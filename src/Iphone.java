public class Iphone extends Phone {
    private String memory;

    public Iphone(String name, typeLogo logo, String memory) {
        super(name, logo);
        this.memory = memory;
    }

    @Override
    public void print() {
        System.out.println("Phone: " + "Iphone" + "\nIphone memory: " + memory);
    }
}
