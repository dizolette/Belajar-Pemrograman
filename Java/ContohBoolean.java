import javax.swing.JOptionPane;
public class ContohBoolean{
	
	public static void main(String[] args){
		// deklarasi tipe data dan identifier
		int x;
		boolean cocok = false;
		// menanyakan input yang sesuai dari user
		x = Integer.valueOf(JOptionPane.showInputDialog("jika 5 + x = 7 berapa x? \n masukan nilai x: "));
		
		// percabangan if
		if(x == 2) {
			cocok = true; // merubah nilai boolean menjadi true
			JOptionPane.showMessageDialog(null, "Jawaban anda: " + cocok); // jika benar masuk kesini
		}
		else {
			JOptionPane.showMessageDialog(null, "Jawaban anda: " + cocok); // jika salah masuk kesini
		}
	}
}