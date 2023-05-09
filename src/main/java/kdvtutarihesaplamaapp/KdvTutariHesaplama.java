package kdvtutarihesaplamaapp;

import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double kdv=1.18,kdvindirimi=1.10;
        System.out.println("Bu uygulama yaptığınız alışverişin KDV oranını hesaplayan bir uygulamadır.\n" +
                           "Girdiğiniz miktar 0 ile 1000 TL arasında ise KDV oranı %18\n" +
                           "Girdiğiniz Miktar 1000 Tl' den büyük ise KDV oranını %8 olarak uygulanacaktır.\n"+
                           "Lütfen Miktarı Giriniz. ");
        //Kullanıcı bilgilendirilidi
        double miktar= scan.nextDouble();//Kullanıcıdan miktarı aldım.
        String kdvUygulansinmMi=(miktar >=0 && miktar<=1000)?"uygulansın":"uygulanmasın";
        if(kdvUygulansinmMi=="uygulansın"){
            double kdvliFiyat=miktar*kdv;
            System.out.println(kdvliFiyat);
        }else{
            double kdvliFiyat=miktar*kdvindirimi;
            System.out.println(kdvliFiyat);
        }



    }
}
