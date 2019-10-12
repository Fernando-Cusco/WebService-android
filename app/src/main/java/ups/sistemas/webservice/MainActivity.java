package ups.sistemas.webservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String json = "{\n" +
                "id: 1, \n" +
                "name: 'London'" +
                "}";

        try {
            JSONObject mjJson = new JSONObject(json);
            
        } catch (JSONException e){
            e.printStackTrace();
        }

    }
}
