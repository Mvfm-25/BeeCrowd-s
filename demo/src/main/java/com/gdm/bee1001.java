// Solucionado : 28/10/2025 || ùltima vez alterado : 31/10/2025
// Segue o link para o problema : https://judge.beecrowd.com/pt/problems/view/1001

package com.gdm;
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