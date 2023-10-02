package model;
public interface IBuilder {
    IBuilder id(int id);
    IBuilder firstName(String firstName);
    IBuilder lastName(String lastName);
    IBuilder email(String email);
    IBuilder expirience_years(int expirience_years);
    IBuilder specialization(String specialization);
    IBuilder position(String position) ;

}


