public class Client {
    
    public static void main(String [] args){

        DatabaseConnection connection = DatabaseConnection.connect();

        System.out.println(connection.getConnectionUrl());

        DatabaseConnection connection2 = DatabaseConnection.connect();

        System.out.println(connection2.getConnectionUrl());


    }

}
