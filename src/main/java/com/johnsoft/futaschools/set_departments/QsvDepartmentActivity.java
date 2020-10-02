package com.johnsoft.futaschools.set_departments;

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

public class QsvDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_qsv_department);
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
                "WELCOME TO THE DEPARTMENT OF QUANTITY SURVEYING",
                "The overall philosophy of the programme is to provide a broadly based education and training at honours degree level with the aim of preparing the students to meet the challenges involved in ensuring financial probity in the conception, planning and execution of development projects (all forms of engineering infrastructure). The programme is therefore designed to provide the graduate Quantity Surveyors with the necessary theoretical base and practical skills to enable them think analytically within a multi-disciplinary field and provide cost and procurement expertise for all forms of infrastructural development projects."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "(a) UTME Admission\n" +
                        "\n" +
                        "Admission into this programme is through the Joint Admission and Matriculation Board (JAMB). To be eligible for admission, candidates must have at least five (5) credits in the WASSCE or NECO or GCE O’Level or its equivalent in English Language, Mathematics and Physics and any two of the following subjects: Chemistry, Economics, Building Construction, Technical Drawing, Geography, Government.\n" +
                        "\n" +
                        "UTME Subjects:\n" +
                        "\n" +
                        "English Language, Mathematics and Physics plus one subject from Chemistry, Building Construction, Technical Drawing, Geography, Economics and Government.\n" +
                        "\n" +
                        "(b) Direct Entry: In addition to the UTME requirements specified in (a) above, candidates for direct entry must possess\n" +
                        "\n" +
                        "(i) National Diploma from recognised Polytechnic orCollegeofTechnologyat Upper Credit level in Quantity Surveying or Building Technology or other relevant fields in Environmental Design and Management.\n" +
                        "\n" +
                        "(ii) GCE ‘A’ level passes in at least two of the following subjects: Mathematics, Physics, Chemistry, Geography and Economics.\n" +
                        "\n"));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for the award of B.Tech. Quantity Surveying, a student must have:\n" +
                        "\n" +
                        "a)            Passed all core courses, all University and School required courses including electives recommended for specialization;\n" +
                        "\n" +
                        "b)            accumulated at least 198 course units if he was admitted through UTME and 156 units if by direct entry and obtained a CGPA  of not less than 1.50; and\n" +
                        "\n" +
                        "c)             Successfully completed the 6 months industrial attachment, seminars and project.\n" +
                        "\n" +
                        "Direct entry students are expected to audit and pass GNS 101, GNS 102, GNS 103, MEE 101 and MEE 102. If any student fails any of the courses, he/she will be required to formally offer it again. Candidates should not score less than a CGPA of 1.50 in order to graduate."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The duration of the programme is ten (10) Semesters for UTME entrants but it is eight (8) Semesters for direct entry students. If a student fails to graduate at the end of the normal academic sessions, he/she would not be allowed to exceed a total of 15 semesters if admitted through UTME or 13 semesters if the admission was through direct entry."));
    }
}