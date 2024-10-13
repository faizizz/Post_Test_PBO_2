# **MANAJEMEN LAPAS - CRUD SEDERHANA DENGAN JAVA**
---
## DESKRIPSI

Project ini merupakan aplikasi manajemen lapas sederhana yang dikembangkan menggunakan bahasa pemrograman Java. Aplikasi ini memungkinkan pengguna untuk melakukan operasi CRUD (Create, Read, Update, Delete) untuk mengelola data narapidana di dalam lapas. 
Terdapat dua kelas utama yaitu Lapas dan Narapidana, yang disusun ke dalam dua package (main dan model), serta menggunakan konsep percabangan, static keyword, dan array/ArrayList.
---
### FITUR UTAMA:
 - Tambah narapidana (Create)
 - Lihat daftar narapidana (Read)
 - Update informasi narapidana (Update)
 - Hapus data narapidana (Delete)
 - Lihat informasi lapas
---
# **DOKUMENTASI OUTPUT** 
Menu Utama
Ketika program dijalankan, pengguna akan melihat menu utama yang terdiri dari beberapa pilihan.

![{072A9C7C-3F1D-4FBF-8BD9-299EE97B06ED}](https://github.com/user-attachments/assets/975421a5-c2f0-47cc-9130-c37ac894b1b8)  
  Pengguna dapat memilih opsi yang diinginkan dengan memasukkan angka yang sesuai.
---
## 1. Tambah Narapidana
Jika pengguna memilih opsi 1, mereka akan diminta untuk memasukkan detail narapidana baru. 
Contoh Output:
### (Jika berhasil)
![{F7B31D89-5976-468C-95CD-2379506795C9}](https://github.com/user-attachments/assets/f889abe2-f06f-4f45-ba34-e7fbb936bf2d)
### (Jika tidak berhasil)
![{E319CBE0-C261-4C65-92C8-47BC3D7F42F4}](https://github.com/user-attachments/assets/a09f4280-0e10-432e-aa7e-bc688b116ebe)
---
## 2. Lihat Semua Narapidana
  Jika pengguna memilih opsi 2, daftar semua narapidana yang ada di sistem akan ditampilkan. Output ini akan menampilkan ID, nama, dan masa tahanan setiap narapidana.
  Contoh output:
  
  ![{21F84DFE-05A3-4F88-BE2E-848EC99487F5}](https://github.com/user-attachments/assets/4dafd085-a3f6-4ed6-b6ea-44a36ae96718)
  
  Jika tidak ada narapidana, program akan menampilkan pesan berikut:
  
  ![{C16CEF1A-E72C-4182-9BA6-A2E2C53FA0B8}](https://github.com/user-attachments/assets/e392d53d-7a18-4fe2-9a81-a8c1730489a9)
---
## 3. Update Data Narapidana
Jika pengguna memilih opsi 3, mereka dapat memperbarui informasi narapidana berdasarkan ID. Setelah memasukkan ID narapidana yang ingin diperbarui, program akan meminta informasi baru untuk menggantikan yang lama. <br>
Contoh output:
  
  ![{AAE8B5E6-E2F5-476B-8B45-5E205D3A382D}](https://github.com/user-attachments/assets/4d018f61-bd3b-4c2c-b92b-f7d9db621e47)
---
## 4. Hapus Narapidana
Jika pengguna memilih opsi 4, mereka dapat menghapus narapidana berdasarkan ID yang dimasukkan. Program akan meminta konfirmasi dari pengguna sebelum menghapus data narapidana.<br>
<br>
Contoh output:

![{E8265B20-8394-47EE-BF65-BA45794B7BFC}](https://github.com/user-attachments/assets/a9cbcfb8-2c5a-4385-8513-ac496b8801ee)
---
## 5. Lihat Informasi Lapas
Jika pengguna memilih opsi 5, program akan menampilkan informasi mengenai lapas, seperti ID lapas, nama lapas, dan kapasitas lapas.<br>
Contoh output:

![{457B57E8-C55B-49CB-B19D-384967BCA471}](https://github.com/user-attachments/assets/2fc318b3-214c-4f1e-9d09-798a7f466ce4)
---
## 0. Keluar<br>
Jika pengguna memilih opsi 0, program akan menampilkan pesan perpisahan dan keluar dari aplikasi.<br>
Contoh output:


![{EEC56836-F697-48D5-BD17-73BDF6A7C5F9}](https://github.com/user-attachments/assets/1a952a3c-55b2-4591-a724-075e05c001b7)
---

# **CATATAN PEMBARUAN** <br>
Berikut adalah penjelasan terkait penambahan yang dilakukan:. <br>
## 1. Inheritance (Pewarisan)
Inheritance diterapkan pada project ini dengan memperkenalkan class abstrak Person yang menjadi parent class dari Narapidana. Semua narapidana adalah Person, sehingga kita dapat menyusun atribut dan metode umum di dalam Person, lalu mewariskannya ke class Narapidana. <br>

## 2.Abstraction (Abstraksi)
Abstraksi diterapkan dengan memperkenalkan interface Manageable yang mendefinisikan operasi CRUD (Create, Read, Update, Delete). Setiap class yang perlu memiliki operasi CRUD akan mengimplementasikan interface ini. <br>

## 3.Encapsulation (Enkapsulasi)
Encapsulation diterapkan melalui penggunaan getter dan setter untuk atribut Narapidana. Atribut-atribut di dalam class Narapidana disembunyikan (private) dan hanya dapat diakses serta dimodifikasi melalui metode getter dan setter. <br>

## 4.Final Keyword <br>
Penggunaan final keyword juga diterapkan dalam project ini. Final digunakan untuk mendefinisikan class yang tidak bisa diwarisi lagi dan variabel yang nilainya tidak bisa diubah setelah diinisialisasi. Class Lapas dibuat final, artinya tidak bisa dijadikan parent class oleh class lain. Selain itu, variabel id juga diberi final sehingga nilainya tidak bisa diubah setelah diberikan.
---
Class Main.java juga telah diubah agar lebih konsisten dengan penggunaan interface Manageable dan class abstrak Person. Operasi CRUD pada Narapidana dan Lapas kini menggunakan metode dari interface Manageable.
