public class Cube extends ThreeDimensional{
    private int højde;
    private int bredde;
    private int længde;


    public Cube(int højde, int bredde, int længde) {
        this.højde = højde;
        this.bredde = bredde;
        this.længde = længde;
    }


    @Override
    public double getArea(){
        return højde * bredde * 6;
    }

    @Override
    public double getVolume(){
        return højde * bredde * længde;
    }
}
