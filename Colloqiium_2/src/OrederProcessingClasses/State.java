package OrederProcessingClasses;

public abstract class State {
    public abstract void Pay();
    public abstract void Cancel();
    public abstract void Delete();
}
