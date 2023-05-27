package ro.java.lesson;

import java.util.ArrayList;

public interface ICar {


    default void frana() {
        //TODO brake
    }

    void virare();

    default void accelerare() {
        //TODO accelerate bla bla
    }

    default void toSomethingBoring(){
        //TODO boring stuff here
    }

}
