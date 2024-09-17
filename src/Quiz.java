import java.util.Scanner;


public class Quiz {

    String pergunta = "";
    String opcaoA = "";
    String opcaoB = "";
    String opcaoC = "";
    String opcaoD = "";
    String opcaoE = "";
    String correta = "";

    public boolean isCorreta(String resposta) {
        if (resposta.equalsIgnoreCase(this.correta)) {
            System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
            System.out.println("");
            return true;
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            System.out.println("");
            return false;
        }
    }

    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    private boolean respostaValida(String resp) {
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
            return true;
        }
        System.out.println("Resposta inválida! Digite opção A, B, C, D ou E. ");
        System.out.println("");
        return false;
    }

    public void escrevaQuestao() {
        System.out.println(this.pergunta);
        System.out.println();
        System.out.println(this.opcaoA);
        System.out.println(this.opcaoB);
        System.out.println(this.opcaoC);
        System.out.println(this.opcaoD);
        System.out.println(this.opcaoE);
        System.out.println();
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("********************************************");
        System.out.println("*         FACULDADE ALFREDO NASSER         *");
        System.out.println("********************************************");
        System.out.println("*   Aluno: Gabriel Arcanjo Pereira Silva   *");
        System.out.println("*   Professor: Brenno Pimenta da Costa     *");
        System.out.println("********************************************");
        System.out.println("*     Quiz de 15 perguntas de Valorant     *");
        System.out.println("********************************************");


        System.out.println("Pergunta 1: Quando valorant foi lançado oficialmente em todos os países? ");
        System.out.println("a) 17 de agosto de 2019()");
        System.out.println("b) 7 de abril de 2020()");
        System.out.println("c) 2 de junho de 2020()");
        System.out.println("d) 16 de julho de 2021()");
        System.out.print("Sua resposta: ");
        String resposta1 = scanner.nextLine();

        if (resposta1.equalsIgnoreCase("c")) {
            score++;
        }
    }
}