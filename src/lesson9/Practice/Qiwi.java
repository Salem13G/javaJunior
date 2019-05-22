package lesson9.Practice;

public class Qiwi extends Fruit {
    @Override
    public String toString() {
        return "Qiwi{" +
                "name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() +
                ", weihgt=" + this.getWeihgt() +
                ", optPrice=" + this.getOptPrice() +
                ", isFresh=" + this.isFresh() +
                '}';

    }
}
