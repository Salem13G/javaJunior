package lesson3;

public class Main3 {
    public static void main(String[] args) {
        int [] dpo = {5,4,3,2,1,0};

       /* System.out.println(dpo[5]);
        System.out.println(dpo[4]);
        System.out.println(dpo[3]);
        System.out.println(dpo[2]);
        System.out.println(dpo[1]);
        System.out.println(dpo[0]);*/ // можно так, но проще ниже:
        for (int i = dpo.length - 1; i >=0; i--){ //из длины массива вычитаем 1
            System.out.println(dpo [i]);
        }


    }
}
