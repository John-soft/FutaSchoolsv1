package com.johnsoft.futaschools.sems_departments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.johnsoft.futaschools.R;
import com.johnsoft.futaschools.model.AboutDepartmentDetails;
import com.johnsoft.futaschools.model.AdmissionRequirementDetails;
import com.johnsoft.futaschools.model.GraduationRequirementDetails;
import com.johnsoft.futaschools.model.HodProfileDetails;
import com.johnsoft.futaschools.model.ProgramDurationDetails;
import com.johnsoft.futaschools.recycler.AboutDepartmentAdapter;
import com.johnsoft.futaschools.recycler.AdmissionRequirementAdapter;
import com.johnsoft.futaschools.recycler.GraduationRequirementAdapter;
import com.johnsoft.futaschools.recycler.HodProfileAdapter;
import com.johnsoft.futaschools.recycler.ProgramDurationAdapter;

import java.util.ArrayList;
import java.util.List;

public class RsgDepartmentActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private RecyclerView aboutDepartmentRecycler, admissionRequirementRecycler, gradRequirementRecycler, programDurationRecycler, hodProfileRecycler;
    private List<AboutDepartmentDetails> aboutDepartmentDetailsList = new ArrayList<>();
    private List<AdmissionRequirementDetails> admissionRequirementDetailsList = new ArrayList<>();
    private List<GraduationRequirementDetails> graduationRequirementDetailsList = new ArrayList<>();
    private List<ProgramDurationDetails> programDurationDetailsList = new ArrayList<>();
    private List<HodProfileDetails> hodProfileDetailsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsg_department);
        mToolbar = (Toolbar) findViewById(R.id.seet_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //about department recycler
        aboutDepartmentRecycler = (RecyclerView) findViewById(R.id.about_department_recycler);
        aboutDepartmentRecycler.setHasFixedSize(false);
        aboutDepartmentRecycler.setLayoutManager(new LinearLayoutManager(this));
        AboutDepartmentAdapter aboutDepartmentAdapter = new AboutDepartmentAdapter(aboutDepartmentDetailsList);
        aboutDepartmentRecycler.setAdapter(aboutDepartmentAdapter);


        //admission requirement recycler
        admissionRequirementRecycler = (RecyclerView) findViewById(R.id.admission_requirement_recycler);
        admissionRequirementRecycler.setHasFixedSize(false);
        admissionRequirementRecycler.setLayoutManager(new LinearLayoutManager(this));
        AdmissionRequirementAdapter admissionRequirementAdapter = new AdmissionRequirementAdapter(admissionRequirementDetailsList);
        admissionRequirementRecycler.setAdapter(admissionRequirementAdapter);

        //graduation requirement recycler
        gradRequirementRecycler = (RecyclerView) findViewById(R.id.graduation_requirement_recycler);
        gradRequirementRecycler.setHasFixedSize(false);
        gradRequirementRecycler.setLayoutManager(new LinearLayoutManager(this));
        GraduationRequirementAdapter graduationRequirementAdapter = new GraduationRequirementAdapter(graduationRequirementDetailsList);
        gradRequirementRecycler.setAdapter(graduationRequirementAdapter);

        //program duration recycler
        programDurationRecycler = (RecyclerView) findViewById(R.id.program_duration_recycler);
        programDurationRecycler.setHasFixedSize(false);
        programDurationRecycler.setLayoutManager(new LinearLayoutManager(this));
        ProgramDurationAdapter programDurationAdapter = new ProgramDurationAdapter(programDurationDetailsList);
        programDurationRecycler.setAdapter(programDurationAdapter);

        //hod profile recycler
        hodProfileRecycler = (RecyclerView) findViewById(R.id.hod_profile_recycler);
        hodProfileRecycler.setHasFixedSize(false);
        hodProfileRecycler.setLayoutManager(new LinearLayoutManager(this));
        HodProfileAdapter hodProfileAdapter = new HodProfileAdapter(hodProfileDetailsList);
        hodProfileRecycler.setAdapter(hodProfileAdapter);


        aboutDepartmentDetailsList.add(new AboutDepartmentDetails("About Department",
                "WELCOME TO THE DEPARTMENT OF REMOTE SENSING AND GEO-SCIENCE INFORMATION SYSTEM",
                "You are welcome to the Department of Remote Sensing and Geoscience Information System, a recent addition to the School of Earth and Mineral Sciences in FUTA.\n" +
                        "\n" +
                        "The Department is established for the purpose of providing training and research in Remote sensing and GIS technology applications. The curriculum is structured such that students will take courses that cut across the earth sciences, urban and regional studies, agriculture and forestry. Fieldwork, hands-on practicals and sound theoretical inputs will be relied upon to expose the students to aspects that are relevant to Nigeria’s needs for developmental growth to meet its Millenium Development Goals.\n" +
                        "\n" +
                        "In addition, we have the human and material capacity to provide quality services in the following areas:\n" +
                        "\n" +
                        "Education and Training in Remote Sensing and GIS\n" +
                        "Groundwater and Mineral exploration and exploitation\n" +
                        "Environmental studies\n" +
                        "Highway and Route Planning\n" +
                        "Agricultural and Forestry Applications\n" +
                        "Land use studies and Urban Planning\n" +
                        "Consultancies\n" +
                        "Programme Objectives\n" +
                        "\n" +
                        "The objectives of the programme are to:\n" +
                        "\n" +
                        "(i) impart basic and fundamental knowledge of remote sensing\n" +
                        "\n" +
                        "(ii) train students with the capability to use remote sensing to solve human\n" +
                        "\n" +
                        "problems\n" +
                        "\n" +
                        "(iii) provide an enabling environment for a better appreciation of remote sensing\n" +
                        "\n" +
                        "in earth sciences and other applied disciplines; and\n" +
                        "\n" +
                        "(iv) equip the students with result–oriented research for industrial, technological\n" +
                        "\n" +
                        "and academic development of the country."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "Admission into the Department shall be through JAMB U.M.E.and Direct entry.\n" +
                        "\n" +
                        "(a) U.M.E\n" +
                        "\n" +
                        "Admission through U.M.E.shall take the student to 100 level.To be eligible for admission,candidate is expected to pass both the U.M.E.and the university screening test.The candidate must have in addition a minimum of credit pass in five subjects at not more than two sittings in SSCE,NECO OR GCE(ordinary level).The credit passes are required in the following subjects:English language,Mathematics,Chemistry,Physics and Biology/Geography.The U.M.E. subjects are:English Language,Physics,Mathematics,Chemistry or Geography.\n" +
                        "\n" +
                        "Direct Entry\n" +
                        "\n" +
                        "Admission by direct entry is into second year(200 level) of the programme.In addition to the senior school certificate requirements for U.M.E. admission,eligible student for direct entry should further possess National Diploma(ND) at a minimum of upper credit level in Mineral Exploration,Mineral Resources Engineering,Geology,Geophysics,Meterology,Mining Engineering,Forestry,Urban & Regional Planning,Architecture,Surveying,Geography and Science Technology from any recognized institution or good passes at GCE(advanced level)at one sitting in at least two of the following subjects:Physics,Mathematics,Chemistry andBiology."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "The minimum number of units required for graduation and for completion of class of degree is 198 for students admitted through UME and 154 for those admitted through Direct Entry."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The.B.Tech.(Remote Sensing and Geoscience Information System)programme is designed for five academic sessions for candidates who gain admission into the University through U.M.E. However, direct entry candidates are permitted to spend four academic sessions in the programme. The first two sessions of the programme are devoted to taking courses in basic sciences, engineering and introductory aspects of the programme. The following two sessions will expose the students to the concepts and core courses in remote sensing including six months industrial experience scheme (SIWES). The last part of the course is focused on specialized courses in remote sensing and its various areas of applications with the aim of solving human problems."));

    }
}
