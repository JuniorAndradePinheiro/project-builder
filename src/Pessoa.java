public class Pessoa {
    private String nome;
    private String nomeDoMeio;
    private String ultimoNome;
    private Endereco endereco;

    public Pessoa(String nome, String nomeDoMeio, String ultimoNome, Endereco endereco) {
        this.nome = nome;
        this.nomeDoMeio = nomeDoMeio;
        this.ultimoNome = ultimoNome;
        this.endereco = endereco;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDoMeio() {
        return nomeDoMeio;
    }

    public void setNomeDoMeio(String nomeDoMeio) {
        this.nomeDoMeio = nomeDoMeio;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", nomeDoMeio='" + nomeDoMeio + '\'' +
                ", ultimoNome='" + ultimoNome + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
