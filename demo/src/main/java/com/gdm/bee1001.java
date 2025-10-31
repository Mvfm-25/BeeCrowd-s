// Soma de valores 'a' & 'b' guardados em 'x', 'x' printado.

import java.io.*;

public class bee1001{
    public static void main(String[] args) throws IOException{
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(input);
        
        int A, B, X;
        A = Integer.parseInt(buff.readLine()); B = Integer.parseInt(buff.readLine());
        X = A + B;
        
        System.out.println("X = " + X);
    }
}