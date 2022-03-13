import processing.core.PApplet;

public class FourBallsMain extends PApplet{

    public static final int WIDTH = 800;
    public static final int HEIGHT = 500;
    public static final int INITIAL_XPOSITION = 0;
    public static final int DIAMETER = 10;

    private Ball ball1, ball2, ball3, ball4;

    public static void main(String[] args){
        PApplet.main("FourBallsMain", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1 = new Ball(INITIAL_XPOSITION,HEIGHT/5, DIAMETER, 1);
        ball2 = new Ball(INITIAL_XPOSITION, 2 * HEIGHT/5, DIAMETER, 2);
        ball3 = new Ball(INITIAL_XPOSITION, 3 * HEIGHT/5, DIAMETER, 3);
        ball4 = new Ball(INITIAL_XPOSITION, 4 * HEIGHT/5, DIAMETER, 4);
    }

    @Override
    public void draw() {
       drawFrame();
    }

    public void drawFrame(){
        moveByOneFrame(ball1);
        moveByOneFrame(ball2);
        moveByOneFrame(ball3);
        moveByOneFrame(ball4);
    }

    public void moveByOneFrame(Ball ball){
        ellipse(ball.getxPosition(), ball.getyPosition(), ball.getDiameter(), ball.getDiameter());
    }
}
