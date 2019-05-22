package lesson16.blackJack;

public class Computer extends Player {

    @Override
    public boolean doAction() {
        int countPoints = 0;
        for (Card card: hand){
            countPoints = countPoints + card.getPoints();
        }
        if (getPoints() <16){
            return true;
        }
        this.setContinue(false);
        return false;
    }

    @Override
    public String toString() {
        return "Компьютер " + getPoints();
    }
}
