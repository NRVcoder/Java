public class FirstCourseSessionPreparation extends SessionPreparationBase {
    @Override
    protected void CollectPracticeInfo()
    {
        System.out.println("Open practice notes.");
    }
    @Override
    protected void CollectTheoryInfo()
    {
        super.CollectTheoryInfo();
        System.out.println("Open lecture notes.");
    }
    @Override
    protected void ProcessTheory()
    {
        System.out.println("Repeat theory!");
    }
}
