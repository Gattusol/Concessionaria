public class Moto extends Automoveis {
    public Moto(String modelo, int id, int ano, float valor, String fabricante, String status) {
        super(modelo, id, ano, valor, fabricante, "Moto", status);
    }

    @Override
    public String toString() {
        return "(Moto) " + getModelo() + " | " + getFabricante();
    }
}
