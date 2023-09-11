/**
 * @author Mi pessoa
 */
public class Exemplo4 {

    public static void main(String[] args) {
        double number, result;
        number = Math.random() * 100;
        for (int x=1; x<=10; x++){
            result = number + x;
            System.out.println(number + " x " + x + " = " + result);
        }
    }
    
}
