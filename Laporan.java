import java.util.Scanner;
Public class laporan{

public String no_lap;
public String tgl_lap;
public String jenis_lap;

public void cetak(){
 	
 	Scanner masuk = new Scanner(System.in);
 	System.out.println("Buat Laporan");
 	System.out.print(" No laporan : "); no_lap = masuk.nextLine();
 	System.out.print(" Tanggal laporan : "); tgl_lap = masuk.nextLine();
 	System.out.print(" Jenis laporan : "); jenis_lap = masuk.nextLine();
}
public void ubah_lap(){
	this.no_lap = "INV0001";
	this.tgl_lap = "20 November 2017";
	this.jenis_lap = "penjualan";

	System.out.println(no_lap);
	System.out.println(tgl_lap);
	System.out.println(jenis_lap);


}
public void hapus_lap(){
	this.no_lap = "INV0001";
	this.tgl_lap = "20 November 2017";
	this.jenis_lap = "penjualan";

	System.out.println(no_lap);
	System.out.println(tgl_lap);
	System.out.println(jenis_lap);


}

}