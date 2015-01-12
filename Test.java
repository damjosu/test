
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
        while ((limInf % multi) != 0)//It will add 1 until the number is Multi's multiple
        {
            limInf++;
        }
        System.out.println("Los multiplos de " + multi + " entre (" + limInf + "," + limSup + ") son: ");        
        for (int cont = (limInf + multi); cont < limSup; cont += multi)
        {
            System.out.println(cont);
        }
    }
    
    /**
     * Sums all the numbers between [0,10]
     */
    public void sumValues()
    {
        limInf = 0;
        limSup = 10;
        int cont = 0;
        int sum = 0;
        while (cont < limSup)
        {
            cont++;
            sum += cont;
        }
        System.out.println("La suma de los números comprendidos entre [" + limInf + "," + limSup + "] es: " + sum);
    }
    
    /**
     * Sums all the numbers between [a,b].
     */
    public void sumValuesInterval(int a, int b)
    {
        if (a < b)
        {
            limInf = a;
            limSup = b;
        }
        else
        {
            limInf = b;
            limSup = a;
        }
        int sum = limSup;
        for (int cont = limInf; cont < limSup; cont ++)
        {
            sum += cont;
        }
        System.out.println("La suma de los números comprendidos entre [" + limInf + "," + limSup + "] es: " + sum);
    }
    
    
}
