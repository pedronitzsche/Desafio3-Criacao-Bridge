package criacao_bridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaRelatoriosTest {

    @BeforeEach
    void setUp() {
        ConfiguracaoSistema
                .getInstance()
                .setNomeEmpresa("Empresa Exemplo");
    }

    @Test
    void deveGerarRelatorioFinanceiroPDF() {
        SistemaRelatorios sistema =
                new SistemaRelatorios(
                        "Financeiro",
                        new FabricaPDF()
                );

        assertEquals(
                "Cabecalho PDF - Empresa Exemplo | PDF: Relatorio Financeiro",
                sistema.gerarRelatorio()
        );
    }

    @Test
    void deveGerarRelatorioFinanceiroHTML() {
        SistemaRelatorios sistema =
                new SistemaRelatorios(
                        "Financeiro",
                        new FabricaHTML()
                );

        assertEquals(
                "Cabecalho HTML - Empresa Exemplo | HTML: Relatorio Financeiro",
                sistema.gerarRelatorio()
        );
    }

    @Test
    void deveGerarRelatorioVendasPDF() {
        SistemaRelatorios sistema =
                new SistemaRelatorios(
                        "Vendas",
                        new FabricaPDF()
                );

        assertEquals(
                "Cabecalho PDF - Empresa Exemplo | PDF: Relatorio de Vendas",
                sistema.gerarRelatorio()
        );
    }

    @Test
    void deveGerarRelatorioVendasHTML() {
        SistemaRelatorios sistema =
                new SistemaRelatorios(
                        "Vendas",
                        new FabricaHTML()
                );

        assertEquals(
                "Cabecalho HTML - Empresa Exemplo | HTML: Relatorio de Vendas",
                sistema.gerarRelatorio()
        );
    }

    @Test
    void deveRetornarExcecaoParaRelatorioInexistente() {
        try {
            new SistemaRelatorios(
                    "Estoque",
                    new FabricaPDF()
            );

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals(
                    "Relatorio inexistente",
                    e.getMessage()
            );
        }
    }
}