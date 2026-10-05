package criacao_bridge;

public class FabricaPDF implements FabricaSaida {

    @Override
    public FormatoRelatorio criarFormato() {
        return new FormatoPDF();
    }

    @Override
    public Cabecalho criarCabecalho() {
        return new CabecalhoPDF();
    }
}