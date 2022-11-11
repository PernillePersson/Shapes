public class Square extends TwoDimensional {
    private int højde;
    private int bredde;

    public Square(int højde, int bredde){
        this.højde = højde;
        this.bredde = bredde;
    }

    @Override
    public double getArea(){
        return højde * bredde;
    }
}


