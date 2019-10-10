class P20_050 {
    int rollno;
    String name;

    P20_050(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println(rollno + " " + name);
    }

    public static void main(String aargs[]) {
        P20_050 p1 = new P20_050(111, "Bob");
        P20_050 p2 = new P20_050(112, "Alice");
        p1.display();
        p2.display();
    }
}
