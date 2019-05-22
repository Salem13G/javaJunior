package lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsClass implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == null || number2 == null");
        }
        double num1 = 0;
        try {
            num1 = Double.parseDouble(number1);
        }catch (Exception e){
            throw new NumberFormatException("Первая переменная - не число");
        }
        double num2= 0;
        try {
            num2 = Double.parseDouble(number2);
        }catch (Exception e){
            throw new NumberFormatException("Вторая переменная - не число");
        }
        if (num2 ==0){
            throw new ArithmeticException("Нельзя делить на 0");

        }

        return num1/num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null){
            throw new NullPointerException("text == null || word == null");
        }
        String[] words = {};
        String key = String.valueOf(Arrays.binarySearch(words,"java"));

      //  int index =0;
       // int count =0;
        //while ((index = text.indexOf(word, index)) !=-1){
          //  count++;
            //index += word.length();

       // }
        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        Pattern p = Pattern.compile("(\\d+(?:\\.\\d+))");
        Matcher m = p.matcher(text);
        ArrayList <Double> resList = new ArrayList<>();
        while(m.find()) {
            double d = Double.parseDouble(m.group(1));
            resList.add(d);
        }
        if (resList.isEmpty()){
            throw new CustomException("Not found numbers!");
        }
        double [] result = new double[resList.size()];
        for (int i =0; i < resList.size(); i++){
            result[i] = resList.get(i);

        }
        return new double[0];
    }
}
