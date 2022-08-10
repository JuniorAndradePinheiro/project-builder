public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new PessoaBuilder().nome("Zezinho")
                .nomeDoMeio("Silva")
                .ultimoNome("Souza")
                .endereco("111122323","rua 1", "Praia Grande","SP", 1233)
                        .build();

        System.out.println(p1);
    }
}
