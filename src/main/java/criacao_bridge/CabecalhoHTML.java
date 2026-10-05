package criacao_bridge;

public class CabecalhoHTML implements Cabecalho {

    @Override
    public String gerar(String empresa) {
        return "Cabecalho HTML - " + empresa;
    }
}