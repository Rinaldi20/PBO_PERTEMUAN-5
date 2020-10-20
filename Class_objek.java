package com.pbo;

class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class Class_objek {

    public static void main(String[] args)  {

        // instansiasi / membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "kenaroh";
        mahasiswa1.NIM = "2014021021";
        mahasiswa1.jurusan = "ilkom";
        mahasiswa1.IPK = 2.5;
        mahasiswa1.umur = 24;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "rinaldi";
        mahasiswa2.NIM = "2019071021";
        mahasiswa2.jurusan = "informatika";
        mahasiswa2.IPK = 3.5;
        mahasiswa2.umur = 19;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }



}
