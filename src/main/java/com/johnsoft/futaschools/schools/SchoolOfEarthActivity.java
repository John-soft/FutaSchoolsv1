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

public class SchoolOfEarthActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<DeptInfo> deptInfoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_of_earth);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        deptInfoList.add(new DeptInfo("Applied Geology (AGY)", R.drawable.geology));
        deptInfoList.add(new DeptInfo("Applied Geophysics (AGP)", R.drawable.agy_1));
        deptInfoList.add(new DeptInfo("Marine Science and Technology (MST)", R.drawable.mst_1));
        deptInfoList.add(new DeptInfo("Meteorology and Climate Science (MCS)", R.drawable.rsg_2));
        deptInfoList.add(new DeptInfo("Remote Sensing and Geoscience Information Systems (RSG)", R.drawable.rsg));

        DeptsRecycler adapter = new DeptsRecycler(deptInfoList, this);
        recyclerView.setAdapter(adapter);
    }
}
