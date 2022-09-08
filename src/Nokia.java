public class Nokia extends Phone {
    private String resistant;

    public Nokia(String name, typeLogo logo, String resistant) {
        super(name, logo);
        this.resistant = resistant;
    }

    @Override
    public void print() {
        System.out.println("Phone: " + "Nokia" + "\nNokia resistant: " + resistant);
    }
}
