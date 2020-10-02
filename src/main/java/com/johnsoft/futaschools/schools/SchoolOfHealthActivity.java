package com.johnsoft.futaschools.schools;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.icu.lang.UCharacter;
import android.os.Bundle;

import com.johnsoft.futaschools.R;
import com.johnsoft.futaschools.model.DeptInfo;
import com.johnsoft.futaschools.recycler.DeptsRecycler;

import java.util.ArrayList;
import java.util.List;

public class SchoolOfHealthActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<DeptInfo> deptInfoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_of_health);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        deptInfoList.add(new DeptInfo("Biomedical Technology (BIM)", R.drawable.bim));
        deptInfoList.add(new DeptInfo("Human Anatomy (ANA)", R.drawable.ana));
        deptInfoList.add(new DeptInfo("Physiology (PHS)", R.drawable.phs));

        DeptsRecycler adapter  = new DeptsRecycler(deptInfoList, this);
        recyclerView.setAdapter(adapter);
    }
}
