package minggu7;

public class pencarianmhs {
    mahasiswa listMHs[];
    int idx;
    public pencarianmhs(int jumMhs){
        listMHs = new mahasiswa[jumMhs];
    }

    void tambah(mahasiswa m) {
        if (idx < listMHs.length) {
            listMHs[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil() {
        for (mahasiswa m : listMHs) {
            m.tampil();
            System.out.println("========================");
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listMHs.length; j++) {
            if (listMHs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    // public int FindBinarySearch(int cari, int left, int right) {
    //     int mid;
    //     if (right >= left) {
    //         mid = (left + right) / 2;
           
    //         if (listMHs[mid].nim < cari) {
    //             return FindBinarySearch(cari, left, mid - 1);
    //         } else if (listMHs[mid].nim > cari) {
    //             return FindBinarySearch(cari, mid + 1, right);
    //         } else {
    //             return mid;
    //         }
    //     }

    //     return -1;
    // }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMHs[mid].nim) {
                return (mid);
            } else if (listMHs[mid].nim > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + "ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan ");
        }
    }

    public void tampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + listMHs[pos].nama);
            System.out.println("Umur\t : " + listMHs[pos].umur);
            System.out.println("IPK\t : " + listMHs[pos].ipk);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }

    }

}
