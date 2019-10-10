class P21_3_050 {
    public void print_1() {
        System.out.println("Hello!");
    }
}

class base extends P21_3_050 {
    public void print_2() {
        System.out.println("World");
    }
}

class base2 extends P21_3_050 {
    public void print_3() {
        System.out.println("NULL!");
    }
}

class two extends P21_3_050 {
    public void print_4() {
        System.out.println("Wassup!");
    }

    public static void main(String[] args) {
        base b = new base();
        b.print_1();
        b.print_2();
        base2 b2 = new base2();
        b2.print_1();
        b2.print_3();
        two t = new two();
        t.print_1();
        t.print_4();
    }
}
