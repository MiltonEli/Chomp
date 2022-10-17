import java.util.Scanner;

public class BoardPrint {

    //for hw print all lines of code
    //a b c
    //3 2 2
    //x
    //x x x
    //x x x
    static int a;
    static int b;
    int counter=1;
    static int c=3;
    

    public static void main(String[] args) {
//        System.out.println("abc represents columns. possible combinations for abc in a 3x3 are: 333,332,331,330,322,321,320,311,310,300,222,221,220,211,210,200,111,110,100,000");
        BoardPrint p=new BoardPrint();



    }
    public BoardPrint(){
        Scanner input= new Scanner(System.in);

        for(int a=3;a>0;a--){
            for(int b=a;b>-1;b--){
                for(int c=b;c>-1;c--){

                        System.out.println("board "+counter+" is: "+a+" "+b+" "+c);
                        counter++;
                }

            }
        }
    }

    public void threeByThree(){


    }




}
