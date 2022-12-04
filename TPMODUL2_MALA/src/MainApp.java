public class MainApp {
    public static void main(String [] args) {
        Perangkat perangkat = new Perangkat("Bebasaja", 16, 4.6f);
        perangkat.informasi();

        System.out.println();

        Handphone hp = new Handphone(false, "Gataudah", 16, 3.6f);
        hp.informasi();
        hp.telfon(81234);
        hp.kirimSMS(21234);
        hp.manyMessage(46578, 98765);

        System.out.println();

        Laptop laptop = new Laptop("Haiiiiii", 32, 4.8f, false);
        laptop.informasi();
        laptop.bukaGame("Zombie");
        laptop.kirimEmail("yunisa.aini22@gmail.com");
        laptop.multiEmail("yunisa.aini22@gmail.com", "yunisa.aini22@mail.com");
    }
}