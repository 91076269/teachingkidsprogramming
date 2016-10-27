package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
//------------- Kata Question -------------------//
// Where do you see duplicate lines of code?
//    and how can you refactor to make this code more readable?
// Write out the steps in English
// Then translate the steps into code
// Make sure to run after each line
//------------- Kata Question -------------------//
//Where do you see duplicate lines of code?
// and how can you refactor to make this code more readable?
//Write out the steps in English
//Then translate the steps into code
//Make sure to run after each line
//------------- Kata Question -------------------//
//Where do you see duplicate lines of code?
//and how can you refactor to make this code more readable?
//Write out the steps in English
//Then translate the steps into code
//Make sure to run after each line

// Be aware: this an example of too much refactoring 
public class PyramidsOfGizaRemoveEvenMoreDuplication_04
{
  public static void main(String[] args) throws Exception
  {
    setUpPyramidLand();
    //bad refactoring
    int[][] degreesAndLength = {{-90, 220},
                                {135, 100},
                                {90, 100},
                                {-90, 100},
                                {90, 100},
                                ;
                                
    for (int [] i : degreesAndLength)    
    {
      
      Tortoise.turn(i[0]);
    }
    };
    
    
//    turnAndMove(-90, 220);
//    turnAndMove(135, 1000);
//    moveDown();
//    moveUp();
//    moveDown();
//    moveUp();
//    moveDown();
//    turnAndMove(135, 210);
  }
  private static void setUpPyramidLand()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Blues.AliceBlue);
    Tortoise.setPenColor(PenColors.Yellows.DarkGoldenrod);
    Tortoise.setPenWidth(2);
    Tortoise.hide();
  }
}
