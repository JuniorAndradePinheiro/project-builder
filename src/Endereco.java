public class Endereco {

    private String cep;
    private String logradouro;
    private String cidade;
    private String uf;
    private Integer numero;


    public Endereco(String cep, String logradouro, String cidade, String uf, Integer numero) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.uf = uf;
        this.numero = numero;
    }

    public Endereco() {
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                ", numero=" + numero +
                '}';
    }
}
