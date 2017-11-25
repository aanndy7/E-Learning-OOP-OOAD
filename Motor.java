public class Motor extends Barang {
		
	public static String namaMotor;
	public static String type;
	public static String merk;
	public static String harga;

	public void inputbarangMotor()
{
		Scanner masuk = new Scanner(System.in);
		System.out.println("Input Barang");
		System.out.print("Nama Motor"); namaMotor = masuk.nextLine();
		System.out.print("type : "); type = masuk.nextLine();
		System.out.print("merk : "); merk = masuk.nextLine();
		System.out.print("harga : "); harga = masuk.nextLine();
		}
}