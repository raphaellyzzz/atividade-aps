public abstract class GerenciadorDeTemas {
    protected Tema temaAtivo;

    public Tema getTemaAtivo() {
        return temaAtivo;
    }

    public void setTemaAtivo(Tema tema) {
        this.temaAtivo = tema;
    }

    public abstract Botao criarBotao();
}

