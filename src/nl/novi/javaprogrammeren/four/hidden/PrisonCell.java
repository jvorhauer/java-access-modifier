package nl.novi.javaprogrammeren.four.hidden;

public class PrisonCell {
  Inhabitant inhabitant;

  public PrisonCell(String name) {
    this.inhabitant = new Inhabitant(name);
  }

  public String getName() {
    return inhabitant.getName();
  }
}
