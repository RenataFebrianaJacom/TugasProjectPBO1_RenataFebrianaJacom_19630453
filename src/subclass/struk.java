package subclass;

import Restaurant.Menu;

    public class struk extends Menu {

        //menambahkan 3 atribut
        public String namakasir;

        @Override
        public String getNamapelanggan() {
            return super.getNamapelanggan();
        }

        @Override
        public void tampilkanpesanan() {
            super.tampilkanpesanan();
        }

        public String getNamakasir() {
            return namakasir;
        }

        public void setNamakasir(String namakasir) {
            this.namakasir = namakasir;
        }

        public String getTotalbayar() {
            return totalbayar;
        }

        public void setTotalbayar(String totalbayar) {
            this.totalbayar = totalbayar;
        }

        public String getKembalian() {
            return kembalian;
        }

        public void setKembalian(String kembalian) {
            this.kembalian = kembalian;
        }

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


