public class ThirdCourseSessionPreparation extends SessionPreparationBase {
    @Override
    protected void CollectPracticeInfo()
    {
        System.out.println("Ask classmates for practice");
    }

    @Override
    protected void CollectTheoryInfo()
    {
        System.out.println("Theory?");
    }

    @Override
    protected void ProcessTheory()
    {
        System.out.println("Do some practice, please...");
    }
}