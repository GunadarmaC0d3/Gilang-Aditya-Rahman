import java.util.Scanner;
public class apa_himti{
	String nama_makanan=" ", nama_minuman=" ";
	int a, b, c, d, total, kembalian, pembeli;
	//Sub menu dalam penghitungan makan
	void makanan(){
		Scanner input = new Scanner(System.in);
		System.out.println("=============== MENU MAKANAN ================");
		System.out.println("1. Bakso super medan 	Rp. 6900");
		System.out.println("2. Bakso super mantaps 	Rp. 6969");
		System.out.println("3. Bakso super granat 	Rp. 7000");
		System.out.print("Silahkan pilih nomor makanan : ");
		int harga_makanan = new Scanner(System.in).nextInt();
		switch(harga_makanan){
			case 1:
			harga_makanan = 6900;
			nama_makanan="Bakso super medan";
			break;
			
			case 2:
			harga_makanan = 6969;
			nama_makanan="Bakso super mantaps";
			break;
			
			case 3:
			harga_makanan = 7000;
			nama_makanan="Bakso super granat";
			break;
			
			case 4: 
			harga_makanan = 9000;
			nama_makanan="Mie ayam si yamin";
			break;
			
			default:
			harga_makanan = 0;
			nama_makanan ="makanan tidak tersedia";
			break;
		}
		System.out.print("Ingin membeli berapa banyak : ");
		int b = input.nextInt();
		minuman();
		
	}
	//Sub menu dalam penghitungan pembelian minuman
	void minuman(){
		Scanner input = new Scanner(System.in);
		System.out.println("=============== MENU MINUMAN ================");
		System.out.println("1. Es mawar merah 		Rp. 5000");
		System.out.println("2. Es Kacang hulk 		Rp. 7000");
		System.out.println("3. Es mawar melati 		Rp. 6000");
		System.out.println("4. Es segar panas		Rp. 4000");
		System.out.print("Silahkan pilih nomor minuman : ");
		int harga_minuman = input.nextInt();
		switch(harga_minuman){
			case 1:
			harga_minuman = 5000;
			nama_minuman="Es Mawar Merah";
			break;
			
			case 2:
			harga_minuman = 7000;
			nama_minuman="Es Kacang Hulk";
			break;
			
			case 3:
			harga_minuman = 6000;
			nama_minuman="Es Mawar Melati";
			break;
			
			case 4:
			harga_minuman = 4000;
			nama_minuman ="Segar sari susu soda";
			break;
			
			case 5:
			menu_utama();
			break;
			
			default:
			harga_minuman= 0;
			nama_minuman ="Minuman tidak tersedia";
			break;
		}
		System.out.print("Ingin membeli berapa banyak : ");
		int e = input.nextInt();
		int total = (harga_minuman*e)+(harga_minuman*b);
		cetak_struk();
	}
	//Sub menu yang akan mencetak nilai total struk
	void cetak_struk(){
		System.out.println("Anda telah memilih "+nama_makanan+" dan membeli "+nama_minuman);
		System.out.println("Total harga yang harus anda bayar Rp."+total);
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan uang si pembeli : ");
		int pembeli = input.nextInt();
		int kembalian = pembeli - total;
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Uang kembaliannya adalah Rp."+kembalian);
	}
	//Menu utama saat program akan di jalankan
	void menu_utama(){
		Scanner input = new Scanner(System.in);
		System.out.println("1. Pilih makanan dan minuman");
		System.out.println("2. Exit");
		System.out.print("Silahkan pilih menu utamanya : ");
		int pilih = input.nextInt();
		System.out.println();
		
		//Pendeklarasian class dari apa_himti menjadi makanan.apa_himti
		apa_himti makanan = new apa_himti();
		switch(pilih){
			case 1:
				makanan();
				break;
			case 2:
				System.exit(1);
				break;
			default:
				System.out.print("Invalid menu");
				break;
		}
	}
	public static void main(String[]args){
		System.out.println("");
		System.out.println("Program makanan");
		System.out.println("-------------------");
		System.out.println("");
		apa_himti makanan = new apa_himti();
		makanan.menu_utama();
	}
	
	}