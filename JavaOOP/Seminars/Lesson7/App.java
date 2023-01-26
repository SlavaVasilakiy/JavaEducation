/**
 * App
 */
public class App {

    public static void main(String[] args) {
        SomeConnection someConnection = new ConnectionImpl(new User("Tom", "1111"));
        Db db = new Db();
        db.setConnection(null);

        ConnectionWrapper nWrapper = new ConnectionWrapper(new SomeConnection());
        nWrapper.connect();
    }
}

class Db {
    SomeConnection someConnection;
    ConnectionWrapper nWrapper;

    // public void setConnection(Connection connection) {
    //   if(connection == null) this.connection = new NullConnection();
    //   else this.connection = connection;
    // }

    public void setConnection(SomeConnection someConnection) {
        if(someConnection == null) this.nWrapper = new Wr;
        else this.someConnection = someConnection;
    }




}

class ConnectionImpl implements SomeConnection {
    User user;

    public ConnectionImpl(User user) {
        this.user = user;
    }

    @Override
    public void connect() {
        // TODO Auto-generated method stub

    }
}

class NullConnection implements SomeConnection {
    User user = new User("default", "default");

    @Override
    public void connect() {
        // TODO Auto-generated method stub

    }

}

class ConnectionWrapper{
    SomeConnection someConnection;

    public ConnectionWrapper(SomeConnection someConnection){
        this.someConnection = someConnection;
    }
    public void connect(){
        someConnection.connect();
    }
}


class User {
    String nick;
    String pass;
    public User(String nick, String pass){
        this.nick = nick;
        this.pass = pass;
    }
}
