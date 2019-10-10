final class A {
    public void show_a() {
        System.out.println("Hello!");
    }
}

class B extends A {
    public void show_b() {
        // errors will be generated because when we declare any calss final it can't be
        // inherited!!
        System.out.println("World");
    }

    public static void main(String args[]) {
        B b = new B();
        b.show_a();
        b.show_b();
    }
}
