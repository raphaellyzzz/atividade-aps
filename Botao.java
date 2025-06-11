public interface Botao {
    void renderizar();

    public class BotaoWindows implements Botao {
        private final String corDeFundo;
        private final String corDaFonte;

        public BotaoWindows(String corDeFundo, String corDaFonte) {
            this.corDeFundo = corDeFundo;
            this.corDaFonte = corDaFonte;
        }

        @Override
        public void renderizar() {
            System.out.println("Botão Windows \n" + "Fundo: " + corDeFundo + ", Fonte: " + corDaFonte);
        }
    }

    public class BotaoMacOS implements Botao {
        private final String corDeFundo;
        private final String corDaFonte;

        public BotaoMacOS(String corDeFundo, String corDaFonte) {
            this.corDeFundo = corDeFundo;
            this.corDaFonte = corDaFonte;
        }

        @Override
        public void renderizar() {
            System.out.println("Botao MacOS" + "Fundo: " + corDeFundo + ", Fonte: " + corDaFonte);
        }
    }
}
