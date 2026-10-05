package criacao_bridge;

public class CabecalhoPDF implements Cabecalho {

    @Override
    public String gerar(String empresa) {
        return "Cabecalho PDF - " + empresa;
    }
}