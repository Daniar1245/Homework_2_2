public abstract class Phone implements Printable {
    private String name;
    private typeLogo logo;

    public Phone(String name,typeLogo logo) {
        this.name = name;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }
}

