package it.jaschke.alexandria;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

public class BarcodeScanner extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcode_scanner);

        Intent returnIntent = new Intent();
        returnIntent.putExtra("result","fuck");
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }
}
