package homeWork8;

public class Product {
    private int productID;
    private int price;
    private double valuation;
    private String productsName;
    private String type;
    private String colorsName;

    private boolean available;
    private Characteristic[] characteristics = new Characteristic[20];
    private Opinion[] opinions = new Opinion[1000];

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getValuation() {
        return valuation;
    }

    public void setValuation(double valuation) {
        this.valuation = valuation;
    }

    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColorsName() {
        return colorsName;
    }

    public void setColorsName(String colorsName) {
        this.colorsName = colorsName;
    }



    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Characteristic[] getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(Characteristic[] characteristics) {
        this.characteristics = characteristics;
    }

    public Opinion[] getOpinions() {
        return opinions;
    }

    public void setOpinions(Opinion[] opinions) {
        this.opinions = opinions;
    }
    public void addCharacteristic(Characteristic characteristic) {
        for (int i = 0; i < characteristics.length; i++) {
            if (characteristics[i] == null) {
                characteristics[i] = characteristic;
                return;

            }
        }

    }
    public void addOpinion(Opinion opinion) {
        for (int i = 0; i < opinions.length; i++) {
            if (opinions[i] == null) {
                opinions[i] = opinion;
                return;

            }
        }
    }
    public void printInfo() {
        System.out.printf("Товар: название - %s, цена - %d, оценка товара - %f, тип - %s",
                productsName, price, valuation, type);
        System.out.println();
        for (Characteristic h:
                characteristics) {
            if (h != null) {



                System.out.println(h.getKey() + ": " + h.getValue());
            }
        }
        for (Opinion o: opinions){
            if (o != null){
                System.out.println("Отзыв от " + o.getClientsName() + " рейтинг :" + o.getRaiting()+ " Город :" +o.getCity()+ " Возраст: "
                        +o.getAge());
            }

        }
    }
}
