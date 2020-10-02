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

public class AecDepartmentActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private RecyclerView aboutDepartmentRecycler, admissionRequirementRecycler, gradRequirementRecycler, programDurationRecycler, hodProfileRecycler;
    private List<AboutDepartmentDetails> aboutDepartmentDetailsList = new ArrayList<>();
    private List<AdmissionRequirementDetails> admissionRequirementDetailsList = new ArrayList<>();
    private List<GraduationRequirementDetails> graduationRequirementDetailsList = new ArrayList<>();
    private List<ProgramDurationDetails> programDurationDetailsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aec_department);
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
                "On behalf of all members of Staff of the Department, it is my great pleasure to welcome you to the Department of Agricultural Extension and Communication Technology located in the School of Agriculture and Agricultural Technology Building, Federal University of Technology, Akure.\n" +
                        "\n" +
                        "The Department was created from the (former) Department of Agricultural Economics and Extension in January 2012. Being a newly created Department, there have, however, been a lot of challenges here and there, but we seek to continue to offer our best to our range of clientele.\n" +
                        "\n" +
                        "The Department intends to be focused and innovative in its operations so as to enable it meet both local and international challenges. The main objective is to produce students with appropriate practical knowledge and skills in the field of Agricultural Extension and Communication Technology. Students that will be able to create employment opportunities for themself and other people, particularly in the field of agriculture, assume leadership position and improve on the well- being of rural dwellers are the anticipated products.\n" +
                        "\n" +
                        "Furthermore, the Department has many seasoned academics that are highly competent and specialize in various aspects of Agricultural Extension and Communication Technology. There are areas of specialization within the confines of the discipline itself and all these provide opportunities for students to realize their life-long goals.\n" +
                        "\n" +
                        "The academics and non-academics staffs of the Department have a tradition of good relationship with students and are always eager to assist students, on the other hand, students are encouraged to relate with their academic advisers for clarification on any area of concern\n" +
                        "\n" +
                        "Once again I welcome you all\n" +
                        "\n" +
                        "Prof. O. O. Fasina\n" +
                        "\n" +
                        "Head of Department\n" +
                        "\n" +
                        "08108578868"));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "In addition to passing the Joint Admissions and Matriculation Board (JAMB) Examination, a candidate wishing to be admitted to a degree programme in Agricultural Extension and Communication Technology must have;\n" +
                        "\n" +
                        "A. U.M.E.: Candidates must possess at least Five Ordinary Level credits in subjects which must include English Language, Mathematics, Chemistry, Biology or Agricultural Science, Economics or Geography. At least a pass in Physics is required.\n" +
                        "\n" +
                        "The UME Subjects are: English Language, Chemistry, Biology/Agricultural Science and either Mathematics or Physics.\n" +
                        "\n" +
                        "B. DIRECT ENTRY ADMISSION(into the second year of the programme):\n" +
                        "\n" +
                        "In addition to “O” level requirements stated above, holders of the Ordinary National Diploma (ND) and Higher National Diploma (HND) or equivalent in Agriculture or any relevant area of specialization from recognized institutions may be considered for admission into 200 level, provided they meet the minimum entry requirements and have passed relevant subjects in the ND examinations at the Upper Credit level."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "Duration of ProgrammeThe programme is for a duration of five academic sessions (5 years), but for Direct Entry students, it is four academic sessions (4 years). Requirements for Graduation (On Semester Basis)The degree of Bachelor of Agricultural Technology (B. Agric. Tech.) in Agricultural Extension & Communication technology is a five-year programme. A student may, however, acquire the degree in less than five years provided the requirements for the degree have been met. To be eligible for the degree, students must have:1. passed all required courses and any elective recommended for specialization.2. accumulated at least 186 credit units for the five year programme and 156 credit units for direct entry programme and obtained a CGPA of not less than 1.0.3. successfully completed all field practicals, industrial attachments, training and projects.\n" +
                        "Grand Total Unit = 193\n" +
                        "\n" +
                        "Minimum Unit required to Graduate =186\n" +
                        "\n" +
                        "The Grand Total Unit and/or minimum TNU for the award of B. Agriculture Technology (Agricultural Extension and Rural Sociology) is as follows:\n" +
                        "\n" +
                        "UME = 186\n" +
                        "\n" +
                        "DE = 156"));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The duration of the programme is five academic sessions for students admitted through the UTME but for Direct Entry, it is four. If a student fails to graduate in five academic sessions, he or she will NOT be allowed to exceed a total of 7 academic sessions or 15 Semesters.\n" +
                        "\n"));

    }

}
