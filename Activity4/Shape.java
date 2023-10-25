public enum Shape {
    CIRCLE(3.0), SQUARE(4.0), TRIANGLE(3.0);

    private double sides;

    Shape(double sides) {
        this.sides = sides;
    }

    public double calculateArea() {
        switch (this) {
            case CIRCLE:
                return Math.PI * Math.pow(sides / 2, 2);
            case SQUARE:
                return Math.pow(sides, 2);
            case TRIANGLE:
                return (Math.sqrt(3) / 4) * Math.pow(sides, 2);
            default:
                return 0.0;
        }
    }

    public double calculatePerimeter() {
        return sides * (this == CIRCLE ? 2 * Math.PI : 1.0);
    }
}