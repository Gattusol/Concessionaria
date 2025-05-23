public class PessoaJuridica extends Clientes {
    public PessoaJuridica(String nome, int id2, String telefone, String cnpj) {
        super(nome, id2, telefone, cnpj);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de Cliente: Pessoa Jurídica";
    }
}
