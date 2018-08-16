package models;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public abstract class Employee {

//    Create an abstract Employee class. The employee should have a name, a NI number and a salary.

    private int id;
    private String name;
    private String NiNumber;
    private int salary;

    public Employee(String name, String niNumber, int salary) {
        this.name = name;
        NiNumber = niNumber;
        this.salary = salary;
    }

    public Employee(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "NiNumber")
    public String getNiNumber() {
        return NiNumber;
    }

    public void setNiNumber(String niNumber) {
        NiNumber = niNumber;
    }

    @Column(name = "salary")
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
