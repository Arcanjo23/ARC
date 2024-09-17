import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pergunta {

    private String pergunta;
    private String opcaoA;
    private String opcaoB;
    private String opcaoC;
    private String opcaoD;
    private String opcaoE;
    private String correta;


    public Pergunta(String pergunta, String opcaoA, String opcaoB, String opcaoC, String opcaoD, String opcaoE, String correta) {
        this.pergunta = pergunta;
        this.opcaoA = opcaoA;
        this.opcaoB = opcaoB;
        this.opcaoC = opcaoC;
        this.opcaoD = opcaoD;
        this.opcaoE = opcaoE;
        this.correta = correta;
    }

    public boolean isCorreta(String resposta) {
        if (resposta.equalsIgnoreCase(this.correta)) {
            System.out.println("Parabéns, resposta correta! - Letra: " + this.correta);
            System.out.println();
            return true;
        } else {
            System.out.println("Resposta errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            System.out.println();
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
        System.out.println("Resposta inválida! Digite uma opção válida: A, B, C, D ou E. ");
        System.out.println();
        return false;
    }

    public void escrevaPergunta() {
        System.out.println(this.pergunta);
        System.out.println();
        System.out.println("A) " + this.opcaoA);
        System.out.println("B) " + this.opcaoB);
        System.out.println("C) " + this.opcaoC);
        System.out.println("D) " + this.opcaoD);
        System.out.println("E) " + this.opcaoE);
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pergunta> perguntas = new ArrayList<>();
        perguntas.add(new Pergunta(
                "Quando Valorant foi lançado oficialmente em todos os países?",
                "17 de agosto de 2019",
                "7 de abril de 2020",
                "2 de junho de 2020",
                "16 de julho de 2021",
                "19 de setembro de 2021",
                "C"
        ));

        List<Pergunta> perguntas2 = new ArrayList<>();
        perguntas.add(new Pergunta(
                " Quais foram os agentes quando o valorant lançou?",
                "Jett, Omen, Phoenix, Yoru, Viper",
                "Jett, Phoenyx, Raze, Viper, Neon",
                "Jett, Killjoy, Raze, Astra, Sage",
                "Jett, Phoenix, Reyna, Omen, Sova",
                "Jett, Killjoy, Reyna, Omen, Sova",
                "D"
        ));

        List<Pergunta> perguntas3 = new ArrayList<>();
        perguntas.add(new Pergunta(
                "  Quais foram os mapas quando valorant lançou? ",
                "Jett, Omen, Phoenix, Yoru, Viper",
                "Jett, Phoenyx, Raze, Viper, Neon",
                "Jett, Killjoy, Raze, Astra, Sage",
                "Jett, Phoenix, Reyna, Omen, Sova",
                "Jett, Killjoy, Reyna, Omen, Sova",
                "D"
        ));

        List<Pergunta> perguntas4 = new ArrayList<>();
        perguntas.add(new Pergunta(
                " Quais foram os agentes quando o valorant lançou?",
                "Jett, Omen, Phoenix, Yoru, Viper",
                "Jett, Phoenyx, Raze, Viper, Neon",
                "Jett, Killjoy, Raze, Astra, Sage",
                "Jett, Phoenix, Reyna, Omen, Sova",
                "Jett, Killjoy, Reyna, Omen, Sova",
                "D"
        ));

        List<Pergunta> perguntas5 = new ArrayList<>();
        perguntas.add(new Pergunta(
                " Quais foram os agentes quando o valorant lançou?",
                "Jett, Omen, Phoenix, Yoru, Viper",
                "Jett, Phoenyx, Raze, Viper, Neon",
                "Jett, Killjoy, Raze, Astra, Sage",
                "Jett, Phoenix, Reyna, Omen, Sova",
                "Jett, Killjoy, Reyna, Omen, Sova",
                "D"
        ));

        List<Pergunta> perguntas6 = new ArrayList<>();
        perguntas.add(new Pergunta(
                " Quais foram os agentes quando o valorant lançou?",
                "Jett, Omen, Phoenix, Yoru, Viper",
                "Jett, Phoenyx, Raze, Viper, Neon",
                "Jett, Killjoy, Raze, Astra, Sage",
                "Jett, Phoenix, Reyna, Omen, Sova",
                "Jett, Killjoy, Reyna, Omen, Sova",
                "D"
        ));

        List<Pergunta> perguntas7 = new ArrayList<>();
        perguntas.add(new Pergunta(
                " Quais foram os agentes quando o valorant lançou?",
                "Jett, Omen, Phoenix, Yoru, Viper",
                "Jett, Phoenyx, Raze, Viper, Neon",
                "Jett, Killjoy, Raze, Astra, Sage",
                "Jett, Phoenix, Reyna, Omen, Sova",
                "Jett, Killjoy, Reyna, Omen, Sova",
                "D"
        ));

        List<Pergunta> pergunta8 = new ArrayList<>();
        perguntas.add(new Pergunta(
                " Quais foram os agentes quando o valorant lançou?",
                "Jett, Omen, Phoenix, Yoru, Viper",
                "Jett, Phoenyx, Raze, Viper, Neon",
                "Jett, Killjoy, Raze, Astra, Sage",
                "Jett, Phoenix, Reyna, Omen, Sova",
                "Jett, Killjoy, Reyna, Omen, Sova",
                "D"
        ));

        List<Pergunta> perguntas9 = new ArrayList<>();
        perguntas.add(new Pergunta(
                " Quais foram os agentes quando o valorant lançou?",
                "Jett, Omen, Phoenix, Yoru, Viper",
                "Jett, Phoenyx, Raze, Viper, Neon",
                "Jett, Killjoy, Raze, Astra, Sage",
                "Jett, Phoenix, Reyna, Omen, Sova",
                "Jett, Killjoy, Reyna, Omen, Sova",
                "D"
        ));

        List<Pergunta> perguntas10 = new ArrayList<>();
        perguntas.add(new Pergunta(
                " Quais foram os agentes quando o valorant lançou?",
                "Jett, Omen, Phoenix, Yoru, Viper",
                "Jett, Phoenyx, Raze, Viper, Neon",
                "Jett, Killjoy, Raze, Astra, Sage",
                "Jett, Phoenix, Reyna, Omen, Sova",
                "Jett, Killjoy, Reyna, Omen, Sova",
                "D"
        ));

        List<Pergunta> perguntas11 = new ArrayList<>();
        perguntas.add(new Pergunta(
                " Quais foram os agentes quando o valorant lançou?",
                "Jett, Omen, Phoenix, Yoru, Viper",
                "Jett, Phoenyx, Raze, Viper, Neon",
                "Jett, Killjoy, Raze, Astra, Sage",
                "Jett, Phoenix, Reyna, Omen, Sova",
                "Jett, Killjoy, Reyna, Omen, Sova",
                "D"
        ));

        List<Pergunta> perguntas12 = new ArrayList<>();
        perguntas.add(new Pergunta(
                " Quais foram os agentes quando o valorant lançou?",
                "Jett, Omen, Phoenix, Yoru, Viper",
                "Jett, Phoenyx, Raze, Viper, Neon",
                "Jett, Killjoy, Raze, Astra, Sage",
                "Jett, Phoenix, Reyna, Omen, Sova",
                "Jett, Killjoy, Reyna, Omen, Sova",
                "D"
        ));

        List<Pergunta> perguntas13 = new ArrayList<>();
        perguntas.add(new Pergunta(
                " Quais foram os agentes quando o valorant lançou?",
                "Jett, Omen, Phoenix, Yoru, Viper",
                "Jett, Phoenyx, Raze, Viper, Neon",
                "Jett, Killjoy, Raze, Astra, Sage",
                "Jett, Phoenix, Reyna, Omen, Sova",
                "Jett, Killjoy, Reyna, Omen, Sova",
                "D"
        ));

        List<Pergunta> perguntas14 = new ArrayList<>();
        perguntas.add(new Pergunta(
                " Quais foram os agentes quando o valorant lançou?",
                "Jett, Omen, Phoenix, Yoru, Viper",
                "Jett, Phoenyx, Raze, Viper, Neon",
                "Jett, Killjoy, Raze, Astra, Sage",
                "Jett, Phoenix, Reyna, Omen, Sova",
                "Jett, Killjoy, Reyna, Omen, Sova",
                "D"
        ));

        List<Pergunta> perguntas15 = new ArrayList<>();
        perguntas.add(new Pergunta(
                " Quais foram os agentes quando o valorant lançou?",
                "Jett, Omen, Phoenix, Yoru, Viper",
                "Jett, Phoenyx, Raze, Viper, Neon",
                "Jett, Killjoy, Raze, Astra, Sage",
                "Jett, Phoenix, Reyna, Omen, Sova",
                "Jett, Killjoy, Reyna, Omen, Sova",
                "D"
        ));



        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("********************************************");
        System.out.println("*         FACULDADE ALFREDO NASSER         *");
        System.out.println("********************************************");
        System.out.println("*   Aluno: Gabriel Arcanjo Pereira Silva   *");
        System.out.println("*   Professor: Brenno Pimenta da Costa     *");
        System.out.println("********************************************");
        System.out.println("*     Quiz de 15 perguntas sobre Valorant  *");
        System.out.println("********************************************");

        for (Pergunta pergunta : perguntas) {
            pergunta.escrevaPergunta();
            String resposta = pergunta.leiaResposta();
            if (pergunta.isCorreta(resposta)) {
                score++;
            }
        }

        System.out.println("Sua pontuação final é: " + score + "/" + perguntas.size());
    }
}
