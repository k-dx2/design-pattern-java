package com.kunal.designpatterns.structural.adapter.adapter;

import com.kunal.designpatterns.structural.adapter.round.RoundPeg;
import com.kunal.designpatterns.structural.adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg=peg;

    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = Math.sqrt(2*Math.pow(peg.getWidth(),2))/2;
        return result;
    }
}
