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


public class AgeDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_age_department);
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
                "WELCOME TO THE DEPARTMENT OF AGRICULTURAL ENGINEERING", "" +
                "Agricultural Engineering is a life-based engineering discipline that integrates " +
                "life sciences with engineering in the advancement and application of fundamental concepts to provide food," +
                " feed, fibre and protect the environment. Our department emphasizes a range of research areas including agricultural" +
                " production/natural resources, biotechnology engineering, food engineering, soil and water conservation and environmental" +
                " protection engineering.The Department of Agricultural and Environmental Engineering is recognized as the leading one of " +
                "its kind in the region" +
                " and is consistently viewed as one of the top agricultural engineering departments in the nation.\n" +
                "\n" +
                "As you browse the descriptions of our various programmes, you will notice a common theme in all our missions: integration of engineering with agricultural (life) and environment, or the application" +
                " of engineering principles to agriculture and environment.Engineering consists of three parts: analysis, synthesis," +
                " and design. Analysis is the study of systems in order to understand their function. Synthesis is the practical building" +
                " of the systems under analysis. Both steps contribute to the end goal of engineering, which normally lies in the design" +
                " of the product.The different engineering disciplines in FUTA are based on pure and applied science. The different " +
                "branches are Civil Engineering, Mechanical Engineering, and Electrical Engineering. Others different branches are Mining" +
                " Engineering, and Metallurgical and Materials Engineering." +
                ""));


        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "(a) UTME\n" +
                        "\n" +
                        "Admission to the 100 level is through the UTME of the joint Admission and Matriculation Board. To be eligible for admission, candidates must have a minimum of five credit passes in the General Certificate of Education (Ordinary Level) or West African Senior Secondary Certificate Examinations (WASSCE) or NECO or its equivalent at not more than two sittings in subjects, which include Chemistry, Physics, Mathematics and English Language\n" +
                        "\n" +
                        "UTME Subjects: English Language, Chemistry, Mathematics and Physics\n" +
                        "\n" +
                        "(b) Direct Entry\n" +
                        "\n" +
                        "In addition to the requirements specified above in (a), candidates seeking admission to 200 level must possess:\n" +
                        "\n" +
                        "ND at Upper Credit Level or equivalent in Agricultural Engineering or related disciplines from recognized institutions; or.\n" +
                        "Good passes at the General Certificate of Education (Advanced Level) or its equivalent in at least two of the following subjects: Chemistry, Physics and Mathematics."));


        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for the degree of B.Eng. Agricultural Engineering of the Federal University of Technology, Akure a candidate must:\n" +
                        "\n" +
                        "\n 1. pass all core as well as University and School Required courses and the electives;\n" +
                        "\n 2. complete a minimum of 205 units if admitted through UME, and 162 units if by Direct Entry and obtain a CGPA of not less than 1.0; and\n" +
                        "\n 3. complete successfully all field projects, laboratory practicals and industrial attachments\n" +
                        "\nDirect Entry students are required to audit and pass GNS 101, 102 and 103 and MEE 101and 102 and if they fail these courses, they must offer them formally as credit courses."));


        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The normal duration of the programme is five academic sessions for" +
                        " students admitted to 100 level through the UME and four academic sessions for those admitted " +
                        "into 200 level by Direct Entry. A student who fails to graduate at the end of the normal academic " +
                        "sessions, shall not be allowed to exceed a total of 15 semesters if admitted through UME and 12 semesters if by Direct Entry"));


        hodProfileDetailsList.add(new HodProfileDetails("Hod's Profile",
                "Agricultural Engineering is a life-based engineering discipline that integrates life sciences with engineering in the advancement and application of fundamental concepts to provide food, feed, fibre and protect the environment. Our department emphasizes a range of research areas including agricultural production/natural resources, biotechnol"));

    }
}
