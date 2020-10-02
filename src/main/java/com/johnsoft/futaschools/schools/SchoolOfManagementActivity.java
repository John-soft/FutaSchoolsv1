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

public class SchoolOfManagementActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<DeptInfo> deptInfoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_of_management);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        deptInfoList.add(new DeptInfo("Accounting (ACC)", R.drawable.acc));
        deptInfoList.add(new DeptInfo("Business Administration (BUS)", R.drawable.bus));
        deptInfoList.add(new DeptInfo("Economics (ECN)", R.drawable.ecn));
        deptInfoList.add(new DeptInfo("Entrepreneurship (ENT)", R.drawable.ent));
        deptInfoList.add(new DeptInfo("Project Management Technology (PMT)", R.drawable.pmt));
        deptInfoList.add(new DeptInfo("Transport Management Technology (TMT)", R.drawable.tmt));

        DeptsRecycler adapter = new DeptsRecycler(deptInfoList, this);
        recyclerView.setAdapter(adapter);
    }
}
