class AkunBank {
    private String namaPemilik;
    private double saldo;

    public AkunBank(String namaPemilik, double saldo) {
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // getter 
    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    // setter 
    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo tidak boleh negatif!");
        }
    }

    // method tambahan
    public void setor(double jumlah) {
        saldo += jumlah;
    }

    public void tarik(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak cukup!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        AkunBank akun = new AkunBank("Budi", 500000);

        // akses via getter
        System.out.println("Pemilik: " + akun.getNamaPemilik());
        System.out.println("Saldo awal: " + akun.getSaldo());

        // ubah via setter
        akun.setNamaPemilik("Ani");
        akun.setSaldo(1000000);

        System.out.println("Pemilik baru: " + akun.getNamaPemilik());
        System.out.println("Saldo baru: " + akun.getSaldo());

        // gunakan method
        akun.setor(500000);
        akun.tarik(300000);
        System.out.println("Saldo akhir: " + akun.getSaldo());
    }
}
