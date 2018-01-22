package com.company;

/**
 * @author William Delarosa
 */

public class Cat extends Pet implements Talkable {
    private int mousesKilled;

    /**
     * @param mousesKilled - number of mouses killed
     * @param name - name of the cat object
     */
    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    /**
     * @return - returns the amount of mice killed
     */
    public int getMousesKilled() {
        return mousesKilled;
    }

    /**
     * increments the amount of mice killed by one
     */
    public void addMouse() {
        mousesKilled++;
    }

    @Override
    public String talk() {
        return "Meow";
    }

    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}
