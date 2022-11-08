public class BoardPrint {

    //for hw print all lines of code
    //a b c
    //3 2 2
    //x
    //x x x
    //x x x








    public static void main(String[] args) {
//        System.out.println("abc represents columns. possible combinations for abc in a 3x3 are: 333,332,331,330,322,321,320,311,310,300,222,221,220,211,210,200,111,110,100,000");
        BoardPrint p = new BoardPrint();
        p.PosRes3();
        p.BadBoard();



    }

    //All Possible Boards

    public BoardPrint() {

        int counter = 1;

        for (int a = 3; a > 0; a--) {
            for (int b = a; b > -1; b--) {
                for (int c = b; c > -1; c--) {


                    System.out.println("board " + counter + " is: " + a + " " + b + " " + c);
                    counter++;
                }

            }
        }
    }

    //Possible Resulting Boards from a full 3x3 position and each coordinating click
    public void PosRes3() {
        int x = 3;
        int y = 3;
        int z ;

        int counterY= 2;
        int counterX =2;

        for (int z2 = 2; z2 > -1; z2--) {

            System.out.println(x + " " + y + " " + z2+" ("+counterX+ ","+counterY+")");
            counterY--;

        }

        counterX--;
        counterY=2;

        for (int y2 = 2; y2 > -1; y2--) {
            z = y2;
            System.out.println(x + " " + y2 + " " + z+" ("+counterX+ ","+counterY+")");
            counterY--;

        }

        counterX--;
        counterY=2;

        for (int x2 = 2; x2 > 0; x2--) {
            z = y = x2 ;
            System.out.println(x2 + " " + y + " " + z+" ("+counterX+ ","+counterY+")");

            counterY--;
        }
    }
    public void BadBoard(){




    }
}










