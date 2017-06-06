package com.example.gio.bigproject.models.directions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * Copyright by Gio.
 * Created on 4/20/2017.
 */

public class Legs {
    @SerializedName("distance")
    @Expose
    private Distance distance;
    @SerializedName("duration")
    @Expose
    private Duration duration;

    public String getEndAddress() {
        return endAddress;
    }

    @SerializedName("end_address")
    @Expose

    private String endAddress;
    @SerializedName("end_location")
    @Expose
    private EndLocation endLocation;
    @SerializedName("start_location")
    @Expose
    private StartLocation startLocation;
    @SerializedName("steps")
    @Expose
    private List<Step> steps;

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public void setEndLocation(EndLocation endLocation) {
        this.endLocation = endLocation;
    }

    public void setStartLocation(StartLocation startLocation) {
        this.startLocation = startLocation;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public Distance getDistance() {

        return distance;
    }

    public Duration getDuration() {
        return duration;
    }

    public EndLocation getEndLocation() {
        return endLocation;
    }

    public StartLocation getStartLocation() {
        return startLocation;
    }

    public List<Step> getSteps() {
        return steps;
    }
}