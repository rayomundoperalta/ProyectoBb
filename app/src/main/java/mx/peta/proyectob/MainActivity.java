package mx.peta.proyectob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button   btnSaludar;
    private TextView lblMensaje;
    private EditText etNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblMensaje = (TextView)findViewById(R.id.lblMensaje);
        etNombre   = (EditText)findViewById(R.id.tfNombre);


        btnSaludar = (Button)findViewById(R.id.btnSaludar);
        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblMensaje.setText("Esto debe ser el nombre " + etNombre.getText());
            }
        });


    }
}