package org.teachingkidsprogramming.section07objects;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Turtle;

public class SuperTurtles
{
  public MultiTurtleWindow mtw = new MultiTurtleWindow();
  public SuperTurtles()
  {
    showSomeTurtles();
  }
  public static void main(String[] args)
  {
    new SuperTurtles();
  }
  private void showSomeTurtles()
  {
    //  makeSpeedyTurtle (recipe below) --#2.0
    makeSpeedyTurtle();
    //  makeSlowTurtle (recipe below) --#4.0
    //  ------------- Recipe for makeSlowTurtle --#3.0
    makeSlowTurtle();
    //  ------------- End of makeSlowTurtle --#3.1
    //  makeCrazyTurtle (recipe below) --#6.0
    makeCrazyTurtle();
    //  ------------- End of makeCrazyTurtle --#5.2
  }
  private void makeCrazyTurtle()
  {
    //  ------------- Recipe for makeCrazyTurtle --#5.1
    //        Create a new crazyTurtle instance  
    Turtle crazyTurtle = new Turtle();
    //        Add your crazyTurtle to your MultiTurtleWindow
    mtw.addAndShowTurtle(crazyTurtle);
    //        Have your crazyTurtle draw a 55 pixel long lightning bolt
    crazyTurtle.drawLightning(55);
  }
  private void makeSlowTurtle()
  {
    //        Create a new slowTurtle instance 
    Turtle slowTurtle = new Turtle();
    mtw.addAndShowTurtle(slowTurtle);
    //        Have your slowTurtle draw a upside down triangle with 50 pixel sides
    slowTurtle.drawTriangle(-50);
  }
  private void makeSpeedyTurtle()
  {
    //  ------------- Recipe for makeSpeedyTurtle --#1.0
    Turtle speedyTurtle = new Turtle();
    mtw.addAndShowTurtle(speedyTurtle);
    speedyTurtle.setSpeed(8);
    speedyTurtle.drawTriangle(100);
    //  ------------- End of makeSpeedyTurtle --#1.1 
  }
}
