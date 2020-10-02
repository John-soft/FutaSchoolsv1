package com.johnsoft.futaschools.sos_departments;

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

public class StaDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_sta_department);
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
                "WELCOME TO THE DEPARTMENT OF STATISTICS",
                "Statistics is a discipline that has become veritable tools in the hands of Scientists, Engineers and others. It is a science which deals with development and application of efficient methods of data collection, organization, analysis, presentation and interpretation, with a view to making appropriate inference about a population based on information from a sample. It has something to offer every fields of study across the Globe. Statistics as a planning and decision science has solutions to world challenges of uncertainties.\n" +
                        "\n" +
                        "At Federal University of Technology, Akure, Department of Statistics became a full fledged department in February, 2013 with Prof. O. E. Asiribo, a visiting Professor appointed as the first head of Department. Prior to this time, it had existed as an option in the old Department of Mathematical Sciences, though approval had been given by the senate for the establishment in March, 2012. The Statistics option was approved by the Senate in September, 2004 and graduated the first set of undergraduates in 2011. The present Head of Department, Prof. K. Ayinde took over in August 2016."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "U M E : To be admitted into our undergraduate programme through University Matriculation Examination (UME), prospective students are expected to possess five (5) ‘O’ Level credits including English language, Mathematics, Physics plus any two of Economics, Geography, Chemistry and Biology. At the University Matriculation Examination, the student will be expected to sit for the following subjects: English language, Physics, Mathematics and any one of Economics, Geography Chemistry and Biology\n" +
                        "DIRECT ENTRY: To be admitted directly into our undergraduate programme, prospective students are expected to possess ‘A’ Level or equivalent with passes in Mathematics and at least one of the following subjects: Physics, Economics, Geography, Chemistry and Biology. Also, holders of National Diploma (ND) in Statistics with a minimum of Upper Credit or equivalent from recognized Polytechnic or College of Technology are also eligible for admission.\n" +
                        "WAIVER: Any prospective student who fails to meet all the requirement above is not eligible for admission and will not be consider as the department grants no waiver."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for the award of Bachelor of Technology (B.Tech) degree in Statistics, a student who has been found worthy in character must satisfy the following requirements:\n" +
                        "\n" +
                        "Must pass all core courses, university and school required courses as well as certain electives tailored towards some areas of specialization which may be of interest to the student.\n" +
                        "Complete a successful six (6) month industrial attachment training.\n" +
                        "Carry out a compulsory final year project under the guidance of one of our academic staff.\n"));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The duration of the programme shall be a minimum of five (5) academic sessions for UTME candidates. However, direct entry candidates are allowed to spend a minimum of four (4) academic sessions."));
    }
}