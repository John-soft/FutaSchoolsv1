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

public class IddDepartmentActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_idd_department);
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
                "WELCOME TO THE DEPARTMENT OF INDUSTRIAL DESIGN",
                "The Industrial Design Programme is concerned with the development of creative strategies in the provision of technological solutions to problems that are related to the specific needs of industry and the society in general. The programme places emphasis on the development of high professional skills as well as exploration and development of indigenous materials in the areas of Ceramics, Graphics and Textiles Design. It also focuses on producing graduates of high quality with creative skill and entrepreneurial knowledge that can make them self reliant as well as employable by the Printing, Textiles and Ceramics industries.\n" +
                        "\n" +
                        "PROGRAMME OBJECTIVES\n" +
                        "\n" +
                        "The object of the programme are to:\n" +
                        "\n" +
                        "1) provide students with appropriate training and adequate intellect in the acquisition of skills and technological proficiency necessary for effective translation of creative designs to finished products;\n" +
                        "\n" +
                        "2) raise the level of aesthetic and cultural awareness in the students;\n" +
                        "\n" +
                        "3) guide students in using their creative skills to enhance and add breath to the quality of living.\n" +
                        "\n" +
                        "4) prepare students that will attract high international employment profile in the feild of Industrial Design; and\n" +
                        "\n" +
                        "5) prepare students for self-reliant work after graduation."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "Bachelor of Technology (BTech.) Industrial Design\n" +
                        "\n" +
                        "(a) UTME Requirements\n" +
                        "\n" +
                        "Candidates seeking admission into the Department of Industrial Design for the bachelor’s degree programme must possess 5 credit passes at the West African Senior Secondary School Certificate Examinations (WASSSCE) or NECO or GCE O’Level or its equivalent in not more than two sittings in the following subjects: English Language, Mathematics, Chemistry, and 2 of the following: Economics, Physics, Technical Drawing, Fine Art and Geography. Credit or Pass in Fine Art will be an additional advantage, while a pass grade in Physics will be acceptable.\n" +
                        "\n" +
                        "UTME Subjects:\n" +
                        "\n" +
                        "English Language, Mathematics, Chemistry, and any one of Fine Art, Physics, Geography and Economics.\n" +
                        "\n" +
                        "(b) Direct Entry Requirements\n" +
                        "\n" +
                        "In addition to satisfying the requirements in (a) above, candidates seeking admission through direct entry should have GCE (Advanced Level) passes in at least two subjects from the following: Mathematics, Chemistry, Geography, Physics, Fine Art, Technical Drawing or Economics. Holders of the National Diploma (ND) with a minimum of upper credit from recognized institutions may also be considered for admission, provided they meet the minimum entry requirements, and have passed in relevant subjects in the ND examinations at credit level."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "Bachelor of Technology (BTech.) Industrial Design\n" +
                        "\n" +
                        "To be eligible for the award of B. TECH in the Industrial Design, a student is expected to have:\n" +
                        "\n" +
                        "a) Passed all core courses, all University and school required courses as well as any elective taken;\n" +
                        "\n" +
                        "b) Accumulated a minimum of 188 courses units if he or she was admitted through UME and 143 units if by direct entry and obtained a CGPA of not less than 1.0.\n" +
                        "\n" +
                        "c) Successfully completed all industrial attachment, seminars and project.\n" +
                        "\n" +
                        "In addition, those who came by direct entry are expected to audit and pass the following university required courses – GNS 101,102and 103 and MEE 101 and 102. If a student fails any of the courses, he/she will be required to offer it formally."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "Bachelor of Technology (B.Tech) Industrial Design\n" +
                        "\n" +
                        "The programme duration is ten (10) semesters for students admitted through the UTME and eight (8) semesters for Direct entry students. If a student fails to graduate at the end of the normal academic sessions, he or she would not be allowed to exceed a total of 15 semesters in the case of UTME students and 13 semesters in the case of direct entry students."));
    }
}