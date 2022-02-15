package rahul.project.dayfour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView editText;
Button button_one,button_two,button_three,button_four,
    button_five,button_six,button_seven,button_eight,
    button_nine,button_zero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editTextNumber);
        button_one=findViewById(R.id.one);
        button_two=findViewById(R.id.two);
        button_three=findViewById(R.id.three);
        button_four=findViewById(R.id.four);
        button_five=findViewById(R.id.five);
        button_six=findViewById(R.id.six);
        button_seven=findViewById(R.id.seven);
        button_eight=findViewById(R.id.eight);
        button_nine=findViewById(R.id.nine);
        button_zero=findViewById(R.id.zero);
    }

    public void one(View view) {
        clearText();
        editText.setText(button_one.getText().toString().trim());
        Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
    }

    public void two(View view) {
        clearText();
        editText.setText(button_two.getText().toString().trim());
        Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
    }

    private void clearText() {
        editText.setText("");
    }


    public void three(View view) {
        clearText();
        editText.setText(button_three.getText().toString().trim());
        Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
    }

    public void four(View view) {
        clearText();
        editText.setText(button_four.getText().toString().trim());
        Toast.makeText(MainActivity.this, "4", Toast.LENGTH_SHORT).show();
    }

    public void five(View view) {
        clearText();
        editText.setText(button_five.getText().toString().trim());
        Toast.makeText(MainActivity.this, "5", Toast.LENGTH_SHORT).show();
    }

    public void six(View view) {
        clearText();
        editText.setText(button_six.getText().toString().trim());
        Toast.makeText(MainActivity.this, "6", Toast.LENGTH_SHORT).show();
    }

    public void seven(View view) {
        clearText();
        editText.setText(button_seven.getText().toString().trim());
        Toast.makeText(MainActivity.this, "7", Toast.LENGTH_SHORT).show();
    }

    public void eight(View view) {
        clearText();
        editText.setText(button_eight.getText().toString().trim());
        Toast.makeText(MainActivity.this, "8", Toast.LENGTH_SHORT).show();
    }

    public void nine(View view) {
        clearText();
        editText.setText(button_nine.getText().toString().trim());
        Toast.makeText(MainActivity.this, "9", Toast.LENGTH_SHORT).show();
    }

    public void zero(View view) {
        clearText();
        editText.setText(button_zero.getText().toString().trim());
        Toast.makeText(MainActivity.this, "0", Toast.LENGTH_SHORT).show();
    }

    Spinner spinner = (Spinner) findViewById(R.id.spinner);
    // Create an ArrayAdapter using the string array and a default spinner layout
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
            R.array.planets_array, android.R.layout.simple_spinner_item);
    // Specify the layout to use when the list of choices appears
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    // Apply the adapter to the spinner
    spinner.setAdapter(adapter);



}