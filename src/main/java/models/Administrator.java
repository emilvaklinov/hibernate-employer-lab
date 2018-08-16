package models;

import javax.persistence.*;

@Entity
@Table(name = "administrators")
public class Administrator extends Employee {

//    Create a Administrator class which inherits from the employee class. The administrator should also have a manager.
//    Create a ManyToOne relationship between the administrator and the manager.



    private Manager manager;

    public Administrator(String name, String niNumber, int salary, Manager manager) {
        super(name, niNumber, salary);
        this.manager = manager;
    }

    public Administrator() {
    }

    @ManyToOne
    @JoinColumn(name = "manager_id", nullable = false)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

}
