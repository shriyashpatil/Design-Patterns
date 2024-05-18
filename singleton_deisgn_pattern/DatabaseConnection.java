
public class DatabaseConnection{

    private static DatabaseConnection dbc;
    private String url;
    private String password;
    private String username;

    private DatabaseConnection(){}


    public static DatabaseConnection connect(){
        if(dbc==null){
            synchronized(DatabaseConnection.class){
                if(dbc==null){
                    dbc = new DatabaseConnection();
                    config(dbc);
                }
            }
        }
        return dbc;
    }

    private static void config(DatabaseConnection db){        
        db.setUrl(DatabaseConfig.url);
        db.setUsername(DatabaseConfig.username);
        db.setPassword(DatabaseConfig.password);
    }

    private void setUrl(String url){
        this.url = url;
    }

    private void setUsername(String username){
        this.username = username;
    }

    private void setPassword(String password){
        this.password = password;
    }

    public String getConnectionUrl(){
         
         this. url = url.replace("username", username);
         this.url = url.replace("password", password);

         return url;
    }
    

}