package lesson9.Practice;

public class Fruit {
    private String name;
    private int price;
    private int weihgt;
    private int optPrice;
    private boolean isFresh = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeihgt() {
        return weihgt;
    }

    public void setWeihgt(int weihgt) {
        this.weihgt = weihgt;
    }

    public int getOptPrice() {
        return optPrice;
    }

    public void setOptPrice(int optPrice) {
        this.optPrice = optPrice;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fruit fruit = (Fruit) o;

        if (price != fruit.price) return false;
        if (weihgt != fruit.weihgt) return false;
        if (optPrice != fruit.optPrice) return false;
        if (isFresh != fruit.isFresh) return false;
        return name != null ? name.equals(fruit.name) : fruit.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + weihgt;
        result = 31 * result + optPrice;
        result = 31 * result + (isFresh ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weihgt=" + weihgt +
                ", optPrice=" + optPrice +
                ", isFresh=" + isFresh +
                '}';
    }
}
