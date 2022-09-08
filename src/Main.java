public class Main {
    public static void main(String[] args) {
        Phone phone[] = {createObject(1), createObject(2), createObject(3)};
        for (int i = 0; i < phone.length; i++) {
            if (i < phone.length && phone[i] instanceof Printable) {
                phone[i].print();
            }
        }
    }

    public static Phone createObject(int Phone) {
        Nokia nokia = new Nokia("CIRPICH", typeLogo.NOKIA,"Withstand any fall");
        Iphone iphone = new Iphone("NULL", typeLogo.APPLE,"1 TB memory");
        Samsung samsung = new Samsung("FLAP 3", typeLogo.SAMSUNG,"3D");
        switch (Phone) {
            case 1:
                return nokia;
            case 2:
                return iphone;
            case 3:
                return samsung;
        }
        Phone phone[] = {nokia, iphone, samsung};
        return null;

    }
}