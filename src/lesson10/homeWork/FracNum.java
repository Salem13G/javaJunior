package lesson10.homeWork;

public class FracNum implements FractionNumber {
    private int dividend;
    private int divisor;
    private double value;

    public FracNum(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    @Override
    public void setDividend(int dividend) {

    }

    @Override
    public int getDividend() {
        return dividend;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {

    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public double value() {
        return value = dividend / divisor;


    }

    @Override
    public String toString() {
        return  dividend + "/ " + divisor;
    }
}
