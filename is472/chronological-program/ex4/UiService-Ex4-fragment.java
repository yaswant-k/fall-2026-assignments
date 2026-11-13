// Fragment for UiService.java, IS 472 Coding Exercise 4.
// Paste the constant and the two methods below inside the UiService class
// body, between the open and close bracket of the class, not inside
// another method. Do not compile this file on its own; it is not a
// complete class. Merge into the BankingApplication copy of UiService.java
// (src/main/java/swsec/bank/services), not BankingApplicationInitial.
// Merge is still pending: Yaswant's BankingApplication source is on his
// Mac, which is offline.

// Blacklist characters fixed by the Ex 4 handout: * [ ] # $
public static final String BLACK_LIST_INPUT = "*[]#$";

// Returns true if any character in input is on the blacklist, false otherwise.
public static boolean isBlackList(String input) {
    // Null input returns false, as in Figure 9-3. The handout does not state null behavior.
    if (input == null) {
        return false;
    }
    for (int i = 0; i < input.length(); i++) {
        if (BLACK_LIST_INPUT.indexOf(input.charAt(i)) >= 0) {
            return true;
        }
    }
    return false;
}

// Returns true when isBlackList finds a blacklist character, false otherwise.
// Prints a message when a blacklist character is found.
public static boolean cleanseInput(String input) {
    if (isBlackList(input)) {
        System.out.println("Blacklist character found in input.");
        return true;
    }
    return false;
}
