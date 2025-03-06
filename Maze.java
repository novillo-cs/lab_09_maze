import java.util.*;
import java.io.*;

public class Maze{
  private char[][]maze;
  private boolean animate;
  private int startRow, startCol;

  /**Constructor

  1. Load maze text file,
  2. Sets animate to false by default.
  3. Set startRow and startCol based on the position of the 'S' in the maze file.
  When the file is not found then: throw a FileNotFoundException

  You may assume the file contains a rectangular ascii maze, made with the following 4 characters:
  '#' - Walls - locations that cannot be moved onto
  ' ' - Empty Space - locations that can be moved onto
  'E' - the location of the goal if any (0 or more per file)
  'S' - the location of the start(exactly 1 per file)
  -Make sure your file reading is able to handle this: maze files can have blank
  newlines at the end of the file because some text editors include a newline
  at the end of a file, but that may not be present.

  */
  public Maze(String filename) throws FileNotFoundException{
  
  }

  /**toString
  *@Return the string that represents the maze.
  *It should look like the text file, 
  *some characters will be replaced when you solve the maze
  */
  public String toString(){
    return "";
  }


  /**Wrapper Solve Function returns the helper function
   *@return the result of the recursive solve.
   */
  public int solve(){
    return 0;
  }

  /**Solve
  @precondition the maze is rectangular and has a border of '#' around the edges.
  @postcondition: The maze has been solved by marking a path of '@' symbols from S to E.
  The 'S' is replaced with '@'
  The 'E' remain the same
  All visited spots that were not part of the solution are changed to '.'
  All visited spots that are part of the solution are changed to '@'

  @return the number of @ symbols from S to E when the maze is solved, or -1 when the maze has no solution.

  */
  private int solve(int row, int col){
    return 0;
  }



  /*
   * Second part of this lab:
   * We will go over this method after you write the solve
   */
  public static void carveMaze(char[][] maze, int row, int col) {
  }
  

  /*
   * The following code will be used for animation.
   * Please do not change anything.
   */


  private void wait(int millis){
    try {
      Thread.sleep(millis);
    }
    catch (InterruptedException e) {
    }
  }

  public void setAnimate(boolean b){
    animate = b;
  }

  public static void clearTerminal(){
    //erase terminal
    System.out.println("\033[2J");
  }
  public static void gotoTop(){
    //go to top left of screen
    System.out.println("\033[1;1H");
  }

}
