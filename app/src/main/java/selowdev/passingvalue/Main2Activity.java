package selowdev.passingvalue;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tvNama,tvUmur,tvNilai;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
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
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent input = getIntent();
        String nama = input.getStringExtra("nama");
        String umur = input.getStringExtra("umur");
        String nilai = input.getStringExtra("nilai");
        tvNama = (TextView)findViewById(R.id.txt_nama);
        tvUmur = (TextView)findViewById(R.id.txt_umur);
        tvNilai = (TextView)findViewById(R.id.txt_nilai);
        tvNama.setText(nama);
        tvUmur.setText(umur);
        tvNilai.setText(nilai);


    }

}
