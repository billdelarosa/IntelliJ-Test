package com.company;

/**
 * @author William Delarosa
 */

public class Dog extends Pet implements Talkable {
    private boolean friendly;

    /**
     * @param friendly - boolean that determines whether the dog object is friendly or not
     * @param name - parameter that holds the name of the dog object
     */
    public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    /**
     *
     * @return - returns a boolean of true or false determining whether or not the dog object is friendly
     */
    public boolean isFriendly() {
        return friendly;
    }

    @Override
    public String talk() {
        return "Bark";
    }

    @Override
    public String toString() {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }


}
