package p13;


import java.util.Date;

public class Motorista {
    private String nome;
    private String codigo;
    private Date dataIngresso;
    private TipoHabilitacao tipoHabilitacao;

    public Motorista(String nome, String codigo) {
        setNome(nome);
        setCodigo(codigo);
    }

    public Date getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(Date dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public TipoHabilitacao getTipoHabilitacao() {
        return tipoHabilitacao;
    }

    public void setTipoHabilitacao(TipoHabilitacao tipoHabilitacao) {
        this.tipoHabilitacao = tipoHabilitacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return getNome() + " (" + getCodigo() + ")";
    }
}