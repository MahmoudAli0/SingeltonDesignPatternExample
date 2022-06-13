
package singeltondesignpatternexampel;

/**
 *
 * @author Mahmoud ali
 */
public class SingeltonDesignPatternExampel {

    public static void main(String[] args) {
        singeltonClass singel1= singeltonClass.getInstance();
        singel1.showMessage();
    }
    
}
