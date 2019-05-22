package lesson7;

public class Drobi {
    private int chislitel;
    private int znamenatel = 1; // чтобы не установили ноль, всегда будет 1 или больше

    public void setChislitel(int chislitel) {
        this.chislitel = chislitel;
    }

    public void setZnamenatel(int znamenatel) {
         if (znamenatel == 0){
             System.out.println("Нельзя делить на 0");
         }else {
             this.znamenatel = znamenatel;
         }

    }

    public int getZnamenatel() {
        return znamenatel;
    }

    public int getChislitel() {
        return chislitel;
    }



    public void printInfo() {
        int celoe = chislitel/znamenatel;
        int ostatok = chislitel % znamenatel;
        System.out.printf("%d %d/%d",celoe, ostatok, znamenatel);
        System.out.println();
    }
}
