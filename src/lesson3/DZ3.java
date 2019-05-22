package lesson3;

public class DZ3 {
    public static void main(String[] args) {
        char[] mass1 = {'a', 'b', 'c', 'd'};
        char[] mass2 = {'e', 'f', 'g', 'h'};
        char[] mass3 = new char[mass1.length + mass2.length];
        mass3[0] = mass1[0];
        mass3[1] = mass1[1];
        mass3[2] = mass1[2];
        mass3[3] = mass1[3];
        mass3[4] = mass2[0];
        mass3[5] = mass2[1];
        mass3[6] = mass2[2];
        mass3[7] = mass2[3]; // не получилось как-то упростить, пришлось так...

        for (char i = 0; i < mass3.length; i++) {
            System.out.print(mass3[i]);
        }

    }
}
