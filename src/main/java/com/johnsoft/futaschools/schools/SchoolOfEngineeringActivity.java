package com.johnsoft.futaschools.schools;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.johnsoft.futaschools.model.DeptInfo;
import com.johnsoft.futaschools.recycler.DeptsRecycler;
import com.johnsoft.futaschools.R;

import java.util.ArrayList;
import java.util.List;

public class SchoolOfEngineeringActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<DeptInfo> deptInfoList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_of_engineering);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        deptInfoList.add(new DeptInfo("Agricultural and Environmental Engineering (AGE)", R.drawable.agriceng));
        deptInfoList.add(new DeptInfo("Civil and Environmental Engineering (CVE)", R.drawable.civil_2));
        deptInfoList.add(new DeptInfo("Computer Engineering (CPE)", R.drawable.computereng));
        deptInfoList.add(new DeptInfo("Electrical and Electronics Engineering (EEE)", R.drawable.electricaleng));
        deptInfoList.add(new DeptInfo("Industrial and Production Engineering (IPE)", R.drawable.productioneng));
        deptInfoList.add(new DeptInfo("Mechanical Engineering (MEE)", R.drawable.mecheng2));
        deptInfoList.add(new DeptInfo("Metallurgical and Materials Engineering (MME)", R.drawable.metmatseng));
        deptInfoList.add(new DeptInfo("Mining Engineering (MNE)", R.drawable.mining));
        deptInfoList.add(new DeptInfo("Information and Communication Technology (ICT)", R.drawable.ict));

        DeptsRecycler adapter = new DeptsRecycler(deptInfoList,this);
        recyclerView.setAdapter(adapter);


    }
}
