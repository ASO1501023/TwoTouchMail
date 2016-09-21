package jp.ac.asojuku.st.twotouthmail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import jp.ac.asojuku.st.twotouchmail.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnPicUp = (Button) this.findViewById(R.id.button1);
        btnPicUp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PickUpActivity.class);
                startActivity(intent);
            }
        });
            Button btnNoDinner =(Button)this.findViewById(R.id.button2);
            btnNoDinner.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    Intent intent = new Intent(MainActivity.this,NoDinnerActivity.class);
                    startActivity(intent);
                 }
            });
    }
}
