// import java.util.Scanner;
// public class BukuMain01 {
//     String judul, pengarang;
//     int halaman, stok, harga;

//     public static void main(String[] args) {

//         Buku01 bk1 = new Buku01();
//         bk1.judul = "Today Ends Tomorrow Comes";
//         bk1.pengarang = "Denanda Pratiwi";
//         bk1.halaman = 198;
//         bk1.stok = 13;
//         bk1.harga = 71000;

//         bk1.tampilInformasi();
//         bk1.terjual(5);
//         bk1.gantiHarga(60000);
//         bk1.tampilInformasi();

//         Buku01 bk2 = new Buku01("Self Reward", "Maheera Ayesha", 160, 29, 59000);
//         bk2.terjual(11);
//         bk2.tampilInformasi();

//         Buku01 bukuAbhi = new Buku01("Perempuan Berwajah Teduh", "Zig Zag", 200, 18, 85000);
//         bukuAbhi.terjual(9);
//         bukuAbhi.tampilInformasi();
//     }

//     void tampilInformasi() {
//         System.out.println("Judul: " + judul);
//         System.out.println("Pengarang: " + pengarang);
//         System.out.println("Jumlah halaman: " + halaman);
//         System.out.println("Sisa stok: " + stok);
//         System.out.println("Harga: Rp " + harga);
//     }

//     void terjual(int jml) {
//         if (stok >= jml) {
//             stok -= jml;
//         } else {
//             System.out.println("Stok tidak mencukupi!");
//         }
//     }

//     void restok(int jml) {
//         stok += jml;
//     }

//     void gantiHarga(int hrg) {
//         harga = hrg;
//     }
// }
