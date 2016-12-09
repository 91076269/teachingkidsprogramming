package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(1);
    Tortoise.setAnimal(Animals.Spider);
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    float lengthOfLine = 10.5f;
    float zoom = 1.1f;
    for (int i = 0; i < 10; i++)
    {
      lengthOfLine = weaveOneLayer(lengthOfLine, zoom);
      zoom = zoom * 1.3f;
    }
  }
  private static float weaveOneLayer(float lengthOfLine, float zoom)
  {
    for (int i = 0; i < 6; i++)
    {
      //
      drawTriangle();
      //
      Tortoise.turn(360 / 6);
      lengthOfLine = lengthOfLine + zoom;
    }
    return lengthOfLine;
  }
  private static void drawTriangle()
  {
    for (int i1 = 0; i1 < 3; i1++)
    {
      double line = 10.5;
      Tortoise.move(line);
      Tortoise.turn(360 / 3);
    }
  }
}
