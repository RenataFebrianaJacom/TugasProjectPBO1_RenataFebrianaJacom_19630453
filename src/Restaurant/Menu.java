//Renata Febriana Jacom
//19630453
//4c Reguler Pagi BanjarBaru


package Restaurant;

public class Menu {
    //8 atribut terlebih dahulu
    public String namapelanggan;
    public String namamakanan;

    public String getNamapelanggan() {
        return namapelanggan;
    }

    public void setNamapelanggan(String namapelanggan) {
        this.namapelanggan = namapelanggan;
    }

    public String getNamamakanan() {
        return namamakanan;
    }

    public void setNamamakanan(String namamakanan) {
        this.namamakanan = namamakanan;
    }

    public String getNamaminuman() {
        return namaminuman;
    }

    public void setNamaminuman(String namaminuman) {
        this.namaminuman = namaminuman;
    }

    public String getJumlahmakanan() {
        return jumlahmakanan;
    }

    public void setJumlahmakanan(String jumlahmakanan) {
        this.jumlahmakanan = jumlahmakanan;
    }

    public String getJumlahminuman() {
        return jumlahminuman;
    }

    public void setJumlahminuman(String jumlahminuman) {
        this.jumlahminuman = jumlahminuman;
    }

    public String getHargamakanan() {
        return hargamakanan;
    }

    public void setHargamakanan(String hargamakanan) {
        this.hargamakanan = hargamakanan;
    }

    public String getHargaminuman() {
        return hargaminuman;
    }

    public void setHargaminuman(String hargaminuman) {
        this.hargaminuman = hargaminuman;
    }

    public String getJumlahharga() {
        return jumlahharga;
    }

    public void setJumlahharga(String jumlahharga) {
        this.jumlahharga = jumlahharga;
    }

    //constructor
    public Menu() {
        namapelanggan= "Renata";
        namamakanan = "Ikan Nila Bakar";
        jumlahharga="Rp.20.000";
    }

    public String namaminuman;
    public String jumlahmakanan;
    public String jumlahminuman;
    public String hargamakanan;
    public String hargaminuman;
    public String jumlahharga;

    // method
   public  void tampilkannamapelanggan(){
        System.out.println("Selamat Datang " +" " +namapelanggan);
        System.out.println("-------------------------------------------");
    }
    public void listmenu(){}

    public void tampilkanpesanan(){
       System.out.println(" ");
       System.out.println("Makanan yang anda pesan : " +namamakanan);
       System.out.println("Minuman yang anda pesan : " +namaminuman);
       System.out.println(" ");
    }
    public void jumlahpesanan(){
       System.out.println(" ");
       System.out.println("Jumlah makanan yang di pesan : " +jumlahmakanan);
       System.out.println("Jumlah minuman yang dipesan  : " +jumlahminuman);
       System.out.println(" ");
    }
    public void hargamenu(){
       System.out.println(" ");
       System.out.println( "Nama makanan :" +namamakanan);
       System.out.println( "Harga Rp."+hargamakanan);
       System.out.println( "Nama Minuman :" +namaminuman);
       System.out.println( "Harga Rp."+hargaminuman);
       System.out.println("Jumlah yang harus di bayar : " +jumlahharga);
       System.out.println(" ");
    }
}
