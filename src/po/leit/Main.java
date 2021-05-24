package po.leit;

public class Main {

    public static void main(String[] args) {
	Ponto2D p1 = new Ponto2D();
	Ponto2D p2 = new Ponto2D(17, 10);
	Ponto3D p3 = new Ponto3D();
	Ponto3D p4 = new Ponto3D(18,-1, 9);
	Ponto2D novoPonto = p4;

	System.out.println("Ponto p1 = " + p1.toString());
	System.out.println("Ponto p2 = " + p2.toString());
	System.out.println("novoPonto.toString() = " + novoPonto.toString());
    }
}
