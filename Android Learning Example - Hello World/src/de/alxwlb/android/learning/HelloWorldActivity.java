package de.alxwlb.android.learning;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HelloWorldActivity extends Activity {
    
    EditText editText1;
    Button btnOk;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        editText1 = (EditText)findViewById(R.id.editText1);
        btnOk = (Button)findViewById(R.id.button1);
        
        btnOk.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if ("" == editText1.getText().toString()) return;
				String sText = "Hello " + editText1.getText().toString().trim() + "!";
				Intent myIntent = new Intent(HelloWorldActivity.this, HelloWorldGreetings.class);
				myIntent.putExtra("myName", sText);
				startActivity(myIntent);
			}
		});
    }

	/* (non-Javadoc)
	 * @see android.app.Activity#onResume()
	 */
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		editText1.setText("");
	}
}