package philippbrogli.launchmapexercise;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMap(View view){
        // get lat and lng values
        EditText editTextLat =(EditText) findViewById(R.id.editTextLat);
        EditText editTextLng =(EditText) findViewById(R.id.editTextLng);
        String strLat = editTextLat.getText().toString();
        String strLng = editTextLng.getText().toString();
        double lat =Double.parseDouble(strLat);
        double lng =Double.parseDouble(strLng);
        // show map
        Intent intent =new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:"+lat+","+lng));
        startActivity(intent);
    }
}
