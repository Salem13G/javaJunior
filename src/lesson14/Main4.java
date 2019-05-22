package lesson14;

public class Main4 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ivan");
        try {
            person.setAge(0240);
        }catch (RuntimeException e){
            System.out.println("How old?");
        }

        System.out.println(person);
    }
}
