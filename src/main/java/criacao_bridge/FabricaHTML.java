package criacao_bridge;

public class FabricaHTML implements FabricaSaida {

    @Override
    public FormatoRelatorio criarFormato() {
        return new FormatoHTML();
    }

    @Override
    public Cabecalho criarCabecalho() {
        return new CabecalhoHTML();
    }
}