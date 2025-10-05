public class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is now OFF");
    }

    @Override
    public void setVolume(int level) {
        System.out.println("TV volume set to " + level);
    }
}