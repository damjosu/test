
/**
 * Test class.
 */
public class Test
{
    private int multi;
    private int limInf;
    private int limSup;
    
    /**
     * Test constructor which sets all the atributes to 0;
     */
    public Test()
    {
        multi = 0;
        limInf = 0;
        limSup = 0;
    }

    /**
     * Prints all the 5 multiples between (10,95).
     */
    public void multiplesOfFive()
    {
        multi = 5;
        limInf = 10;
        limSup = 95;        
         while ((limInf % 5) != 0)
        {
            limInf++;
        }
        System.out.println("Los multiplos de " + multi + " entre (" + limInf + "," + limSup + ") son: ");        
        for (int cont = limInf; cont < limSup; cont += 5)
        {
            System.out.println(cont);
        }
    }
    
    
}
