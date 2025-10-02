package inheritance.single;

class Kendaraan {
    String merk;
    int tahun;

    public void info() {
        System.out.println("Merk: " + merk + ", Tahun: " + tahun);
    }
}

class Mobil extends Kendaraan {
    int jumlahPintu;

    public void bukaPintu() {
        System.out.println("Mobil membuka pintu: " + jumlahPintu);
    }
}

public class MainSingle {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.merk = "Toyota";
        m.tahun = 2020;
        m.jumlahPintu = 4;
        m.info();
        m.bukaPintu();
    }
}
