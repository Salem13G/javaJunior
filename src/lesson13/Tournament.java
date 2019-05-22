package lesson13;

import java.util.*;

public class Tournament<teams> {
    private String nameTournament;
    private HashMap<String, Integer> teams = new HashMap<>();

    public Tournament() {

    }

    public Tournament(String name) {
        nameTournament = name;

    }

    public String getNameTournament() {
        return nameTournament;
    }

    public void setNameTournament(String nameTournament) {
        this.nameTournament = nameTournament;
    }

    public void addTeam(String nameTeam, int points) {
        if (teams.containsKey(nameTeam)) {
            int currentPoints = teams.get(nameTeam);
            teams.put(nameTeam, points + currentPoints);
        } else {
            teams.put(nameTeam, points);
        }
    }

    public void printTable() {
        for (String key : teams.keySet()) {
            System.out.printf("Command - %s, Points - %d\n", key, teams.get(key));
        }
    }

    public void printWinner() {
        int max = 0;
        String winner = " ";
        for (String key : teams.keySet()) {
            if (teams.get(key) > max) {
                max = teams.get(key);
                winner = key;
            }

        }
        System.out.println("Winner: " + max + " " + winner);
    }

    public void printLoozer() {
        int min = Integer.MAX_VALUE;
        String winner = " ";
        for (String key : teams.keySet()) {
            if (teams.get(key) < min) {
                min = teams.get(key);
                winner = key;
            }
        }
        System.out.println("Loozer:" + min + " " + winner);
    }
   /* MyComparator comparator = new MyComparator(teams);

    TreeMap<String, Integer> map = new TreeMap<String, Integer>(comparator);
        map.putAll(teams);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
        System.out.println("Team - " + entry.getKey() + " | points - " + entry.getValue());
    }
    /*public void sortTable (){
        ArrayList <Integer> points = new ArrayList<Integer>(teams.values());
        Collections.sort(points);

        for (String key:teams.keySet()){

        }*/
    }

