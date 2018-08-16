import db.DBHelper;
import models.Administrator;

import java.util.List;

import static db.DBHelper.getAll;

public class Runner {

    public static void main(String[] args) {

        Administrator joe = new Administrator("Joe", "PS303576D", 20000);
        DBHelper.save(joe);

        Administrator mike = new Administrator("Mike", "PS356576D", 50000);
        DBHelper.save(mike);
        mike.setSalary(60000);
        DBHelper.update(mike);

        Administrator emil = new Administrator("Emil", "PS303766D", 100000);
        DBHelper.save(emil);
        DBHelper.delete(emil);

        List<Administrator> administrators = DBHelper.getAll(Administrator.class);

        Administrator findJoe = DBHelper.findbyId(Administrator.class, joe.getId());


    }

}
