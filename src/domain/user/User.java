package domain.user;

import java.security.InvalidParameterException;

public abstract class User {

    private  Username _name;
    private  Email _email;

    public User(Username name, Email email, int age) {
        this._name = name;
        this._email = email;
    }

    public String getName(){
        return this._name.getValue();
    }

    public String getEmail(){
        return this._email.getValue();
    }

}
