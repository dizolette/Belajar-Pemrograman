package geniuslabs.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //deklarasi shared preferences
    SharedPreferences preferen;
    SharedPreferences.Editor editors;

    String KEEPLOGIN = "KEEPLOGIN";
    String NAMA = "NAMA";
    String MYDATA = "MYDATA";

    private Button btnLogout;
    public TextView textMain, textEmail, textNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogout = (Button) findViewById(R.id.btn_logout);
//        textEmail = (TextView) findViewById(R.id.email);
//        textNama = (TextView) findViewById(R.id.nama);

        //inisialisasi
        preferen = getSharedPreferences(MYDATA, MODE_PRIVATE);
        editors = preferen.edit();

        String namaLain = "Albert";

        //ambil data dari shared preference
        String email = preferen.getString("NAMA", null);
//        textMain.setText(email);
//        textNama.setText(namaLain);
        aturTulisan(email,namaLain);
    }

    public void logout(View view) {
        editors.clear();
        editors.commit();
        Intent i = new Intent(MainActivity.this, Login.class);
        startActivity(i);
        finish();
    }

    public void aturTulisan(String txt1, String txt2){
        textEmail = (TextView) findViewById(R.id.email);
        textNama = (TextView) findViewById(R.id.nama);
        textEmail.setText(txt1);
        textNama.setText(txt2);
    }
}
