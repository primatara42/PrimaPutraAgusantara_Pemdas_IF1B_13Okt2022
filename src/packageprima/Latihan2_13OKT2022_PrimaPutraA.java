package packageprima;

import java.util.Scanner;

public class Latihan2_13OKT2022_PrimaPutraA 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		char kodeJaket, kodeUkuran;
		String merkJaket = null, ukuranJaket = null;
		int harga = 0;
		int jumlahJaket = 0;
		
		System.out.print("Silahkan Masukkan Kode Jaket : ");
		kodeJaket = input.nextLine().charAt(0);
		
		System.out.print("Silahkan Masukkan Kode Ukuran : ");
		kodeUkuran = input.nextLine().charAt(0);
		
		System.out.print("Masukkan Jumlah Jaket yang Diinginkan : ");
		jumlahJaket = input.nextInt();
		
		
		
		if(kodeJaket == 'E')
		{
			if(kodeUkuran == 'S')
			{
				merkJaket = "Eiger";
				ukuranJaket = "Small";
				harga = 150000;
				harga = harga * jumlahJaket;
			}
			
			else if(kodeUkuran == 'M')
			{
				merkJaket = "Eiger";
				ukuranJaket = "Medium";
				harga = 220000;
				harga = harga * jumlahJaket;
			}
			
			else if(kodeUkuran == 'L')
			{
				merkJaket = "Eiger";
				ukuranJaket = "Large";
				harga = 250000;
				harga = harga * jumlahJaket;
			}
			
			System.out.print("Anda Memilih Jaket Merk " + merkJaket + " Dengan Ukuran " + ukuranJaket + " Dengan Harga " + harga);
			
		}
		
		else if(kodeJaket == 'P')
		{
			if(kodeUkuran == 'S')
			{
				merkJaket = "Polo";
				ukuranJaket = "Small";
				harga = 100000;
				harga = harga * jumlahJaket;
			}
			
			else if(kodeUkuran == 'M')
			{
				merkJaket = "Polo";
				ukuranJaket = "Medium";
				harga = 125000;
				harga = harga * jumlahJaket;
			}
			
			else if(kodeUkuran == 'L')
			{
				merkJaket = "Polo";
				ukuranJaket = "Large";
				harga = 165000;
				harga = harga * jumlahJaket;
			}
			
			System.out.print("Anda Memilih Jaket Merk " + merkJaket + " Dengan Ukuran " + ukuranJaket + " Dengan Harga " + harga);
			
		}
		
		else if(kodeJaket == 'H')
		{
			if(kodeUkuran == 'S')
			{
				merkJaket = "Hammer";
				ukuranJaket = "Small";
				harga = 110000;
				harga = harga * jumlahJaket;
			}
			
			else if(kodeUkuran == 'M')
			{
				merkJaket = "Hammer";
				ukuranJaket = "Medium";
				harga = 130000;
				harga = harga * jumlahJaket;
			}
			
			else if(kodeUkuran == 'L')
			{
				merkJaket = "Hammer";
				ukuranJaket = "Large";
				harga = 170000;
				harga = harga * jumlahJaket;
			}
		
			System.out.print("Anda Memilih Jaket Merk " + merkJaket + " Dengan Ukuran " + ukuranJaket + " Sebanyak " + jumlahJaket + " Buah" + " Dengan Harga " + harga);
			
		}
		
	}
}
