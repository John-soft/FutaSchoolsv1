package com.johnsoft.futaschools.saat_departments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.johnsoft.futaschools.R;
import com.johnsoft.futaschools.model.AboutDepartmentDetails;
import com.johnsoft.futaschools.model.AdmissionRequirementDetails;
import com.johnsoft.futaschools.model.GraduationRequirementDetails;
import com.johnsoft.futaschools.model.ProgramDurationDetails;
import com.johnsoft.futaschools.recycler.AboutDepartmentAdapter;
import com.johnsoft.futaschools.recycler.AdmissionRequirementAdapter;
import com.johnsoft.futaschools.recycler.GraduationRequirementAdapter;
import com.johnsoft.futaschools.recycler.ProgramDurationAdapter;

import java.util.ArrayList;
import java.util.List;

public class EwmDepartmentActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private RecyclerView aboutDepartmentRecycler, admissionRequirementRecycler, gradRequirementRecycler, programDurationRecycler, hodProfileRecycler;
    private List<AboutDepartmentDetails> aboutDepartmentDetailsList = new ArrayList<>();
    private List<AdmissionRequirementDetails> admissionRequirementDetailsList = new ArrayList<>();
    private List<GraduationRequirementDetails> graduationRequirementDetailsList = new ArrayList<>();
    private List<ProgramDurationDetails> programDurationDetailsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ewm_department);
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


        aboutDepartmentDetailsList.add(new AboutDepartmentDetails("About Department",
                "WELCOME TO THE DEPARTMENT OF ECOTOURISM AND WILDLIFE MANAGEMENT",
                "The philosophy of this programme is to provide functional education for students who eventually after the training will be job-makers rather than job seekers. The academic programme takes adequate cognizance of the requirements for the different areas in Ecotourism, Wildlife, and Environmental Protection and Management sub-sector of Agricultural production with the aim of meeting the need for manpower requirements in this sub-sector. The products of this programme will be required for rational exploitation and utilization of Nigeria’s Biodiversity and Wildlife as renewable natural resources mainly for food production, industrial biomaterials, tourism and environmental protection.\n" +
                        "\n" +
                        "Objective of The Programme\n" +
                        "\n" +
                        "the major objectives of the programme are to:\n" +
                        "\n" +
                        "a. provide education in the science and technology of ecotourism, environmental protection and management, and wildlife resources managements for skilled manpower needs of the country.\n" +
                        "\n" +
                        "b. provide opportunities for goal oriented research in ecotourism, wildlife enviromental protection and management relevant to the country needs in general and local needs in particularly.\n" +
                        "\n" +
                        "c. offer the public the result of resarch and foster the practical application of these result to benefit the immediate commodity and the country at large income empowerment, poverty allievation, and eradication of hunger, ignorance, stagnation and diseases.\n" +
                        "\n" +
                        "d. get involved in sustainable wildlife production, ecotourism, environmental protection and management through collaborations with the federal and state government, parastals, institutes and other international organisations in the areas of wildlife production and management, ecotourism and environmental protection."));


        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "a. UME\n" +
                        "\n" +
                        "Admission into the first year (100 Level) of the programme is through JAMB. To be eligible for admission, candidates are expected to take and pass the UME examination. Candidates must possess five (5) credits in SSCE or NECO or GCE (O/L) or equivalent at a maximum of two (2) sittings in the following subjects: English Language, Mathematics, Biology or Agricultural Science, Chemistry and Geography/ Economics and Physics.\n" +
                        "\n" +
                        "UTME subjects: English Language, Biology/Agricultural Science and ANY TWO of Chemistry, Geography, Economics, Mathematics and Physics.\n" +
                        "\n" +
                        "b. Direct Entry\n" +
                        "\n" +
                        "(i) Candidates may be admitted into the second year (200 Level) of the programme through Direct Entry if they have a National Diploma with a minimum of Upper Credit or equivalent from recognized Polytechnic and College of Wildlife Management in relevant discipline (Agricultural Sciences). Such candidates are also expected to meet the requirements for UTME admission specified in (a) above.\n" +
                        "\n" +
                        "(ii) Candidates who possess GCE (Advanced Level) or equivalent with passes in at least two of the following subjects are eligible for admission: Chemistry, Biology, Physics and Geography or Economics."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirement",
                "To be eligible for the award of B.Tech degree in food science and technology a student must have:\n" +
                        "\n" +
                        "a. passed all core (compulsory) courses as well as all university and school required courses and electives recommended for specialization;\n" +
                        "\n" +
                        "b. accumulated at least 202 units for students admitted through UTME and 168 units for those by direct entry, and obtained a CGPA of not less than 1.00; and\n" +
                        "\n" +
                        "c. successfully completed all class work; industrial attachment, seminars and projects.\n" +
                        "\n" +
                        "As part of the programme, students visit industries and take part in the Long Vacation Industrial Practical Work Scheme (usually in the second semesters of 200 and 300 levels)to enable them reconcile therotical knowledge with what obtain in the industries and farms. in the second semester of the 400 levels (4th year), they also go on a six-month students industrial Work Experience Scheme (SIWES) in a food industry.\n" +
                        "\n" +
                        "Direct entry students are expected to audit and pass the following University required courses: GNS101, 102, 103 and 106; MEE 101 and 102."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The duration of the programme is five academic sessions for students admitted through the UTME but for Direct Entry, it is four. If a student fails to graduate in five academic sessions, he or she will NOT be allowed to exceed a total of 7 academic sessions or 15 Semesters.\n" +
                        "\n"));
    }
}
