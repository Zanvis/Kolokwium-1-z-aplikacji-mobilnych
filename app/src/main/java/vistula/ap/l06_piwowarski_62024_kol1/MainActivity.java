package vistula.ap.l06_piwowarski_62024_kol1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void MoveToObrazekap(View view){
        EditText editFirstNameap = (EditText) findViewById(R.id.editFirstNameap);
        EditText editLastNameap = (EditText) findViewById(R.id.editLastNameap);
        String nameap = editFirstNameap.getText().toString();
        String lastap = editLastNameap.getText().toString();

        Bundle bundleap = new Bundle();
        bundleap.putString("nameap", nameap);
        bundleap.putString("lastap", lastap);

        Intent intentap = new Intent(this, Obrazekap.class);
        intentap.putExtras(bundleap);
        startActivity(intentap);
    }
    public void MoveToCalculatorap(View view){
        EditText editFirstNameap = (EditText) findViewById(R.id.editFirstNameap);
        EditText editLastNameap = (EditText) findViewById(R.id.editLastNameap);
        String nameap = editFirstNameap.getText().toString();
        String lastap = editLastNameap.getText().toString();

        Bundle bundle2ap = new Bundle();
        bundle2ap.putString("nameap", nameap);
        bundle2ap.putString("lastap", lastap);

        Intent intent3ap = new Intent(this, KalkulatorLiczbZespolonychap.class);
        intent3ap.putExtras(bundle2ap);
        startActivity(intent3ap);
    }
}