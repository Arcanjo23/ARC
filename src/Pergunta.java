import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pergunta {

    private final String pergunta;
    private final String opcaoA;
    private final String opcaoB;
    private final String opcaoC;
    private final String opcaoD;
    private final String opcaoE;
    private final String correta;

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

        // Pergunta 1
        perguntas.add(new Pergunta(
                "Qual é o nome do mapa lançado junto com o jogo?",
                "Bind",
                "Haven",
                "Ascent",
                "Icebox",
                "Split",
                "A"
        ));

        // Pergunta 2
        perguntas.add(new Pergunta(
                "Qual é a habilidade de Sage?",
                "Cura e ressuscitação",
                "Criar paredes",
                "Invisibilidade",
                "Teleportação",
                "Armadilha de veneno",
                "A"
        ));

        // Pergunta 3
        perguntas.add(new Pergunta(
                "Qual é o nome do agente com habilidades de rastreamento?",
                "Reyna",
                "Omen",
                "Sova",
                "Phoenix",
                "Viper",
                "C"
        ));

        // Pergunta 4
        perguntas.add(new Pergunta(
                "Qual é o agente que usa a habilidade de 'Paranoia'?",
                "Phoenix",
                "Sova",
                "Omen",
                "Astra",
                "Breach",
                "C"
        ));

        // Pergunta 5
        perguntas.add(new Pergunta(
                "Qual é a arma que custa 2050 créditos no jogo?",
                "Vandal",
                "Marshal",
                "Sheriff",
                "Guardian",
                "Bulldog",
                "E"
        ));

        // Pergunta 6
        perguntas.add(new Pergunta(
                "Qual é o nome do desenvolvedor de Valorant?",
                "Epic Games",
                "Riot Games",
                "Valve",
                "Activision",
                "Blizzard",
                "B"
        ));

        // Pergunta 7
        perguntas.add(new Pergunta(
                "Em qual modo do jogo os jogadores jogam apenas com uma vida por rodada?",
                "Modo Contagem Regressiva",
                "Modo Competitivo",
                "Modo Deathmatch",
                "Modo Spike Rush",
                "Mata-Mata",
                "B"
        ));

        // Pergunta 8
        perguntas.add(new Pergunta(
                "Qual agente foi o primeiro a ter uma habilidade de cura?",
                "Sage",
                "Viper",
                "Astra",
                "Breach",
                "Omen",
                "A"
        ));

        // Pergunta 9
        perguntas.add(new Pergunta(
                "Qual é o nome da habilidade de 'smoke' de Omen?",
                "Shrouded Step",
                "Dark Cover",
                "Paranoia",
                "Blinding Light",
                "Phoenix Flame",
                "B"
        ));

        // Pergunta 10
        perguntas.add(new Pergunta(
                "Qual é o nome da habilidade de 'explosão' de Raze?",
                "Boom Bot",
                "Cluster Grenade",
                "Paint Shells",
                "Explosive Charge",
                "Shock Dart",
                "C"
        ));

        // Pergunta 11
        perguntas.add(new Pergunta(
                "Qual é o nome do recurso de 'rápido teleporte' de Jett?",
                "Tailwind",
                "Cloudburst",
                "Updraft",
                "Shock Dart",
                "Windstrike",
                "A"
        ));

        // Pergunta 12
        perguntas.add(new Pergunta(
                "Quem é o personagem do jogo que foi inspirado por uma lenda asiática?",
                "Phoenix",
                "Omen",
                "Jett",
                "Breach",
                "Astra",
                "C"
        ));

        // Pergunta 13
        perguntas.add(new Pergunta(
                "Qual é a principal habilidade de Viper?",
                "Armadilha de veneno",
                "Poço de ácido",
                "Veneno contínuo",
                "Fumaça venenosa",
                "Parede de veneno",
                "D"
        ));

        // Pergunta 14
        perguntas.add(new Pergunta(
                "Qual é o nome do modo de jogo 5v5 onde os jogadores devem pegar e plantar a Spike?",
                "Team Deathmatch",
                "Escalation",
                "Competitive",
                "Bomb Rush",
                "Plant and Destroy",
                "C"
        ));

        // Pergunta 15
        perguntas.add(new Pergunta(
                "Qual personagem possui uma habilidade chamada 'Run It Back'?",
                "Phoenix",
                "Astra",
                "Reyna",
                "Breach",
                "Omen",
                "A"
        ));

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
        double porcentagem = (score / 15.0) * 100;
        System.out.println("Porcentagem de acerto: " + String.format("%.2f", porcentagem) + "%");
    }
}
