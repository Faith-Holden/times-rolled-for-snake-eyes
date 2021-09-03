package solution;

public class SnakeEyes {
    public static void main(String[]args){
        boolean two1s = false;
        int die1;
        int die2;
        int counter = 0;
        while (!two1s){
            die1 = (int)(Math.random()*6)+1;
            die2 = (int)(Math.random()*6)+1;
            counter++;
            if (die1==1&&die2==1)
                two1s=true;
        }
        System.out.println("It took " + counter+ " roll(s) to get snake eyes.");
    }
}
