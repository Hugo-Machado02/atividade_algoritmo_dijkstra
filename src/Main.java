import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int op = 0;
        do {
            System.out.println("\n\n===================== Menu ====================");
            System.out.println("1- Atividade 01");
            System.out.println("2- Atividade 02");
            System.out.println("0- Sair");
            System.out.printf("Selecione uma opção: ");
            op = scan.nextInt();
            System.out.println("===============================================");

            switch (op) {
                case 0:
                    System.out.println("==> Finalizando a sessão de Consulta!");
                    break;

                case 1:
                    System.out.println("================= Atividade 01 ================");
                    Atividade01();
                    System.out.println("\n\n===============================================");
                    break;

                case 2:
                    System.out.println("\n\n================= Atividade 02 ================");
                    Atividade02();
                    System.out.println("===============================================");
                    break;

                default:
                    System.out.println("==> Opção não valida... Tente Novamente!");

            }
        }while(op != 0);



    }

    public static void Atividade01(){
        Grafo g1 = new Grafo();
        // Adicionando arestas entre os vértices
        g1.adicionarAresta('A', 'B', 140);
        g1.adicionarAresta('A', 'D', 85);
        g1.adicionarAresta('B', 'F', 26);
        g1.adicionarAresta('D', 'C', 19);
        g1.adicionarAresta('D', 'E', 39);
        g1.adicionarAresta('F', 'C', 12);
        g1.adicionarAresta('F', 'H', 100);
        g1.adicionarAresta('F', 'L', 65);
        g1.adicionarAresta('F', 'M', 67);
        g1.adicionarAresta('H', 'L', 70);
        g1.adicionarAresta('C', 'I', 126);
        g1.adicionarAresta('E', 'G', 30);
        g1.adicionarAresta('E', 'I', 105);
        g1.adicionarAresta('G', 'I', 74);
        g1.adicionarAresta('I', 'M', 30);
        g1.adicionarAresta('M', 'P', 110);
        g1.adicionarAresta('L', 'P', 31);
        g1.adicionarAresta('P', 'N', 70);
        g1.adicionarAresta('N', 'J', 61);

        g1.dijkstra('A');

        g1.verificaDistancia('A', 'B');
        g1.verificaDistancia('A', 'C');
        g1.verificaDistancia('A', 'D');
        g1.verificaDistancia('A', 'E');
        g1.verificaDistancia('A', 'F');
        g1.verificaDistancia('A', 'G');
        g1.verificaDistancia('A', 'H');
        g1.verificaDistancia('A', 'I');
        g1.verificaDistancia('A', 'J');
        g1.verificaDistancia('A', 'L');
        g1.verificaDistancia('A', 'M');
        g1.verificaDistancia('A', 'N');
        g1.verificaDistancia('A', 'P');
    }

    public static void Atividade02(){
        Grafo g2 = new Grafo();

        g2.adicionarAresta('A', 'B', 11);
        g2.adicionarAresta('A', 'C', 5);
        g2.adicionarAresta('A', 'D', 8);
        g2.adicionarAresta('B', 'D', 3);
        g2.adicionarAresta('B', 'G', 8);
        g2.adicionarAresta('C', 'D', 2);
        g2.adicionarAresta('C', 'E', 8);
        g2.adicionarAresta('D', 'E', 4);
        g2.adicionarAresta('D', 'G', 2);
        g2.adicionarAresta('D', 'H', 11);
        g2.adicionarAresta('E', 'H', 4);
        g2.adicionarAresta('E', 'F', 15);
        g2.adicionarAresta('F', 'G', 3);
        g2.adicionarAresta('G', 'H', 2);

        g2.dijkstra('A');

        g2.verificaDistancia('A', 'B');
        g2.verificaDistancia('A', 'C');
        g2.verificaDistancia('A', 'D');
        g2.verificaDistancia('A', 'E');
        g2.verificaDistancia('A', 'F');
        g2.verificaDistancia('A', 'G');
        g2.verificaDistancia('A', 'H');
    }
}
