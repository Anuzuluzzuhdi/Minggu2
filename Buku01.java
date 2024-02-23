/**
 * buku16
 */
public class Buku01 {

    String judul, pengarang;
    int halaman, stock, harga,hargaTotal;
    double diskon;

    public Buku01(){

    }
    public Buku01(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        stock = stok;
        harga = har;
    }


    void tampilinformasi() {
        System.out.println("judul: " +judul);
        System.out.println("pengarang: " +pengarang);
        System.out.println("jumlah halaman: " +halaman);
        System.out.println("sisa stok: " +stock);
        System.out.println("harga: " +harga);
        System.out.println("Harga Total : "+hargaTotal);
    }
    void terjual(int jml) {
        if (stock > 0) { // Memeriksa apakah stok lebih besar dari 0      
                stock -= jml; // Mengurangkan stok hanya jika stok masih ada / lebih dari 0
        } else {
            System.out.println("Stok kosong :)");
        }
    }   
    void restock(int jml){
        stock += jml;
    }
    int gantiHarga(int hrg){
        harga = hrg;
        return harga;
    }
    int hitungHargaTotal(int jmlBukuTerjual){
        int hargatotalan = harga * jmlBukuTerjual;
        return hargatotalan;
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