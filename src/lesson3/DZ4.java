package lesson3;

public class DZ4 {
    public static void main(String[] args) {
        char[] mass = {'a', 'b', 'c', 'd'};
        char [] mass1;
        mass1 = mass;
        for (char i = 3; i <mass.length;i--){
            System.out.print(mass1[i]);

        }
    }
}
