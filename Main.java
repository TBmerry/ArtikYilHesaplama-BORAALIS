import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;
        boolean status = true;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir yıl giriniz : ");
        yil = input.nextInt();

        if(yil%4==0){
            if(yil%100==0 && yil%400!=0){
                status=false;
            }else{
                status=true;
            }
        }else{
            status=false;
        }
        if (status == true){
            System.out.println(yil + " bir artık yıldır !");
        }else{
            System.out.println(yil + " bir artık yıl değildir !");
        }
        

    }
}