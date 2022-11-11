public class Circle extends TwoDimensional
{
    private int radius;

    public Circle(int radius)
    {
        this.radius = radius;
    }


    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }


}
