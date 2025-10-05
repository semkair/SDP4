public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remote = new AdvancedRemote(tv);

        remote.turnOn();
        remote.setVolume(10);
        remote.turnOff();

        System.out.println();

        Device radio = new Radio();
        RemoteControl radioRemote = new AdvancedRemote(radio);

        radioRemote.turnOn();
        radioRemote.setVolume(5);
        radioRemote.turnOff();
    }
}