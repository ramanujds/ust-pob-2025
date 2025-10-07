package creational;

class DBConnection{

    private static DBConnection connection;
    private DBConnection(){}

    private String connectionString;

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public static DBConnection getInstance(){
        if(connection==null){
            connection = new DBConnection();
        }
        return connection;
    }

}

public class SingletonPattern {

    public static void main(String[] args) {

        DBConnection connection1 = DBConnection.getInstance();
        DBConnection connection2 =  DBConnection.getInstance();

        connection1.setConnectionString("Mysql Connection");
        connection2.setConnectionString("Mongodb Connection");

        System.out.println(connection1.getConnectionString());
        System.out.println(connection2.getConnectionString());



    }

}
