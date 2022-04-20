import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135, 206, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    // draw suns
    drawSun(0, 0, 150, 255, 255, 0);
    drawSun(350, 0, 100, 155, 255, 55);
    drawSun(100, 150, 70, 180, 100, 80);
    drawSun(300, 125, 90, 65, 175, 69);
    drawSun(375, 250, 20, 100, 100, 110);
    System.out.println(drawSun(50, 280, 130, 200, 200, 255));
    

    // draw ground
    drawForeground(0, 320, 400, 430, 0, 255, 0);
    
    // draw house
    drawHouse(95, 150, 210, 180, 210, 180, 140);
    drawHouse(40, 40, 210, 180, 150, 140, 150);
  }
  /**
  * @param groundX is the X position of the ground
  * @param groundY is the Y position of the ground
  * @param groundR is the red rgb coloring of the ground
  * @param groundG is the green rgb coloring of the ground
  * @param groundB is the blue rgb coloring of the ground
  * @param lengthGround is the amount the rectangle extends along the x axis (length)
  * @param widthGround is the amount the rectangle extends along the y axis (width)
  */ 
  
  public void drawForeground(float groundX, float groundY, float lengthGround, float widthGround, float groundR, float groundG, float groundB) {

    // green rectangle
    fill(groundR, groundG, groundB);
    rect(groundX, groundY, lengthGround, widthGround);
  }

  /**
  * @param sunX is the X position of the sun
  * @param sunY is the Y position of the sun
  * @param sunR is the red rgb coloring of the sun
  * @param sunG is the green rgb coloring of the sun
  * @param sunB is the blue rgb coloring of the sun
  * @param sunDiameter is the diameter of the sun
  */
  
  public int drawSun(float sunX, float sunY, float sunDiameter, float sunR, float sunG,float sunB) {

     fill(sunR, sunG, sunB);
     ellipse(sunX, sunY, sunDiameter, sunDiameter);
     return (int) sunX; 

  }
  
  /**
  * @param houseX is the X position of the sun
  * @param houseY is the Y position of the sun
  * @param houseLength is the length of the house
  * @param houseWidth is the width of the house
  * @param houseRed is the red rgb coloring of the sun
  * @param houseGreen is the green rgb coloring of the sun
  * @param houseBlue is the blue rgb coloring of the sun
  */
  
  public void drawHouse(float houseX, float houseY, float houseLength, float houseWidth, float houseRed, float houseGreen, float houseBlue) {

      // base of house
      fill(houseRed, houseGreen, houseBlue);
      rect(houseX, houseY, houseLength, houseWidth);
  
      // triangle roof
      fill(houseRed + 45, houseGreen - 129, houseBlue - 89);
      triangle(houseX - 15, houseY, houseX + 105, houseY - 80, houseX + 225, houseY);
  
      // door 
      fill(houseRed + 45, houseGreen + 24, houseBlue - 140);
      rect(houseX + 85, houseY + 110, houseLength - 165, houseWidth - 110);
  
    }
  }