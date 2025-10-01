package inheritance;

class Kendaraan {
    String merk;
    int tahun;

    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    public void info() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
    }

    public void jalan() {
        System.out.println(merk + " sedang berjalan...");
    }
}

class Mobil extends Kendaraan {
    int jumlahPintu;

    public Mobil(String merk, int tahun, int jumlahPintu) {
        super(merk, tahun); 
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void info() {
        super.info(); 
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }

    public void klakson() {
        System.out.println(merk + " membunyikan klakson: Tiiinnn!");
    }
}

class Motor extends Kendaraan {
    String jenis;

    public Motor(String merk, int tahun, String jenis) {
        super(merk, tahun);
        this.jenis = jenis;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Jenis Motor: " + jenis);
    }

    public void wheelie() {
        System.out.println(merk + " sedang melakukan wheelie!");
    }
}

class SpdListrik extends Kendaraan {
    String jenis;

    public SpdListrik(String merk, int tahun, String jenis) {
        super(merk, tahun);
        this.jenis = jenis;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Jenis Sepeda Listrik: " + jenis);
    }

    public void dragrace() {
        System.out.println(merk + " sedang melakukan drag race!");
    }
}


public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota Avanza", 2020, 4);
        Motor motor = new Motor("Yamaha R15", 2022, "Sport");
        SpdListrik spd = new SpdListrik("Gooda XYZ", 2024, "Hama");

        System.out.println("=== Data Mobil ===");
        mobil.info();
        mobil.jalan();
        mobil.klakson();

        System.out.println("\n=== Data Motor ===");
        motor.info();
        motor.jalan();
        motor.wheelie();

        System.out.println("\n=== Data Sepeda Listrik ===");
        spd.info();
        spd.jalan();
        spd.dragrace();
    }
}
