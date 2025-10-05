public class Radio implements Device {
    @Override
    public void turnOn() {
        System.out.println("Radio is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is now OFF");
    }

    @Override
    public void setVolume(int level) {
        System.out.println("Radio volume set to " + level);
    }
}