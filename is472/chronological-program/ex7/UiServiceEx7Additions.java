// UiService additions for IS 472 Exercise 7.
// This file is insertion fragments for Yaswant's UiService.java, not a
// standalone compilable class. Insert each block at the point stated
// above it. His UiService.java was not available when this was written,
// so the call sites in block 4 must be matched to his actual code.

// Block 1. Import. Place at the top of UiService.java with the other imports.
// The package must match the exceptions folder; confirm it against the
// existing exception classes before compiling.
import exceptions.MaliciousInputException;

// Block 2. Mode constant. Place inside the UiService class.
// true is developer mode. Set it to false for user mode testing in Step 5.
private static final boolean DEVELOPER_MODE = true;

// Block 3. cleanseInput2. Place inside the UiService class beside cleanseInput.
// It calls the same two checks as cleanseInput and throws instead of printing.
public void cleanseInput2(String input) throws MaliciousInputException {
    if (isBlackList(input) || detectSQLInjection(input)) {
        throw new MaliciousInputException(input);
    }
}

// Block 4. Call-site replacement. Repeat at every place cleanseInput was
// called. Use the variable name from that call site in place of input.
// The Ex 4 flow chart places the cleanseInput calls in initialLogin and
// authenticateAdmin; the Ex 7 handout does not name the call sites.

// cleanseInput(input); // commented out for Ex 7; kept so Ex 4 work stays available for grading
try {
    cleanseInput2(input);
} catch (MaliciousInputException e) {
    if (DEVELOPER_MODE) {
        System.out.println(e.getDeveloperErrorMessage());
    } else {
        System.out.println(e.getUserErrorMessage());
    }
    System.exit(1);
} finally {
}
