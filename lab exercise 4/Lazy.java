public class Lazy {
    private static Lazy uniqueInstance;

    private Lazy() {
        
    }

    public static Lazy getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Lazy(); 
        }
        return uniqueInstance;
    }
}
