package lesson7;

public class Main1 {
    public static void main(String[] args) {
        Drobi num1 = new Drobi();
        Drobi num2 = new Drobi();

        num1.setChislitel(2);
        num1.setZnamenatel(50);

        num2.setChislitel(7);
        num2.setZnamenatel(4);

        CalcDrobei calc = new CalcDrobei();
        Drobi res = calc.sum(num1, num2);
        res.printInfo();


    }
}
