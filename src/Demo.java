import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author ksyzz
 * @since <pre>2019/03/12</pre>
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        String path = "./npyReader/x.npy";
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(path));
        int[][] arr = NumpyReader.readIntArray(dataInputStream);
        for(int i[]:arr){
            for(int j:i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
