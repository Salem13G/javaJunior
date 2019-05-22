package lesson11;

public class Coin implements Comparable<Coin>{

    private int nominal;
    private int diameter;
    private int year;

    public Coin() {
    }

    public Coin(int nominal, int diameter, int year) {
        this.nominal = nominal;
        this.diameter = diameter;
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (nominal != coin.nominal) return false;
        if (diameter != coin.diameter) return false;
        return year == coin.year;
    }

    @Override
    public int hashCode() {
        int result = nominal;
        result = 31 * result + diameter;
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", diameter=" + diameter +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Coin o) {
        int nom2 = this.nominal;
        int nom1 = o.nominal;

        if (nom1 != nom2){
            return nom1 - nom2;
        }
        if (o.year != this.year){
            return this.year - o.year;
        }

        return this.diameter - o.diameter;
    }
}
