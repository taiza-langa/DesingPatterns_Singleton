public class ConfigurationManager {
    // A única instância da classe, inicializada como null
    private static ConfigurationManager instance = null;

    // Configurações da aplicação (exemplo simplificado)
    private String databaseUrl;
    private String apiLKey;

    // COnstrutor privado para ivitar a criação de instancias fora da classe
    private ConfigurationManager() {
        // Inicialização das configurações (poderias ser carregado de um arquivo, por
        // exemplo)
        this.databaseUrl = "jdbc:mysql//localhost:3306/mydatabase";
        this.apiLKey = "1234567890abcdef";

    }

    // Método público para obter a intância única da classe
    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }
    public String getDatabaseUrl(){
        return databaseUrl;
    }
    public String getApikey() {
        return apiLKey;
    }
}
