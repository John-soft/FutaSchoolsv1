package com.johnsoft.futaschools.soc_departments;

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

public class CysDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_cys_department);
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
                "WELCOME TO THE DEPARTMENT OF CYBER SECURITY",
                "The Bachelor of Technology in Cyber security programme is designed to prepare students to obtain employment in the cybersecurity field or as a course of study leading to graduate studies in cybersecurity.\n" +
                        "\n" +
                        "Cybersecurity programme graduates will be able to:\n" +
                        "\n" +
                        "a. apply the ethical principles required of computer professionals:\n" +
                        "\n" +
                        "b. apply knowledge of computing and information technologies and use software development and security analysis tools to produce effective designs and solutions for specific cybersecurity problems within a variety of computing platforms and employing an approved secure systems development process model;\n" +
                        "\n" +
                        "c. identify, analyse, and synthesise scholarly and professional literature relating to the fields of cybersecurity, information security, or information assurance, to help solve specific problems and to stay abreast of the rapidly changing security context;\n" +
                        "\n" +
                        "d. participate as an active and effective member of a project team engaged in achieving specific computer-based results or solutions;\n" +
                        "\n" +
                        "e. communicate, both orally and in writing, and negotiate with colleagues and other stakeholders including employees, managers, and executives. Negotiation and communication skills should also extend to all relevant external persons and organisations;\n" +
                        "\n" +
                        "f. demonstrate sensitivity to and sound judgment on ethical issues as they arise in information security and cyber defence and will adhere to accepted norms of professional responsibility; and\n" +
                        "\n" +
                        "g. use appropriate tools to detect an attack and determine appropriate remedial action based on its progress.\n" +
                        "\n" +
                        "\u200B\u200B"));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "The entry requirements for the degree programming shall be\n" +
                        "\n" +
                        "1. Unified Tertiary Examination (UTME) Requirements\n" +
                        "\n" +
                        "UTME subjects must include English Language, Mathematics, chemistry, and physics.\n" +
                        "Five credits passes at not more than TWO sittings which must include English language, Mathematics, physics, chemistry and biology or Agricultural science, at senior school certificate.\n" +
                        "2. Direct Entry Requirements\n" +
                        "\n" +
                        "Candidates shall possess in addition to the minimum requirement in 1(b)\n" +
                        "\n" +
                        "Two A’ level subjects including Mathematics, physics or chemistry with minimum of credit passes\n" +
                        "At least upper credit pass in national diploma in computer science from a recognised polytechnic or its equivalent; and\n" +
                        "NCE with at least credit pass both in computer science/mathematics/physics."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for the award of B.Tech. degree in Cyber Security, a student must have:\n" +
                        "\n" +
                        "passed all the core courses, university and school required courses and electives;\n" +
                        "accumulated a minimum of 192 course units for students admitted through UTME and 151 for students admitted through direct entry; and\n" +
                        "attain a minimum CGPA of 1.50.\n" +
                        "However, the direct entry students are expected to audit some 100–level courses of the University such as GNS101, GNS102, GNS103, and MEE101. These courses must be passed at first sitting to be qualified as zero unit otherwise they will be used for computation in the affected students’ results."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The duration of the programme is ten academic semesters for UTME candidates and eight academic semesters for direct entry candidates. if a candidate fails to graduate within the stipulated academic sessions, he or she will not be allowed to exceed a total of fifteen academic semesters in the case of UTME candidate and twelve academic semesters for direct entry."));
    }
}
