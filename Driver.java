import java.io.FileNotFoundException;
public class Driver{
  public static void main(String[]args){

    //files do not require an extension like .txt or .dat,
    //but if they have them, you must include them in your filename String.
    String filename = "maze1";
    if(args.length > 0){
      //no error checking
      filename = args[0];
    }

    try{
      Maze f;
      f = new Maze(filename);
      //f.setAnimate(true);
      System.out.println(f.solve()+" steps");
      System.out.println(f);
    }catch(FileNotFoundException e){
      System.out.println("Invalid filename: "+filename);
    }
  }
}
