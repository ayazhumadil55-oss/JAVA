class Config {
    static String appName = "MyApp";
    static int version = 1;
}

public class Main5 {
    public static void main(String[] args) {
        System.out.println(config.appName);
        System.out.println(config.version);
    }
}
class config {
    static String appName;
    static int version;

    static {
        appName = "MyApp";
        version = 2;
        System.out.println("Static block executed");
    }
}

