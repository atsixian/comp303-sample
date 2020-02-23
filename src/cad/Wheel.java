package cad;

public class Wheel implements Part {

    private int ax;
    private int ay;

    /**
     * New wheel with a starting position
     * @param px
     * @param py
     */
    public Wheel(int px, int py) {
        ax = px;
        ay = py;
    }

    @Override
    public void move(int px, int py) {
        System.out.println(String.format("I'm a Wheel. I rolled from (%d, %d) to (%d, %d).", ax, ay, ax+px, ay+py));
        ax += px;
        ay += py;
    }
}
