package inheritance.multilevel;

class Kendaraan {
    String merk;
    int tahun;

    public void info() {
        System.out.println("Merk: " + merk + ", Tahun: " + tahun);
    }
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

public class MainMultilevel {
    public static void main(String[] args) {
        MobilSport ms = new MobilSport();
        ms.merk = "Ferrari";
        ms.tahun = 2022;
        ms.jumlahPintu = 2;
        ms.horsePower = 800;
        ms.info();
        ms.nitroBoost();
    }
}
