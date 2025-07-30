public class PrimitiveDataTypesDemo {

    // Default values of primitive data types
    static byte defaultByte;
    static short defaultShort;
    static int defaultInt;
    static long defaultLong;
    static float defaultFloat;
    static double defaultDouble;
    static char defaultChar;
    static boolean defaultBoolean;

    public static void main(String[] args) {

        // Explicit initialization
        byte b = 10;                      // 1 byte
        short s = 1000;                   // 2 bytes
        int i = 50000;                    // 4 bytes
        long l = 10000000000L;            // 8 bytes (suffix L)
        float f = 5.75f;                  // 4 bytes (suffix f)
        double d = 19.99;                 // 8 bytes
        char c = 'A';                     // 2 bytes (Unicode character)
        boolean bool = true;              // 1 bit

        // Printing initialized values
        System.out.println("Initialized values:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        // Printing default values (of static variables)
        System.out.println("\nDefault values:");
        System.out.println("byte: " + defaultByte);
        System.out.println("short: " + defaultShort);
        System.out.println("int: " + defaultInt);
        System.out.println("long: " + defaultLong);
        System.out.println("float: " + defaultFloat);
        System.out.println("double: " + defaultDouble);
        System.out.println("char (as int): " + (int)defaultChar); // shows ASCII 0
        System.out.println("boolean: " + defaultBoolean);

        // Simple operations
        int sum = b + s + i;
        double total = d + f;
        char nextChar = (char)(c + 1); // char arithmetic

        System.out.println("\nBasic operations:");
        System.out.println("Sum of byte + short + int: " + sum);
        System.out.println("Sum of double + float: " + total);
        System.out.println("Next character after '" + c + "': " + nextChar);
    }
}
