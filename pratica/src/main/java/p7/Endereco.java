package p7;

public class Endereco {

    /* Você deveria acrescentar outros atributos
     * para que esta classe seja considerada adequada
     */
    private String rua;
    private String setor;

    public Endereco(String rua, String setor) {
        super();
        this.rua = rua;
        this.setor = setor;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}