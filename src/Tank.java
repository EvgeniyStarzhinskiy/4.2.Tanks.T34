public class Tank {

    private int x, y;
    private int fuel;
    static final String MODEL = "T34";
    private int number;
    private static int tanksCount;

    public Tank() {
        this(0,0,100);
    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        this.number = ++tanksCount;
    }

    public void goForward(int i) {
        if (i < 0 && -i > -fuel) {
            System.out.println("");
            i = -fuel;
        }
        else if (i > fuel)
            i = fuel;
        x += i;
        fuel -= Math.abs(i);
    }

    public void printPosition() {
        System.out.println("The  33    && tank " + MODEL + "-" + number + " is at " + x + ", " + y + " now.");
    }

    public void goBackward(int i) {
        goForward(-i);
    }

}
