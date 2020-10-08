package nl.novi.javaprogrammeren.three;

import nl.novi.javaprogrammeren.three.sub.Human;

public class Doctor extends Human {

    public Doctor(String sofiNumber) {
        super(sofiNumber);
    }

    // Je mag bij overriden de access modifier publiekelijker (minder streng) maken.
    @Override
    public String getSofiNumber() {
        return super.getSofiNumber();
    }
}
