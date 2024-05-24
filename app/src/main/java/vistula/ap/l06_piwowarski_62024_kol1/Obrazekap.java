package vistula.ap.l06_piwowarski_62024_kol1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Obrazekap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_obrazekap);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        readFromIntentap();
    }
    private void readFromIntentap(){
        Bundle bundleap = getIntent().getExtras();
        String nameap = bundleap.getString("nameap");
        String lastap = bundleap.getString("lastap");

        TextView FirstName2ap = (TextView) findViewById(R.id.editFirstNameObrazekap);
        TextView LastName2ap = (TextView) findViewById(R.id.editLastNameObrazekap);
        FirstName2ap.setText(nameap);
        LastName2ap.setText(lastap);
    }
    public void MoveToMainActivityap(View view){
        Intent intent2ap = new Intent(this, MainActivity.class);
        startActivity(intent2ap);
    }
}