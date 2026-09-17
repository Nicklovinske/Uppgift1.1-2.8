package org.Uppgift2P7;

import org.Uppgift2P1.Employee;

import java.util.Arrays;

public class Team {
    private String teamName;
    private Employee teamLead;

    public Team(String teamName, Employee teamLeader){
        this.teamName = teamName;
        this.teamLead = teamLeader;
    }

    public String getTeamName(){
        return teamName;
    }

    public void setTeamName(String teamName){
        this.teamName = teamName;
    }

    public Employee getTeamLead(){
        return teamLead;
    }

    public void copyTo(Team clone){
        clone.teamName = teamName;
        clone.teamLead = teamLead;
    }

    static void main(){
        Team team1 = new Team("Team 1", new Employee("John Doe", 40000, education));
        Team team2 = new Team("", null);
        team1.copyTo(team2);
        var teamLead = team2.getTeamLead();
        teamLead.setSalary(50000);

        IO.println(team1.teamName + " " + team1.teamLead.getSalary());
        IO.println(team2.teamName + " " + team2.teamLead.getSalary());

        Team[] teams = {team1, team2};
        var teamsCopy = Arrays.copyOf(teams, teams.length);
    }
}
