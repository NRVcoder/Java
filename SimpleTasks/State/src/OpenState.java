public class OpenState extends State {
    public OpenState(DbConnection dbConnection)
    {
        super(dbConnection);
    }

    @Override
    public void Close()
    {
        System.out.println("Close connection...");
        dbConnection.SetState(new CloseState(dbConnection));
    }

    @Override
    public void Open()
    {
        System.out.println("Connection is already open!");
    }

    @Override
    public void Process(String str)
    {
        System.out.println(String.format("Process %s", str));
    }
}
