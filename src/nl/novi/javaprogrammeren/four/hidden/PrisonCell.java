package nl.novi.javaprogrammeren.four.hidden;

public class PrisonCell {

    private Inhabitant prisoner;

    public PrisonCell(String prisonerName) {
        this.prisoner = new Inhabitant(prisonerName);
    }

    public String getPrisonerName() {
        return prisoner.getName();
    }
}
