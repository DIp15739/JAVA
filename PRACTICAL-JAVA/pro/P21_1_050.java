class P21_1_050 {
    public void print_1() {
        System.out.println("Hello!");
    }
}

class two extends P21_1_050 {
    public void print_2() {
        System.out.println("World");
    }

    public static void main(String[] args) {
        two g = new two();
        g.print_1();
        g.print_2();
        g.print_1();
    }
}
