import java.util.ArrayList;

public class SimpleDotComGame
{
    public static void  main(String[] args)
    {
        int numOfGuesses=0;
        GameHelper helper=new GameHelper();
        DotCom theDotCom=new DotCom();
        int randomNum=(int)(Math.random()*5);
        String first=Integer.toString(randomNum);
        String second=Integer.toString(randomNum+1);
        String third=Integer.toString(randomNum+2);

        ArrayList<String> locations= new ArrayList<String>();
        locations.add(first);
        locations.add(second);
        locations.add(third);

        theDotCom.setLocationCells(locations);
        boolean isAlive=true;

        while (isAlive==true)
        {
            String guess=helper.getUserInput("enter a number");
            String result=theDotCom.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("kill"))
            {
                isAlive=false;
                System.out.println("Congratulations! You took "+numOfGuesses+" guesses");
            }
            else
            {
                System.out.println(result);
            }

        }
    }
}
