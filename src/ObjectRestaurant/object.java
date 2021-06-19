package ObjectRestaurant;

import Restaurant.Menu;
import subclass.struk;

public class object {

        public static void main(String[] args) {
            //membuat object untuk Menu dan MenuSubclass


            Menu cs = new Menu();
            System.out.println(cs.namapelanggan);
            System.out.println(cs.namamakanan);
            System.out.println(" ");

            Menu cstr = new Menu();
            System.out.println(cstr.jumlahharga);
            System.out.println(" ");

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
            System.out.println(" ");
            System.out.println(">>>>>>>>>>>Menu Minuman<<<<<<<<<<");
            System.out.println("1.Jus Alpukat");
            System.out.println("2.Jus Mangga");
            System.out.println("3.Es Jeruk ");
            System.out.println("4.Es Teh");
            System.out.println("5.Es Buah Segar");
            System.out.println(">>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<");
            System.out.println(" ");
            list.listmenu();

            Menu psn = new Menu();
            psn.namamakanan = "Ikan Gurami Goreng"; //menampilkan object pesanan
            psn.namaminuman = "Jus Alpukat";
            System.out.println(" ");
            psn.tampilkanpesanan();

            Menu jmlh = new Menu();
            jmlh.jumlahmakanan = "2";    //menampilkan object jumlah menu
            jmlh.jumlahminuman = "2";
            System.out.println(" ");
            jmlh.jumlahpesanan();

            Menu hrg = new Menu();
            hrg.namamakanan = "Ikan Gurami Goreng";
            hrg.hargamakanan = "60000";
            hrg.namaminuman = "Jus Alpukat";    //menampilkan object harga dan total
            hrg.hargaminuman = "13000";
            hrg.jumlahharga = "146000";
            System.out.println(" ");
            hrg.hargamenu();


            struk ksr = new struk();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            ksr.namakasir = " Renata imut"; //menampilkan  nama kasir
            ksr.kasir();

            struk tt = new struk();
            tt.totalbayar = " 200000";
            tt.kembalian = "54000";
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            tt.hasil();

        }
    }




