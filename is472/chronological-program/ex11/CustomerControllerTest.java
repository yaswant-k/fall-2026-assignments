package swsec.bank.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import swsec.bank.controllers.CustomerController;
import swsec.bank.exceptions.InsufficientFundsException;
import swsec.bank.models.Account;
import swsec.bank.services.repositories.AccountRepository;

// Exercise 11, part 3. Test cases MW-01 to MW-10 for makeWithdrawal,
// from the Exercise 10 plan (IS472_Ex10_Test_Plan_Yaswant_Kakarla.docx).
// One @Test method per case, named after the case id.
//
// Fixture, from the plan: every case starts from a customer account with
// a balance of 100.00 and resets to that balance before the next case.
// The @Before setUp below rebuilds that fixture before each test, so no
// test depends on a balance left behind by an earlier test.
//
// Amounts are written as (float) literals, matching the project examples
// in AccountRepositoryTest. Balances are asserted with a delta of 0,
// matching that file. If makeWithdrawal takes double, change the literals
// and the delta to match the source.
//
// VERIFY-AGAINST-SOURCE: the CustomerController constructor, the
// makeWithdrawal signature, and the way the balance is read back are not
// shown in any handout. The setUp below and the makeWithdrawal calls use
// the plainest reading of the plan; confirm each against
// CustomerController.java and AccountRepository.java before running.
// See ex11-verification.md for the full list.

public class CustomerControllerTest {

  private static final int ACCOUNT_ID = 1234;
  private static final float OPENING_BALANCE = (float) 100.00;

  private Account account;
  private AccountRepository accountRepository;
  private CustomerController controller;

  @Before
  public void setUp() {
    account = new Account(ACCOUNT_ID, OPENING_BALANCE);
    accountRepository = new AccountRepository();

    // VERIFY-AGAINST-SOURCE: the CustomerController constructor is not
    // shown in any handout. If it takes arguments (for example the
    // account, the repository, or a UiService), pass them here. The
    // no-argument construction below is a draft placeholder.
    controller = new CustomerController();
  }

  // VERIFY-AGAINST-SOURCE: how the balance is read after a withdrawal
  // depends on how makeWithdrawal stores it. getBalance on the
  // repository is the read used by the instructor's
  // AccountRepositoryTest; if makeWithdrawal updates only the Account
  // object, read the balance from the account instead.
  private float currentBalance() {
    return accountRepository.getBalance(ACCOUNT_ID);
  }

  // MW-01: amount 0.00, lower boundary. No exception, balance stays
  // 100.00.
  @Test
  public void testMakeWithdrawal_MW01() throws InsufficientFundsException {
    controller.makeWithdrawal((float) 0.00);

    Assert.assertEquals(OPENING_BALANCE, currentBalance(), 0);
  }

  // MW-02: amount 0.01, smallest positive amount. No exception, balance
  // becomes 99.99.
  @Test
  public void testMakeWithdrawal_MW02() throws InsufficientFundsException {
    controller.makeWithdrawal((float) 0.01);

    Assert.assertEquals((float) 99.99, currentBalance(), 0);
  }

  // MW-03: amount 50.00, interior valid amount. No exception, balance
  // becomes 50.00.
  @Test
  public void testMakeWithdrawal_MW03() throws InsufficientFundsException {
    controller.makeWithdrawal((float) 50.00);

    Assert.assertEquals((float) 50.00, currentBalance(), 0);
  }

  // MW-04: amount 99.99, balance minus the smallest unit. No exception,
  // balance becomes 0.01.
  @Test
  public void testMakeWithdrawal_MW04() throws InsufficientFundsException {
    controller.makeWithdrawal((float) 99.99);

    Assert.assertEquals((float) 0.01, currentBalance(), 0);
  }

  // MW-05: amount 100.00, equal to the balance. The requirement states
  // no outcome for this case, so this test is ignored until the behavior
  // is confirmed from the CustomerController source.
  // VERIFY-AGAINST-SOURCE: read makeWithdrawal in CustomerController.java
  // and confirm which candidate holds: allowed with the balance at 0.00,
  // or InsufficientFundsException with the balance unchanged. Then remove
  // @Ignore and keep the matching assert below, deleting the other.
  @Ignore("VERIFY-AGAINST-SOURCE: amount equal to balance has no stated outcome")
  @Test
  public void testMakeWithdrawal_MW05() throws InsufficientFundsException {
    controller.makeWithdrawal((float) 100.00);

    // No assert here on purpose: the expected outcome is unknown until
    // the source behavior is confirmed. Candidate A is allowed with the
    // balance at 0.00 (assert balance equals (float) 0.00). Candidate B
    // is InsufficientFundsException with the balance unchanged (wrap the
    // call in try/catch with fail(), as in MW-06, and assert the balance
    // is unchanged in the catch block). Add the matching assert only
    // after the source confirms which candidate holds.
  }

  // MW-06: amount 100.01, balance plus the smallest unit. Expects
  // InsufficientFundsException and the balance unchanged.
  //
  // The exception pattern from testcaseforamethod-thatthrowsexception.txt
  // is @Test(expected = ...class). That form cannot also assert the
  // balance, because code after the call never runs, so this test uses a
  // try/catch with fail() instead, which checks both the exception and
  // the unchanged balance in one method. MW-06b below is the same check
  // written with the expected-exception annotation, for the record.
  @Test
  public void testMakeWithdrawal_MW06() {
    try {
      controller.makeWithdrawal((float) 100.01);
      Assert.fail("Expected InsufficientFundsException for 100.01");
    } catch (InsufficientFundsException ex) {
      Assert.assertEquals(OPENING_BALANCE, currentBalance(), 0);
    }
  }

  // MW-06b: same case, written with the expected-exception annotation
  // from the Blackboard file. Kept so the taught pattern is on record.
  @Test(expected = InsufficientFundsException.class)
  public void testMakeWithdrawal_MW06b() throws InsufficientFundsException {
    controller.makeWithdrawal((float) 100.01);
  }

  // MW-07: amount 200.00, well above the balance. Expects
  // InsufficientFundsException and the balance unchanged.
  @Test
  public void testMakeWithdrawal_MW07() {
    try {
      controller.makeWithdrawal((float) 200.00);
      Assert.fail("Expected InsufficientFundsException for 200.00");
    } catch (InsufficientFundsException ex) {
      Assert.assertEquals(OPENING_BALANCE, currentBalance(), 0);
    }
  }

  // MW-07b: same case, written with the expected-exception annotation
  // from the Blackboard file.
  @Test(expected = InsufficientFundsException.class)
  public void testMakeWithdrawal_MW07b() throws InsufficientFundsException {
    controller.makeWithdrawal((float) 200.00);
  }

  // MW-08: amount -0.01, smallest negative amount. The requirement names
  // no rejection mechanism, so this test is ignored until the mechanism
  // is confirmed from the CustomerController source.
  // VERIFY-AGAINST-SOURCE: read makeWithdrawal and confirm how a
  // negative amount is rejected (for example InsufficientFundsException,
  // IllegalArgumentException, a returned boolean, or no rejection at
  // all). Then remove @Ignore and write the test to match: an expected
  // exception, a try/catch with fail(), or an assert on the return value.
  // In every case the balance must stay 100.00.
  @Ignore("VERIFY-AGAINST-SOURCE: negative amount rejection mechanism not named")
  @Test
  public void testMakeWithdrawal_MW08() {
    controller.makeWithdrawal((float) -0.01);

    // No assert here on purpose: the rejection mechanism is unknown
    // until the source is read. Once it is confirmed, write the test to
    // match (expected exception, try/catch with fail(), or an assert on
    // the return value) and assert the balance stays 100.00.
  }

  // MW-09: amount -50.00, negative amount. Same open item as MW-08.
  // VERIFY-AGAINST-SOURCE: confirm the rejection mechanism from source
  // before removing @Ignore; see MW-08.
  @Ignore("VERIFY-AGAINST-SOURCE: negative amount rejection mechanism not named")
  @Test
  public void testMakeWithdrawal_MW09() {
    controller.makeWithdrawal((float) -50.00);

    // No assert here on purpose: see MW-08. Once the mechanism is
    // confirmed, write the test to match it and assert the balance
    // stays 100.00.
  }

  // MW-10: amount 10.005, a third decimal place. Rounding is not defined
  // by the requirement, so this test is ignored until the storage and
  // rounding are confirmed from the CustomerController source.
  // VERIFY-AGAINST-SOURCE: confirm how the amount is stored (float or
  // double) and how 10.005 is rounded before running. (float) 10.005 is
  // not exact in binary, so the balance assert below uses a delta of
  // 0.01 and is a candidate only; replace it with the stored amount and
  // resulting balance the source actually produces.
  @Ignore("VERIFY-AGAINST-SOURCE: rounding for a third decimal place not defined")
  @Test
  public void testMakeWithdrawal_MW10() throws InsufficientFundsException {
    controller.makeWithdrawal((float) 10.005);

    // No assert here on purpose: rounding is undefined until the source
    // is read. Once the stored amount and the resulting balance are
    // confirmed, assert them. Note (float) 10.005 is not exact in binary,
    // so the assert will need a delta; record the stored amount and the
    // resulting balance the source actually produces.
  }

}
