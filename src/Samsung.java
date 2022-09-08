public class Samsung extends Phone {
    private String tachpad;


    public Samsung(String name, typeLogo logo, String tachpad) {
        super(name, logo);
        this.tachpad = tachpad;
    }

    @Override
    public void print() {
        System.out.println("Phone: " + "Samsung" + "\nSamsung tachpad: " + tachpad);
    }

}

