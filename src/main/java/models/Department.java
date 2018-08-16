package models;

import javax.persistence.*;

@Entity
@Table(name = "departments")
public class Department {

//    Create a Department class. The department should take in a title and a Manager.
//    Change the Manager class so that the manager takes in a Department object rather than a string (remember to update the getters and setters).
//    Remove the department from the Manager constructor. The department should have a manager in its constructor but the manager should not have a department in its.
//    Create a OneToOne association between Manager and Department.
//
//    In DBManager write a function fo find what department the manager is accociated with.



    private int id;
    private String title;
    private Manager manager;

    public Department(String title, Manager manager) {
        this.title = title;
        this.manager = manager;
    }

    public Department(){

    }

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id", nullable = false)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
