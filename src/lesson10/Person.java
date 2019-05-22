package lesson10;

public class Person {
    private int age;
    private String name;
    private int height;
    private String phone;


    public Person() {  //конструктор

    }

    //либо такой конструктор
    public Person(int age1, String name1) {
        age = age1;
        name = name1;

    }

    public Person(int age, int height) {
        this.age = age;
        this.height = height;
    }

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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", phone='" + phone + '\'' +
                '}';
    }
}
