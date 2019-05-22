package lesson8;

public class Tovar {
    private int id_tovara;
    private int fixPrice;
    private int discount;
    private String nameTovar;
    private String type;
    private String nameColor;
    private String colorId;
    private boolean available;
    private Charachteristic[] charachteristics = new Charachteristic[20];
    private Otziv[] otzivi = new Otziv[1000];

    public int getId_tovara() {
        return id_tovara;
    }

    public void setId_tovara(int id_tovara) {
        this.id_tovara = id_tovara;
    }

    public int getFixPrice() {
        return fixPrice;
    }

    public void setFixPrice(int fixPrice) {
        this.fixPrice = fixPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getNameTovar() {
        return nameTovar;
    }

    public void setNameTovar(String nameTovar) {
        this.nameTovar = nameTovar;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNameColor() {
        return nameColor;
    }

    public void setNameColor(String nameColor) {
        this.nameColor = nameColor;
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Charachteristic[] getCharachteristics() {
        return charachteristics;
    }

    public void setCharachteristics(Charachteristic[] charachteristics) {
        this.charachteristics = charachteristics;
    }

    public Otziv[] getOtzivi() {
        return otzivi;
    }

    public void setOtzivi(Otziv[] otzivi) {
        this.otzivi = otzivi;
    }

    public void addCharachteristic(Charachteristic charachteristic) {
        for (int i = 0; i < charachteristics.length; i++) {
            if (charachteristics[i] == null) {
                charachteristics[i] = charachteristic;
                return;

            }
        }

    }

    public void addOtziv(Otziv otziv) {
        for (int i = 0; i < otzivi.length; i++) {
            if (otzivi[i] == null) {
                otzivi[i] = otziv;
                return;

            }
        }

    }

    public void printInfo() {
        System.out.printf("Товар: название - %s, цена - %d, скидка - %d, тип - %s",
                nameTovar, fixPrice, discount, type);
        System.out.println();
        for (Charachteristic h:
             charachteristics) {
            if (h != null) {



                System.out.println(h.getKey() + ": " + h.getValue());
            }
        }
        for (Otziv o: otzivi){
            if (o != null){
                System.out.println("Отзыв от " + o.getClientsName() + " рейтинг :" + o.getRaiting());
            }

        }
    }
}
