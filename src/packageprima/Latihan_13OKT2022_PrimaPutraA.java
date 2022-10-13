package packageprima;

import java.util.Scanner;

public class Latihan_13OKT2022_PrimaPutraA 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		char kodeJaket = 0, kodeUkuran;
		int harga = 0;
		
		//INPUT
		System.out.print("Masukkan Kode Jaket : ");
		kodeJaket = input.nextLine().charAt(0);
		
		System.out.print("Masukkan Kode Ukuran : ");
		kodeUkuran = input.nextLine().charAt(0);
		
		//PROSES
		if(kodeJaket == 'E')
		{
			if(kodeUkuran == 'S')
			{
				harga = 150000;
			}
			
			else if(kodeUkuran == 'M')
			{
				harga = 220000;
			}
			
			else if(kodeUkuran == 'L')
			{
				harga = 250000;
			}
			
			else
			{
				harga = 0;
				kodeJaket = 0;
				kodeUkuran = 0;
			}
		}
		
		else if(kodeJaket == 'P')
		{
			if(kodeUkuran == 'S')
			{
				harga = 100000;
			}
			
			else if(kodeUkuran == 'M')
			{
				harga = 125000;
			}
			
			else if(kodeUkuran == 'L')
			{
				harga = 165000;
			}
			
			else
			{
				harga = 0;
				kodeJaket = 0;
				kodeUkuran = 0;
			}
		}
		
		else if(kodeJaket == 'H')
		{
			if(kodeUkuran == 'S')
			{
				harga = 110000;
			}
			
			else if(kodeUkuran == 'M')
			{
				harga = 130000;
			}
			
			else if(kodeUkuran == 'L')
			{
				harga = 170000;
			}
			
			else
			{
				harga = 0;
				kodeJaket = 0;
				kodeUkuran = 0;
			}
		}
		
		else
		{
			kodeJaket = 0;
			kodeUkuran = 0;
		}
		
		if(kodeJaket == 0 && kodeUkuran == 0)
		{
			System.out.println("Input Tidak Valid!");
		}
		
		else
		{
			System.out.print("Anda Memilih Kode Jaket " + kodeJaket);
			System.out.println(" Dengan Ukuran " + kodeUkuran);
			System.out.println("Harga yang Harus Dibayar Adalah " + harga);
		}
		
		
	}
	
}
