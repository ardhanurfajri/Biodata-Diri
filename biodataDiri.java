public class biodataDiri {
  public static void data(){
      String nama= "Ardha Nur Fajri";
      System.out.println("Nama           : "+nama);
      int nis=42240888;
      System.out.println("NISN           : "+nis);
      String lahir="Tulungagung",bulan="April";
      int tanggal=06,tahun=2004;
      System.out.println("Tempat Lahir   : "+lahir);
      System.out.println("Tanggal Lahir  : "+tanggal+" "+bulan+" "+tahun);
      char gol='O';
      System.out.println("Golongan Darah : "+gol);
      String kelamin="Laki - Laki";
      System.out.println("Jenis Kelamin  : "+kelamin);
      String alamat="Batangsaren, Kauman, Tulungagung";
      System.out.println("Alamat         : "+alamat);
      String motto="平和と幸福";
      System.out.println("Motto Hidup    : "+motto);
  }
  public static void main(String[]args){
      biodataDiri bio=new biodataDiri();
      System.out.println("============");
      System.out.println("Biodata Diri");
      System.out.println("============");
      data();
  }      
}