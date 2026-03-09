public class Moneda {

    private String base;
    private String destino;
    private double valor;

    public Moneda(String base, String destino, double valor) {
        this.base = base;
        this.destino = destino;
        this.valor = valor;
    }

    public String getBase() {
        return base;
    }

    public String getDestino() {
        return destino;
    }

    public double getValor() {
        return valor;
    }
}