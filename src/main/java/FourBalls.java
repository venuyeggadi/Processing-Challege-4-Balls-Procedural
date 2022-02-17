import processing.core.PApplet;

import java.util.Arrays;

public class FourBalls extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int BALL_DIAMETER = 10;
    private float[] xCoordinatesOfBalls;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        xCoordinatesOfBalls = new float[4];
        Arrays.fill(xCoordinatesOfBalls, 0);
    }

    @Override
    public void draw() {
        for(int index = 0; index < 4; index++) {
            float yCoordinate = (index + 1f) * HEIGHT / 5;
            drawCircle(xCoordinatesOfBalls[index], yCoordinate);
            xCoordinatesOfBalls[index] += (index + 1);
        }
    }

    private void drawCircle(float xCoordinate, float yCoordinate) {
        ellipse(xCoordinate, yCoordinate, BALL_DIAMETER , BALL_DIAMETER);
    }
}
