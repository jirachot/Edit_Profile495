package app.lab.profile495;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends Activity implements OnClickListener {

	private Button btn1, btn2;
	private TextView txtt1, txtt2, txtt3, txtt4, txtt5, txtt6, txtt7, txtt8;
	private String show1, show2, show3, show4, show5, show6, show7, show8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ViewMatching();
        
    }
        	private void ViewMatching() {
        		btn1 = (Button) findViewById(R.id.edt_profile);
        		btn2 = (Button) findViewById(R.id.btnimg);
        		btn1.setOnClickListener(this);
        		btn2.setOnClickListener(this);
        		txtt1 = (TextView) findViewById(R.id.txt01);
        		txtt2 = (TextView) findViewById(R.id.txt02);
        		txtt3 = (TextView) findViewById(R.id.txt03);
        		txtt4 = (TextView) findViewById(R.id.txt04);
        		txtt5 = (TextView) findViewById(R.id.txt05);
        		txtt6 = (TextView) findViewById(R.id.txt06);
        		txtt7 = (TextView) findViewById(R.id.txt07);
        		txtt8 = (TextView) findViewById(R.id.txt08);
        		txtt1.setText("PALY");
        		txtt2.setText("21");
        		txtt3.setText("A");
        		txtt4.setText("Sakaeo");
        		txtt5.setText("23/02/36");
        		txtt6.setText("Badminton");
        		txtt7.setText("Buddhism");
        		txtt8.setText("Thailand");
        		show1 = getIntent().getStringExtra("txtt1");
        		show2 = getIntent().getStringExtra("txtt2");
        		show3 = getIntent().getStringExtra("txtt3");
        		show4 = getIntent().getStringExtra("txtt4");
        		show5 = getIntent().getStringExtra("txtt5");
        		show6 = getIntent().getStringExtra("txtt6");
        		show7 = getIntent().getStringExtra("txtt7");
        		show8 = getIntent().getStringExtra("txtt8");
        		txtt1.setText(show1);
        		txtt2.setText(show2);
        		txtt3.setText(show3);
        		txtt4.setText(show4);
        		txtt5.setText(show5);
        		txtt6.setText(show6);
        		txtt7.setText(show7);
        		txtt8.setText(show8);
        		}
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch (v.getId()) {
				case R.id.edt_profile:
				Intent i = new Intent(getApplicationContext(), edt_profile_495.class);
				startActivity(i);
				break;
				case R.id.btnimg:
				Intent j = new Intent(getApplicationContext(), ImageActivity.class);
				startActivity(j);
				break;
				default:
				break;
			}
		}
    
    }
	

