package com.pbo;

class Mahasiswa3{
    String nama;
    String NIM;
    String jurusan;

    // constructor dengan parameter
    Mahasiswa3(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}
public class Constructor {
    public static void main(String[] args)  {

        Mahasiswa3 mahasiswa1 = new Mahasiswa3("kenaroh","2014071021","ilkom");
        Mahasiswa3 mahasiswa2 = new Mahasiswa3("rinaldi","2019071021","informatika");


    }
}

