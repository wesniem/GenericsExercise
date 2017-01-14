package nyc.c4q.wesniemarcelin.genericexercise.model;

/**
 * Created by wesniemarcelin on 1/14/17.
 */

public class Lock<T> {
    T passcode;

    public Lock(T passcode) {
        this.passcode = passcode;
    }

    public T getPasscode() {
        return passcode;
    }

    public void setPasscode(T passcode) {
        this.passcode = passcode;
    }
}
