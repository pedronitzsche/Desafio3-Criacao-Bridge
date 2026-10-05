package criacao_bridge;

public class RelatorioVendas extends Relatorio {

    @Override
    public String gerar() {
        return formato.formatar("Relatorio de Vendas");
    }
}