package lab7;

public class bai1 {
    interface Shape {
        double getArea();
        double getPerimeter();
    }

    static class Triangle implements Shape {
        private double side1;
        private double side2;
        private double side3;
        private double perimeter;

        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            this.perimeter = side1 + side2 + side3;
        }

        @Override
        public double getArea() {
            double s = perimeter / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }

        @Override
        public double getPerimeter() {
            return perimeter;
        }
    }

    static class Rectangle implements Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public void setSize(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public boolean isSquare() {
            return width == height;
        }

        @Override
        public double getArea() {
            return width * height;
        }

        @Override
        public double getPerimeter() {
            return 2 * (width + height);
        }
    }

    static class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }


}
 class Main {
    public static void main(String[] args) {
        bai1.Shape[] shapes = new bai1.Shape[4];

        shapes[0] = new bai1.Rectangle(4, 5);
        shapes[1] = new bai1.Triangle(3, 4, 5);
        shapes[2] = new bai1.Circle(2.5);
        shapes[3] = new bai1.Rectangle(2, 2);

        for (bai1.Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());

            if (shape instanceof bai1.Rectangle) {
                bai1.Rectangle rect = (bai1.Rectangle) shape;
                System.out.println("Is square: " + rect.isSquare());
            }

            System.out.println();
        }
    }
}
