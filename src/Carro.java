public class Carro extends Automoveis {
    public Carro(String modelo, int id, int ano, float valor, String fabricante, String status) {
        super(modelo, id, ano, valor, fabricante, "Carro", status);
    }

    @Override
    public String toString() {
        return "(aCarro) " + getModelo() + " | Fabricante: " + getFabricante() + " | Valor: R$" + getValor();
    }
}
