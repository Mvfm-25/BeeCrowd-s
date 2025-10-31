// Solucionado : 28/10/2025 || ùltima vez alterado : 31/10/2025
// Segue o link para o problema : https://judge.beecrowd.com/pt/problems/view/1002

package com.gdm;
import java.io.*;

public class bee1002 {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(input);
        
        double raio = Double.parseDouble(buff.readLine());
        double area = 3.14159 * (raio * raio);
        
        System.out.printf("A=%.4f%n", area);
    }
}