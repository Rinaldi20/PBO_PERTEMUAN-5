package com.pbo;

// player
class player{
    String nama ;
    double health;
    int lever;

    Weapon weapon;
    Armor armor;

    player(String nama, double health){
        this.nama = nama;
        this.health = health;
    }
    void attack(player musuh){
        System.out.println(this.nama+" attacking "+musuh.nama + "with power "+ weapon.attackpower);

        double attackpower = this.weapon.attackpower;
        musuh.defence(attackpower);
    }
    void defence(double attackpower){

        // akan mengambil damage
        double damage;
        if(this.armor.defencepower < attackpower){
            damage = attackpower - this.armor.defencepower;
        }else {
            damage = 0;
        }
        this.health-=damage;
        System.out.println(this.nama+" gets damage "+damage);
    }


    void equipweapon(Weapon weapon){
      this.weapon = weapon;
    }
    void equiparmor(Armor armor){
        this.armor = armor;
    }
    void display(){
        System.out.println("\nnama : "+this.nama);
        System.out.println("health : "+this.health+"hp");
        this.weapon.display();
        this.armor.display();
    }



}
// senjata
class Weapon{
    double attackpower;
    String nama ;
    Weapon(String nama, double attackpower){
        this.nama = nama;
        this.attackpower = attackpower;
    }
    void display(){
        System.out.println("weapon : "+this.nama+"power : "+ this.attackpower);
    }

}

// armor
class Armor{
    double defencepower;
    String nama;

    Armor(String nama ,double defencepower){
        this.defencepower = defencepower;
        this.nama = nama;
    }
    void display(){
        System.out.println("armor : "+this.nama+"defence : "+ this.defencepower);
    }
}


public class Latihan1 {
    public static void main(String[] args) {
        // membuat objek player
        player player1 = new player("rinaldi",100);
        player player2 = new player("kenaroh ",50);

        // membuat objek weapon
        Weapon pedang = new Weapon("pedang, ",20);
        Weapon ketapel = new Weapon("ketapel, ",10);

        // membuat objek armor
        Armor bajubesi = new Armor("baju besi, ",20);
        Armor kaos = new Armor("kaos, ", 5);

        // player1
        player1.equipweapon(pedang);
        player1.equiparmor(bajubesi);
        player1.display();

        // player2
        player2.equipweapon(ketapel);
        player2.equiparmor(kaos);
        player2.display();

        System.out.println("\npertempuran");
        System.out.println("\nepisode - 1 \n");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\nepisode - 2 \n");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}
