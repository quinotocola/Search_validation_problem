package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetProperties {
     private static GetProperties getProperties= null;
     private String browser;
     private String host;

     private String host2;
     private String search;


     private GetProperties(){
         Properties properties = new Properties();
         String nameFile="windows.properties";
         String nameFile1="amazon.properties";
         InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
         InputStream inputStream1 = getClass().getClassLoader().getResourceAsStream(nameFile1);
         if(inputStream!= null){
             try {
                 properties.load(inputStream);
                 properties.load(inputStream1);
                 browser=properties.getProperty("browser");
                 host=properties.getProperty("host");
                 search=properties.getProperty("buscar");
                 host2=properties.getProperty("host2");

             } catch (IOException e) {
                 throw new RuntimeException(e);
             }
         }
     }

     public static GetProperties getInstance(){
         if (getProperties == null)
             getProperties=new GetProperties();
         return getProperties;
     }

    public String getBrowser() {
        return browser;
    }

    public String getHost() {
        return host;
    }

    public String getHost2() { return host2; }

    public String getSearch() {
        return search;
    }

}
