public class Program {
    public static void main(String[] args) throws CloseStateException {
        var dbConnection = new DbConnection();

        String str = "Hello every one.";

        dbConnection.Open();
        dbConnection.Process(str);
        dbConnection.Close();
    }
}
