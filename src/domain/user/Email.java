package domain.user;

import java.security.InvalidParameterException;
import java.util.regex.Pattern;

public class Email {

    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    private String _value;

    public Email(String value) {
        this._value = value;
        this.validate();
    }

    public String getValue() {
        return this._value;
    }

    private void validate() {
        if (this._value == null || this._value.isEmpty()) {
            throw new InvalidParameterException("Invalid E-mail: Email cannot be null or empty");
        }

        if (!EMAIL_PATTERN.matcher(this._value).matches()) {
            throw new InvalidParameterException("Invalid E-mail: Email format is incorrect");
        }
    }
}
