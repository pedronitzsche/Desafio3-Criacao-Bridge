package criacao_bridge;

public class RelatorioFactory {

    public static Relatorio obterRelatorio(String relatorio) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName(
                    "criacao_bridge.Relatorio" + relatorio
            );

            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException(
                    "Relatorio inexistente"
            );
        }

        if (!(objeto instanceof Relatorio)) {
            throw new IllegalArgumentException(
                    "Relatorio invalido"
            );
        }

        return (Relatorio) objeto;
    }
}