package lesson6;

public class Main4 {
    public static void main(String[] args) {
        int [][] piramide= new int [5][9];
        int k = 1;
        int l = 4;         //индекс колонки. Обязательно посмотреть вебинар последнее задание
        for (int i = 0; i<piramide.length; i++){
            for (int j = 0; j<k; j++){

                System.out.println();
            }
            k= k+2;
        }
    }
}
