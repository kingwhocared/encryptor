/**
 * Created by stannis on 08/05/17.
 */
/******************************************************************************
 *  Compilation:  javac HelloWorld.java
 *  Execution:    java HelloWorld
 *
 *  Prints "Hello, World". By tradition, this is everyone's first program.
 *
 *  % java HelloWorld
 *  Hello, World
 *
 *  These 17 lines of text are comments. They are not part of the program;
 *  they serve to remind us about its properties. The first two lines tell
 *  us what to type to compile and test the program. The next line describes
 *  the purpose of the program. The next few lines give a sample execution
 *  of the program and the resulting output. We will always include such
 *  lines in our programs and encourage you to do the same.
 *
 ******************************************************************************/

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World");
        Tuple<View.MainMenuRequest, String> user_request = View.GetUserRequest();

        switch (user_request.x) {
            case ENCRIPTION:
                View.Encryption_Result_Output(user_request.y);
                break;
            case DECRYPTION:
                View.Decryption_Result_Output(user_request.y);
                break;
        }
    }

}