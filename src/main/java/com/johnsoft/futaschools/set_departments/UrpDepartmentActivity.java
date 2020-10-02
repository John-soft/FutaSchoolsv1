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

public class UrpDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_urp_department);
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
                "WELCOME TO THE DEPARTMENT OF URBAN AND REGIONAL PLANNING",
                "Urban and Regional Planning is the art and science of ordering land use development for the social, economic and political benefits of the population. It is concerned with formulation, design implementation and monitoring of development policy through spatial planning at the local, regional and national levels. Urban and Regional Planning is offered as a broad-based discipline that, apart from its main core courses, takes a lot of input from other fields, especially the social sciences. Graduates from the programme can be employed in public and private Planning Agencies, Financial Institutions, International Organisations and Environmental Units of any organisation. They can also be self-employed.\n" +
                        "\n" +
                        "PROGRAMME OBJECTIVES\n" +
                        "\n" +
                        "The main objectives of the programmes are to:\n" +
                        "\n" +
                        "a) Give the student a broad-based education that ensures acquisition of professional skills to analyses, evaluate and implement programmes of the built environment;\n" +
                        "\n" +
                        "b) Provide linkage between theory and practice through the application of research to solving practical problems;\n" +
                        "\n" +
                        "c) Develop students special interest and capabilities in planning skills and research;\n" +
                        "\n" +
                        "d) Produce competent graduates registrable with the professional bodies such as Nigeria Institute of Town Planners (NITP) and Town Planners Registration Council(TOPREC); and\n" +
                        "\n" +
                        "e) Produce well-equipped intellectuals capable of pursuing postgraduate studies"));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "(a) UTME Admission\n" +
                        "\n" +
                        "Admission into the department is mainly through the UTME. The entry requirement is 5 credits at not more than two sittings in SSCE, WASSCE, NECO, or its equivalent in the following subjects: English Language, Mathematics, Geography and any two subjects from Chemistry, Biology/Agric. Science, Economics and Technical Drawing. The prospective Candidate must have at least a pass in Physics.\n" +
                        "\n" +
                        "UTME Subjects:\n" +
                        "\n" +
                        "English Language, Mathematics and any two from Physics, Chemistry, Economics and Geography.\n" +
                        "\n" +
                        "(b) Direct Entry Admission\n" +
                        "\n" +
                        "In addition to fulfilling the requirement for (a) above, candidates seeking admission to 200 Level shall possess any of the following:\n" +
                        "\n" +
                        "i. Advanced level passes in at least two of the following: Mathematics, Geography, Economics, Physics and Chemistry; and\n" +
                        "\n" +
                        "ii. National Diploma (ND) at Upper Credit in Town and Regional Planning."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "For a student to qualify for the award of B. Tech in Urban and Regional Planning, he/she must have passed: a) All core courses; b) University and school required courses; c) Other prescribed elective; and d) The students industrial Work Experience Scheme (SIWES) courses Candidates who are admitted through UME must accumulate a minimum of 199 course units to graduate, while Direct Entry candidates must attain a minimum of 156 course units. Candidates should not score less than a CGPA of 1.0 in order to graduate."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "Candidates undergoing this programme are expected to spend 5 academic sessions for UME candidates, while direct entry candidates will spend 4 academic sessions. If a student fails to graduate within 5 academic sessions he/she cannot stay beyond 7 academic sessions."));
    }
}