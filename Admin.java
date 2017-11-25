Public class Admin {
	public String id_admin;
	public String nama_admin;
	public String password;

	public void tambah(){

		System.out.print("Masukan id : ");
		kode_adm = input.nextLine();
		System.out.print("Masukan nama : ");
		nama_adm = input.nextLine();
		System.out.print("Masukan Password : ");
		password = input.nextLine();
				
	}
	public void update() {
		System.out.print("Update Admin : ");
		nama_admin = input.nextLine();	
	}
	public void hapus() {
		System.out.print("Hapus Admin: ");
		nama_admin = input.nextLine();
	}
	
}