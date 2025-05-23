public class PessoaFisica extends Clientes {
    public PessoaFisica(String nome, int id2, String telefone, String cpf) {
        super(nome, id2, telefone, cpf);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de Cliente: Pessoa Física";
    }
}

