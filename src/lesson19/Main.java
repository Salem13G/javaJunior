package lesson19;

public class Main {
    public static void main(String[] args) throws FileCopyFailedException {
        FileCopyWithChannel copyUtils1 = new FileCopyWithChannel();
        FileCopyWithJava7 copyUtils2 = new FileCopyWithJava7();

        try {


            copyUtils1.copyFile("D:\\logs\\myStruts1App.txt",
                    "D:\\торренты");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
    }
}
