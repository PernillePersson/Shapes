public class Sphere extends ThreeDimensional{

    private int radius;

    public Sphere(int radius)
    {
        this.radius = radius;
    }

    @Override
    double getVolume() {
        return 4 / 3 * Math.PI * radius * radius * radius;
    }


    @Override
    double getArea() {
        return 4 * Math.PI * radius * radius;
    }
}

