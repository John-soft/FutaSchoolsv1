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

public class FatDepartmentActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private RecyclerView aboutDepartmentRecycler, admissionRequirementRecycler, gradRequirementRecycler, programDurationRecycler, hodProfileRecycler;
    private List<AboutDepartmentDetails> aboutDepartmentDetailsList = new ArrayList<>();
    private List<AdmissionRequirementDetails> admissionRequirementDetailsList = new ArrayList<>();
    private List<GraduationRequirementDetails> graduationRequirementDetailsList = new ArrayList<>();
    private List<ProgramDurationDetails> programDurationDetailsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fat_department);
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
                "WELCOME TO THE DEPARTMENT OF FISHERIES AND AQUACULTURE TECHNOLOGY",
                "The philosophy that guides this programme is the production of skilled manpower that is adequately trained and equipped with comprehensive knowledge required to be self-reliant in fish production. Such students are to be trained in an atmosphere with the widest possible human and material resources, through the adoption of effective techniques of instruction and exposure to the actual practice of fisheries management and aquaculture production. Consequently, there are opportunities for formal training at the undergraduate and postgraduate levels for the acquisition of basic and higher degrees, respectively. These training programmes are mounted through classroom instructions, laboratory practicals, field demonstration and Students’ Industrial Work Experience Scheme (SIWES). The programme prepares the graduates to be self-reliant in Fish production and can be employed in any fisheries establishment, banks and other related field.\n" +
                        "\n" +
                        "Programme Objective\n" +
                        "\n" +
                        "The major objectives of the programme are to:\n" +
                        "\n" +
                        "provide advanced education and training in the science and technology of fisheries, resources, aquaculture, environmental impact assessment, biodiversity management to cater for the Higher Management Requirements of the nation.\n" +
                        "provide functional education for Postgraduate students at Masters and Postgraduate diploma levels who will eventually become job makers and trainers of the captains of Industries and distinguished academics.\n" +
                        "provide opportunity for problem solving research studies focused on fish production and utilization and provision of the necessary raw materials for the national agricultural Industries in this sub sector.\n" +
                        "offer to the public the results of research break-through and foster the practical application of these results.\n" +
                        "provide advanced studies and higher training in environmental impact assessment, environmental control and management, management of national biodiversity, and industrial bionutrients production, for sustainable agriculture and poverty alleviation especially in rural areas."));


        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "a)         UTME Admission\n" +
                        "\n" +
                        "Admission into the first year (100 level) of the programme is through JAMB. In order to be eligible for admission, candidates are expected to sit and pass the UTME. Candidate must possess five credit passes in WASCE or NECO or GCE (O/L) or equivalent at a maximum of two sittings in the following subjects: English Language, Mathematics, Chemistry, Biology or any other relevant subject. At least a pass in Physics is required.\n" +
                        "\n" +
                        "UTME Subjects: English Language, Chemistry, Biology or Agricultural Science, Mathematics or Physics.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "b)         Direct Entry\n" +
                        "\n" +
                        "Candidates seeking admission to 200 Level through Direct Entry must possess:\n" +
                        "\n" +
                        "i)          National Diploma with a minimum of Upper Credit or equivalent from FUTA UDS Program or recognized Polytechnics and Colleges of Technology in relevant disciplines (Agricultural Sciences),  or\n" +
                        "\n" +
                        "ii)         GCE (A/L) or equivalent with passes in at least two of the following subjects: Chemistry, Biology and Physics.\n" +
                        "\n" +
                        "Direct entry candidates must also meet the requirements for UTME admission specified in ‘a’ above."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirement",
                "To be eligible for the award of B.Tech. (Fisheries and Aquaculture Technology), a student must have:\n" +
                        "\n" +
                        "(a) passed all core (compulsory)courses as well as all University and school required courses and electives recommended for specialization\n" +
                        "\n" +
                        "(b) accumulated a minimum of 187 units for UTME students, 144 units for direct entry students and obtain a CGPA of not less than 1.0 and\n" +
                        "\n" +
                        "(c) successfully completed all field practicals, industrial attachment, training seminars and projects.\n" +
                        "\n" +
                        "Direct entry student are expected to audit and pass the following University required courses: GNS101,GNS102, GNS103, GNS106, MEE 101, and 102."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The duration of the programme is five academic sessions for students admitted through the UTME but for Direct Entry, it is four. If a student fails to graduate in five academic sessions, he or she will NOT be allowed to exceed a total of 7 academic sessions or 15 Semesters.\n" +
                        "\n"));
    }
}
