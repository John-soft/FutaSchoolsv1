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

public class AreDepartmentActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private RecyclerView aboutDepartmentRecycler, admissionRequirementRecycler, gradRequirementRecycler, programDurationRecycler, hodProfileRecycler;
    private List<AboutDepartmentDetails> aboutDepartmentDetailsList = new ArrayList<>();
    private List<AdmissionRequirementDetails> admissionRequirementDetailsList = new ArrayList<>();
    private List<GraduationRequirementDetails> graduationRequirementDetailsList = new ArrayList<>();
    private List<ProgramDurationDetails> programDurationDetailsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_are_department);
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
                "WELCOME TO THE DEPARTMENT OF AGRICULTURAL AND RESOURCE ECONOMICS",
                "The Department runs a five-year degree programme leading to the award of Bachelor of Agricultural Technology (B. Agric. Tech.) degree in Agricultural and Resource Economics. The first year of the programme is devoted to the teaching of basic science courses such as  Physics, Chemistry, Biology, Mathematics, etc. These courses are taught by other Departments in the University. During the second  year of the degree programme, students are taught General Agriculture  courses. These cut across all Departments with in the School of Agriculture and Agricultural Technology. The remaining three years of  the undergraduate programme are used to teach general and specialized  courses in Agricultural and Resource Economics. The programme  integrates academic work with some measure of practical training,  including attachment to relevant industries and organizations for more practical orientation during the second semester in the fourth year of  study. The major courses taught at the undergraduate level include:\n" +
                        "\n" +
                        "Production Economics\n" +
                        "Agricultural Finance\n" +
                        "Agricultural Planning and Policy\n" +
                        "Agricultural Marketing\n" +
                        "Resource Economics"));


        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "(a) UME\n" +
                        "\n" +
                        "Candidates must possess at least five credits at WASSCE or NECO or GCE (O/L) or  equivalent at not more than two sittings in the following subjects: English Language, Mathematics, Chemistry, Biology or Agricultural  Science, Economics or Geography.  At least a pass in Physics is  required.\n" +
                        "\n" +
                        "U. M. E. Subjects\n" +
                        "\n" +
                        "English Language, Chemistry, Biology or Agricultural Science and either Physics or Mathematics.\n" +
                        "\n" +
                        "(b) Direct Entry\n" +
                        "\n" +
                        "(i) Applicants should possess, in addition to the requirements in “a”  above, the National Diploma with a minimum of upper credit or equivalent or Higher National Diploma with a minimum of lower credit or  equivalent. \n" +
                        "\n" +
                        "(ii) GCE (Advanced Level) or equivalent in at least two of the following subjects passed at a sitting: Biology, Chemistry, Economics and Mathematics. Holders of any  of these certificates from recognized institutions may be considered foradmission into 200 level, provided they meet the minimum entry requirements and have passed relevant subjects at appropriate level."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for the award of the degree, students must have:a) passed all Core courses as well as University and School Required courses and any elective recommended for specialization;b) successfully completed all class work, field practicals, industrial attachments, training, seminars and project;c) accumulated at least 186 credit units for the five year programme and 156 credit units for Direct entry programme and obtained a CGPA of not less than 1.0; and Direct entry students are expected to audit and pass GNS 101, 102, 103, 106 and, MEE 101 and 102. In the event that they fail any of the courses, they will have to register for and pass it."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The degree of Bachelor of Agricultural Technology (B. Agric. Tech.) in Agricultural & Resource Economics is a five-year programme. A student may, however, acquire the degree in less than five years provided the requirements for the degree have been met. If a student fails to graduate in five academic sessions, he or she will be allowed for a maximum of fifteen semesters in the case of students admitted through UME and twelve semesters in the case of direct entry students."));
    }
}
