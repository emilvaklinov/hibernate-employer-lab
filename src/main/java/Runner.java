import db.DBHelper;
import models.Administrator;
import models.Manager;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Manager emilManager = new Manager("Emil", "JH785673F", 10000, 100000, "HR");
        DBHelper.save(emilManager);

        Manager kirstinBoss = new Manager("Kirstin", "FGk9876F", 100000000, 500000, "Boss");
        DBHelper.save(kirstinBoss);

        Administrator joe = new Administrator("Joe", "PS303576D", 20000, emilManager);
        DBHelper.save(joe);

        Administrator mike = new Administrator("Mike", "PS356576D", 50000, kirstinBoss);
        DBHelper.save(mike);
        mike.setSalary(60000);
        DBHelper.update(mike);

        Administrator emil = new Administrator("Emil", "PS303766D", 100000, kirstinBoss);
        DBHelper.save(emil);
        DBHelper.delete(emil);

        List<Administrator> administrators = DBHelper.getAll(Administrator.class);

        Administrator findJoe = DBHelper.findbyId(Administrator.class, joe.getId());

    }

}
