public class Clientes {

    private String nome;
    private int id2;
    private String telefone;
    private String cpfoucnpj;

    public Clientes(String nome, int id2, String telefone, String cpfoucnpj) {
        this.nome = nome;
        this.id2 = id2;
        this.telefone = telefone;
        this.cpfoucnpj = cpfoucnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPFOUCNPJ() {
        return cpfoucnpj;
    }

    public void setCPFOUCNPJ(String cpfoucnpj) {
        this.cpfoucnpj = cpfoucnpj;
    }

    @Override
    public String toString() {
        return "------------------------" +
                "\nNúmero: " + id2 +
                "\nNome: " + nome +
                "\nTelefone: " + telefone +
                "\nCPF/CNPJ: " + cpfoucnpj +
                "\n------------------------";
    }
}
