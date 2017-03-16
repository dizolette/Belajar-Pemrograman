public class OperatorLogika {

	public static void main(String[] args) {
	
	// operator AND (&& , &), operator OR (||, |), operator XOR (^)
	int x = 10, y = 5;
	boolean test, test2, test3, test4, test5, test9;
	boolean test6 = true, test7 = false, test8 = false;
	
	/*operator AND 
	true = true && true 
	false = true && flase 
	false = false && true 
	false = false && false
	*/
	
	// && -> mengecek kedua kondisi (kiri dan kanan) walaupun sudah mendapat boolean false
	test = (x > 5) && (y < 8);
	System.out.println("hasil dari test: " + test);
	
	// & -> jika kondisi 1 false , maka tidak akan mengecek kondisi ke 2
	test2 = (x < 5) & (y < 6);
	System.out.println("hasil dari test2: " + test2);
	
	/*operator OR
	true = true || true
	true = true || false
	true = false || true
	false = false || false
	*/
	
	// || -> jika kondisi 1 bernilai true, maka tidak mengecek kondisi 2
	test3 = (x > 2) || (y < 3);
	System.out.println("hasil dari test3: " + test3);
	
	// | -> mengecek kedua kondisi
	test4 = (x > 11) | (y < 3);
	System.out.println("hasil dari test4: " + test4);
	
	/* Operator exclusive OR (XOR)
	true = false ^ true
	true = true ^ false
	false = true ^ true
	false = false ^ false
	*/
	test5 = test6 ^ test7; // true ^ false = true
	System.out.println("hasil dari test5: " + test5);
	
	test9 = test7 ^ test8; // false ^ false = false
	System.out.println("hasil dari test9: " + test9);
	
	
	}

}