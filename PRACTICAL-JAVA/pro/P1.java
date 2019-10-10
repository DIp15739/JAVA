interface P1 {
    int a = 10;

    void print_p1();
}

interface P2 {
    int b = 20;

    void print_p2();
}

interface P12 extends P1, P2 {
    int c = 30;

    void print_p12();
}

class Q implements P12 {
    public void print_p1() {
        System.out.println("Value of a:" + a);
    }

    public void print_p2() {
        System.out.println("Value of b:" + b);
    }

    public void print_p12() {
        System.out.println("Value of c:" + c);
    }

    public static void main(String args[]) {
        Q q1 = new Q();
        q1.print_p1();
        q1.print_p2();
        q1.print_p12();
    }
}
