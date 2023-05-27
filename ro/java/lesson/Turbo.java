package ro.java.lesson;

import java.util.ArrayList;

public class Turbo {

    //TODO kind of bad pratice
    private ArrayList<String> options = new ArrayList<>();

    public ArrayList<String> getOptions() {
        return new ArrayList<>(this.options);
    }

    {
        options.add("Turbo");
    }

}
