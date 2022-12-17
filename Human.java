public class Human {
    private String name;
    private boolean call;

    public Human(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public boolean getCall() {
        return call;
    }

    public boolean setCall(boolean newcall) {
        return this.call = newcall;
    }

    public void tellMyPet() {
        System.out.println("Человек называет кличку питомца");
    }

    public void work() {
        System.out.println("Человек работает");
    }

    public boolean call() {
        if (getCall())
            tellMyPet();
        else
            work();
        return call;
    }

}
