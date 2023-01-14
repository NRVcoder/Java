public abstract class SessionPreparationBase {
    protected void CollectTheoryInfo()
    {
        System.out.println("Collect theory info");
    }

    protected abstract void CollectPracticeInfo();

    protected void ProcessPractice()
    {
        System.out.println("Process practice....");
    }

    protected abstract void ProcessTheory();

    public void PrepareSession()
    {
        CollectTheoryInfo();
        CollectPracticeInfo();
        ProcessTheory();
        ProcessPractice();
    }
}
