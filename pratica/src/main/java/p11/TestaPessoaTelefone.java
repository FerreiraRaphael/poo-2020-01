package p11;


public class TestaPessoaTelefone {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Zeca dos Telefones");

        // Coloca sob controle o estoque do Zeca
        for (int i = 1; i <= 9; i++) {
            p.adicionaTelefone(new Telefone(Integer.toString(i)));
        }
        Telefone t10 = new Telefone("10");
        p.adicionaTelefone(t10);

        System.out.println(p);

        /* Zeca vende um dos telefones
         * Para remover, observe que foi empregada uma referência
         * em vez do número do telefone. Doutra forma o objeto
         * não seria removido, pois a classe Telefone não sobrepõe
         * o método equals. Ou seja, dois objetos só serão iguais
         * caso as referências empregadas indiquem o mesmo objeto.
         */
        p.removeTelefone(t10);

        System.out.println(p);
    }
}