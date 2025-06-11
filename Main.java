public class Main {
    public static void main(String[] args) {

        System.out.println("### Etapa 1: Usando o Builder para criar objetos Tema complexos ###");
        Tema temaEscuro = new Tema.TemaBuilder()
                .comCorDeFundo("#2d2d2d")
                .comCorDaFonte("#e0e0e0")
                .comFonte("Consolas", 14)
                .build();

        Tema temaClaro = new Tema.TemaBuilder()
                .comCorDeFundo("#fafafa")
                .comCorDaFonte("#333333")
                .comFonte("Arial", 12)
                .build();
        System.out.println("Temas criados com sucesso.\n");


        System.out.println("### Etapa 2: Configurando o Gerenciador (Singleton) e usando a Fábrica (Factory Method) ###");
        GerenciadorDeTemas gerenciador = GerenciadorWindows.getInstance();

        // ---- Teste com Tema Escuro ----
        System.out.println("\n--- Usando o Tema Escuro ---");
        gerenciador.setTemaAtivo(temaEscuro);

        Botao botaoEscuro = gerenciador.criarBotao();
        System.out.print("--> Resultado: ");
        botaoEscuro.renderizar();

        // ---- Teste com Tema Claro ----
        System.out.println("\n--- Usando o Tema Claro ---");
        gerenciador.setTemaAtivo(temaClaro);

        Botao botaoClaro = gerenciador.criarBotao();
        System.out.print("--> Resultado: ");
        botaoClaro.renderizar();
    }
}