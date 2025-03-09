package Com.TestDoor;

public abstract class Door {
    private int height;
    private int width;
   abstract public void open();
   abstract public void close();

    public Door(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
