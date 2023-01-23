import java.util.Scanner;

public class Sinav {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int not;
        System.out.println("Sınav notunu giriniz: ");
        not = scan.nextInt();

        if(not > 90) {
            System.out.println("AA ile dersi geçtiniz.");
        }
        else if(not > 85) {
            System.out.println("BA ile dersi geçtiniz.");
        }
        else if(not > 80) {
            System.out.println("BB ile dersi geçtiniz.");
        }
        else if(not > 75) {
            System.out.println("CB ile dersi geçtiniz.");
        }
        else if(not > 50) {
            System.out.println("Kosullu geçtiniz.");
        }
        else {
            System.out.println("Dersten kaldınız.");
        }
    }
}
