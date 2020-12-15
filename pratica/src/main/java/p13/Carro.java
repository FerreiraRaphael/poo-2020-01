package p13;

public class Carro {
    private String placa;
    private Tipo tipo;

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    private Categoria categoria;

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