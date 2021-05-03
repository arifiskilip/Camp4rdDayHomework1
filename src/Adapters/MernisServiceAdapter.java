package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        if (customer.getFirstName().length()>=1 && customer.getNatinolatiyId().length()==11)
        {
            return  true;
        }
        else {
            return false;
        }
        }
}


