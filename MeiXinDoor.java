package Com.TestDoor;

public class MeiXinDoor extends Door {
    public MeiXinDoor(int height, int width) {
        super(height, width);
    }

    @Override
    public void open() {
        System.out.println("MeiXinDoor open");
    }

    @Override
    public void close() {
        System.out.println("MeiXinDoor close");
    }
}
