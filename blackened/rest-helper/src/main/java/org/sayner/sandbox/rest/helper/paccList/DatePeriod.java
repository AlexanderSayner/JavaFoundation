package org.sayner.sandbox.rest.helper.paccList;

import java.time.Instant;

public class DatePeriod {

    private Instant end;

    private Instant start;

    public DatePeriod() {
    }

    public DatePeriod(Instant end, Instant start) {
        this.end = end;
        this.start = start;
    }

    public void setEnd(Instant end){
        this.end = end;
    }
    public Instant getEnd(){
        return this.end;
    }
    public void setStart(Instant start){
        this.start = start;
    }
    public Instant getStart(){
        return this.start;
    }
}
