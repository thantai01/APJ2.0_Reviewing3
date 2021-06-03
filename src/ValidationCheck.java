import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationCheck {
    static Pattern pattern;
    static Matcher matcher;
    static final String STUDENT_ID_REGEX  = "^[C]\\d{4}[G|H|I|K]\\d{2}$";
    static final String STUDENT_EMAIL_REGEX = "^[[a-z]{1,}].{2,}@codegym.vn$";
    static final String STUDENT_DATE_REGEX = "((0\\d|[1-2]\\d|3[0-1])/(0\\d|1[0-2])/[1-2]\\d{3})";

    public ValidationCheck() { }

    public static boolean validates (String input, String REGEX) {
        ValidationCheck.pattern = Pattern.compile(REGEX);
        ValidationCheck.matcher = ValidationCheck.pattern.matcher(input);
        return ValidationCheck.matcher.matches();
    }

}
