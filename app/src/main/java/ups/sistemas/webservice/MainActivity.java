package ups.sistemas.webservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private Button parse;
    private TextView datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parse = (Button) findViewById(R.id.btnParse);
        datos = (TextView) findViewById(R.id.tvCity);
        parse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                City c = parseJson();
                datos.setText("Datos: "+c.getId()+"-"+c.getName());
                Toast.makeText(getApplicationContext(), "Id: "+c.getId()+" Nombre: "+c.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private City parseJson(){
        String json = "{\n" +
                "id: 1, \n" +
                "name: 'London'" +
                "}";
        City city = null;
        try {
            JSONObject mjJson = new JSONObject(json);
            //obtenemos los 2 datos del json
            int id = mjJson.getInt("id");
            String name = mjJson.getString("name");
            city = new City(id, name);
        } catch (JSONException e){
            e.printStackTrace();
        }
        return  city;
    }
}
