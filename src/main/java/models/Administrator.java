package models;

import javax.persistence.*;

@Entity
@Table(name = "administrators")
//Inherits from Employee super class - join tables
@Inheritance(strategy = InheritanceType.JOINED)
public class Administrator extends Employee {

    public Administrator(String name, String niNumber, int salary) {
        super(name, niNumber, salary);
    }

    public Administrator() {
    }

}
