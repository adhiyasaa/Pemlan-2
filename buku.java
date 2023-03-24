class buku {
    String judulBuku;
    String ISBN;
    String Penulis;
    String Halaman;
    String Sinopsis;

    buku(String judulBuku, String ISBN, String Penulis, String Halaman,String Sinopsis) {
        this.judulBuku = judulBuku;
        this.ISBN = ISBN;
        this.Penulis = Penulis;
        this.Halaman = Halaman;
        this.Sinopsis=Sinopsis;
    }
    public int jumlahKata(String Sinopsis){
        boolean asd = true;
        int jumlah = 0;
        for(int i = 0; i < Sinopsis.length(); i++){
            if(Sinopsis.charAt(i) == ' ') asd = true;
            else{
                if(asd) jumlah++;
                asd = false;
            }
        }
        return jumlah;
    }
    public buku copy(){
        return new buku(judulBuku, ISBN, Penulis, Halaman, Sinopsis);
    }
    void show() {
        System.out.println("Judul Buku                = " + this.judulBuku);
        System.out.println("ISBN                      = " + this.ISBN);
        System.out.println("Penulis                   = " + this.Penulis);
        System.out.println("Halaman                   = " + this.Halaman);
        System.out.println("Sinopsis buku             = " + this.Sinopsis);
        System.out.println("Jumlah Kata Pada Sinopsis = " +jumlahKata(Sinopsis));
    }


}
