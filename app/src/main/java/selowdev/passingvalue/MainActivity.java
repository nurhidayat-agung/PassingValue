package selowdev.passingvalue;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    final String LOG = "cobaDebug";
    EditText edtNama, edtUmur, edtNilai;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        edtNama = (EditText)findViewById(R.id.edt_name);
        edtUmur = (EditText)findViewById(R.id.edt_umur);
        edtNilai = (EditText)findViewById(R.id.edt_nilai);
        ;

        btnSubmit = (Button)findViewById(R.id.btn_submit);
        btnSubmit.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        String nama,umur,nilai;
        nama = edtNama.getText().toString();
        umur = edtUmur.getText().toString();
        nilai = edtNilai.getText().toString();
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("nama",nama);
        intent.putExtra("umur",umur);
        intent.putExtra("nilai",nilai);
        startActivity(intent);


    }
}
