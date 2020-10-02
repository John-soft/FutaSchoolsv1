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

public class PhyDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_phy_department);
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
                "WELCOME TO THE DEPARTMENT OF PHYSICS",
                "OBJECTIVES\t\n" +
                        "PROGRAMME PHILOSOPHY\n" +
                        "\n" +
                        "The philosophy of the Federal University of Technology, Akure is to prouce technologically oriented graduates.In line with this philosophy,the Department trains graduates with a broad based knowlege of the various aspects of physics with a bias towards electronics.The programme of the Department is therefore designed to give students the required academic and practical background in Condensed Matter Physics Atmospheric Physics, Radiation and Health Physics, Communication Physics and Electronic Instrumentation Physics. The products of this programme can be easily employed in the communication, aviation and oil industry as well as research laboratories.they can also be self employed\n" +
                        "\n" +
                        "OBJECTIVES\n" +
                        "\n" +
                        "The main objectives of the programme is to: (a) Impart to the students the fundamentals of the main branches of physics (b) Provide students with opportunity for integrating theoretical physics with practical in all branches of physics. (c) Expose the students to all aspects of applied physics which is sine qua non for the development of Condensed Matter, Electronics and Energy. (d) Equip the students with capability for Research and Development in all areas of theoretical and applied physics. (e) Prepare students to be self-reliant work after graduation.\n" +
                        "\n" +
                        "(f)prepare students for self reliant work after graduation.\n" +
                        "\n"));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "Candidate seeking admission into this programme must have credits in five (5) subjects at WASSCE or NECO or GCE ordinary level or equivalent at not more than two (2) sittings.The five subjects must include English language, Physics,Chemistry and Mathematics\n" +
                        "\n" +
                        "UME SUBJECTS:English Language, Mathematics, Physics and Chemistry\n" +
                        "\n" +
                        "b) DIRECT ENTRY\n" +
                        "\n" +
                        "In addittion to the UME requirements specified in (a) above, candidates seeking admission by direct entry must possess either (i) National Diploma (ND) at Upper Credit or its equivalent in Science Technology, Electronics and Elecrical Engineering or (ii) a minimum of (2) GCE Advanced level (A/L) passes in Physics and Mathematics at one sitting or its equivalent"));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "REQUIREMENT FOR GRADUATION\n" +
                        "\n" +
                        "To be eligible for the award of the degree of bachelor of Technology (B.Tech.)Honours in physics (Electronics), a student must:\n" +
                        "\n" +
                        "(a) pass all core courses as well as University and school required courses and electives required for specialization;\n" +
                        "\n" +
                        "(b) complete successfully industrial attachment,seminars and projects\n" +
                        "\n" +
                        "(c) accumulate at least 194 units for the students admitted through UME or 155 units if by direct entry and obtain a CGPA of not less than 1.00\n" +
                        "\n" +
                        "in addition, direct entry students should audit and pass the following University required courses- GNS 101, 102 and 103 and MEE 101 and 102. if a student fails any of the courses, he/she will be required to offer it formally."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The duration of the programme shall be a minimum of five (5) academic sessions for UTME candidates. However, direct entry candidates are allowed to spend a minimum of four (4) academic sessions."));
    }
}