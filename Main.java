
package TugasInheritance;

public class Main {
    public static void main(String[] args) {

        Persegi p1 = new Persegi(5);
        System.out.println("=== PERSEGI ===");
        System.out.println("Luas: " + p1.luas());
        System.out.println("Keliling: " + p1.keliling());

        Lingkaran l1 = new Lingkaran(7);
        System.out.println("\n=== LINGKARAN ===");
        System.out.println("Luas: " + l1.luas());
        System.out.println("Keliling: " + l1.keliling());

        PersegiPanjang pp1 = new PersegiPanjang(8, 4);
        System.out.println("\n=== PERSEGI PANJANG ===");
        System.out.println("Luas: " + pp1.luas());
        System.out.println("Keliling: " + pp1.keliling());

        Segitiga s1 = new Segitiga(6, 8);
        System.out.println("\n=== SEGITIGA ===");
        System.out.println("Luas: " + s1.luas());
        System.out.println("Keliling: " + s1.keliling());
    }
}

//parent class
class BangunDatar {

    public float luas() {
        return 0;
    }

    public float keliling() {
        return 0;
    }
}

//child class
class Persegi extends BangunDatar {

    float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    //Override
    public float luas() {
        return sisi * sisi;
    }

    //Override
    public float keliling() {
        return 4 * sisi;
    }
}

//child class
class Lingkaran extends BangunDatar {

    float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    //Override
    public float luas() {
        return 3.14f * r * r;
    }

    //Override
    public float keliling() {
        return 2 * 3.14f * r;
    }
}

//child class
class PersegiPanjang extends BangunDatar {

    float panjang;
    float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    //Override
    public float luas() {
        return panjang * lebar;
    }

    //Override
    public float keliling() {
        return 2 * (panjang + lebar);
    }
}

//child class
class Segitiga extends BangunDatar {

    float alas;
    float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    //Override
    public float luas() {
        return (alas * tinggi) / 2;
    }

    //Override
    public float keliling() {
        float miring = (float) Math.sqrt(
            alas * alas + tinggi * tinggi
        );
        return alas + tinggi + miring;
    }
}
