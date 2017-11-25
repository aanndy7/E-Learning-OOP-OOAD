import java.util.Scanner;
public class Barang {

	public static String kode_barang;
	public static String nama_barang;
	public static String harga;

		public void inputBarang() {
			Scanner input = new Scanner (System.in);
			System.out.println("Input Kode Barang ?...");

			
				kode_barang = input.nextLine();
				nama_barang = input.nextLine();
				harga = input.nextLine();
		}
		public void edit() {
				System.out.print("edit barang: ");
				kode_barang = input.nextLine();
			
		}
		public void hapus() {
				System.out.print("hapus barang: ");
				kode_barang = input.nextLine();
		}
}