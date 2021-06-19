//Renata Febriana Jacom
//19630453
//4c Reguler Pagi BanjarBaru


package Restaurant;

public class Menu {
    //8 atribut terlebih dahulu
    public String namapelanggan;
    public String namamakanan;

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
