public class Ball {
    public int getxPosition() {
        moveByOneStep();
        return xPosition;
    }

    private void moveByOneStep() {
        this.xPosition = this.xPosition + this.speed;
    }


    public int getyPosition() {
        return yPosition;
    }


    public int getDiameter() {
        return diameter;
    }


    public int getSpeed() {
        return speed;
    }

    private int xPosition;
    private int yPosition;
    private int diameter;
    private int speed;

    public Ball(int xPosition, int yPosition, int diameter, int speed){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.diameter = diameter;
        this.speed = speed;
    }


}
