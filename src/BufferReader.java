import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
    public static void main(String[] args) throws IOException {
        int num1,num2,result;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        num1 = Integer.parseInt(br.readLine());
        System.out.println("Enter another number: ");
        num2 = Integer.parseInt(br.readLine());
        result = num1 + num2;
        System.out.println("The result of addition of 2 nos: " + result);

    }
}
