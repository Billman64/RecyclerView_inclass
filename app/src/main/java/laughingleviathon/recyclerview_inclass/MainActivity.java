package laughingleviathon.recyclerview_inclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView rV;
    String[] mD = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rV = (RecyclerView) findViewById(R.id.rV);
        RecyclerView.LayoutManager lM = new LinearLayoutManager(this);
        rV.setLayoutManager(lM);

        MyAdapter mA = new MyAdapter(mD);
        rV.setAdapter(mA);

    }
}
