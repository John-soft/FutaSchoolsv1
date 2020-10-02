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

public class SchoolOfEnvironmentalActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<DeptInfo> deptInfoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_of_environmental);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        deptInfoList.add(new DeptInfo("Architecture (ARC)", R.drawable.arc_1));
        deptInfoList.add(new DeptInfo("Building (BDG)", R.drawable.bdg));
        deptInfoList.add(new DeptInfo("Estate Management (ESM)", R.drawable.esm_1));
        deptInfoList.add(new DeptInfo("Industrial Design (IDD)", R.drawable.idd));
        deptInfoList.add(new DeptInfo("Quantity Surveying (QSV)", R.drawable.qsv));
        deptInfoList.add(new DeptInfo("Surveying and Geoinformatics (SVG)", R.drawable.svg_1));
        deptInfoList.add(new DeptInfo("Urban and Regional Planning (URP)", R.drawable.urp));

        DeptsRecycler adapter = new DeptsRecycler(deptInfoList,this);
        recyclerView.setAdapter(adapter);
    }
}
