package week3;

public class Wall {
    private double width;
    private double height;

    // First constructor (no-arg constructor)
    public Wall() {
        this.width = 0.0;
        this.height = 0.0;
    }

    // Second constructor with parameters width and height
    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0.0;
        } else {
            this.width = width;
        }

        if (height < 0) {
            this.height = 0.0;
        } else {
            this.height = height;
        }
    }

    // Method to get the width
    public double getWidth() {
        return this.width;
    }

    // Method to get the height
    public double getHeight() {
        return this.height;
    }

    // Method to set the width with validation
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0.0;
        } else {
            this.width = width;
        }
    }

    // Method to set the height with validation
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0.0;
        } else {
            this.height = height;
        }
    }

    // Method to calculate the area of the wall
    public double getArea() {
        return this.width * this.height;
    }

    public static void main(String[] args) {
        Wall wall = new Wall (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
