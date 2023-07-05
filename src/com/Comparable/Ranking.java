package com.Comparable;

import java.util.*;

class Ranking implements Comparable<Ranking> {
    private String name;
    private long score;

    public Ranking(String name, long score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public long getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(long score) {
        this.score = score;
    }

    @Override
    public int compareTo(Ranking other) {
     
        return Long.compare(other.score, this.score);
    }
}

