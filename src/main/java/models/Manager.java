package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "managers")
public class Manager extends Employee {

    private int budget;
    private Department department;
    private List<Administrator> administrators;

    public Manager(String name, String niNumber, int salary, int budget) {
        super(name, niNumber, salary);
        this.budget = budget;
        this.department = department;
        this.administrators = new ArrayList<Administrator>();
    }

    public Manager(){

    }

    @Column(name = "budget")
    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @OneToOne(mappedBy = "manager", fetch = FetchType.LAZY)
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
    public List<Administrator> getAdministrators() {
        return administrators;
    }

    public void setAdministrators(List<Administrator> administrators) {
        this.administrators = administrators;
    }

}
