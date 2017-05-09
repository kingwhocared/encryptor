/**
 * Created by stannis on 09/05/17.
 */
public class RegularManipulator extends FileManipulator {
    Code code;
    String inputfilename;
    String outputfilename;
    public RegularManipulator(Code code, String inputfilename, String outputfilename) {
        this.code = code;
        this.inputfilename = inputfilename;
        this.outputfilename = outputfilename;
    }

    int ManipulateByte(int to_manipulate) {
        return to_manipulate;
    }
}
