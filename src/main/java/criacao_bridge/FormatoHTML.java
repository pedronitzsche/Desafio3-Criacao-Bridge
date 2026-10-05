package criacao_bridge;

public class FormatoHTML implements FormatoRelatorio {

    @Override
    public String formatar(String conteudo) {
        return "HTML: " + conteudo;
    }
}