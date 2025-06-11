public class Tema {
    private final String corDeFundo;
    private final String corDaFonte;
    private final String nomeDaFonte;
    private final int tamanhoFonte;

    private Tema(TemaBuilder builder) {
        this.corDeFundo = builder.corDeFundo;
        this.corDaFonte = builder.corDaFonte;
        this.nomeDaFonte = builder.nomeDaFonte;
        this.tamanhoFonte = builder.tamanhoFonte;
    }
    public String getCorDeFundo() {
        return corDeFundo;
    }

    public String getCorDaFonte() {
        return corDaFonte;
    }

    public String getFonte() {
        return nomeDaFonte;
    }

    public int getTamanhoFonte() {
        return tamanhoFonte;
    }

    @Override
    public String toString() {
        return "Tema Cor de Fundo\n" + corDeFundo + "\n Cor da Fonte\n" + corDaFonte +
                "\n Fonte \n" + nomeDaFonte + "\n Tamanho da Fonte \n" + tamanhoFonte;
    }

    public static class TemaBuilder {
        private String corDeFundo;
        private String corDaFonte;
        private String nomeDaFonte;
        private int tamanhoFonte;

        public TemaBuilder comCorDeFundo(String corDeFundo) {
            this.corDeFundo = corDeFundo;
            return this;
        }

        public TemaBuilder comCorDaFonte(String corDaFonte) {
            this.corDaFonte = corDaFonte;
            return this;
        }

        public TemaBuilder comFonte(String nomeDaFonte, int tamanhoFonte) {
            this.nomeDaFonte = nomeDaFonte;
            this.tamanhoFonte = tamanhoFonte;
            return this;
        }

        public Tema build() {
            return new Tema(this);
        }
    }
}
