package de.alxwlb.android.learning;


import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloWorldActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final EditText editText1 = (EditText)findViewById(R.id.editText1);
        final Button btnOk = (Button)findViewById(R.id.button1);
        
        btnOk.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if ("" == editText1.getText().toString()) return;
				String sText = "Hello " + editText1.getText().toString().trim() + "!";
			}
		});
    }
}