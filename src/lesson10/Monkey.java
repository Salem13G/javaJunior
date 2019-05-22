package lesson10;

public class Monkey implements Animal {

    @Override
    public void breath() {
        System.out.println("breath");
    }

    @Override
    public void voice() {
        System.out.println("wow");

    }
}
