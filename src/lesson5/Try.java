package lesson5;

public class Try {
    public static void main(String[] args) {
        int minNumber = DZNumbersMethods.minNumber(0,-1,8);
        System.out.println(minNumber);

        int maxNumber = DZNumbersMethods.maxNumber(0,1,2);
        System.out.println(maxNumber);

        String text = DZStringMethods.howMuchSimbols("mama mila ramu");
        System.out.println();

        String text1 = DZStringMethods.wordToLine("otgovorila roscha zolotaya");
        System.out.println();

        String vowels = DZStringMethods.glas("Two roads diverged in a yellow wood");
        System.out.println();

        String alpha = DZStringMethods.alphabetBegin("If you can keep your head when all about you");
        System.out.println();



    }
}
