package multibracketvalidation;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input) {
        String br1 = "(";
        String br2 = ")";
        String br3 = "[";
        String br4 = "]";
        String br5 = "{";
        String br6 = "}";

        Boolean output;

        if (input.contains(br1) && input.contains(br2)) {
            output = true;
        } else if (input.contains(br3) && input.contains(br4)) {
            output = true;
        } else if (input.contains(br5) && input.contains(br6)) {
            output = true;
        } else {
            output = false;
        }
        return output;
    }
}
