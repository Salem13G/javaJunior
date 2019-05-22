package lesson9.homeWork;

public class Rhombus extends Figure {
    private int height;
    private int base;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rhombus rhombus = (Rhombus) o;

        if (height != rhombus.height) return false;
        return base == rhombus.base;
    }

    @Override
    public int hashCode() {
        int result = height;
        result = 31 * result + base;
        return result;
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }

    @Override
    public void printSquare() {
        double square = base*height;
        System.out.println(square);
    }

    @Override
    public void printPerimetr() {
        double perimetr = 4*base;
        System.out.println(perimetr);
    }
}
