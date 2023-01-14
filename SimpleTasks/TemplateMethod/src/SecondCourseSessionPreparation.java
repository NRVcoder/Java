public class SecondCourseSessionPreparation extends SessionPreparationBase {
    @Override
    protected void CollectPracticeInfo()
    {
        System.out.println("Ask students for practice info");
    }
    @Override
    protected void CollectTheoryInfo()
    {
        super.CollectTheoryInfo();
        System.out.println("Open lectures on google disk");
    }

    @Override
    protected void ProcessTheory()
    {
        System.out.println("Process theory!!");
    }
}
