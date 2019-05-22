package lesson9.Practice;

public class Apple extends Fruit {
    public String toString() {
        return "Apple{" +
                "name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() +
                ", weihgt=" + this.getWeihgt() +
                ", optPrice=" + this.getOptPrice() +
                ", isFresh=" + this.isFresh() +
                '}';


    }
}