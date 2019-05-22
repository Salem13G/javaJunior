package lesson10.homeWork;

public class FNum implements FractionNumber {

    public int DEFAULT_DIVISOR_VALUE = 1;
    public int dividend;
    public int divisor;
    public double value;

    public FNum(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;

    }

    public int getDEFAULT_DIVISOR_VALUE() {
       return DEFAULT_DIVISOR_VALUE;
   }

   public void setDEFAULT_DIVISOR_VALUE(int DEFAULT_DIVISOR_VALUE) {
        this.DEFAULT_DIVISOR_VALUE = DEFAULT_DIVISOR_VALUE;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public void setDividend(int dividend) {

    }

    @Override
    public int getDividend() {
        return 0;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {

    }

    @Override
    public int getDivisor() {
        return 0;
    }

    @Override
    public double value() {
        value = dividend/divisor;
        System.out.println();
        return 0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FNum fNum = (FNum) o;

        if (DEFAULT_DIVISOR_VALUE != fNum.DEFAULT_DIVISOR_VALUE) return false;
        if (dividend != fNum.dividend) return false;
        if (divisor != fNum.divisor) return false;
        return Double.compare(fNum.value, value) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = DEFAULT_DIVISOR_VALUE;
        result = 31 * result + dividend;
        result = 31 * result + divisor;
        temp = Double.doubleToLongBits(value);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "FNum{" +
                "DEFAULT_DIVISOR_VALUE=" + DEFAULT_DIVISOR_VALUE +
                ", dividend=" + dividend +
                ", divisor=" + divisor +
                ", value=" + value +
                '}';
    }

}
