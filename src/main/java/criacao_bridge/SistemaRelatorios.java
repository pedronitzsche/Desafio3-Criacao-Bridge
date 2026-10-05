package criacao_bridge;

public class SistemaRelatorios {

    private Relatorio relatorio;
    private Cabecalho cabecalho;

    public SistemaRelatorios(
            String tipoRelatorio,
            FabricaSaida fabrica
    ) {

        this.relatorio =
                RelatorioFactory.obterRelatorio(tipoRelatorio);

        FormatoRelatorio formato =
                fabrica.criarFormato();

        this.cabecalho =
                fabrica.criarCabecalho();

        this.relatorio.setFormato(formato);
    }

    public String gerarRelatorio() {

        String empresa =
                ConfiguracaoSistema
                        .getInstance()
                        .getNomeEmpresa();

        return cabecalho.gerar(empresa)
                + " | "
                + relatorio.gerar();
    }
}