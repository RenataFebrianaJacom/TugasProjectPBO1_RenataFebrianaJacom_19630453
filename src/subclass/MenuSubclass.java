package subclass;

import Restaurant.Menu;

public class MenuSubclass  extends Menu {

        //menambahkan 3 atribut
        public String namakasir;
        public int totalbayar;
        public int kembalian;

        //menambahkan 2 method;
        public void kasir(){
            System.out.println("Nama Kasir : "+namakasir);
        }
        public void struk(){
            System.out.println("Total yang harus bayar : " +totalbayar);
            System.out.println("Kembalian anda : " +kembalian);
        }
    }


