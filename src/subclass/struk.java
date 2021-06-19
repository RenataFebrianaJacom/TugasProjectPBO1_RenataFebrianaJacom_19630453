package subclass;

import Restaurant.Menu;

    public class struk extends Menu {

        //menambahkan 3 atribut
        public String namakasir;
        public String totalbayar;
        public String kembalian;

        //menambahkan 2 method;
        public void kasir(){
            System.out.println("Nama Kasir : "+namakasir);
        }
        public void hasil(){
            System.out.println("Total yang harus bayar : " +totalbayar);
            System.out.println("Kembalian anda : " +kembalian);
        }
    }


