package swsec.bank.services;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import swsec.bank.controllers.*;
import swsec.bank.services.UiService;

// YOU WILL HAVE TO CHANGE THE NAME OF THE EXCEPTION
// IF YOU USED A DIFFERENT NAME
import swsec.bank.exceptions.MaliciousInputException;

// used to test UiService, along with all the classes it uses
//
// Exercise 11, part 2. The instructor example testIsBlackList is kept
// unchanged. BL-01 to BL-16 are the cases from the Exercise 10 plan
// (IS472_Ex10_Test_Plan_Yaswant_Kakarla.docx). One @Test method per case,
// named after the case id so the plan and the code stay traceable.
// Blacklist set, from the plan: * [ ] # $
// Spelling: the method is called here as isBlackList, matching the
// starter file. If UiService.java spells it isBlacklist, change every
// call in this file to match the source.

public class UiServiceTest {

  //shows an example test case for isBlackList method
  //write other test cases similarly
  @Test
  public void testIsBlackList(){
    String inp = "cseaman*";
    UiService ui = new UiService();
    boolean returnedValue = ui.isBlackList(inp);

    Assert.assertEquals(true,returnedValue);


    //Assert.assertTrue(returnedValue);

  }

  // BL-01: empty string, no character can match. Expect false.
  @Test
  public void testIsBlackList_BL01() {
    String inp = "";
    UiService ui = new UiService();
    boolean returnedValue = ui.isBlackList(inp);

    Assert.assertEquals(false, returnedValue);
  }

  // BL-02: single ordinary character. Expect false.
  @Test
  public void testIsBlackList_BL02() {
    String inp = "a";
    UiService ui = new UiService();
    boolean returnedValue = ui.isBlackList(inp);

    Assert.assertEquals(false, returnedValue);
  }

  // BL-03: single blacklist character, first in the set. Expect true.
  @Test
  public void testIsBlackList_BL03() {
    String inp = "*";
    UiService ui = new UiService();
    boolean returnedValue = ui.isBlackList(inp);

    Assert.assertEquals(true, returnedValue);
  }

  // BL-04: single blacklist character "[". Expect true.
  @Test
  public void testIsBlackList_BL04() {
    String inp = "[";
    UiService ui = new UiService();
    boolean returnedValue = ui.isBlackList(inp);

    Assert.assertEquals(true, returnedValue);
  }

  // BL-05: single blacklist character "]". Expect true.
  @Test
  public void testIsBlackList_BL05() {
    String inp = "]";
    UiService ui = new UiService();
    boolean returnedValue = ui.isBlackList(inp);

    Assert.assertEquals(true, returnedValue);
  }

  // BL-06: single blacklist character "#". Expect true.
  @Test
  public void testIsBlackList_BL06() {
    String inp = "#";
    UiService ui = new UiService();
    boolean returnedValue = ui.isBlackList(inp);

    Assert.assertEquals(true, returnedValue);
  }

  // BL-07: single blacklist character "$". Expect true.
  @Test
  public void testIsBlackList_BL07() {
    String inp = "$";
    UiService ui = new UiService();
    boolean returnedValue = ui.isBlackList(inp);

    Assert.assertEquals(true, returnedValue);
  }

  // BL-08: blacklist character in the middle. Expect true.
  @Test
  public void testIsBlackList_BL08() {
    String inp = "abc*def";
    UiService ui = new UiService();
    boolean returnedValue = ui.isBlackList(inp);

    Assert.assertEquals(true, returnedValue);
  }

  // BL-09: blacklist character at the start. Expect true.
  @Test
  public void testIsBlackList_BL09() {
    String inp = "*abc";
    UiService ui = new UiService();
    boolean returnedValue = ui.isBlackList(inp);

    Assert.assertEquals(true, returnedValue);
  }

  // BL-10: blacklist character at the end. Expect true.
  @Test
  public void testIsBlackList_BL10() {
    String inp = "abc$";
    UiService ui = new UiService();
    boolean returnedValue = ui.isBlackList(inp);

    Assert.assertEquals(true, returnedValue);
  }

  // BL-11: all five blacklist characters together. Expect true.
  @Test
  public void testIsBlackList_BL11() {
    String inp = "*[]#$";
    UiService ui = new UiService();
    boolean returnedValue = ui.isBlackList(inp);

    Assert.assertEquals(true, returnedValue);
  }

  // BL-12: typical valid username, letters, underscore, digits.
  // Expect false.
  @Test
  public void testIsBlackList_BL12() {
    String inp = "user_name123";
    UiService ui = new UiService();
    boolean returnedValue = ui.isBlackList(inp);

    Assert.assertEquals(false, returnedValue);
  }

  // BL-13: angle bracket is not in the blacklist set. Expect false.
  @Test
  public void testIsBlackList_BL13() {
    String inp = "abc<def";
    UiService ui = new UiService();
    boolean returnedValue = ui.isBlackList(inp);

    Assert.assertEquals(false, returnedValue);
  }

  // BL-14: parentheses are not in the blacklist set. Expect false.
  @Test
  public void testIsBlackList_BL14() {
    String inp = "pass(word)";
    UiService ui = new UiService();
    boolean returnedValue = ui.isBlackList(inp);

    Assert.assertEquals(false, returnedValue);
  }

  // BL-15: null input. The requirement does not define the outcome, so
  // this test is ignored until the behavior is confirmed from the
  // UiService source. Do not assume true or false.
  // VERIFY-AGAINST-SOURCE: read isBlackList in UiService.java, confirm
  // what it does with null (returns false, returns true, or throws),
  // then remove @Ignore and write the assert that matches the source.
  // If it throws NullPointerException, use
  // @Test(expected = NullPointerException.class) instead of an assert.
  @Ignore("VERIFY-AGAINST-SOURCE: null outcome not defined by the requirement")
  @Test
  public void testIsBlackList_BL15() {
    UiService ui = new UiService();
    ui.isBlackList(null);

    // No assert here on purpose: the expected value is unknown until
    // the source behavior is confirmed. See the VERIFY-AGAINST-SOURCE
    // note above. This method exists so the case is not lost; it runs
    // only after @Ignore is removed and an assert is added.
  }

  // BL-16: 500 ordinary characters with "$" as the last character.
  // Expect true.
  @Test
  public void testIsBlackList_BL16() {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < 500; i++) {
      builder.append("a");
    }
    builder.append("$");
    String inp = builder.toString();
    UiService ui = new UiService();
    boolean returnedValue = ui.isBlackList(inp);

    Assert.assertEquals(true, returnedValue);
  }

}
