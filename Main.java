package com.mycompany.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> daftarEvent = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Manajemen Daftar Event/Konser ===");
            System.out.println("1. Tambah Event");
            System.out.println("2. Lihat Event");
            System.out.println("3. Ubah Event");
            System.out.println("4. Hapus Event");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1 -> { // create
                    System.out.print("Masukkan nama event baru: ");
                    String eventBaru = input.nextLine();
                    System.out.println("Masukkan tanggal event baru (dd-mm-yyyy): ");
                    String tanggalEvent = input.nextLine();
                    String gabunganEvent = eventBaru + " | " + tanggalEvent;
                    daftarEvent.add(gabunganEvent);
                    System.out.println("Event berhasil ditambahkan!");
                }

                case 2 -> { // read
                    System.out.println("\n=== Daftar Event ===");
                    if (daftarEvent.isEmpty()) {
                        System.out.println("Belum ada event.");
                    } else {
                        for (int i = 0; i < daftarEvent.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarEvent.get(i));
                        }
                    }
                }

                    case 3 -> { // update
                    if (daftarEvent.isEmpty()) {
                        System.out.println("Belum ada event untuk diubah.");
                    } else {
                        System.out.println("\n=== Daftar Event ===");
                        for (int i = 0; i < daftarEvent.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarEvent.get(i));
                        }
                        System.out.print("Pilih nomor event yang ingin diubah: ");
                        int ubahIndex = input.nextInt();
                        input.nextLine(); 

                        if (ubahIndex > 0 && ubahIndex <= daftarEvent.size()) {
                            System.out.print("Masukkan nama event baru: ");
                            String eventUpdate = input.nextLine();
                            System.out.print("Masukkan tanggal event baru (dd-mm-yyyy): ");
                            String tanggalUpdate = input.nextLine();

                            String gabunganUpdate = eventUpdate + " | " + tanggalUpdate;
                            daftarEvent.set(ubahIndex - 1, gabunganUpdate);

                            System.out.println("Event berhasil diubah!");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                }


                case 4 -> { // delete
                    if (daftarEvent.isEmpty()) {
                        System.out.println("Belum ada event untuk dihapus.");
                    } else {
                        System.out.println("\n=== Daftar Event ===");
                        for (int i = 0; i < daftarEvent.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarEvent.get(i));
                        }
                        System.out.print("Pilih nomor event yang ingin dihapus: ");
                        int hapusIndex = input.nextInt();
                        input.nextLine();

                        if (hapusIndex > 0 && hapusIndex <= daftarEvent.size()) {
                            daftarEvent.remove(hapusIndex - 1);
                            System.out.println("Event berhasil dihapus!");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                }

                case 5 -> System.out.println("Terima kasih!");

                default -> System.out.println("Pilihan tidak ada. Coba lagi.");
            }

        } while (pilihan != 5);
    }
}
