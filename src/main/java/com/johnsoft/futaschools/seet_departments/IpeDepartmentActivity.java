package com.johnsoft.futaschools.seet_departments;

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

public class IpeDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_ipe_department);

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
                "WELCOME TO THE DEPARTMENT OF INDUSTRIAL AND PRODUCTION ENGINEERING",
                "Department of Industrial and Production Engineering is the newest Department in the School of Engineering and Engineering Technology. This programme is an amalgam of mechanical engineering, industrial engineering and management science. Industrial and Production Engineering is primarily concerned with the development, improvement and implementation of integrated systems. These systems include human being, money, knowledge, information, equipment, energy, materials and processes. The philosophy and the target objectives of our programme are briefly highlighted." +
                        "\nProvide a 5-year programme leading to Bachelor of Engineering degree in Industrial and production Engineering.        .\n" +
                        "Enable graduates develop the skills in design and manufacturing required by employers hitherto not readily available locally.\n" +
                        "Produce graduates that combine theoretical knowledge acquired during the programmed with practical skills developed during students work experience schemes, industrial training arid final year project to develop a reasonable level of the practical competence required by employers\n" +
                        "Enhance their entrepreneurship skills and technical competence to be self-  employed in consultancy, manufacturing or service industry.\n" +
                        "Produce creative and innovative graduates that are socially responsible and able to communicate effectively." +
                        "" ));
        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "A             Utme Admission\n" +
                        "\n" +
                        "Admission to first year (100 level) of the programme is through Joint Matriculation Examination. To be eligible for admission, candidate must possess the General Certificate of Education (Ordinary Level). National Examination Council certificate of West Africa Senior School Certificate or its equivalent with at least five credit passes in subject which include Chemistry, Physics, Mathematics and English Language  at NOT more than two (2) sittings. UTME subject: English Language, Chemistry, Mathematics and Physics.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "B             Direct Entry Admission\n" +
                        "\n" +
                        "In addition to the requirement specified in (a) above, candidates seeking admission to second year (200 level) of the programme through direct entry must possess:   \n" +
                        "\n" +
                        "(I)   National Diploma at Upper Credit level or equivalent in Production/Industrial/Mechanical Engineering or related disciplines from a recognized institution, or\n" +
                        "\n" +
                        "(II)  General Certification of Education (Advance level) or equivalent with good passes in at least two subjects at a sitting which must include Mathematics, Physics and Chemistry\n" +
                        "\n" +
                        "However, admission to appropriate level shall be made on any other minimum entry qualifications as may be stipulated by the university."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for a degree of bachelor of Production and Industrial Engineering (B.Eng. Production and Industrial Engineering) of The Federal University of Technology, Akure, a candidate must satisfactorily\n" +
                        "\n" +
                        "(a) Pass all prescribed compulsory (core, University and school courses) and the electives;\n" +
                        "\n" +
                        "(b) Complete successfully a minimum of 207 units for candidates admitted through UME and 163 units for candidates admitted through Direct Entry and obtain a CGPA of not less than 1.0\n" +
                        "\n" +
                        "(c) Complete successfully all field projects, laboratory practical and industrial attachments Direct Entry Students are expected to audit and pass GNS 102,102 and 103 and MEE 101 and 102 respectively and in the event that they fail the courses, they must offer them formally as credit courses"));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "\"The normal duration of the programme is five academic sessions for students admitted to 100 level through the UME and four academic sessions for those admitted into 200 level by Direct Entry. Students that fail to graduate at the end of normal academic sessions shall not be allowed to exceed a total of 15 semesters in the case of UME students and 12 semesters in the case of Direct Entry students."));

        hodProfileDetailsList.add(new HodProfileDetails("Hod's Profile",
                ""));

    }
}
