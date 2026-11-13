package exceptions;

// Package must match the exceptions folder in the BankingApplication.
// Confirm it against the existing exception classes before compiling.
public class MaliciousInputException extends Exception {

    private String developerErrorMessage;
    private String userErrorMessage;
    private String inputString;

    public MaliciousInputException(String inputString) {
        super();
        this.inputString = inputString;
        this.developerErrorMessage = "Malicious input detected. Input received: " + inputString;
        this.userErrorMessage = "Invalid input. Please try again.";
    }

    public String getDeveloperErrorMessage() {
        return developerErrorMessage;
    }

    public String getUserErrorMessage() {
        return userErrorMessage;
    }

    public String getInputString() {
        return inputString;
    }
}
