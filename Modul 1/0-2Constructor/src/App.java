import javax.sound.midi.Sequencer.SyncMode;

// class tanpa constructor "class polos"
class Polos {
    String dataString;
    int dataInteger;
}

public class App {
    public static void main(String[] args) throws Exception {
        // instaniasi objek
        Polos objekpPolos = new Polos();

        // pengisian data
        objekpPolos.dataString = "polos";
        objekpPolos.dataInteger = 19;

        // cetak objek
        System.out.println(objekpPolos.dataString);
        System.out.println(objekpPolos.dataInteger);
    }
}
