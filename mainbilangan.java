package com.pbo;

public class mainbilangan {
    public static void main(String[] args) {
        bilangan obil= new bilangan();
        System.out.println("Nilai A = "+obil.tampilkanA());
        System.out.println("Nilai B = "+obil.tampilkanB());
        System.out.println("Nilai B = "+obil.tampilkanC());

        obil.inputA(100);
        System.out.println("nilai A setelah diinput = "+obil.tampilkanA());
        obil.inputB(200);
        System.out.println("nilai A setelah diinput = "+obil.tampilkanB());
        obil.inputC(300);
        System.out.println("nilai A setelah diinput = "+obil.tampilkanC());


        System.out.println("hasil pertambahan = "+obil.tambah());
        System.out.println(" hasil perkalian = " + obil.kali());
        System.out.println("hasil pengurangan = "+obil.kurang());
        System.out.println("hasil pembagian = "+ obil.bagi());
    }

}
