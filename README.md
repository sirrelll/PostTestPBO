**MANAJEMEN DAFTAR EVENT MUSIK/KONSER**
Darel Prasetya Fawwaz
NIM : 2409116064
Sistem Informasi - B 24

**Deskripsi Program**

Program ini dibuat dengan menggunakan bahasa pemrograman Java di NetBeans dengan menerapkan konsep CRUD (Create, Read, Update, Delete), Data data event disimpan dalam sebuah ArrayList agar dapat menampung data secara dinamis. Program ini dibuat untuk bisa mengelola informasi event atau konser, sehingga pengguna bisa menyusun daftar acara secara lebih teratur karena disetiap event memiliki nama dan tanggal pelaksanaan
==============================================================================
**Penjelasan Code**
==============================================================================
<img width="247" height="80" alt="Screenshot 2025-09-09 194102" src="https://github.com/user-attachments/assets/220827dc-d9ef-4a07-a09b-f571b064cc16" />


Bagian ini adalah tempat package & import yang dimana package untuk menandakan folder tempat filenya, dan ArrayList untuk menyimpan suatu data, dan Scanner untuk membaca input dari keyboard.
=============================================================================

<img width="501" height="96" alt="Screenshot 2025-09-09 194355" src="https://github.com/user-attachments/assets/2f9d6928-8b5d-43db-9097-f299297fb48b" />

Bagian ini adalah kelas utamanyam jadi Main berfungsi sebagai titik masuk program atau semua progrma yang akan di run dimulai dari Main, dan ada Variabel Utama yaitu daftarEvent bertipe data String yang akan berfungsi untuk menyimpan data setiap event, Dan ada input yang membaca masukan user, dan Pilihan untuk menyimpan nomor menu yang akan dipilih.

==============================================================================

<img width="573" height="236" alt="Screenshot 2025-09-09 194820" src="https://github.com/user-attachments/assets/01182806-45de-4f9a-b8ab-e0244967e4c0" />

Disini diawali dengan do yaitu untuk memulai sesuatu perulangan, dan seterusnya ada code yang menampilkan menu awal yang ada pada program ini contohnya seperti ini

<img width="300" height="103" alt="Screenshot 2025-09-09 195029" src="https://github.com/user-attachments/assets/6e8b3518-2b73-4bf1-89d6-4e73c678adb1" />

Dan diakhir ada switch yaitu berfungsi sebagai struktur menu untuk memilih dari berbagai case yang ada.

=============================================================================

<img width="570" height="165" alt="Screenshot 2025-09-09 195215" src="https://github.com/user-attachments/assets/0accddec-f27f-47a8-9b28-0aca4c8cb8b1" />

Di case pertama ini ada Create, kita bisa memasukkan event baru dan tanggal dilaksanakannya event tersebut, dengan membuat string gabunganevent maka nama dan tanggal akan digabungkan menjadi satu string.

Contohnya seperti ini:

<img width="297" height="67" alt="Screenshot 2025-09-09 195613" src="https://github.com/user-attachments/assets/8783ee3f-f478-43ba-a2c2-e9cc8d88b122" />

=============================================================================

<img width="564" height="183" alt="Screenshot 2025-09-09 195357" src="https://github.com/user-attachments/assets/397e753a-023e-437f-88dc-bc7ab241bbe6" />

Di case kedua ini ada Read, yang dimana kita bisa meminta program menampilkan event event yang sudah ada, jika event belum ada satupun maka akan menampilkan pesan "Belum ada Event".

Contohnya seperti ini:

<img width="196" height="40" alt="Screenshot 2025-09-09 195621" src="https://github.com/user-attachments/assets/178f583d-c9ce-478c-b7a6-122f65fc639a" />

JIka belum ada event:

<img width="183" height="43" alt="Screenshot 2025-09-09 195715" src="https://github.com/user-attachments/assets/e5035ea9-48ad-4b93-9af6-f682274ae846" />

=============================================================================

<img width="655" height="495" alt="Screenshot 2025-09-09 195855" src="https://github.com/user-attachments/assets/b948a598-7559-480f-98a3-7fad52ff8d66" />

Pada case 3 ini yaitu Update, memungkinkan pengguna untuk mengubah event yang sudah ada, dan jika daftar masih kosong maka program akan langsung memberi pesan tidak ada event untuk diubah.

Contohnya seperti ini mengupdate sebuah event:

<img width="383" height="112" alt="Screenshot 2025-09-09 195651" src="https://github.com/user-attachments/assets/af5d1bbe-78a7-40cc-a41e-05cfecf6b97b" />

Dan akan menghasilkan:

<img width="197" height="45" alt="Screenshot 2025-09-09 195657" src="https://github.com/user-attachments/assets/c2ad2d09-5cf7-4c15-8d62-91115a73329d" />

==============================================================================

<img width="612" height="375" alt="Screenshot 2025-09-09 200330" src="https://github.com/user-attachments/assets/b3db93b4-e844-4f99-b57e-28e59429a645" />

Pada case 4 ini yaitu Delete yang berfungsi untuk menghapus event yang sudah ada.

Contohnya seperti ini:

<img width="283" height="73" alt="Screenshot 2025-09-09 195709" src="https://github.com/user-attachments/assets/418aa623-0a44-4974-8878-0c0e3c5651b6" />

Dan akan menghasilkan tampilan:

<img width="183" height="43" alt="Screenshot 2025-09-09 195715" src="https://github.com/user-attachments/assets/431ba049-e234-4bc7-ba1d-97a86f4c7f35" />

==============================================================================

<img width="515" height="74" alt="Screenshot 2025-09-09 200533" src="https://github.com/user-attachments/assets/a7467031-7edf-4c68-9f1a-ca6915535736" />

Di case 5 ini adalah untuk Keluar dari loop serta programnya, Jadi dengan pengguna menginput angka 5 maka program akan selesai, dan jika input pilihan tidak valid maka akan menampilkan pesan "Pilihan tidak ada, Coba lagi".

<img width="291" height="143" alt="Screenshot 2025-09-09 200730" src="https://github.com/user-attachments/assets/9f0599b5-e3f7-4eb8-930d-6812e667f338" />

==============================================================================












