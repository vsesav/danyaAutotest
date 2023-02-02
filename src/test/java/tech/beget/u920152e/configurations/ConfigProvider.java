package tech.beget.u920152e.configurations;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
      static Config readConfig(){
       return ConfigFactory.load("application.conf");
   }

   String URL = readConfig().getString("url");
   String EMAIL = readConfig().getString("email");
   String PASSWORD = readConfig().getString("password");
}
