public class ShapePrinter
{

    public static void main(String[] args)
    {
        Triangle triangle = new Triangle(5,3);
        Cube cube = new Cube(6,2,7);
        Square square = new Square(7,3);
        Circle circle = new Circle(5);
        Sphere sphere = new Sphere(3);
        Tetrahedron tetrahedron = new Tetrahedron(8);



        Shape[] shapes = new Shape[6];

        shapes[0] = triangle;
        shapes[1] = cube;
        shapes[2] = square;
        shapes[3] = circle;
        shapes[4] = sphere;
        shapes[5] = tetrahedron;



        for (int i = 0; i < shapes.length; i++)
        {
            System.out.printf("Shape %d is a %s%n", i, shapes[i].getClass().getName());
            System.out.println("area: " + shapes[i].getArea());

            if (shapes[i].getClass().getSuperclass() == ThreeDimensional.class){
                System.out.println("volume: " + ((ThreeDimensional)shapes[i]).getVolume());

            }

            System.out.println("");

        }



    }

}