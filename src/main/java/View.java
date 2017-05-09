/**
 * Created by stannis on 08/05/17.
 */
import java.io.File;
import java.util.Scanner;

public class View {
    public enum UserRequest {ENCRIPTION, DECRYPTION}

    public static Tuple<UserRequest, String> GetUserRequest(){
        System.out.println("[Main Menu]:");
        System.out.println("1).Encryption");
        System.out.println("2).Decryption");

        Scanner reader = new Scanner(System.in);
        int user_choice = Integer.parseInt(reader.nextLine());
        UserRequest mainMenuRequest;

        switch (user_choice) {
            case 1:
                mainMenuRequest = UserRequest.ENCRIPTION;
                break;
            case 2:
                mainMenuRequest = UserRequest.DECRYPTION;
                break;
            default:
                throw new RuntimeException("invalid choice");
        }

        File varTmpDir;
        String filepath;
        do {
            System.out.println("Enter file path:");
            filepath = reader.nextLine();
            varTmpDir = new File(filepath);
        } while (! (varTmpDir.exists()));

        return new Tuple<UserRequest, String>(mainMenuRequest, filepath);
    }

    public static void Encryption_Result_Output(String filename){
        System.out.println("Encryption simulation of file " + filename);
    }

    public static void Decryption_Result_Output(String filename){
        System.out.println("Decryption simulation of file " + filename);
    }
}
