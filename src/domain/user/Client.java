package domain.user;

import java.security.InvalidParameterException;

public class Client {
    private  Username _name;
    private  Email _email;
    private int _age;

    public Client(Username name, Email email, int age) {
        this._name = name;
        this._email = email;
        this._age = age;
        this.validate();
    }

    private void validate(){
        if(this._age > 110){
            throw new InvalidParameterException("Are you a vampire? O_o");
        }
    }

    public String getName(){
        return this._name.getValue();
    }

    public String getEmail(){
        return this._email.getValue();
    }

    public int getAge(){
        return this._age;
    }



}
