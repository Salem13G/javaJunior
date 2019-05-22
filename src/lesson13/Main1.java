package lesson13;

public class Main1 {
    public static void main(String[] args) {
        Tournament tournament = new Tournament();
        tournament.addTeam("Spartak",3);
        tournament.addTeam("Dinamo",9);
        tournament.addTeam("Chelsi",7);
        tournament.addTeam("CSKA",34);
        tournament.addTeam("Spartak",3);

        tournament.printTable();
        tournament.printWinner();
        tournament.printLoozer();
    }
}
