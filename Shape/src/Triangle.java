public class Triangle extends TwoDimensional{
    private int højde;
    private int bredde;

    public Triangle(int højde, int bredde) {
        this.højde = højde;
        this.bredde = bredde;
    }


    //h*B/2
    @Override
    public double getArea() {
        return højde * bredde / 2;

    }
}

