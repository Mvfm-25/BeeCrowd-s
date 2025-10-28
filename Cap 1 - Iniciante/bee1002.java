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