public class CloseState extends State {
    public CloseState(DbConnection dbConnection)
    {
        super(dbConnection);
    }

    @Override
    public void Close()
    {
    }

    @Override
    public void Open()
    {
        System.out.println("Open connection...");
        dbConnection.SetState(new OpenState(dbConnection));
    }

    @Override
    public void Process(String str) throws CloseStateException {
        throw new CloseStateException("Can't process close DbConnection");
    }
}

