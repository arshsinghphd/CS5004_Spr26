package student;

/*
 * This class is a place holder which you will fully implement based on the javadoc
 * 
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 * 
 */

/**
 * Greeting holds the locality of the greeting, the greeting itself, and the format in which the greeting is to be printed.
 *
 * <p>
 * The greeting class is simple acts as a container for the information of location, 
 * the ascii and unicode strings of the greeting, along with formatted in which the greeting should be printed.
 * </p>
 *
 */
public class Greeting {
    /** Holds the integer localityID, immutable. */
    private final int localityID;
    /** Holds the name of the locality, immutable. */
    private final String localityName;
    /** Holds the ASCII greeting, immutable. */
    private final String asciiGreeting;
    /** Holds the unicode greeting, immutable. */
    private final String unicodeGreeting;
    /** Holds the name of a person, immutable. */
    private final String name;
    /** Holds the format in which the greeting will be displayed, immutable. */
    private final String formatStr;

    /** String value of the DEFAULT_GREETING. */
    private static final String DEFAULT_GREETING = "Hello";
    /** String value of the DEFAULT_FORMAT. */
    private static final String DEFAULT_FORMATSTR = "%s, %%s!";

    /**
     * This is a constructor for the Greeting class. It makes no assumptions and everything needs to be provided.
     * It creates an instance with user provided localityID, localityName, greeting, and formatStr.
     * 
     * @param localityID int ID of the locality.
     * @param localityName string locality.
     * @param asciiGreeting string ascii greeting.
     * @param unicodeGreeting string unicode greeting.
     * @param formatStr string format of the greeting with %%s for name.
     * 
     */
    public Greeting(int localityID, String localityName, String asciiGreeting, String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }
    /**
     * This is a constructor for the Greeting class.
     * It creates an instance with user provided localityID, localityName, greeting, and DEFAULT_FORMATSTR.
     * It calls the more deatiled method using default values for missing parameters.
     * @param localityID int ID of the locality.
     * @param localityName string locality.
     * @param greeting string greeting.
     * 
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, DEFAULT_FORMATSTR);
    }
    /**
     * This is a constructor for the Greeting class. 
     * It creates an instance with user provided localityID and localityName, DEFAULT_GREETING, and DEFAULT_FORMATSTR.
     * It calls the more deatiled method using default values for the missing parameters.
     * @param localityID int ID of the locality.
     * @param localityName string locality.
     * 
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, DEFAULT_GREETING, DEFAULT_GREETING, DEFAULT_FORMATSTR);
    }

    private int getLocalityID() {
        return localityID;
    }

    

}
