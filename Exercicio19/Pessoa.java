package Exercicio19;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String nomeIntermediario;

    public Pessoa(String nome, String sobrenome, String nomeIntermediario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nomeIntermediario = nomeIntermediario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getNomeIntermediario() {
        return nomeIntermediario;
    }
    public void setNomeIntermediario(String nomeIntermediario) {
        this.nomeIntermediario = nomeIntermediario;
    }

    @Override
    public String toString() {
         char primeiraLetraNome = getNome().charAt(0);
        char primeiraLetraNomeIntermediario = getNomeIntermediario().charAt(0);

         return sobrenome.toUpperCase() + ", " + primeiraLetraNome + ". " + primeiraLetraNomeIntermediario + ".";
    }

}
