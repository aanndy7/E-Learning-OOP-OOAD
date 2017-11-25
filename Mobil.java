public class Mobil extends Barang {
	
	public static String namaMobil;
	public static String type;
	public static String merk;
	public static String harga;

	public void inputbarangMobil()
{
		Scanner masuk = new Scanner(System.in);
		System.out.println("Input Barang");
		System.out.print("Nama Mobil"); namaMobil = masuk.nextLine();
		System.out.print("type : "); type = masuk.nextLine();
		System.out.print("merk : "); merk = masuk.nextLine();
		System.out.print("harga : "); harga = masuk.nextLine();
		}
}