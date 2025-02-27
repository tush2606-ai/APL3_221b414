public class Eager {
    private static Eager uniqueInstance = new Eager(); 

    private Eager() { 
    }

    public static Eager getInstance() { 
        return uniqueInstance; 
    }
}
