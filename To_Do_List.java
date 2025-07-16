import java.util.Scanner;
import java.util.ArrayList;

public class To_Do_List {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> daftar = new ArrayList<>();

        int pilihan = 0;
        boolean inputValid = false;
        boolean kondisi = false;

        do {
            while (!inputValid) {
                try {
                    System.out.println("=== Program To Do List ===");
                    System.out.print("""
                            Daftar Perintah
                            1. Tambah
                            2. Lihat
                            3. Hapus
                            0. Stop Program
                            """);
                    System.out.print("Silahkan Masukkan Input: ");
                    pilihan = input.nextInt();

                    inputValid = true;
                } catch(java.util.InputMismatchException e) {
                    System.out.println("\nInput Tidak Valid! Silahkan Masukkan Input Sesuai Dengan Daftar Perintah.");
                    // flush
                    input.nextLine();
                }
            }
            // flush
            input.nextLine();
            switch(pilihan) {
                case 1:
                    
                    System.out.println("\n=== Tambah List ===");
                    System.out.print("Silahkan Masukkan To Do List Anda: ");
                    daftar.add(input.nextLine());
                break;
                case 2:
                    System.out.println("\n=== Daftar To Do List Anda ===");
                    if (!daftar.isEmpty()) {
                        for (int u = 0; u < daftar.size(); u++) {
                        System.out.println((u + 1) + ". " + daftar.get(u));
                        }
                    } else {
                        System.out.println("-");
                    }
                break;
                case 3:
                    try {
                        System.out.println("\n=== Menu Untuk Menghapus To Do List ===");
                        System.out.print("Silahkan Masukkan Nomor List Keberapa Yang Akan Anda Hapus: ");
                        int delete = input.nextInt() - 1;
                        daftar.remove(delete);
                    } catch(java.lang.IndexOutOfBoundsException e) {
                        System.out.println("Nomor List yang Anda Masukkan Tidak Ada Dalam list.");
                    }
                break;
                case 0:
                    System.out.println("\nProgram Berhenti.");
                kondisi = true;
                break;
                default:
                    System.out.println("\nNomor Yang Anda Inputkan Tidak Valid!");
                break;
            }
            inputValid = false;
        } while(!kondisi);
        input.close();
    }
}
