package Com.TestDoor;

public class Test {
    public static void main(String[] args) {
        PanPanDoor door1 = new PanPanDoor(300,175);
        MeiXinDoor door2 = new MeiXinDoor(250,180);
        door1.open();
        door1.close();
        door1.alarm();
        System.out.println("--------");
        door2.open();
        door2.close();
    }
}
