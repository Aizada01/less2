package Figure;

public class Circle extends Figure {

    private Integer radius;


    public Circle(String name, Integer radius) {
        super(name);
        this.radius = radius;
    }

    public Integer calculatedPerimeter() {
        return (int) (2 * Math.PI * radius);
}

    @Override
    public void draw() {
        System.out.println("\u29BE");

    }

}
