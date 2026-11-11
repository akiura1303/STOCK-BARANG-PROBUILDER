# Stok Barang - Android Native App (Java & SQLite)

## Cara Mendapatkan File APK (.apk):

### CARA 1: Melalui Android Studio (Lokal di Laptop/PC)
1. Ekstrak file zip ini ke folder komputer Anda.
2. Buka **Android Studio** -> Pilih **Open** -> Arahkan ke folder hasil ekstrak.
3. Tunggu proses **Gradle Sync** selesai (~1 menit).
4. Klik menu: **Build > Build Bundle(s) / APK(s) > Build APK(s)**
   atau jalankan di terminal:
   ```bash
   ./gradlew assembleDebug
   ```
5. File APK siap install akan berada di:
   `app/build/outputs/apk/debug/app-debug.apk`

### CARA 2: Otomatis via GitHub Actions (Cloud Tanpa Android Studio)
1. Buat repository baru di GitHub Anda (Gratis).
2. Upload seluruh isi folder hasil ekstrak.
3. Buka tab **Actions** di GitHub -> Workflow "Build Android APK" akan otomatis berjalan.
4. Klik hasil build -> Download file **StokBarang-APK.zip** yang berisi `app-debug.apk` langsung!

100% Offline, Menggunakan SQLiteOpenHelper lokal tanpa server/internet.