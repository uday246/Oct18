package oct12;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;

// Constructor
class Ball{
public Ball() {

setWidth (Settings.BALL_WIDTH);

setHeight (Settings.BALL_HEIGHT);

resetPosition();

// TODO: Set width to Settings.BALL_WIDTH

// TODO: Set width to Settings.BALL_HEIGHT

// TODO: Call resetPosition

}
}
/**

* Resets the ball to the initial position

* Uses Settings.INITIAL_BALL_X/Y to set the position of the ball

*/

public void resetPosition() {

x = (Settings.INITIAL_BALL_X);

y = (Settings.INITIAL_BALL_Y);

// TODO: Set the balls y by using the INITIAL_BALL_Y (see above)

}

public void update() {

x += xVelocity;

y += yVelocity;

// TODO: Increase the y variable by yVelocity (see above)

// Bounce off left side of screen

if(x <= 0) {

x=0;

setXVelocity(1);

// TODO: Set x to 0 so it does not leave the screen

// TODO: Change the x velocity to make the ball go right

}

// Bounce off right side of screen

if(x >= Settings.WINDOW_WIDTH - Settings.BALL_WIDTH) {

setXVelocity(-1);

// TODO: Set x to the right edge of the screen (see the above if condition)

// TODO: Change the x velocity to make the ball go left

}

// Bounce off top of screen

if(y <= 0) {

y=0;

setYVelocity(1);

// TODO: Set y to 0 so it does not leave the screen

// TODO: Change the y velocity to make the ball go downward

}

}

public void setXVelocity(int x) {

xVelocity=x;// TODO: Set the x velocity

}

public void setYVelocity(int y) {

yVelocity=y;

// TODO: Set the y velocity

}

public int getXVelocity() {

return x; // TODO: Return the x velocity

}

public int getYVelocity() {

return y; // TODO: Return the y velocity

}

public void paint(Graphics g) {

g.fillOval(x, y, Settings.BALL_WIDTH, Settings.BALL_HEIGHT);

}

}



 class Paddle extends Sprite {

private int xVelocity;

public Paddle() {

setWidth(Settings.PADDLE_WIDTH); // TODO: Set width to Settings.PADDLE_WIDTH

setHeight(Settings.PADDLE_HEIGHT); // TODO: Set width to Settings.PADDLE_HEIGHT

resetPosition(); // TODO: Call resetPosition

}

public void resetPosition() {

x = (Settings.INITIAL_PADDLE_X); // TODO: Set initial position x and y (use INITIAL_PADDLE_X/Y)

y = (Settings.INITIAL_PADDLE_Y); // Note: Check Ball.java for a hint

}

public void update() {

x += xVelocity;

if (x <=0) {

x = 0;

}

if (x >= Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH) {

x = Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH;

}

// TODO: Prevent the paddle from moving outside of the screen

// This can be done using two if statements (one for the left side of the screen and one for the right)

}

public void paint(Graphics g) {

g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);

}

public void setXVelocity(int vel) {

this.xVelocity = vel; // TODO: Set x velocity

}

}