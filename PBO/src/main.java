public class main {
    public static void main(string[] args) {
        gaji s = new gaji("wahyu", "kubar", 3, 5000);

        System.out.println("menyusun gaji");
        System.out.println("panggil mailcheck berdasarkan referensi gaji");
        s.mailcheck();
        System.out.println("");

        System.out.println("menyusun pegawai");
        pegawai e = new gaji("nama", "samarinda", 2, 2500);
        System.out.println("panggil mailcheck berdasarkan referensi pegawai");
        e.mailcheck();

    }
}