public class Tetrahedron extends ThreeDimensional
{
    private int længde;
    public Tetrahedron(int længde)
    {
        this.længde = længde;
    }

    @Override
    double getVolume() {
        return (Math.pow(længde, 3) / (6 * Math.sqrt(2)));
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3)*(længde * længde));
    }
}


