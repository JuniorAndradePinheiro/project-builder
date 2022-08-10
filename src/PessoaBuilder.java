public class PessoaBuilder {

    Pessoa instancia;

    public PessoaBuilder() {
        this.instancia = new Pessoa();
    }

    public PessoaBuilder nome(String nome){
        this.instancia.setNome(nome);
        return this;
    }

    public PessoaBuilder nomeDoMeio(String nomeMeio){
        this.instancia.setNomeDoMeio(nomeMeio);
        return this;
    }

    public PessoaBuilder ultimoNome(String ultimoNome){
        this.instancia.setUltimoNome(ultimoNome);
        return this;
    }

    public PessoaBuilder endereco(String cep, String logradouro, String cidade, String uf, Integer numero){

        Endereco endereco = new Endereco();

        endereco.setCep(cep);
        endereco.setLogradouro(logradouro);
        endereco.setCidade(cidade);
        endereco.setUf(uf);
        endereco.setNumero(numero);

        this.instancia.setEndereco(endereco);

        return this;
    }

    public Pessoa build(){
        return this.instancia;
    }
}
