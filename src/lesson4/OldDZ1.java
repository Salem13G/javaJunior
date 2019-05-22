package lesson4;

public class OldDZ1 { //so zvezdo4koi
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c', 'd'};
        char[] b = {'q', 'w', 'e', 'r'};

        char[] c = new char[a.length + b.length]; //сложили длины массивов
        // DZ3 Lesson3 упрощение
        /*c[0] = a[0];
        c[1] = a[1];
        c[2] = a[2];
        c[3] = a[3];

        c[4] = b[0];
        c[5] = b[1];
        c[6] = b[2];
        c[7] = b[3];*/

        for (int i = 0; i < c.length; i++) {
            if (i < a.length) {
                c[i] = a[i];   //так как ячейки совпадают то там и там i

            } else {
                c[i] = b[i - a.length]; //то есть 5-я минус 4 из массива а
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
    }

}
