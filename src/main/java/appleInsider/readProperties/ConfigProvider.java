package appleInsider.readProperties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {

    Config config = getConfig();

    static Config getConfig(){

        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("application.conf");
    }

    String  ADMIN_USERNAME= getConfig().getString("userParams.admin.username");
    String ADMIN_PASSWORD = getConfig().getString("userParams.admin.password");
    String BASE_URL = getConfig().getString("base_url");
}
