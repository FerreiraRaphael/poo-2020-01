package p11;


public class Telefone {
    private String numero;

    public Telefone(String numero) {
        setNumero(numero);
    }

    public String getNumero() {
        return numero;
    }

    // XXX Terá que validar o número recebido.
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String toString() {
        return getNumero();
    }
}