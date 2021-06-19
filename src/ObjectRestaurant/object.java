package ObjectRestaurant;

import Restaurant.Menu;
import subclass.struk;

public class object {

        public static void main(String[] args) {
            //membuat object untuk Menu dan MenuSubclass

            Menu np = new Menu();
            np.namapelanggan = "Renata Febriana Jacom";   //object untuk nama pelanggan
            np.tampilkannamapelanggan();

            Menu list = new Menu();
            System.out.println("===========Menu Makanan==========");  //object untuk menu makan dan minum
            System.out.println("1.Ikan Nila Bakar");
            System.out.println("2.Ikan Gurami Goreng");
            System.out.println("3.Kepiting Saos Tiram");
            System.out.println("4.Ayam Panggang");
            System.out.println("5.Udang Asam Manis");
            System.out.println("---------------------------------");
            System.out.println(">>>>>>>>>>>Menu Minuman<<<<<<<<<<");
            System.out.println("1.Jus Alpukat");
            System.out.println("2.Jus Mangga");
            System.out.println("3.Es Jeruk ");
            System.out.println("4.Es Teh");
            System.out.println("5.Es Buah Segar");
            list.listmenu();

            Menu psn = new Menu();
            psn.namamakanan = "2.Ikan Gurami Goreng"; //menampilkan object pesanan
            psn.namaminuman = "1.Jus Alpukat";
            psn.tampilkanpesanan();

            Menu jmlh = new Menu();
            jmlh.jumlahmakanan = "2";    //menampilkan object jumlah menu
            jmlh.jumlahminuman = "2";
            jmlh.jumlahpesanan();

            Menu hrg = new Menu();
            hrg.hargamakanan = "60000"; //menampilkan object harga dan total
            hrg.hargaminuman = "13000";
            hrg.jumlahharga = "146000";
            hrg.hargamenu();


            struk ksr = new struk();
            ksr.namakasir = " Renata imut"; //menampilkan  nama kasir
            ksr.kasir();

            struk tt = new struk();
            tt.totalbayar = " 200000";
            tt.kembalian = "54000";
            tt.hasil();

        }
    }




