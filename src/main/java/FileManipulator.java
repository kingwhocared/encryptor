import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * Created by stannis on 09/05/17.
 */
public abstract class FileManipulator {
    public void ManipulateFile(View.UserRequest request, String fileinput, String fileoutput) {
        try {
            ByteManipulator manipulator;
            switch (request) {
                case ENCRIPTION:
                    manipulator = (int x) -> {return EncodeByte(x)};
                    break;
                case DECRYPTION:
                    manipulator = this.DecodeByte;
                    break;
            }
            FileOutputStream out = new FileOutputStream(fileoutput);
            InputStream input = new FileInputStream(fileinput);
            int a = 0;
            a = input.read();
            while (a != -1) {
                out.write(manipulator(a));
                a = input.read();
            }

            input.close();
            out.close();
        }
        catch (Throwable e){
            System.out.println("Failure. Exception thrown in i/o.");
        }
    }

    abstract int EncodeByte(int to_encode);
    abstract int DecodeByte(int to_decode);


}
