package domain.user;

import java.security.InvalidParameterException;
import java.util.regex.Pattern;

public class Username {

    private static final String USERNAME_REGEX = "^[a-zA-Z0-9_]+$";
    private static final Pattern USERNAME_PATTERN = Pattern.compile(USERNAME_REGEX);

    private String _value;

    public Username(String value) {
        this._value = value;
        this.validate();
    }

    public String getValue() {
        return this._value;
    }

    private void validate() {
        if (this._value == null || this._value.isEmpty()) {
            throw new InvalidParameterException("Invalid Username: Username cannot be null or empty");
        }

        if (!USERNAME_PATTERN.matcher(this._value).matches()) {
            throw new InvalidParameterException("Invalid Username: Username cannot contain special characters");
        }
    }
}
