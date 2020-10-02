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

public class MmeDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_mme_department);
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
                "WELCOME TO THE DEPARTMENT OF MATERIALS AND METALLURGICAL ENGINEERING",
                "\n" +
                        "The objectives of the programme are to:\n" +
                        "\n" +
                        "(a) Expose the students to sound foundational sciences of Engineering and Engineering Technology;\n" +
                        "\n" +
                        "(b) Develop in the students an overall sound knowledge of metallurgical and materials engineering and as such produce engineers that are capable of participating effectively in the main areas of the metallurgical and materials industry;\n" +
                        "\n" +
                        "(c) Encourage close association of the programme with industries and relevant research establishment in the country and outside;\n" +
                        "\n" +
                        "(d) Impart to the students the ability to investigate, analyze and provide solutions to problems arising from metallurgical and materials engineering processes; and\n" +
                        "\n" +
                        "(e) Train the students to acquire the capability for meaningful result oriented research in Metallurgical and Materials Engineering."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "(a) UME Admission\n" +
                        "\n" +
                        "Admission to 100 level is through UME of the joint Admission Matriculation Examination. To be eligible for admission, candidates must have a minimum of five credits in the General Certificate of Education (Ordinary Level) or West African Senior Secondary Certificate (WASSCE) or NECO or its equivalent at not more than two sittings in subjects which must include: Chemistry, Physics, Mathematics and English Language.\n" +
                        "\n" +
                        "U.M.E. Subjects: English Language, Chemistry, Mathematics and Physics.\n" +
                        "\n" +
                        "(b) Direct Entry Admission\n" +
                        "\n" +
                        "In addition to the requirements specified in (a) above candidates seeking admission to\n" +
                        "\n" +
                        "200-Level must possess:\n" +
                        "\n" +
                        "(i) ND at Upper Credit Level or its equivalent, in Metallurgical and Materials Engineering or related discipline in recorgnised institution; or\n" +
                        "\n" +
                        "(ii) Good passes at the Advanced Level of General Certificate of Education or its equivalent in Chemistry, Physics and Mathematics."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for a B.Eng. degree in Metallurgical and Materials Engineering of The Federal University of Technology, Akure, a candidate must:\n" +
                        "\n" +
                        "A) Pass all prescribed core courses, School and University required courses as well as the electives;\n" +
                        "\n" +
                        "B) Complete a minimum of 204 units for candidates admitted through UME and 161 units for candidates admitted through Direct Entry and obtain a CGPA of not less than 1.0.\n" +
                        "\n" +
                        "C) Complete successfully all field projects, laboratory practical and industrial attachments.\n" +
                        "\n" +
                        "Direct entry students are required to audit and pass GNS 101,102 and 103 and MEE 101 and 102 respectively, and if they fail these courses, they must offer them formally as credit courses."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The normal duration of the programme is five academic sessions for students admitted through UME to 100 level and four academic sessions for those admitted by Direct Entry into 200-Level. If a student fail to graduate at the end of normal academic sessions he or she would not be allowed to exceed a total of 15 semesters in the case of UME students and 12 semesters in the case of Direct Entry students."));

        hodProfileDetailsList.add(new HodProfileDetails("Hod's Profile",
                ""));

    }
}
