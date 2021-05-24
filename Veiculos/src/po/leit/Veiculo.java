package po.leit;

public class Veiculo {
    private final int passengers; // numero de passageiros
    private final int fuelcap;    // capacidade tanque combustive
    private final int efic; // quantos kilometro por litro de combustivel

    public Veiculo(int passengers, int fuelcap, int efic) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.efic = efic;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public int getEfic() {
        return efic;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "passengers=" + passengers +
                ", fuelcap=" + fuelcap +
                ", efic=" + efic +
                '}';
    }

    public int alcance() {
        return fuelcap * efic;
    }

    // Calcule o combustível necessário para uma determinada distância.
    double combustivelnecessario(int kms) {
        return (double) kms / efic;
    }
}
