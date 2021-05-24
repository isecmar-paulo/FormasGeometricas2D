package po.leit;




public class Pixel extends Ponto2D {

    private int cor;

    public Pixel() {  }
    public Pixel(int cor) { }
    public Pixel(int x, int y, int cor) { }

    public int getCor() { return cor;  }
    public void mudaCor(int nvCor) { }
    public void somaPixel(Pixel pix) { }
    public void somaPixel(int dx, int dy) { }

    public String toString() {
        StringBuffer s = new StringBuffer();
        s.append(super.toString());
        s.append(", ("); s.append(cor); s.append(" )");
        return s.toString();
    }

    public Pixel clone() {
        return new Pixel(this.getX(), this.getY(), cor);
    }

}