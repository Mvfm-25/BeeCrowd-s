// Soma de valores 'a' & 'b' guardados em 'x', 'x' printado.

import java.util.*;

public class bee1001{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt(); 
        int b = teclado.nextInt();
        teclado.close();

        int x = a + b;
        System.out.println(x);
    }
}