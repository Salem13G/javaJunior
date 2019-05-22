package lesson9;

public class Animal {
    private int age;
    private String name;
    private String typeFood;
    private int price;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        if (price != animal.price) return false;
        if (name != null ? !name.equals(animal.name) : animal.name != null) return false;
        return typeFood != null ? typeFood.equals(animal.typeFood) : animal.typeFood == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (typeFood != null ? typeFood.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", typeFood='" + typeFood + '\'' +
                ", price=" + price +
                '}';
    }
    public void voice (){
        System.out.println("гав-гав");
    }
}
