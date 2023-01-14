public class Program {
    public static void main(String[] args) {
        IConnection connection1 = DBConnection.getConnection();
        IConnection connection2 = DBConnection.getConnection();
        IConnection connection3 = DBConnection.getConnection();
        IConnection connection4 = DBConnection.getConnection();
        connection1.set(0, '8');
        assert connection1.get(0) == connection2.get(0);
        assert connection1.get(0) == connection3.get(0);
        assert connection1.get(0) == connection4.get(0);
        assert connection1 == connection4;
        assert connection2 == DBConnection.getConnection();
        assert connection3 == DBConnection.getConnection();
        assert connection1 != connection2;
        assert connection1 != connection3;
        assert connection2 != connection3;

        assert DBConnection.getInstance() == DBConnection.getInstance();
    }
}
