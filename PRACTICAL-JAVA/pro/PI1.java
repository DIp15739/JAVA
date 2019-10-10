interface PI1 {
    void show_PI1();
}

interface PI2 {
    void show_PI2();
}

class P24_050 implements PI1, PI2 {
    public void show_PI1() {
        System.out.println("Hello");
    }

    public void show_PI2() {
        System.out.println("World!");
    }

    public static void main(String args[]) {
        P24_050 p = new P24_050();
        p.show_PI1();
        p.show_PI2();
    }
}
