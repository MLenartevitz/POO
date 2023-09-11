/**
 * @author Mi pessoa
 */
public class Exemplo5 {

    public static void main(String[] args) {
        double number, result;
        int x=1;
        number = Math.random() * 100;
        while (x<=10){
            result = number + x;
            System.out.println(number + " x " + x + " = " + result);
            x++;
        }
       
    }
    
}
