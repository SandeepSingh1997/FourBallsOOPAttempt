import processing.core.PApplet;

import java.util.ArrayList;

public class FourBallsMain extends PApplet {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 500;
    public static final int INITIAL_XPOSITION = 0;
    public static final int DIAMETER = 10;

    private static final int SPEED1 = 1;
    private static final int SPEED2 = 2;
    private static final int SPEED3 = 3;
    private static final int SPEED4 = 4;


    private ArrayList<Ball> ballList = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("FourBallsMain", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ballList.add(new Ball(INITIAL_XPOSITION, HEIGHT / 5, DIAMETER, SPEED1));
        ballList.add(new Ball(INITIAL_XPOSITION, 2 * HEIGHT / 5, DIAMETER, SPEED2));
        ballList.add(new Ball(INITIAL_XPOSITION, 3 * HEIGHT / 5, DIAMETER, SPEED3));
        ballList.add(new Ball(INITIAL_XPOSITION, 4 * HEIGHT / 5, DIAMETER, SPEED4));
    }

    @Override
    public void draw() {
        for (Ball ball : ballList) {
            ball.draw(this);
        }
    }


}
