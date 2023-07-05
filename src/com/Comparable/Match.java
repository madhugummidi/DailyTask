package com.Comparable;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Match implements Comparable<Match> {
    private LocalDate matchDate;
    private String teamOne;
    private String teamTwo;

    public Match(String matchDate, String teamOne, String teamTwo) {
        this.matchDate = LocalDate.parse(matchDate, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
    }

    // Getter and Setter methods
    public LocalDate getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }

    public String getTeamOne() {
        return teamOne;
    }

    public void setTeamOne(String teamOne) {
        this.teamOne = teamOne;
    }

    public String getTeamTwo() {
        return teamTwo;
    }

    public void setTeamTwo(String teamTwo) {
        this.teamTwo = teamTwo;
    }

    @Override
    public int compareTo(Match other) {
        // Sort in descending order based on the match date
        return other.matchDate.compareTo(this.matchDate);
    }
}


