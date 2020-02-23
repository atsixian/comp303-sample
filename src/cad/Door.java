package cad;

public class Door implements Part {

    private int ax;
    private int ay;

    /**
     * New door with a starting position
     * @param px
     * @param py
     */
    public Door(int px, int py) {
        ax = px;
        ay = py;
    }

    @Override
    public void move(int px, int py) {
        System.out.println(String.format("I'm a Door. I slided from (%d, %d) to (%d, %d).", ax, ay, ax+px, ay+py));
        ax += px;
        ay += py;
    }
}
