public class Kapal {
    protected boolean fingerprint;

    public Kapal(boolean fingerprint, String TransportasiAir, int Sampan, Float Kapal){
        this.TransportasiAir = TransportasiAir;
        this.Sampan = Sampan;
        this.Kapal = Kapal;
    }

    public void informasi() {
        Syestem.out.print1n("Transportasi Air jenis tidak diketahui" + " " + TransportasiAir + " " + "dengan kursi berjumlah 4" Sampan + " " + "ditetapkan dengan biaya sebesar Rp. 20000" + " " Kapal + " " + "Ghz")
    }
}
