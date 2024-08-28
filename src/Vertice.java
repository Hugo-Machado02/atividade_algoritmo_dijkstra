public class Vertice {
    private char destino;
    private int distancia;

    public Vertice(char destino, int distancia) {
        this.destino = destino;
        this.distancia = distancia;
    }

    public char getDestino() {
        return destino;
    }

    public void setDestino(char destino) {
        this.destino = destino;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
}
