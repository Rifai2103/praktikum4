package inheritance.multiple;

class Kendaraan {
    String merk;
    int tahun;
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

public class MainMultiple {
    public static void main(String[] args) {
        Pesawat p = new Pesawat();
        p.merk = "Boeing";
        p.tahun = 2018;
        p.jumlahSayap = 2;
        p.terbang();
    }
}
