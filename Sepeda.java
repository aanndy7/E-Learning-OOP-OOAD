public class Sepeda extends Barang {
	
	public static String namaSepeda;
	public static String type;
	public static String merk;
	public static String harga;

	public void inputbarangSepeda()
{
		Scanner masuk = new Scanner(System.in);
		System.out.println("Input Barang");
		System.out.print("Nama Sepeda"); namaSepeda = masuk.nextLine();
		System.out.print("type : "); type = masuk.nextLine();
		System.out.print("merk : "); merk = masuk.nextLine();
		System.out.print("harga : "); harga = masuk.nextLine();
		}
}