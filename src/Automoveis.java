public class Automoveis {

    private String modelo;
    private int id;
    private int ano;
    private float valor;
    private String fabricante;
    private String tipo;
    private String status;

    public Automoveis(String modelo, int id, int ano, float valor, String fabricante, String tipo, String status) {
        this.modelo = modelo;
        this.id = id;
        this.ano = ano;
        this.valor = valor;
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.status = status;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "------------------------" +
                "\nNúmero: " + id +
                "\nModelo: " + modelo +
                "\nFabricante: " + fabricante +
                "\nAno: " + ano +
                "\nValor: R$ " + String.format("%.2f", valor) +
                "\nTipo: " + tipo +
                "\nStatus: " + status +
                "\n------------------------";
    }
}





