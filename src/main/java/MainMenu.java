/**
 * Created by stannis on 08/05/17.
 */
import java.io.File;
import java.util.Scanner;

public class MainMenu {
    public enum MainMenuRequest {ENCRIPTION, DECRYPTION}

    public static Tuple<MainMenuRequest, String> GetUserRequest(){
        System.out.println("[Main Menu]:");
        System.out.println("1).Encryption");
        System.out.println("2).Decryption");

        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        MainMenuRequest mainMenuRequest;
        if (n==1){
            mainMenuRequest = MainMenuRequest.ENCRIPTION;
        }
        else if (n==2){
            mainMenuRequest = MainMenuRequest.DECRYPTION;
        }
        else {
            throw new RuntimeException("invalid choice");
        }

        System.out.println("Enter file path:");
        String filepath = reader.nextLine();

        File varTmpDir = new File(filepath);
        if (!varTmpDir.exists()){
            throw new RuntimeException("file does not exist");
        }

        return new Tuple<MainMenuRequest, String>(mainMenuRequest, filepath);
    }

}
