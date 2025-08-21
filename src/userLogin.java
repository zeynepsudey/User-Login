import java.util.Scanner;

public class userLogin {
    public static void main(String[] args) {

        String userName, password, newPass;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz : ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();

        if (userName.equals("zeynepsude") && password.equals("java123")) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Bilgiler yanlış.");
            System.out.println("Yeni şifre oluşturmak ister misiniz? \n1-Evet\n2-Hayır");
            select = input.nextInt();
            input.nextLine();

            if (select == 1) {
                System.out.print("Yeni şifrenizi giriniz: ");
                newPass = input.nextLine();

                if (newPass.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Şifre değiştirilmedi.");
            }
        }
    }
}
