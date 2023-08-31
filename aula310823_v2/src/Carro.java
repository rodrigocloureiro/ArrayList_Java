public class Carro implements Comparable<Carro> {
    private String modelo;
    private String fabricante;
    private int cavalos;

    public Carro(String modelo, String fabricante, int cavalos) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cavalos = cavalos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    @Override
    public String toString() {
        return "{" +
                "modelo: " +
                this.modelo + ", " +
                "fabricante: " + " " +
                this.fabricante + ", " +
                "cavalos: " +
                this.cavalos +
                "}";
    }

    @Override
    public int compareTo(Carro outroCarro) {
//        return this.modelo.compareTo(outroCarro.getModelo());
        return this.fabricante.compareTo(outroCarro.getFabricante());
    }
}
