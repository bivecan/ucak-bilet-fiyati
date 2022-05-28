import java.util.Scanner;

public class UcakBiletFiyat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("mesafe km: ");
        double km = input.nextDouble();

        System.out.println("Yasınız: ");
        int yas= input.nextInt();

        System.out.println("Yolculuk tipi: 1-> Tek Yon, 2-> Gidis Donus");
        int tip= input.nextInt();

        if((km<0) || (yas<0) || ((tip!=1 ) && (tip!=2)))
            {System.out.println("Hatalı veri girdiniz");}

        else
            {double tutar = 0.1 * km;

            if (yas<12)
                tutar = tutar*0.5;
            else if((12<=yas) && (yas<=24))
                tutar = tutar*0.9;
            else if(yas>65)
                tutar= tutar*0.7;

            if (tip ==2)
                tutar = tutar*2*0.8;

        System.out.println("Toplam Tutar= " + tutar);}
    }
}
