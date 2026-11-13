package swsec.bank.services.repositories;

import org.junit.Assert;
import org.junit.Test;
import swsec.bank.models.Account;
import swsec.bank.services.repositories.AccountRepository;


// Exercise 11, part 1. Instructor starter file, copied unchanged from
// Blackboard. The empty catch and finally blocks are the instructor's,
// kept as delivered so the part 1 run matches the file under test. Do
// not copy the empty catch pattern into new tests.

/**
 * Created by cseaman on 4/4/2016.
 * Modified by sampath 2018.

 */
public class AccountRepositoryTest {

  @Test
  public void testModifyBalance () {

     try {
       // create a new account with balance of $100
       Account acct = new Account (1234, (float)100);

       // create a repository instance that can change the balance
       AccountRepository acctRep = new AccountRepository ();

       // modify the balance
       acctRep.modifyBalance (acct, (float)200);

       // test that the new balance is actually $200
       Assert.assertEquals ((float)200, acctRep.getBalance (1234), 0);

     } catch (Exception ex) {
     } finally {
     }
   }

}
