Public class Transaksi {
		public static String no_transaksi;
		public static String tgl_transaksi;
		

		public void membuat(){
			System.out.print("Masukan nomor transaksi   : ");
			no_transaksi = input.nextLine();
			System.out.print("Masukan tanggal transaksi : ");
			tgl_transaksi = input.nextLine();
		}
			public void ubah(){
				System.out.print("Ubah Transaksi: ");
				no_transaksi = input.nextLine();
			}
			public void hapus(){
				System.out.print("Hapus Transaksi: ");
				no_transaksi = input.nextLine();
		}		
	}