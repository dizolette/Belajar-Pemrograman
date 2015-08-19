public class OperatorKondisi1{
	
	public static void main (String[] args){
		
		/*operator logika ?:
		strukturnya -> (kondisi1)? pernyataan1 : pernyataan2;
		*/
		
		//deklarasi tipe data dan variabel
		String Grade = "";
		int Nilai = 90;
		
		Grade = (Nilai >= 90)? "A" : "B";
		System.out.print("Kamu Mendapat Grade: " + Grade); //menggunakan tanda "+" untuk menggabungkan statement
		
	
	}

}