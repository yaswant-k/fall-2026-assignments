// Exercise 8, Logging: code to add to UiService.java
// IS 472, Yaswant Kakarla, Prof. Sreedevi Sampath. Draft, November 12, 2026.
//
// This file is NOT a standalone compilable class. It holds the exact blocks
// to insert into UiService.java, in apply order, with the insertion point
// stated above each block. Apply it only after reading ex8/README.md.
//
// Sources used, and nothing else:
//   - coding_exercise_8_Logging.pdf (Ex 8 handout, parts 2 to 5)
//   - LoggerExample.java (Blackboard, In class exercises folder)
//   - ../ex7/UiServiceEx7Additions.java and
//     ../ex7/MaliciousInputException.java (the chronological program's
//     own Exercise 7 drafts, for the mode flag, the exception's getters,
//     and the catch sites; those drafts are themselves unverified
//     against the real source, so the items below stay marked
//     VERIFY-AGAINST-SOURCE)
// The BankingApplication source was not available when this was written.
// Every place where a name, flag, or message must come from that source is
// marked VERIFY-AGAINST-SOURCE. Do not guess those; read UiService.java
// and match them before compiling.

// ---------------------------------------------------------------------------
// Block 1. Imports. Add at the beginning of UiService.java.
// Taken from LoggerExample.java. The Scanner import from LoggerExample is
// NOT copied: it belongs to the example's demo input loop, not to UiService.
// ---------------------------------------------------------------------------

// import java.io.IOException;
// import java.util.logging.*;

// ---------------------------------------------------------------------------
// Block 2. Logger field. Insert just after the UiService class header,
// before the instance variables (thisCust, thisAcct, and others).
// This is the LoggerExample line with UiService substituted for
// LoggerExample, exactly as the handout instructs.
// ---------------------------------------------------------------------------

// private static final Logger LOGGER = Logger.getLogger(UiService.class.getName());

// ---------------------------------------------------------------------------
// Block 3a. Guard field. Add at class level, next to the logger field
// from Block 2. It is not inside the constructor.
// private static boolean logHandlerAdded = false;
//
// Block 3b. Constructor setup. Insert inside the UiService constructor,
// which the handout states is currently empty. Copied from LoggerExample:
// the setUseParentHandlers statement, the fileHandler declaration, the
// first try/catch/finally, and the LOGGER.info statement.
//
// Two deliberate additions, both flagged here so they are visible:
//   (a) The static logHandlerAdded guard. LoggerExample runs once from a
//       main method, so it never adds a handler twice. UiService is
//       constructed once per run of the program in normal use, but if it is
//       ever constructed twice in one JVM, a second FileHandler would
//       duplicate every log record and hold a second handle on IS472.log.
//       The guard keeps handler setup to the first construction only.
//   (b) The log file path is "./IS472.log", copied unchanged from
//       LoggerExample. The handout says the file should appear in
//       src/main/java; that is true only when the working directory at run
//       time is the project root in the layout the handout assumes. If the
//       file appears elsewhere, the working directory differs, not the code.
// ---------------------------------------------------------------------------

// public UiService() {
//     LOGGER.setUseParentHandlers(false);
//     if (!logHandlerAdded) {
//         Handler fileHandler = null;
//         try {
//             fileHandler = new FileHandler("./IS472.log");
//             fileHandler.setFormatter(new SimpleFormatter());
//             LOGGER.addHandler(fileHandler);
//             LOGGER.setLevel(Level.ALL);
//             LOGGER.config("Configuration done.");
//             LOGGER.log(Level.FINE, "Finer logged");
//             logHandlerAdded = true;
//         } catch (IOException exception) {
//             LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", exception);
//         } finally {
//         }
//     }
//     LOGGER.info("Logger Name: " + LOGGER.getName());
// }

// ---------------------------------------------------------------------------
// Block 4. Malicious-input catch handling (handout part 4). Add this helper
// method to UiService, then call it from every place that catches the
// malicious input exception.
//
// Handout rule, applied literally:
//   - Developer mode: log the developer error message and the input string
//     to the log file, and also print both to the terminal.
//   - User mode: print only the user error message to the terminal, and
//     log nothing.
//
// 5W-H format (handout): Who is the user id, What is the level word
// (ERROR here), Where is class and method, When is the timestamp the
// logger adds automatically, Why is the developer error message, How is
// the rejected input string. A reader with only the log file should be
// able to tell who did it, what happened, where it happened, and why the
// input was rejected.
// ---------------------------------------------------------------------------

// VERIFY-AGAINST-SOURCE: the mode flag is taken from the program's own
// Exercise 7 draft (../ex7/UiServiceEx7Additions.java), which defines
//   private static final boolean DEVELOPER_MODE = true;
// with true as developer mode and false for user mode testing. That
// draft is itself unverified against UiService.java, so confirm the
// flag exists with that name and meaning in the real source before
// compiling. The Ex 8 handout and LoggerExample name no mode flag.
//
// The error messages come from the exception itself, per the Exercise 7
// draft exception class (../ex7/MaliciousInputException.java):
//   ex.getDeveloperErrorMessage() returns
//     "Malicious input detected. Input received: " + inputString
//   ex.getUserErrorMessage() returns "Invalid input. Please try again."
//   ex.getInputString() returns the rejected input string.
// Confirm those getters and wordings against the real exception class;
// if the real class differs, use its getters and wordings instead.
//
// private void handleMaliciousInput(String location,
//         MaliciousInputException ex) {
//     String logMessage = "ERROR | user=" + currentUserId()
//             + " | where=UiService." + location
//             + " | why=" + ex.getDeveloperErrorMessage()
//             + " | input=" + ex.getInputString();
//     if (DEVELOPER_MODE) {
//         LOGGER.log(Level.SEVERE, logMessage, ex);
//         System.out.println(ex.getDeveloperErrorMessage());
//         System.out.println("Input: " + ex.getInputString());
//     } else {
//         System.out.println(ex.getUserErrorMessage());
//     }
// }

// VERIFY-AGAINST-SOURCE: the handout names the user id as part of Who but
// no getter for it is shown in the handout or in LoggerExample. Replace
// the body of currentUserId with the real lookup from UiService state
// (the handout names the instance variables thisCust, thisAcct, and
// others; use whichever of those identifies the current user). If no user
// id is available at a given catch site, return "unknown" rather than
// failing.
// private String currentUserId() {
//     return "unknown";
// }

// ---------------------------------------------------------------------------
// Block 5. Example catch site. This is the shape to use at every place
// that catches the malicious input exception. The method name in the
// location argument is the method containing the catch, so the Where in
// the log record stays accurate at each site.
//
// VERIFY-AGAINST-SOURCE: the catch sites, the method names, and the
// input variable at each site are not listed in the handout. The
// program's Exercise 7 draft places the cleanseInput2 calls in
// initialLogin and authenticateAdmin (per the Ex 4 flow chart) and
// catches MaliciousInputException there. Confirm those sites in
// UiService.java, apply this shape at each one, and pass the real
// enclosing method name. Keep whatever the catch body already does
// after logging (the Ex 7 draft exits the program there); this block
// covers the logging and printing only, it does not replace the rest
// of the catch body.
// ---------------------------------------------------------------------------

// try {
//     cleanseInput2(input);
// } catch (MaliciousInputException ex) {
//     handleMaliciousInput("initialLogin", ex);
//     // ... existing handling, for example System.exit(1) ...
// }
