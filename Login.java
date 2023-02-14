import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String userName, Passaword;
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz:");
        userName = input.nextLine();
        System.out.println("Şifrenizi giriniz:");
        Passaword = input.nextLine();
        if ((userName.equals("barkobt")) && (Passaword.equals("z1b2b3a4"))) {
            System.out.println("Giriş yapıldı.");
        } else{
            System.out.println("Kullanıcı adı veya şifreniz hatalıdır.");
        }
    }
}
