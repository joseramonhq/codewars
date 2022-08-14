package codewars.kyu7.integer_Primitive_Data_Types;

public class Primitive {

    public String determineType(String number) {
        try {
            Byte a = Byte.valueOf(number);
            return "byte";
        } catch (NumberFormatException e) {
            try {
                Short a = Short.valueOf(number);
                return "short";
            } catch (NumberFormatException f) {
                try {
                    Integer a = Integer.valueOf(number);
                    return "int";
                } catch (NumberFormatException g) {
                    try {
                        Long a = Long.valueOf(number);
                        return "long";
                    } catch (NumberFormatException h) {
                        return "none";

                    }
                }
            }
        }
    }
}
