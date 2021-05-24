package po.leit;

public class Ponto3D extends Ponto2D {
    private  int z;
    public Ponto3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }

    public Ponto3D() {
        super();
        this.z = 0;
    }

    public int getZ() { return z; }

    public void desloca(int dx, int dy, int dz) {
        super.desloca(dx,dy);
        this.z += dz;
    }

    public Ponto3D somaPonto(int dx, int dy, int dz) {
       /* Ponto3D aux = new Ponto3D(this.getX()+dx, this.getY() + dy, z+dz)
        return aux; */
        return new Ponto3D(this.getX()+dx, this.getY() + dy, z+dz);

    }
    public void somaPonto(Ponto3D p) {
        super.somaPonto(p);  this.z += p.getZ();
    }

    public String toString() {
        StringBuffer s = new StringBuffer();
        s.append(super.toString());
        s.append(", "); s.append(z);
        return s.toString();
    }

    public Ponto3D clone() {
        return new Ponto3D(this.getX(), this.getY(), z);
    }

}
