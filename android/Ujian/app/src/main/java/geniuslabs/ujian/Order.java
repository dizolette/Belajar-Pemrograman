package geniuslabs.ujian;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Order extends AppCompatActivity {

    Button btnOrder;
    EditText edtNama, edtPesanan, edtJumlah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edtNama = (EditText) findViewById(R.id.edt_nama);
        edtPesanan = (EditText) findViewById(R.id.edt_pesanan);
        edtJumlah = (EditText) findViewById(R.id.edt_jumlah);
        btnOrder = (Button) findViewById(R.id.btn_order);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Order.this, "Terima Kasih Telah Memesan. mohon menunggu.", Toast.LENGTH_SHORT).show();
                edtNama.setText("");
                edtPesanan.setText("");
                edtJumlah.setText("");
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.about:
                Toast.makeText(this, "ini menu about", Toast.LENGTH_SHORT).show();
                break;

            case R.id.help:
                Toast.makeText(this, "ini menu help", Toast.LENGTH_SHORT).show();
                break;

            case R.id.call:
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:08572323232323"));
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
