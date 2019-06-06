import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class meshvide {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("wamikitxe.txt"));

        String st;
        int i = 1;
        while ((st = br.readLine()) != null) {
            if(i%2==0){
                System.out.println(st);
            }
            i++;
        }
    }
}
