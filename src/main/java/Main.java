/**
 * Created by stannis on 08/05/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World");
        //Tuple<View.MainMenuRequest, String> user_request = View.GetUserRequest();
        Model.EncryptFile("/home/stannis/Documents/my poop.txt", Model.UserEncryptionCodeChoice.CAESAR);
    }

}
