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

public class CspDepartmentActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private RecyclerView aboutDepartmentRecycler, admissionRequirementRecycler, gradRequirementRecycler, programDurationRecycler, hodProfileRecycler;
    private List<AboutDepartmentDetails> aboutDepartmentDetailsList = new ArrayList<>();
    private List<AdmissionRequirementDetails> admissionRequirementDetailsList = new ArrayList<>();
    private List<GraduationRequirementDetails> graduationRequirementDetailsList = new ArrayList<>();
    private List<ProgramDurationDetails> programDurationDetailsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csp_department);
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
                "WELCOME TO THE DEPARTMENT OF CROP, SOIL AND PEST MANAGEMENT",
                "The Department of Crop, Soil and Pest Manaegement, formerly called the Department of Crop Production, was establish in 1982 in the Federal University of Technology, Akure, in response to the need for innovative davelopement,packaging and transmission of appropriate crop production technologies at the University level.\n" +
                        "\n" +
                        "The Department has as its philosophy, the training of the required manpower i crop production technology and advancing its frontier through teaching, research and extension. The acadmic programme of the Department takes into consideration, the fundemental principles and practices of the diffrent areas of Crop rpoduction, including product harvesting, processing, preservation and consumption. By placing adequate emphasis on adaptable technologies in soil and crop management, crop improvement and protection,post-harvest operations and consumption, the Department abidges current inadequatcis of similar programmes existiing in conventiional universities. Further, the Department focuses attention on the establishment of sound technologies for sustainnable crop production, protection, management, processing, renewal and product management. Graduates from this Department can br gainfully employed in self sustaining enterprises such as small scale crop farms and crop processing factories. Also, the graduates can find sweetable employment in gorvernment establishments (ministries and parastatals) agro based company ( food and chemical), private farms and banks.\n" +
                        "\n" +
                        "OBJECTIVES OF THE PROGRAMME\n" +
                        "\n" +
                        "The objectives of the programmes are to:\n" +
                        "\n" +
                        "(a) Train undergraduates broadly in the field of agricultural production with emphasis on crop production, soil management and pest management;\n" +
                        "\n" +
                        "(b) Emphasize in the course of training, appriciation of the role of insect pests, diseases and weeds in crops production through diagnosis of pest attack and elaboration of preventive and curative measures;\n" +
                        "\n" +
                        "(c) Train undergraduates in basic field experimentation techniques; and\n" +
                        "\n" +
                        "(d) Prepare undergraduates for self-employment in general agriculture, particularly in the various sphere of crop producton, including soil and pest management."));


        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "a. UTMEAdmission\n" +
                        "\n" +
                        "Admission into the first year (100 level) of the programme is through the UTME. candidates must have five credita at WASSCE or NECO or GCE O/Lor equivalent examination at a maximum of two sitting in the following subjects: English Language, Mathematics, Chemistry, Biologyor Agricultural Science. Candidate must have at least a pass in physiscs\n" +
                        "\n" +
                        "UTME Subject: English language, Mathematics, Biology/Agricultural Science, Chemistry,\n" +
                        "\n" +
                        "b. Direct Entry\n" +
                        "\n" +
                        "Candidates may be admited into the second year (200 level) of yhe programme through direct entry if:\n" +
                        "\n" +
                        "(i) They have the National Diploma with a minimum of upper credict from recognized polytechnics or Colleges of Technology or the Nigerian Certificate in education (NCE) or equivalent in relevant agriculture-based disciplines such as Agricultural Education and Crop production Technologh; or\n" +
                        "\n" +
                        "(ii) The possess at least two GCE Advanced Level passesin Biology and any of the following subjects: Chemistry, Physics and Mathematics.\n" +
                        "\n" +
                        "Direct Entry candidates must also meet the requirement for UTME admission in a above."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligble for the award of B.Agric.Tech.(Crop, Soil and Pest Management), a student must have:\n" +
                        "\n" +
                        "(a) passed all the core (compulsory) courses, University and School required courses, as well as elective recommended for specialization;\n" +
                        "\n" +
                        "(b) accumulated in minimum of 199 unit for UTME and 156 unit for direct entry students, passed all the courses recommened for this option and obtain a CGPA of not less than 1.00; and\n" +
                        "\n" +
                        "(c) successfully completed all laboratory and field practical, industrial attachment, training seminars and projects.\n" +
                        "\n" +
                        "direct entry students are expected to audit and pass GNS 101, 102, 103, and 106, and MEE 101 and 102."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The duration of the programme is five academic sessions for students admitted through the UTME but for Direct Entry, it is four. If a student fails to graduate in five academic sessions, he or she will NOT be allowed to exceed a total of 7 academic sessions or 15 Semesters.\n" +
                        "\n"));
    }
}
