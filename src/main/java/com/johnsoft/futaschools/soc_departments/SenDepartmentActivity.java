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

public class SenDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_sen_department);
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
                "WELCOME TO THE DEPARTMENT OF SOFTWARE  ENGINEERING",
                "Software Engineering has become a crucial discipline in the functioning of the modern world. Information systems, communications, transport, manufacturing and services all require well-engineered and reliable software. The focus of the B.Sc. degree programme in Software Engineering is automated and large-scale software engineering, which will equip students to deal with the types of systems widely found in industry. The programme provides up-to-date theory and practice in the core areas of software engineering, and the core methods and tools used in industry. The curriculum of the Software Engineering emphasises the art, science, engineering and technology of computing and information systems. The students are developed to meet the challenges of self-employment as professional software engineers, private and public employment and design and development of local content intelligent systems solutions to immediate problems in our environment. Graduates of the programme can easily find employments in government establishments, industries, business, banking and accounting houses, oil companies, educational institutions, commercial houses, higher institutions as trainee researchers and academicians and software development establishments. They are also equipped to establish their own private practice in information technology, computer training, software development and e–technology generally.\n" +
                        "\n" +
                        "Furthermore, the Department is fast changing and advancing with reputation for innovative education base on high level of changes and advancement. The Department offers consultancy services to both government and private establishments and there are facilities for supporting its numerous academic programmes."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "The entry requirements for the degree programme shall be:\n" +
                        "\n" +
                        "Unified Tertiary Matriculation Examination (UTME) requirements:\n" +
                        "\n" +
                        "i. UTME subjects must include English Language, Mathematics, Chemistry and Physics\n" +
                        "\n" +
                        "ii. Five Credit Passes at not more than TWO sittings, which must include English Language, Mathematics, Chemistry, Physics, and Biology or Agricultural Science, at Senior Secondary School Certificate.\n" +
                        "\n" +
                        "Direct entry requirements\n" +
                        "\n" +
                        "The following may be considered in addition to the minimum requirements in a:\n" +
                        "\n" +
                        "i. Two A' Level passes with minimum of C grade in Mathematics, Physics, or Chemistry;\n" +
                        "\n" +
                        "ii. At least Upper Credit pass in National Diploma in Software Engineering from a recognised Polytechnic or its equivalent; and\n" +
                        "\n" +
                        "iii. NCE with at least credit pass both in Software Engineering/Mathematics; Software Engineering/Physics or Mathematics/Physics."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for the award of B.Tech. degree in Software Engineering, a student must have:\n" +
                        "\n" +
                        "passed all the core courses, university and school required courses and electives;\n" +
                        "accumulated a minimum of 171 course units for students admitted through UTME and 128 for students admitted through direct entry; and\n" +
                        "attain a minimum CGPA of 1.50.\n" +
                        "However, the direct entry students are expected to audit some 100–level courses of the University such as GNS101, GNS102, GNS103, and MEE101. These courses must be passed at first sitting to be qualified as zero unit otherwise they will be used for computation in the affected students’ results."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The duration of the programme is normally ten academic semesters for UTME and eight academic semesters for the direct entry candidates. If a candidate fails to graduate within the stipulated academic sessions, he or she will not be allowed to exceed a total of fifteen academic semesters in the case of UTME candidate and thirteen semesters in the case of direct entry."));
    }
}
