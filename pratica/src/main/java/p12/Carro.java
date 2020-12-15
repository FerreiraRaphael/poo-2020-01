package p12;

public class Carro {
    private String placa;

    public Carro(String placa) {
        setPlaca(placa);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String toString() {
        return getPlaca();
    }
}