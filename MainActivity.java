package com.example.gridview;
import java.util.ArrayList;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.GridView;
public class MainActivity extends Activity {
    GridView gv;
    Context context;
    ArrayList prgmName;
    public static String [] prgmNameList={"Let Us C","c++","JAVA","Jsp","Microsoft .Net","Android","PHP","Jquery","JavaScript"};
    public static int [] prgmImages={R.drawable.abc,R.drawable.abc,R.drawable.abc,R.drawable.abb,R.drawable.dodo,R.drawable.soso3,R.drawable.abb,R.drawable.dodo,R.drawable.soso3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv=(GridView) findViewById(R.id.gridView1);
        gv.setAdapter(new CustomAdapter(this, prgmNameList, prgmImages) {
        });
    }


}