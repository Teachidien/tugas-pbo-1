public class Gaji extends Pegawai {
    /* extend digunakan untuk melakukan pewarisan dari superclass ke subclass */

    private double salary;

    public Gaji(String name, string address, int number, double salary) {
        super(name, address, number);
        setsalary(salary);
    }

    public void mailcheck()
    /*
     * pada method mailcheck ini terjadi overriding karena memiliki nama yang sama
     * dengan method di superclass
     * lalu method pada subclass ini merubah referensinya dari superclass, maka ini
     * dinamakan Upcasting
     */

    {
        System.out.println("Memeriksa gaji didalam surat ");
        System.out.println("surat ditujukan untuk" + getName() + "dengan gaji sebanyak" + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary (douuble newSalary)
    {
        if (newSalary >= 0.0) {
            salary = newSalary
        }
    }

    public double computerpay() {
        System.out.println("menghitung pembayaran gaji untuk" + getName());
        return salary / 52;
    }
}