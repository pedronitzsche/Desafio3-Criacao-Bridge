package criacao_bridge;

public abstract class Relatorio {

    protected FormatoRelatorio formato;

    public void setFormato(FormatoRelatorio formato) {
        this.formato = formato;
    }

    public abstract String gerar();
}