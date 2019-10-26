# dts-modul11
Contoh backend calories modul 11 dts

## Cara penggunaan
Berikut ini hal-hal yang perlu dipersiapkan
1. Database mysql sudah terinstall
2. Buatlah database dengan nama `dts` user `root`, dan password `` atau sesuaikan dengan mengubah file `application.properties`
3. Buka project dengan editor kesayangan Anda, Netbeans, Intellij, Android Studio
4. Atau bisa menggunakan maven dengan mengetik perintah `mvn install`

## Daftar End point
1. `http://localhost:8081/api/v.1.0/calories` methode GET untuk mendapatkan semua kalories
2. `http://localhost:8081/api/v.1.0/calories/[id]` methode GET untuk mendapatkan kalori berdasarkan id
3. `http://localhost:8081/api/v.1.0/calories/[id]` methode PUT untuk update kalori
4. `http://localhost:8081/api/v.1.0/calories`[id] methode DELETE untuk menghapus kalori
5. `http://localhost:8081/api/v.1.0/calories` methode POST untuk menyimpan
