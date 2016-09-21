package jp.ac.asojuku.st.twotouthmail;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Random;

import jp.ac.asojuku.st.twotouchmail.R;


public class PickUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_up);
        Button btnSend = (Button) this.findViewById(R.id.button);

        btnSend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                RadioGroup rgPlace = (RadioGroup) findViewById(R.id.rg_place);
                int checkedId = rgPlace.getCheckedRadioButtonId();
                String strPlace = ((RadioButton) findViewById(checkedId)).getText().toString();
                EditText edit01 = (EditText) findViewById(R.id.editText);
                String title = edit01.getText().toString();

                Resources res = getResources();

                Uri uri;
                Random rand = new Random();
                int r = rand.nextInt(3);
                switch(r){
                    case 1:
                        uri = Uri.parse("mailto:" +res.getString(R.string.mail_to1).toString());
                        break;

                    case 2:
                        uri = uri =Uri.parse("mailto:" +res.getString(R.string.mail_to2).toString());
                        break;
                    case 3:
                        uri = uri =Uri.parse("mailto:" +res.getString(R.string.mail_to3).toString());
                        break;

                    default:
                        uri = Uri.parse("mailto:" +res.getString(R.string.mail_to1).toString());
                        break;
                }

                Intent intent = new Intent(Intent.ACTION_SENDTO,uri);
                intent.putExtra(Intent.EXTRA_SUBJECT,title);
                intent.putExtra(intent.EXTRA_TEXT,strPlace+"にきて");
                startActivity(intent);

            }

        });


    }
}
