public class DbConnection {
    private State _state;

    public DbConnection()
    {
        SetState(new CloseState(this));
    }

    public void Open()
    {
        _state.Open();
    }

    public void Process(String str) throws CloseStateException {
        _state.Process(str);
    }

    public void Close()
    {
        _state.Close();
    }

    public void SetState(State state)
    {
        _state = state;
    }
}
