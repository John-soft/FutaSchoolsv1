package com.johnsoft.futaschools.shht_departments;

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

public class AnaDepartmentActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_ana_department);
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
                "WELCOME TO THE DEPARTMENT OF ANATOMY",
                "The Department of Human Anatomy is one of the pioneer departments in the School of Health and Health Technology, established at the inception of the School of Health and Health Technology in 2015. The department currently runs Bachelor of Science (B. Sc degree) in Human Anatomy. The programme took off in 2015/2016 academic session with Dr. Victor Ukwenya (Ph.D.) as the first staff member and pioneering head of department. The department has the following units/divisions for teaching and research purposes; Gross Anatomy Unit, Microscopic Anatomy Unit, Developmental Biology Unit, Molecular Endocrinology Unit, Neuroanatomy Unit , Anthropology and Clinical Anatomy Unit, Radiological Anatomy Unit, Comparative and Evolutionary Anatomy Unit. The departmental office housing the academic staff is situated in the School of Health and Health Technology Building in Obala Main Campus of the University.\n" +
                        "\n" +
                        "Students of the department offer the same science courses at the 100 level as their counterparts in the other schools within the university and start to offer courses in the department from 200 level. During the second semester holiday of 200 and 300 level, all students in the department are required to proceed on Student Work Experience Programme (SWEP) as part of requirement for award of Bachelor of Science (B.sc) in Human Anatomy.\n" +
                        "\n" +
                        "The academic programme of the Department operates academic curricular in line with National Universities Commission (NUC) Benchmark Minimum Academic Standards."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "Admission into the department of Anatomy can be by Unified Tertiary Matriculation Examination (UTME) or by direct entry.\n" +
                        "\n" +
                        "UTME\n" +
                        "Admission into the first year (100 Level) of the programme is either through the UTME or the Pre-degree Science programme of the Federal University of Technology, Akure. Candidates must have a minimum of five credit passes at not more than two sittings, which must include: English Language, Mathematics, Physics, Chemistry and Biology.\n" +
                        "\n" +
                        "UTME Subjects: English Language, Physics, Chemistry and Biology.\n" +
                        "\n" +
                        "Direct Entry\n" +
                        "Students seeking admission into the second year (200 Level) of the programme through direct entry must possess:\n" +
                        "\n" +
                        "a good National Diploma from recognized Polytechnics and Colleges of Technology with a minimum of Upper Credit in Science Laboratory Technology (SLT), Dental Technology, Biology or related discipline .\n" +
                        "in addition to (a) “A” Level passes or its equivalence (such as GCE Cambridge, JUPEB e.t.c.) at one sitting with the following subjects: English Language, Biology, Physics and Chemistry."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for a B.Sc. degree in Anatomy of the Federal University of Technology, Akure, a candidate must:\n" +
                        "\n" +
                        "\n" +
                        "(a) Pass all prescribed core courses, School and University required courses as well as electives;\n" +
                        "\n" +
                        "(b) Complete successfully a minimum of 163 units for candidate admitted through UME and 122 units for candidates admitted through Direct Entry.\n" +
                        "\n" +
                        "Direct Entry students are expected to write and pass GNS 101, 102, 103, 106 and MEE 101"));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The Department of Anatomy offer a degree programme leading to the award of Bachelor of Science (B.Sc) in Human Anatomy\n" +
                        "\n" +
                        "The programme shall run for four academic calendar years with lectures, practicum and other academic activities and a compulsory 6-8 weeks of Students’ Laboratory/Industrial Work Experience during the second semester of the second and third academic years respectively. Students shall write examination at the end of each semester."));
    }
}
