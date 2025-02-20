// Define the interfaces for behaviors
interface FlyBehavior {
    void fly();
}

interface QuackBehavior {
    void quack();
}

// Implement the fly behaviors
class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with wings!");
    }
}

class NoFly implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly.");
    }
}

// Implement the quack behaviors
class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack!");
    }
}

class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak!");
    }
}

class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("...");
    }
}

// Define the abstract Duck class
abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck() {}

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks can swim.");
    }
}

// Define specific duck types
class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new Squeak();
    }

    void display() {
        System.out.println("I'm a Rubber Duck.");
    }
}

class WoodenDuck extends Duck {
    public WoodenDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new MuteQuack();
    }

    void display() {
        System.out.println("I'm a Wooden Duck.");
    }
}

class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    void display() {
        System.out.println("I'm a RedHead Duck.");
    }
}

class LakeDuck extends Duck {
    public LakeDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    void display() {
        System.out.println("I'm a Lake Duck.");
    }
}

// Test the duck game
public class Main {
    public static void main(String[] args) {
        Duck rd = new RubberDuck();
        Duck wd = new WoodenDuck();
        Duck rhd = new RedHeadDuck();
        Duck ld = new LakeDuck();

        rd.display();
        rd.performFly();
        rd.performQuack();
        rd.swim();

        wd.display();
        wd.performFly();
        wd.performQuack();
        wd.swim();

        rhd.display();
        rhd.performFly();
        rhd.performQuack();
        rhd.swim();

        ld.display();
        ld.performFly();
        ld.performQuack();
        ld.swim();
    }
}
