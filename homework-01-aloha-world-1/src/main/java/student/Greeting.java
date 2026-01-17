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
    /**
     * Holds the integer localityID.
     */
    private int localityID;
    /**
     * Holds the name of the locality.
     */
    private String localityName;
    /**
     * Holds the ASCII greeting.
     */
    private String asciiGreeting;
    /**
     * Holds the unicode greeting.
     */
    private String unicodeGreeting;
    /**
     * Holds the name of a person, immutable.
     */
    private String name;
    /**
     * Holds the format in which the greeting will be displayed.
     */
    private String formatStr;

    /**
     * String value of the DEFAULT_GREETING with class scope.
     */
    private static final String DEFAULT_GREETING = "Hello";
    /**
     * String value of the DEFAULT_FORMAT with class scope.
     */
    private static final String DEFAULT_FORMATSTR = "%s, %%s!";


    /**
     * Greeting that creates a greeting with ascii and unicode characters.
     * It makes no assumptions and everything needs to be provided.
     * Other constructors call this very detailed constructor.
     *
     * @param localityID      int, ID of the locality.
     * @param localityName    string, locality.
     * @param asciiGreeting   string, ASCII greeting.
     * @param unicodeGreeting string, Unicode greeting.
     * @param formatStr       string, format of the greeting with %%s for name.
     */
    public Greeting(int localityID, String localityName,
                    String asciiGreeting,
                    String unicodeGreeting,
                    String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * Greeting that creates a greeting with ASCII and Unicode characters
     * assuming the language is already using ascii letters only. It also
     * assumes the format of the greeting to be "{greeting}, {name}!"
     *
     * @param localityID   - int, id of the locality
     * @param localityName - string, name of the locality
     * @param greeting     - string, greeting using ascii characters
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, DEFAULT_FORMATSTR);
    }

    /**
     * Default greeting that creates "Hello, {name}!".
     *
     * @param localityID   - int, id of the locality.
     * @param localityName - string, name of the locality
     *
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, DEFAULT_GREETING, DEFAULT_GREETING, DEFAULT_FORMATSTR);
    }

    /**
     * This is a private method for Greeting class that returns the locality id number.
     *
     * @return int, localityID.
     */
    private int getLocalityID() {
        return localityID;
    }

    /**
     * This is a private method for Greeting class that returns the string locality.
     *
     * @return string, locality name.
     */
    private String getLocalityName() {
        return localityName;
    }

    // main method for example usage
//    public static void main(String[] args) {
//        Greeting g1 = new Greeting(1, "USA", "hello", "hello", "%s, %%s!");
//        System.out.println(g1.getLocalityID()); // prints 1
//        System.out.println(g1.getLocalityName()); // prints USA
//        Greeting g2 = new Greeting(2, "UK");
//        System.out.println(g2.getLocalityID()); // prints 2
//        System.out.println(g2.getLocalityName()); // prints UK
//    }
}