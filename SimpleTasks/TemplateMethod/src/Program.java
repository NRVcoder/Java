public class Program {
    public static void main(String[] args)
    {
        System.out.println("First course session preparation:");

        var firstCourseSession = new FirstCourseSessionPreparation();
        firstCourseSession.PrepareSession();

        System.out.println("\nSecond course session preparation:");

        var secondCourseSession = new SecondCourseSessionPreparation();
        secondCourseSession.PrepareSession();

        System.out.println("\nThird course session preparation:");

        var thirdCourseSession = new ThirdCourseSessionPreparation();
        thirdCourseSession.PrepareSession();
    }
}