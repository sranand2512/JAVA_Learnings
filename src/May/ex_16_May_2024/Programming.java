package May.ex_16_May_2024;

public class Programming {
    int version;
    String author;

    Programming() {
        System.out.println("DC");
    }

    Programming(int version, String author) {
        this.version = version;
        this.author = author;
    }

    void printInfo(){
        System.out.println("Program Info -->"+this.version+" Author "+this.author);
    }

    void bhk3() {
    System.out.println("3BHK");
}
}