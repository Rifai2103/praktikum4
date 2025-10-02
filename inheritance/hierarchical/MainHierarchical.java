package inheritance.hierarchical;

class Kendaraan {
    String merk;
    int tahun;

    public void info() {
        System.out.println("Merk: " + merk + ", Tahun: " + tahun);
    }
}

class Mobil extends Kendaraan {
    void klakson() {
        System.out.println("Mobil " + merk + " membunyikan klakson!");
    }
}

class Motor extends Kendaraan {
    void wheelie() {
        System.out.println("Motor " + merk + " melakukan wheelie!");
    }
}

public class MainHierarchical {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.merk = "Honda";
        m.tahun = 2020;
        m.info();
        m.klakson();

        Motor mot = new Motor();
        mot.merk = "Yamaha";
        mot.tahun = 2019;
        mot.info();
        mot.wheelie();
    }
}

