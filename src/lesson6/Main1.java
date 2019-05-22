package lesson6;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Start:");
        for (int i = 0; i < 366; i++) {
            for (int j = 0; j < 25; j++) {
                for (int k = 0; k < 61; k++) {
                    for (int l = 0; l < 60; l++) {
                        System.out.printf("От старта прошло: %d дня, %d часа, %d минут, %d секунд", i, j, k, l);
                        System.out.println();
                        try { // считает посекундно
                            Thread.sleep(1000); // предзадержка в одну секунду
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }

        }
    }
}
