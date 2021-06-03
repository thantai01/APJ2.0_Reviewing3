import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationCheck {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String STUDENT_ID_REGEX  = "";
    private static final String STUDENT_EMAIL_REGEX = "";
    private static final String STUDENT_DATE_REGEX = "";

    public ValidationCheck(String regex) {
        ValidationCheck.pattern = Pattern.compile(regex);
    }
    public boolean validates (String regex) {
        matcher = ValidationCheck.pattern.matcher(regex);
        return matcher.matches();
    }
}
