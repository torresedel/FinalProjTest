package com.example.admin.finalprojtest;

import java.util.List;

/**
 * Created by Admin on 10/11/2017.
 */

public class TeamInfo {

    String teamName;
    List<String> members;

    public TeamInfo(String teamName, List<String> members) {
        this.teamName = teamName;
        this.members = members;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
}
