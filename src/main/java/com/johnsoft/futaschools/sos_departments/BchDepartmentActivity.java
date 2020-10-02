package com.johnsoft.futaschools.sos_departments;

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

public class BchDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_bch_department);
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
                "WELCOME TO THE DEPARTMENT OF BIOCHEMISTRY",
                "The philosophy of the Department is in line with the University Philosophy of training students to be practically oriented, ready to be self-employed after graduation. In line with this, the Department of Biochemistry as at now runs an approved option - Applied Biochemistry. The courses in this option are designed to make the students practically oriented and to make them theoretically knowledgeable. This is to ensure that students after graduation can fit perfectly into the employment market, whether in the industries, government parastatals or the self-employment market.\n" +
                        "\n" +
                        "OBJECTIVE OF THE DEPARTMENT\n" +
                        "\n" +
                        "The objectives are to:\n" +
                        "\n" +
                        "a. provide a comprehensive basic education in the science of Biochemistry up to Bachelor’s degree level;\n" +
                        "\n" +
                        "b. make students aware that of the increasing relevance of Biochemistry in providing goods and services for the benefit of mankind;\n" +
                        "\n" +
                        "c. provide a basis for the establishment of centres of excellence in specialized area of Biochemistry at higher degree levels;\n" +
                        "\n" +
                        "d. provide appropriate service courses for students from other Departments who require working knowledge of Biochemistry,"));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "a) UME Admission: Admission into the first year (100L) of the programme is either through UME or the Pre-degree Science programme of the Federal University of Technology, Akure. Candidates must have a minimum of five OLevel credit passes at a maximum of two sittings, which must include : English Language, Mathematics, Physics, Chemistry, Biology, or Agricultural Science. UME Subjects: English Language , Chemistry, Biology/Agricultural Science and Mathematics/Physics.\n" +
                        "\n" +
                        "b) Direct Entry: Students may be admitted into the second year (200L) of the programme through direct entry entry if they have a good National Diploma from recognized Polytecnics and Colleges Of Technology in relevants disciplines. A minimum of Upper Credit at National D iploma level is required along with the SSCE/NECO requirement for UME admission."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "The minimum number of units required for graduation is stated as follows:\n" +
                        "\n" +
                        "UME admission candidates - 194 units\n" +
                        "\n" +
                        "Direct Entry admission candidates - 150 units"));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The duration for the B.Tech (Applied Biochemistry) programme shall be five academic session for students that entered the University by UME admission and four academic sessions for those by direct admission."));
    }
}