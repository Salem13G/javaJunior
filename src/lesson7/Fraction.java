package lesson7;

public class Fraction {
    private int a;
    private int b;

    Fraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Fraction(String c, String d) {
    }

    public String toString() {
        return a + "/" + b;
    }

    public Fraction simplify() {
        long limit = Math.min(a, b);

        for (long i = 2; i <= limit; i++) {
            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
        }
        return this;
    }
}

