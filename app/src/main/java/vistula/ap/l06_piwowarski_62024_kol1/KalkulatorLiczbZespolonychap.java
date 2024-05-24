package vistula.ap.l06_piwowarski_62024_kol1;

import static vistula.ap.l06_piwowarski_62024_kol1.Kalkulatorap.calculationsap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class KalkulatorLiczbZespolonychap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator_liczb_zespolonychap);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        readFromIntentap();
    }
    private void readFromIntentap(){
        Bundle bundle2ap = getIntent().getExtras();
        String nameap = bundle2ap.getString("nameap");
        String lastap = bundle2ap.getString("lastap");

        TextView FirstName3ap = (TextView) findViewById(R.id.editFirstNameKalkap);
        TextView LastName3ap = (TextView) findViewById(R.id.editLastNameKalkap);
        FirstName3ap.setText(nameap);
        LastName3ap.setText(lastap);
    }
    public void calculateap(View view){
        EditText editz1fistap = (EditText)findViewById(R.id.editz1firstap);
        EditText editz1secondap = (EditText)findViewById(R.id.editz1secondap);
        EditText editz2fistap = (EditText)findViewById(R.id.editz2firstap);
        EditText editz2secondap = (EditText)findViewById(R.id.editz2secondap);
        Spinner spinnerOperatorap = (Spinner)findViewById(R.id.spinnerOperatorap);

        String str_n1ap = editz1fistap.getText().toString();
        String str_n2ap = editz1secondap.getText().toString();
        String str_n3ap = editz2fistap.getText().toString();
        String str_n4ap = editz2secondap.getText().toString();
        String operatorap = spinnerOperatorap.getSelectedItem().toString();

        int n1ap = 0, n2ap = 0, n3ap = 0, n4ap = 0;
        try {
            n1ap = Integer.parseInt(str_n1ap);
        }
        catch(NumberFormatException e){
            editz1fistap.setText("0");
        }
        try {
            n2ap = Integer.parseInt(str_n2ap);
        }
        catch(NumberFormatException e){
            editz1secondap.setText("0");
        }
        try {
            n3ap = Integer.parseInt(str_n3ap);
        }
        catch(NumberFormatException e){
            editz2fistap.setText("0");
        }
        try {
            n4ap = Integer.parseInt(str_n4ap);
        }
        catch(NumberFormatException e){
            editz2secondap.setText("0");
        }
        int calc1ap = calculationsap(n1ap, n3ap, operatorap);
        int calc2ap = calculationsap(n2ap, n4ap, operatorap);
        int calc3ap = calculationsap(n1ap, n4ap, operatorap);
        int calc4ap = calculationsap(n2ap, n3ap, operatorap);
        int firstap;
        int secondap;

        EditText editn1ap = (EditText) findViewById(R.id.editn1ap);
        EditText editn2ap = (EditText) findViewById(R.id.editn2ap);

        if(operatorap.equals("*")){
            firstap = calc1ap - calc2ap;
            secondap = calc3ap + calc4ap;

            editn1ap.setText(Integer.toString(firstap));
            editn2ap.setText(Integer.toString(secondap));
        }
        else{
            editn1ap.setText(Integer.toString(calc1ap));
            editn2ap.setText(Integer.toString(calc2ap));
        }
    }
    public void MoveToMainActivityap(View view){
        Intent intent3ap = new Intent(this, MainActivity.class);
        startActivity(intent3ap);
    }
}