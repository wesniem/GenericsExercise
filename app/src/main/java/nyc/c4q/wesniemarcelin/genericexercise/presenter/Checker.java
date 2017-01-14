package nyc.c4q.wesniemarcelin.genericexercise.presenter;

import nyc.c4q.wesniemarcelin.genericexercise.model.Lock;

/**
 * Created by wesniemarcelin on 1/14/17.
 */

public class Checker {

    private Lock myCode = new Lock<>(1234);

    private Lock userInput;

    public Checker(Lock userInput) {
//        this.userInput = userInput;
        this.userInput = new Lock<>(userInput);
    }

    public Lock getMyCode() {
        return myCode;
    }

    public void setMyCode(Lock myCode) {
        this.myCode = myCode;
    }

    public Lock getUserInput() {
        return userInput;
    }

    public void setUserInput(Lock userInput) {
        this.userInput = userInput;
    }

    public boolean checkInputs() {
        if (myCode.equals(userInput)) {
            return true;
        }
        return false;
    }
}
