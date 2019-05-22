package lesson5;

public class DZStringMethods {
    public static String howMuchSimbols(String text) {
        String res1 = text.replaceAll(" ", ""); // убираем пробелы
        int res = res1.length();
        System.out.println(res);

        return text;
    }

    public static String wordToLine(String text) {

        String[] res2 = text.split("\\s");
        for (String res : res2)
            System.out.println(res);


        return text;
    }

    public static String glas(String text) {


        char[] strMass = text.toCharArray(); // можно было еще перевести все символы в нижний регистр .toLowerCase, но не стал)))

        for (char vowel: strMass) {
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' || vowel == 'y') {
                System.out.print(vowel);
            }


        }

        return text;
    }
    public static String alphabetBegin (String text){
        char[] simbols = text.toCharArray();
        for (char abc: simbols){
            if (abc == 'a'||abc == 'b'||abc == 'c'||abc == 'd'||abc == 'e'||abc == 'f'||abc == 'g'||abc == 'h'||abc == 'i'||abc == 'j'||abc == 'k'||abc == 'l'||abc == 'm'||abc == 'n'||abc == 'o'||abc == 'p'||abc == 'q'||abc == 'r'||abc == 's'||abc == 't'||abc == 'u'||abc == 'v'||abc == 'w'||abc == 'x'||abc == 'y'||abc == 'z'){
                System.out.print(abc); //какая-то фигня получается...
            }

        }
        return text;
    }
}




