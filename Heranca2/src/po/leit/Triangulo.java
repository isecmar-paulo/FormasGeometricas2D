package po.leit;

public class Triangulo extends Forma2D {

    private String style;

    public Triangulo() {
        super();
        this.style = "nao definido";
    }

    public Triangulo(String s, double w, double h ) {
        super(w, h); // call superclass constructor
        style = s;
    }

    public Triangulo(String s, double w, double h, Ponto2D local ) {
        super(w, h, local); // call superclass constructor
        style = s;
    }


    Triangulo(double x, int cx, int cy) {
        super(x,cx,cy); // call superclass constructor
        style = "preenchido";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("O triângulo é do estilo " + style);
    }

}
