package model;

public class Mahasiswa {
   //atribut/properties
   public String npm;
   public String namaLengkap;
   public int jumlahSKS;
   public double ipk;

   //behaviour/method
   public void tampilkanInfo() {
      System.out.println(npm);
      System.out.println(namaLengkap);
      System.out.println(jumlahSKS);
      System.out.println(ipk);
   }

   public void mengambilMataKuliah(){}
   public void updateInfo() {};
   }


