class P21_2_050 {
    public void print_1() {
        System.out.println("Hello!");
    }
}

class base extends P21_2_050 {
    public void print_2() {
        System.out.println("World");
    }
}

class two extends base {
    public void print_3() {
        System.out.println("Wassup!");
    }

    public static void main(String[] args) {
        two g = new two();
        g.print_1();
        g.print_2();
        g.print_3();
    }
}
