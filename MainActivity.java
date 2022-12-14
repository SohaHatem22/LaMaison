package com.example.gridview;
import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.GridView;
public class MainActivity extends Activity {
    GridView gv;
    Context context;
    ArrayList prgmName;

    public static String [] prgmNameList={"Adidas Bag","Women handbag",
            "Oversize purple shirt", "Oversize grey T-shirt","Black heels",
            "Gold heels","Baggy pants", "Ripped jeans","Les Deux","Nasa Hoodie",
            "Adidas white shoes", "Adidas floral shoes"};
    public static int [] prgmImages={R.drawable.bag1,R.drawable.bag2,R.drawable.tshirt,
            R.drawable.tshirt1,R.drawable.shoes,R.drawable.heels4,R.drawable.jeanse,
            R.drawable.jeanse1,R.drawable.hoodie2,R.drawable.hoodi5,R.drawable.adidas2,
            R.drawable.adidas};
    public static String [] prgmNameList2={"800","900","300","350",
            "750","1500","500","300","600","600","900",
            "1000"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button gridActivityBtn =(Button) findViewById(R.id.button3);
        gridActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Groceries.class);
                startActivity(i);
            }
        });
        gv=(GridView) findViewById(R.id.gridView1);
        gv.setAdapter(new CustomAdapter(this, prgmNameList, prgmImages,prgmNameList2) {

        });
    }


}
