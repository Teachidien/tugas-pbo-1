class parent {
    int x = 5;

    public void info() {
        System.out.println("ini class parent");
    }
}

class child extends parent {
    int x = 10;

    public void info() {
        System.out.println("ini class child");
    }
}

class test {
    public static void main (string[] args)
    {
        parent test = new child();
        System.out.println("nilai x =" test.x);
        test.info();
    }
}