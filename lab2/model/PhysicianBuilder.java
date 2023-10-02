
package model;
public class PhysicianBuilder implements IBuilder {
    
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String specialization;
    private int expirience_years;
    private String position;

    @Override
    public PhysicianBuilder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public PhysicianBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public PhysicianBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public PhysicianBuilder email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public PhysicianBuilder position(String position) {
        this.position = position;
        return this;
    }

    @Override
    public PhysicianBuilder specialization(String specialization) {
        this.specialization = specialization;
        return this;
    }

    @Override
    public PhysicianBuilder expirience_years(int expirience_years) {
        this.expirience_years = expirience_years;
        return this;
    }

    public Physician build() {
        return new Physician(id, firstName, lastName, email, expirience_years,specialization, position);
    }
}