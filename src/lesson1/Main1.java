package lesson1;

public class Main1 {
    public static void main(String[] args) {
        double lenghtRoom = 13;
        double wightRoom = 7;
        double lenghtTable = 1.5;
        double wightTable = 2;

        double squareRoom = lenghtRoom * wightRoom;
        double squareTable = lenghtTable * wightTable;
        int countTable = (int) (squareRoom / squareTable);
        System.out.println(countTable);
    }
}
