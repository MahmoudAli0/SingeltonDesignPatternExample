
package singeltondesignpatternexampel;

/**
 *
 * @author Mahmoud ali
 */
public class singeltonClass 
{
    private static singeltonClass instance = new singeltonClass();
    
    private singeltonClass(){}
    
    public static singeltonClass getInstance()
{
         return instance;
}
   public void showMessage()
{
        System.out.println("Hello from private class ");
}
}
