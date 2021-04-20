import java.util.Locale;

public class Main {
    public static void main(String[] args) {
       String kota = "Banjarbaru";
       int jumlah;
       double harga;
       char nilaiAbjad ='A';

       char[] kotaArray ={'B','a','n','j','a','r','b','a','r','u'};

        System.out.println(kota);
        System.out.println(kotaArray);
        System.out.println(kota.toLowerCase());
        System.out.println(kota.toUpperCase());
        System.out.println("jumlah huruf :" + kota.length());
        System.out.println(kota.substring(3));
        System.out.println(kota.substring(3,8));

        int nilaiA = 10;
        int nilaiB = 15;

        System.out.println(nilaiA == nilaiB);
        System.out.println(nilaiA != nilaiB);

        nilaiA = nilaiA + 1;
        System.out.println(nilaiA);
        nilaiA++;
        System.out.println(nilaiA);
        nilaiA+=5;
        System.out.println(nilaiA);



    }
}
