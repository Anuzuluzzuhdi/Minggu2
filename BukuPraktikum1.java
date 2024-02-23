public class BukuPraktikum1 {

    String judul, pengarang;
    int halaman, stok, harga, hargaTotal;
    double diskon;
    public static void main(String[] args) { 

        Buku01 bk1 = new Buku01();
        bk1.judul = "Today Ends Tomorrow Ends";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stock = 13; // Memperbaiki penulisan atribut stok
        bk1.harga = 71000;
        bk1.hargaTotal=bk1.hitungHargaBayar(bk1.hitungHargaTotal(5),bk1.hitungDiskon(bk1.hitungHargaTotal(5)));
    

        // bk1.tampilinformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        // bk1.tampilinformasi();
        bk1.hitungHargaTotal(5);
        bk1.hitungDiskon(bk1.hitungHargaTotal(5));
        bk1.hitungHargaBayar(bk1.hitungHargaTotal(5),bk1.hitungDiskon(bk1.hitungHargaTotal(5)));
        bk1.tampilinformasi();


        // Buku01 bk2 = new Buku01("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        // bk2.terjual(11);
        // bk2.tampilinformasi();

        // Buku01 bukueksa = new Buku01("Bismillah Sukses", "Eksa Putra", 200, 1, 1000000);
        // bukueksa.tampilinformasi();
    


    }
    void tampilinformasi() {
        System.out.println("judul: " +judul);
        System.out.println("pengarang: " +pengarang);
        System.out.println("jumlah halaman: " +halaman);
        System.out.println("sisa stok: " +stok);
        System.out.println("harga: " +harga);
        System.out.println("Harga Total" +hargaTotal);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        } else {
            System.out.println("Stok kosong :)");
        }
    }

    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }
    int hitungHargaTotal(int jmlBukuTerjual){
        harga *=jmlBukuTerjual;
        return harga;
    }

    double hitungDiskon(double hargaTotal) {
        
        if (hargaTotal > 150000) {
            diskon = 0.12; 
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = 0.05; 
        }
        return diskon;
    }

    int hitungHargaBayar(int hargaTotal, double diskon) {
        hargaTotal -= (hargaTotal * diskon);
        return hargaTotal;
    }


}