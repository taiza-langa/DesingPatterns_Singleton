public class App {
    public static void main(String[] args) throws Exception {
        //Obtendo a intãncia única do ConfigurationManager
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Acessando as configurações 
        System.out.println("Database URL: " + configManager.getDatabaseUrl());
        System.out.println("API Key: " + configManager.getApikey());
    }
}
