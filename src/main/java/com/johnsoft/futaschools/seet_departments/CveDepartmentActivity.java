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

public class CveDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_cve_department);
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
                "WELCOME TO THE DEPARTMENT CIVIL AND ENVIRONMENTAL ENGINEERING",
                "\n" +
                        "Develop in the students the ability to use their accumulated technical knowledge, sense of analysis and creative design abilities in various ways that can contribute to the development of a more satisfying life and environment for the country and for all mankind\n" +
                        "Produce leaders, both in creativity and adaptability in the planning, design, evaluation and analysis of technological innovation for improving the quality of the environment and of life generally in response to the ever changing goals and needs of the Nigerian society\n" +
                        "Produce graduates that have entrepreneurial skills for self employment in the Civil Engineering profession.\n" +
                        "Lay the foundation on which students can proceed to further studies in specialized aspects of Civil Engineering practice or multi-disciplinary areas involving Civil and Environmental Engineering."));
        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "(a) UTME Admission\n" +
                        "\n" +
                        "Admission to 100 Level is through the UTME of the JOint Admission and Matriculation Board Examinatiobn in subjects such as English Language, Mathematics, Physics and Chemistry. To be eligible for admission, candidates must have a minimum of credit pass in the General Certifcate of West Senior Secondary Certificate Examination (WASSCE) or NECO or its equivalent at not more than two (2) sittings in the following subjects:\n" +
                        "\n" +
                        "Chemistry, Physics, Mathematics, and English Language.\n" +
                        "\n" +
                        "U.M.E Subjects: English Language, Chemistry, Mathematics, and Physics.\n" +
                        "\n" +
                        "(b) Direct Entry Admission\n" +
                        "\n" +
                        "In addition to the requirements specified above in (a), candidates seeking admission to 200 Level must possess:\n" +
                        "\n" +
                        "(i)ND at Upper Credit Level ro equivalent in civil engineering or realted discipline from recognised institution , or\n" +
                        "\n" +
                        "(ii)Good passes at the General Certificate of Education (Advanced Level) or its equivalent in Chemistry, Physics, andMathematics"));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                        "To be eligible for a degree of B.Eng. in Civil Engineering of the Federal University of Technology, Akure, a candidate must:\n" +
                                "\n" +
                                "(a) Pass all prescribed core courses as well as University and school required courses and the elective;\n" +
                                "\n" +
                                "(b) Complete a minimum of 207 units if admitted through UME and a minimum of 164 units, if by Direct Entry and obtain a CGPA of not less than 1.0; and\n" +
                                "\n" +
                                "(c) Complete successfully all field projects, laboratory practicals and industrial attachments.\n" +
                                "\n" +
                                "Direct Entry students are expected to audit and pass GNS 101, 102 and 103 and MEE 101 and 102 and in the event that they fail these courses, they must offer them formally as credit courses."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The normal duration of the programme is five academic sessions for students admitted to 100 level" +
                        " through the UME and four academic sessions for those admitted into 200 level by Direct Entry. Students that fail " +
                        "to graduate at the end of normal academic sessions shall not be " +
                        "allowed to exceed a total of 15 semesters in the case of UME students and 12 semesters in the case of Direct Entry students."));

        hodProfileDetailsList.add(new HodProfileDetails("Hod's Profile",
                ""));

    }
}
