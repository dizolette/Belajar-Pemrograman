package geniuslabs.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private Button btnLogin;
    private EditText edtEmail, edtPass;

    //deklarasi shared preferences
    SharedPreferences preferen;
    SharedPreferences.Editor editors;

    String KEEPLOGIN = "KEEPLOGIN";
    String NAMA = "NAMA";
    String MYDATA = "MYDATA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //inisialisasi preferences
        preferen = getSharedPreferences(MYDATA, MODE_PRIVATE);
        editors = preferen.edit();

        btnLogin = (Button) findViewById(R.id.btnLogin);
        edtEmail = (EditText) findViewById(R.id.email);
        edtPass = (EditText) findViewById(R.id.password);

        //cek login
        if (preferen.getBoolean(KEEPLOGIN, false)) {
            Intent i = new Intent(Login.this, MainActivity.class);
            startActivity(i);
            finish();
        } else {
            Toast.makeText(this, "Do Nothing", Toast.LENGTH_SHORT).show();
        }
    }

    public void login(View view) {
        String valueEmail = edtEmail.getText().toString();
        String valuePass = edtPass.getText().toString();

        if ((valueEmail.equals("albertusdwie@gmail.com") && (valuePass.equals("1234567")))) {

            //nyimpen data ke shared preferences
            editors.putString(NAMA, edtEmail.getText().toString());
            editors.putBoolean(KEEPLOGIN, true);
            editors.commit();

            //ini ada intent
            Intent i = new Intent(Login.this, MainActivity.class);
            startActivity(i);
            finish();

            //toast
            Toast.makeText(this, "Berhasil Login", Toast.LENGTH_SHORT).show();
        }
    }

}
