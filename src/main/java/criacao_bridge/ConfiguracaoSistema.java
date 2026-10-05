package criacao_bridge;

public class ConfiguracaoSistema {

    private static ConfiguracaoSistema instance = new ConfiguracaoSistema();

    private String nomeEmpresa;

    private ConfiguracaoSistema() {
    }

    public static ConfiguracaoSistema getInstance() {
        return instance;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
}