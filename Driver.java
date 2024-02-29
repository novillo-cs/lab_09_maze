import java.io.FileNotFoundException;

public class Driver{
  public static void main(String[]args){

    //files do not require an extension (.txt or .dat)
    String filename = "files/maze1";
    
    if(args.length > 0){
      filename = args[0];
    }

    try{
      Maze m;
      m = new Maze(filename);
      //f.setAnimate(true);
      System.out.println("Number of steps from S to E: " + m.solve());
      System.out.println(m);
    }catch(FileNotFoundException e){
      System.out.println("File not found: " + filename);
    }
  }
}
