import model.Mahasiswa;

public class Aksi {
    public static void main(String[] args) {
        //ini instance/pembuatan object dari sebuah class
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630993";
        mahasiswa.namaLengkap = "Nazaratun Syifa";
        mahasiswa.ipk = 3.7;
        mahasiswa.jumlahSKS = 24;

        Mahasiswa azril = new Mahasiswa();
        azril.npm = "19630994";
        azril.namaLengkap = "azril fauzan rahsya";
        azril.ipk = 3.6;
        azril.jumlahSKS= 22;

        mahasiswa.tampilkanInfo();
    }
}
