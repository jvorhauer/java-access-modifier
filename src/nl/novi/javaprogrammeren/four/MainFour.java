package nl.novi.javaprogrammeren.four;

import nl.novi.javaprogrammeren.four.hidden.PrisonCell;

public class MainFour {
    public static void main(String[] args) {
        PrisonCell prisonCell = new PrisonCell("Arjen");
        System.out.println(prisonCell.getPrisonerName());
    }
}
