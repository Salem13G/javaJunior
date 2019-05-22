package lesson6;

public class DZ {
    public static void main(String[] args) {
        int[][] diagonal = {{1, 1, 1, 1},
                            {1, 1, 1, 1},
                            {1, 1, 1, 1},
                            {1, 1, 1, 1}};
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j <= diagonal[i].length; j +=5) {


                System.out.print(diagonal[i][j] + " ");

            }

            System.out.println(); // не знаю что еще можно сделать... Один фиг выводит в столбик...

        }
    }
}
