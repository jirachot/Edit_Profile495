package app.lab.profile495;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class edt_profile_495 extends Activity implements OnClickListener {
	
	private Button btn_submit;
	private EditText etxt1, etxt2, etxt3, etxt4, etxt5, etxt6, etxt7, etxt8;
	private String txtt1, txtt2, txtt3, txtt4, txtt5, txtt6, txtt7, txtt8;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edt_profile495);
		ViewMatching();
	}
	private void ViewMatching() {
		btn_submit = (Button) findViewById(R.id.btn_save);
		btn_submit.setOnClickListener(this); 
		etxt1 = (EditText) findViewById(R.id.edt1);
		etxt2 = (EditText) findViewById(R.id.edt2);
		etxt3 = (EditText) findViewById(R.id.edt3);
		etxt4 = (EditText) findViewById(R.id.edt4);
		etxt5 = (EditText) findViewById(R.id.edt5);
		etxt6 = (EditText) findViewById(R.id.edt6);
		etxt7 = (EditText) findViewById(R.id.edt7);
		etxt8 = (EditText) findViewById(R.id.etd_8);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_save:
		txtt1 = (etxt1.getText().toString());
		txtt2 = (etxt2.getText().toString());
		txtt3 = (etxt3.getText().toString());
		txtt4 = (etxt4.getText().toString());
		txtt5 = (etxt5.getText().toString());
		txtt6 = (etxt6.getText().toString());
		txtt7 = (etxt7.getText().toString());
		txtt8 = (etxt8.getText().toString());
		Intent R = new Intent(getApplicationContext(),ProfileActivity.class);
		R.putExtra("txtt1", txtt1);
		R.putExtra("txtt2", txtt2);
		R.putExtra("txtt3", txtt3);
		R.putExtra("txtt4", txtt4);
		R.putExtra("txtt5", txtt5);
		R.putExtra("txtt6", txtt6);
		R.putExtra("txtt7", txtt7);
		R.putExtra("txtt8", txtt8);
		startActivity(R);
		break;
		default:
		break;
		}
	}

}
