package criacao_bridge;

public class RelatorioFinanceiro extends Relatorio {

    @Override
    public String gerar() {
        return formato.formatar("Relatorio Financeiro");
    }
}