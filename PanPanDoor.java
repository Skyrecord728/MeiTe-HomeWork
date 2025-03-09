package Com.TestDoor;

public  class PanPanDoor extends Door implements Alarm{

    public PanPanDoor(int height, int width) {
        super(height, width);
    }

    @Override
    public void alarm(){
        System.out.println("PanPanDoor alarm");
    }

    @Override
    public void open() {
        System.out.println("PanPanDoor open");
    }

    @Override
    public void close() {
        System.out.println("PanPanDoor close");
    }
}
