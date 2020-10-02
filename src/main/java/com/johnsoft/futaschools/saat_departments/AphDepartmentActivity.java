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

public class AphDepartmentActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private RecyclerView aboutDepartmentRecycler, admissionRequirementRecycler, gradRequirementRecycler, programDurationRecycler, hodProfileRecycler;
    private List<AboutDepartmentDetails> aboutDepartmentDetailsList = new ArrayList<>();
    private List<AdmissionRequirementDetails> admissionRequirementDetailsList = new ArrayList<>();
    private List<GraduationRequirementDetails> graduationRequirementDetailsList = new ArrayList<>();
    private List<ProgramDurationDetails> programDurationDetailsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aph_department);
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
                "WELCOME TO THE DEPARTMENT OF ANIMAL PRODUCTION AND HEALTH",
                "The philosophy of the Federal University of Technology, Akure is to produce practical-oriented graduates who are ready for self-employment at graduation. In line with this philosophy, the Department considers it appropriate to train graduates who have a broad-based knowledge of the various aspects of agriculture, and a bias towards animal production. The intention is that these graduates should be so practically trained as well as theoretically knowledgeable so as to encourage them to set up themselves in agricultural production as a means of reducing graduate unemployment and increasing agricultural productivity. The Department further holds that a deeper knowledge of animal health problems than is normally imparted to undergraduates of Animal Science will better prepare a graduate of Animal Production and Health for the challenges of intensive livestock production that would encountered on the field.\n" +
                        "\n" +
                        "Objectives of the Programme The objectives of the programme are to: 1. - train undergraduates broadly in the filed of agricultural production with emphasis on animal production. 2. - emphasise in the above training appreciation for the role of animal diseases in animal production through general disease diagnosis and elaboration of preventive measures. 3. - train undergraduates in basic research techniques. 4. - prepare undergraduates for self employment in general agriculture, especially in animal production.\n" +
                        "\n"));


        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "UTME Admission: Admission into the first year (100 level) of the programme is either through UTME or pre-degree programme of the Federal University of Technology, Akure. A. ORDINARY LEVEL REQUIREMENTS\n" +
                        "\n" +
                        "Candidates must possess five credits in WASSCE or NECO or GCE (O/L) or equivalent at a maximum of two sittings to include the following subjects: English Language, Mathematics, Chemistry, Biology or Agricultural Science and at least a pass in Physics.\n" +
                        "\n" +
                        "B. UNIVERSITY MATRICULATION EXAMINATION (UME) SUBJECT REQUIREMENTS\n" +
                        "\n" +
                        "UTME Subjects: English Language, Mathematics or Physics, Chemistry, Biology or Agricultural Science\n" +
                        "\n" +
                        "C. DIRECT ENTRY(DE) REQUIREMENTS\n" +
                        "\n" +
                        "(i)Candidates may be admitted into the second year (200 Level) of the programme through Direct Entry if they have a National Diploma with minimum of Upper Credit or equivalent from FUTA UDS programme or recognized polytechnics and Colleges of Technology in relevant disciplines (Agricultural Sciences). Such candidates are also expected to meet the requirements for UTME admission specified in ‘a’ above.\n" +
                        "\n" +
                        "(ii)Candidates who possess GCE (A/L) or equivalent with passes in at least two of the following subjects are eligible for admission: Physics, Chemistry and Biology."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for the award of B.Agric.Tech. (Animal Production and Health), a student must have:\n" +
                        "\n" +
                        "a.passed all core (compulsory) courses as well as all University and School required courses and electives recommended for specialization;\n" +
                        "\n" +
                        "b. accumulated a minimum of 200 units for UTME, 156 Units for Direct Entry, passed all recommended courses for the option and obtained a CGPA of not less than 1.00 and\n" +
                        "\n" +
                        "c. successfully completed all field practicals, industrial attachment, training seminars and projects.\n" +
                        "\n" +
                        "All Direct Entry students are expected to audit and pass the following University required courses: GNS 101, 102, 103 & 106, MEE 101 & 102."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The duration of the programme is five academic sessions for students admitted through the UTME but for Direct Entry, it is four. If a student fails to graduate in five academic sessions, he or she will NOT be allowed to exceed a total of 7 academic sessions or 15 Semesters.\n" +
                        "\n"));
    }
}
