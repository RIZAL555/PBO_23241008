import javax.sound.midi.Sequencer.SyncMode;

class Mahasiswa {
    String nama;
    String jurusan;
    String nim;
    double ipk;
    int umur;

}

public class App {
    public static void main(String[] args) throws Exception {
        // instaniasi objek
        Mahasiswa mhs_1 = new Mahasiswa();
        mhs_1.nama = "rizal";
        mhs_1.nim = "23241008";
        mhs_1.jurusan = "PTI";
        mhs_1.ipk = 3.30;
        mhs_1.umur = 19;

        // cetak objek
        System.out.println("nama Mahasiswa : " + mhs_1.nama);
        System.out.println("nim :" + mhs_1.nim);
        System.out.println("jurusan : " + mhs_1.jurusan);
        System.out.println("ipk : " + mhs_1.ipk);
        System.out.println("umur : " + mhs_1.umur);
    }
}
