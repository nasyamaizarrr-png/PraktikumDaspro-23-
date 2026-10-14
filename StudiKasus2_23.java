import java.util.Scanner;

public class StudiKasus2_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input Data Mahasiswa dan Jenis Kegiatan
        System.out.print("Nama mahasiswa : ");
        sc.nextLine();
        
        System.out.print("Jenis kegiatan (BELAMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = sc.nextLine().trim().toLowerCase();

        // 2. Validasi untuk kelompok BELAMAWA, BAKORMA, MANDIRI
        // Catatan: Disesuaikan menjadi "belamawa" agar cocok dengan prompt di atas
        if (jenis.equals("belamawa") || jenis.equals("bakorma") || jenis.equals("mandiri")) {
            System.out.print("Jumlah dokumen : ");
            int dokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            int juara = sc.nextInt();

            if (juara >= 1 && juara <= 3) {
                if (dokumen >= 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan (Juara " + juara + ", dokumen lengkap).");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }
            
       
        // Menutup resource scanner di akhir program utama
        sc.close();
    }
}   }
 