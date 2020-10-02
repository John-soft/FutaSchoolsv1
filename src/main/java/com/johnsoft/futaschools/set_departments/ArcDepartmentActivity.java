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

public class ArcDepartmentActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_arc_department);
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
                "WELCOME TO THE DEPARTMENT OF ARCHITECTURE",
                "The overall philosophy of the training programme in the Department of Architecture in the Federal University of Technology, Akure is to produce competent, skilled and versatile graduates capable of understanding the society’s need for shelter and translating this need into an appropriate built environment. The programme also seeks to ensure the technological capability of the graduates to face a broad spectrum of challenges of the environment for human and other activities especially through self-reliance. The programme places emphasis on the development of high professional skills, exploration and development of indigenous materials. It is also aimed at raising the level of aesthetic and cultural awareness in the students and, by extension, among the people through research, academic publications and general exhibitions.\n" +
                        "\n" +
                        "The products of this programme would be capable of practicing on their own or be engaged in the industry and the public sector.\n" +
                        "\n" +
                        "PROGRAMME OBJECTIVES\n" +
                        "\n" +
                        "The main objectives of the programme are to:\n" +
                        "\n" +
                        "(a) provide students with appropriate training and adequate intellect in the acquisition of skills and technological proficiency necessary for effective translation of creative designs to finish products;\n" +
                        "\n" +
                        "(b) raise the level of aesthetic and cultural awareness in the students;\n" +
                        "\n" +
                        "(c) guide students to use their creative skills to enhance and add breadth to the quality of living; and\n" +
                        "\n" +
                        "(d) produce graduates who can be readily admitted and registered by the Architects Registration Council of Nigeria (ARCON), Nigerian Institute of Architects (NIA) and other allied professional bodies."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "a) UTME\n" +
                        "\n" +
                        "UTME Admission:\n" +
                        "\n" +
                        "Admission into the Department is mainly through the UTME. The entry requirement is 5 O’level credits at not more than two sittings in SSCE, WASSCE, NECO, or its equivalent in the following subjects: English Language, Mathematics, Physics and any two subjects from the following: Economics, Chemistry, Technical Drawing, Fine Art and Geography.\n" +
                        "\n" +
                        "UTME Subjects:\n" +
                        "\n" +
                        "English Language, Mathematics, Physics and any one of Chemistry, Geography or Technical Drawing.\n" +
                        "\n" +
                        "b) DIRECT ENTRY\n" +
                        "\n" +
                        "In addition to fulfilling the requirements for (a) above, candidates seeking admission into 200 level shall possess any of the following:\n" +
                        "\n" +
                        "GCE Advanced level pass at not less than credit level in Cambridge International Examination (CIE), Interim Joint Matriculation Board (IJMB) examination or its equivalent in at least two of the following: Mathematics, Physics, Geography, Chemistry and Economics;\n" +
                        "National Diploma (ND) in Architecture or related disciplines with at least Upper Credit level Pass from NBTE accredited institutions; and\n" +
                        "Any other equivalent qualifications"));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for the B. Tech Architecture of the Federal University of Technology, Akure, a student must have:\n" +
                        "\n" +
                        "a. passed all prescribed core courses, University and School required courses as well\n" +
                        "\n" +
                        "as elective courses recommended for specialization.\n" +
                        "\n" +
                        "b. completed a minimum of 200 units for candidates admitted through UTME and\n" +
                        "\n" +
                        "156 units for candidates admitted through Direct Entry and a CGPA of not less\n" +
                        "\n" +
                        "than 1.50; and\n" +
                        "\n" +
                        "c. completed successfully industrial attachment, studio woks and projects.\n" +
                        "\n" +
                        "Direct Entry students are expected to offer and pass GNS 106 as a credit course. They are also to audit and pass GNS 101, 102, 103 and MEE 101 and 102; and if they fail these courses at first attempt, they must offer them formally as credit courses."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "Candidates undergoing this programme are expected to spend 10 semesters for UTME candidates, while the direct entry candidates will spend 8 semesters. If a student fails to graduate within the 10 or 8 semesters, he/she cannot stay beyond 15 or 13 semesters for direct entry or UTME candidates respectively.\n" +
                        "\n" +
                        "At the end of the 5-year programme, the student will be required to continue for one and a half sessions to obtain the Master of Technology degree, M. Tech. Architecture to enable them attain full professional status."));
    }
}