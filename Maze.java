import java.io.File;
import java.util.Scanner;

public class Maze {

    public static char[][] maze;
    public static File mazeFile=new File("maze2.txt");
    public static int rows;
    public static int cols;
    public static int startRow;
    public static int startCol;
    public static int endRow;
    public static int endCol;

    public static void main(String[]  args){
        System.out.println("Enter the name for maze file: ");
        /*
        Scanner scn =new Scanner (System.in);
        Scanner inputFile=new Scanner(mazeFile);
        */


        //makeMaze(inputFile);
        printmaze();
    }

    static void makeMaze(Scanner inputFile){

    }

    static void printmaze(){
        for (int i=0; i<cols; i++){
            for (int j=0; j<rows;j++){
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }

    static void findpath(){

    }


}
