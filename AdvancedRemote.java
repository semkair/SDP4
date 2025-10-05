public class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void setVolume(int level) {
        System.out.println("Using advanced remote...");
        device.setVolume(level);
    }
}