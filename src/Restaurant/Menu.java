//Renata Febriana Jacom
//19630453
//4c Reguler Pagi BanjarBaru


package Restaurant;

public class Menu {
    //8 atribut terlebih dahulu
    public String namapelanggan;
    public String namamakanan;
    public String namaminuman;
    public String jumlahmakanan;
    public String jumlahminuman;
    public int hargamakanan;
    public int hargaminuman;
    public int jumlahharga;

    //4 method
   public  void tampilkannamapelanggan(){
        System.out.println("Selamat Datang" +namapelanggan);
    }
    public void tampilkanpesanan(){
       System.out.println("Makanan yang anda pesan : " +namamakanan);
       System.out.println("Minuman yang anda pesan : " +namaminuman);
    }
    public void jumlahpesanan(){
       System.out.println("Jumlah makanan yang di pesan : " +jumlahmakanan);
       System.out.println("Jumlah minuman yang dipesan  : " +jumlahminuman);
    }
    public void hargamenu(){
       System.out.println(+namamakanan "=" +hargamakanan);
       System.out.println(+namaminuman "=" +hargaminuman);
       System.out.println("Jumlah yang harus di bayar : " +jumlahharga);
    }
}
