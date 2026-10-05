package criacao_bridge;

public class FormatoPDF implements FormatoRelatorio {

    @Override
    public String formatar(String conteudo) {
        return "PDF: " + conteudo;
    }
}