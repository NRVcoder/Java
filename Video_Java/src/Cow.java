public class Cow extends Animal {
    void mu(){
        System.out.println(getSound() + "muu");
    }

    @Override
    public String getSound() {
        String sound = super.getSound();
        return sound + "New!";
    }
}
