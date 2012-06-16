package de.alxwlb.android.learning;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HelloWorldGreetings extends Activity {

    Button btnOk;
    TextView textView2;
    
	  public void onCreate(Bundle icicle) {
	        super.onCreate(icicle);
	        setContentView(R.layout.greetings);
	        
	        textView2 = (TextView)findViewById(R.id.textView2);
	        btnOk = (Button)findViewById(R.id.button2);
	        
	        btnOk.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View v) {
					// TODO Auto-generated method stub
					finish();
				}
			});
	    }

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		textView2.setText("");
		String sText = getIntent().getExtras().getString("myName");
		textView2.setText(sText);
		
	}
}
