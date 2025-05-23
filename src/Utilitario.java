public class Utilitario extends Automoveis {
    public Utilitario(String modelo, int id, int ano, float valor, String fabricante, String status) {
        super(modelo, id, ano, valor, fabricante, "Utilitário", status);
    }

    @Override
    public String toString() {
        return "(Utilitatario) " + getModelo() + " | Ano: " + getAno();
    }
}
