class P22_050 {
    public int year = 2020;
}

class chk extends P22_050 {
    public void show() {
        if (year % 4 == 0) {
            System.out.println("Year is Leap Year");
        } else {
            System.out.println("Year is not Leap year ");
        }
    }

    public static void main(String args[]) {
        chk c = new chk();
        c.show();
    }
}
