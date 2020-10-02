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

public class CscDepartmentActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_csc_department);
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
                "WELCOME TO THE DEPARTMENT OF COMPUTER SCIENCE",
                "The curriculum of the Computer Science emphasizes the art science, engineering and technology of computing and information systems. Students are made to enrol for core courses in Computer Science, Information Science, Electronic, Physics and Applied Mathematics.\n" +
                        "\n" +
                        "The students are developed to meet the challenges of self employment as professional software and hardware engineers, private and public employment involving the following.\n" +
                        "\n" +
                        "a. computer hardware system studies, design, assembling, construction,operation and maintenance.\n" +
                        "\n" +
                        "b. computer software system studies, prototyping, development, implementation,documentation and maintenance.\n" +
                        "\n" +
                        "c. Data minning and warehousing\n" +
                        "\n" +
                        "d. principles and practice of Information Technology and computer Networking, in oil and manufacturing industries, banks business and finance houses,educational institutions and government ministries andparastatals\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "OBJECTIVE OF THE DEPARTMENT OF COMPUTER SCIENCE\n" +
                        "\n" +
                        "The objectives of the department are to:\n" +
                        "\n" +
                        "a. provide and promote sound practical and theoretical training in computer hardware, software and application areas, that will make the students useful in both private and public sectors of the economy.\n" +
                        "\n" +
                        "b. identify the basic problems of the society and find appropriate computer solutions to them.\n" +
                        "\n" +
                        "c. develop and offer service courses in Computer Science and Information Technology to otherDepartments in the University\n" +
                        "\n" +
                        "d. equip the students with the capacity for professional practice in Information Technology \n" +
                        "\n" +
                        "e. develop the students for the purpose of self  employment and job placements in the government and industry.\n" +
                        "\n" +
                        "f. develop the students through sound academic and professional programmes as a basis for postgraduate studies."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                ""));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for the award of B.Tech. degree in Computer Science, a student must have:\n" +
                        "\n" +
                        "passed all the core courses, university and school required courses and electives;\n" +
                        "accumulated a minimum of 192 course units for students admitted through UTME and 151 for students admitted through direct entry; and\n" +
                        "attain a minimum CGPA of 1.50.\n" +
                        "However, the direct entry students are expected to audit some 100–level courses of the University such as GNS101, GNS102, GNS103, and MEE101. These courses must be passed at first sitting to be qualified as zero unit otherwise they will be used for computation in the affected students’ results."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                ""));
    }
}
