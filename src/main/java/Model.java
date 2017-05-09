/**
 * Created by stannis on 09/05/17.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Model {
    public enum UserEncryptionCodeChoice {CAESAR}

    public static void DoUserRequest(String filepath, View.UserRequest request, UserEncryptionCodeChoice codeRequested){
        switch (request) {
            case ENCRIPTION:
                EncryptFile(filepath, codeRequested);
                break;
            case DECRYPTION:
                DecryptFile(filepath, codeRequested);
                break;
        }
    }

    static Code getCode(UserEncryptionCodeChoice code) {
        switch (code) {
            case CAESAR:
                return new Caesar();
            default:
                throw new RuntimeException("no such code");
        }
    }

    static void EncryptFile(String filepath, UserEncryptionCodeChoice code){

    }

    static void DecryptFile(String filepath, UserEncryptionCodeChoice code){
    }
}
