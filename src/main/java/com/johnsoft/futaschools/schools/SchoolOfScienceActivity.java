package com.johnsoft.futaschools.schools;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.johnsoft.futaschools.R;
import com.johnsoft.futaschools.model.DeptInfo;
import com.johnsoft.futaschools.recycler.DeptsRecycler;

import java.util.ArrayList;
import java.util.List;

public class SchoolOfScienceActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<DeptInfo> deptInfoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_of_science);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        deptInfoList.add(new DeptInfo("Biochemistry (BCH)", R.drawable.bch));
        deptInfoList.add(new DeptInfo("Biology (BIO)", R.drawable.bio));
        deptInfoList.add(new DeptInfo("Biotechnology (BTH)", R.drawable.bth));
        deptInfoList.add(new DeptInfo("Industrial Chemistry (CHE)", R.drawable.che));
        deptInfoList.add(new DeptInfo("Mathematical Sciences (MTS)", R.drawable.mts_1));
        deptInfoList.add(new DeptInfo("Microbiology (MCB)", R.drawable.mcb));
        deptInfoList.add(new DeptInfo("Physics (PHY)", R.drawable.mts));
        deptInfoList.add(new DeptInfo("Statistics (STA)", R.drawable.sta));

        DeptsRecycler adapter = new DeptsRecycler(deptInfoList, this);
        recyclerView.setAdapter(adapter);

    }
}
