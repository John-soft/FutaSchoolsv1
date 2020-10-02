package com.johnsoft.futaschools.schools;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.johnsoft.futaschools.R;
import com.johnsoft.futaschools.model.DeptInfo;
import com.johnsoft.futaschools.recycler.DeptsRecycler;
import com.squareup.picasso.Picasso;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SchoolOfComputingActivity extends AppCompatActivity {
   private RecyclerView recyclerView;
   private List<DeptInfo> deptInfoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_of_computing);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        deptInfoList.add(new DeptInfo("Computer Science (CSC)", R.drawable.computerscience));
        deptInfoList.add(new DeptInfo("Cyber Security (CYS)", R.drawable.cyber));
        deptInfoList.add(new DeptInfo("Information Systems (IFS)", R.drawable.informationsystems));
        deptInfoList.add(new DeptInfo("Information Technology (IFT)", R.drawable.informationtech));
        deptInfoList.add(new DeptInfo("Software Engineering (SEN)", R.drawable.software));

        DeptsRecycler adapter = new DeptsRecycler(deptInfoList, this);
        recyclerView.setAdapter(adapter);

    }
}
