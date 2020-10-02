
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

public class SchoolOfAgricActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<DeptInfo> deptInfoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_of_agric);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        deptInfoList.add(new DeptInfo("Agricultural and Resource Economics (ARE)", R.drawable.are));
        deptInfoList.add(new DeptInfo("Agricultural Extension and Communication Technology  (AEC)", R.drawable.aec));
        deptInfoList.add(new DeptInfo("Animal Production and Health (APH)", R.drawable.aph));
        deptInfoList.add(new DeptInfo("Crop, Soil and Pest Management (CSP)", R.drawable.csp));
        deptInfoList.add(new DeptInfo("Ecotourism and Wildlife Management  (EWM)", R.drawable.ewm));
        deptInfoList.add(new DeptInfo("Fisheries and Aquaculture Technology (FAT)", R.drawable.fat));
        deptInfoList.add(new DeptInfo("Food Science and Technology (FST)", R.drawable.fst));
        deptInfoList.add(new DeptInfo("Forestry and Wood Technology (FWT)", R.drawable.fwt));

        DeptsRecycler adapter = new DeptsRecycler(deptInfoList,this);
        recyclerView.setAdapter(adapter);
    }
}
