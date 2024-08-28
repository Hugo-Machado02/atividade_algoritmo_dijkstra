import java.util.*;

public class Grafo {
    private Map<Character, ArrayList<Vertice>> adjacencias;
    private Map<Character, Integer> distancias;

    public Grafo() {
        this.adjacencias = new HashMap<>();
        this.distancias = new HashMap<>();
    }

    public void adicionarAresta(char origem, char destino, int distancia) {
        this.adjacencias.computeIfAbsent(origem, k -> new ArrayList<>()).add(new Vertice(destino, distancia));
        this.adjacencias.computeIfAbsent(destino, k -> new ArrayList<>()).add(new Vertice(origem, distancia));
    }

    public void verificaDistancia(char origem, char destino) {
        if (this.distancias.containsKey(destino)) {
            int distancia = this.distancias.get(destino);
            if (distancia == Integer.MAX_VALUE) {
                System.out.println("-> Não existe um caminho de " + origem + " até " + destino);
            } else {
                System.out.println("-> Menor distância entre " + origem + " e " + destino + ": " + distancia);
            }
        } else {
            System.out.println("-> Vértice " + destino + " inexistente.");
        }
    }

    public void dijkstra(char origem) {
        for (char vertice : this.adjacencias.keySet()) {
            this.distancias.put(vertice, Integer.MAX_VALUE);
        }
        this.distancias.put(origem, 0);


        PriorityQueue<Vertice> prioridade = new PriorityQueue<>(Comparator.comparingInt(a -> a.getDistancia()));
        prioridade.add(new Vertice(origem, 0));

        while (!prioridade.isEmpty()) {
            Vertice atual = prioridade.poll();
            char verticeAtual = atual.getDestino();
            int distanciaAtual = atual.getDistancia();

            if (distanciaAtual > this.distancias.get(verticeAtual)) continue;

            ArrayList<Vertice> ligacao = this.adjacencias.get(verticeAtual);
            if (ligacao != null) {
                for (Vertice vizinho : ligacao) {
                    char v = vizinho.getDestino();
                    int novaDistancia = distanciaAtual + vizinho.getDistancia();

                    if (novaDistancia < this.distancias.get(v)) {
                        this.distancias.put(v, novaDistancia);
                        prioridade.add(new Vertice(v, novaDistancia));
                    }
                }
            }
        }

        System.out.println("Distâncias a partir do vértice " + origem + ":");
        for (Map.Entry<Character, Integer> entry : this.distancias.entrySet()) {
            System.out.println("Vértice " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
