package model;

public class Physician {

    private final int id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final int experience_years;
    private final String specialization;
    private final String position;

    Physician(int id, String firstName, String lastName, String email, int experience_years,String specialization, String position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.experience_years = experience_years;
        this.specialization = specialization;
        this.position = position;
    }

    @Override

public String toString() {
    return String.format(
            "\nPhysician "+
            "\nid=%d, firstName='%s', lastName='%s'"+ 
            "\nemail='%s'"+
            "\nexperience_years=%d,"+
            "\nspecialization='%s', position='%s'",
            id, firstName, lastName, email, experience_years, specialization, position);
}


}
