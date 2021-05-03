import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrate.NeroCustomerManager;
import Concrate.StarbucksCustomerManager;
import Entities.Customer;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        Customer arif = new Customer();
        arif.setId(1);
        arif.setFirstName("Arif");
        arif.setLastName("İskilip");
        arif.setNatinolatiyId("11111111111");
        arif.setDateOfBirth(new Date(2000,2,1));
        customerManager.save(arif);
        BaseCustomerManager digeri = new NeroCustomerManager();
        digeri.save(arif);
    }
}
