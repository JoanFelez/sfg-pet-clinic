package sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {

    private PetType peType;
    private Owner owner;
    private LocalDate bithDate;

    public PetType getPeType() {
        return peType;
    }

    public void setPeType(PetType peType) {
        this.peType = peType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBithDate() {
        return bithDate;
    }

    public void setBithDate(LocalDate bithDate) {
        this.bithDate = bithDate;
    }
}
