package inheritance.hybrid;

class Kendaraan {
    String merk;
    int tahun;
}

class Mobil extends Kendaraan {
    int jumlahPintu;
}

class MobilSport extends Mobil {
    int horsePower;

    public void nitroBoost() {
        System.out.println("Mobil sport " + merk + " aktifkan nitro dengan " + horsePower + " HP!");
    }
}

interface BisaTerbang {
    void terbang();
}

class Pesawat extends Kendaraan implements BisaTerbang {
    int jumlahSayap;

    public void terbang() {
        System.out.println("Pesawat " + merk + " terbang dengan " + jumlahSayap + " sayap.");
    }
}

class JetTempur extends Pesawat {
    boolean adaRudal;

    public void serang() {
        if (adaRudal) {
            System.out.println("Jet tempur " + merk + " meluncurkan rudal!");
        } else {
            System.out.println("Jet tempur " + merk + " tidak punya rudal.");
        }
    }
}

public class MainHybrid {
    public static void main(String[] args) {
        MobilSport ms = new MobilSport();
        ms.merk = "Lamborghini";
        ms.tahun = 2022;
        ms.jumlahPintu = 2;
        ms.horsePower = 900;
        ms.nitroBoost();

        JetTempur jt = new JetTempur();
        jt.merk = "F-16";
        jt.tahun = 2023;
        jt.jumlahSayap = 2;
        jt.adaRudal = true;
        jt.terbang();
        jt.serang();
    }
}

