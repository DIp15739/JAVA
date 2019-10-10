abstract class Shape {
    abstract void area();
}

class Triangle extends Shape {
    int d;
    int b = 9;
    int h = 5;

    public void area() {
        d = b * h;
        System.out.println("Area of triangle is:" + d);
    }
}

class Rectangle extends Shape {
    int a;
    int l = 3;
    int w = 4;

    public void area() {
        a = l * w;
        System.out.println("Area of rectangle is:" + a);
    }
}

class Circle extends Shape {
    double c;
    double pi = 3.14;
    int r = 5;

    public void area() {
        c = pi * r * r;
        System.out.println("Area of circle is:" + c);
    }

    public static void main(String args[]) {
        Shape s;
        s = new Triangle();
        s.area();
        s = new Rectangle();
        s.area();
        s = new Circle();
        s.area();
    }
}
