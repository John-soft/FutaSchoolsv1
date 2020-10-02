package com.johnsoft.futaschools.sems_departments;

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

public class AgpDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_agp_department);
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
                "WELCOME TO THE DEPARTMENT OF APPLIED GEOPHYSICS",
                "The Applied Geophysics Department is one of the Department in the School of Earth and Mineral Sciences.\n" +
                        "\n" +
                        "DEPARTMENTAL PROGRAMMES\n" +
                        "\n" +
                        "B.Tech. (Applied Geophysics)\n" +
                        "\n" +
                        "PGD. (Applied Geophysics)\n" +
                        "\n" +
                        "M.Tech. (Exploration Geophysics)\n" +
                        "\n" +
                        "Ph. D. (Exploration Geophysics)\n" +
                        "\n" +
                        "Our Vision:\n" +
                        "\n" +
                        "Vision of the Department of Applied Geophysics, Federal University of Technology, Akure: is to be an International Centre of Excellence and Research in Exploration Geophysics\n" +
                        "\n" +
                        "Our Mission\n" +
                        "\n" +
                        "To train students to enter the Geosciences and Technology related industries as qualified geophysicists\n" +
                        "To train existing practitioners in up-to-date geophysical technologies\n" +
                        "To advance the science of Applied Geophysics through a range of research programmes\n" +
                        "To disseminate that knowledge to the general exploration profession\n" +
                        "We see our planet, Earth, as an extraordinarily complex system that defies reduction to the perspective of a single research discipline. We therefore recognize the interdisciplinary synergy among the natural sciences (chemical, physical and biological) as a vital ingredient which keeps enable the department fulfils her mission.\n" +
                        "\n" +
                        "The Department hosts a diverse community of scholars that include research scientists, post doctoral scholars and visiting scientists. These valued members of our department enrich research and learning about the fundamental nature of Earth, and other planetary bodies, their physics, chemistry, and history, and have an important role in the broad intellectual life of the Department, school and the University.\n" +
                        "\n" +
                        "We strive to solve exploration problems through observations and techniques capable of transferring our understanding of the earth for the benefit of its inhabitants.\n" +
                        "\n" +
                        "We emphasize the process of discovery as ideal integration over maintenance of disciplinary knowledge and its boundaries. With a range of research experience that exceeds the confine of our discipline, we disseminate to our students, research colleagues and the environment, knowledge and opportunity to solve problems that can rarely be pursued elsewhere."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "(a)UME Admission:\n" +
                        "\n" +
                        "Admission into 100 level is through the university matriculation examination(UME)of the joint admission and matriculation board.To be eligible for admission,candidates are expected to obtain credits in at least five subjects including English Language,Physics,Mathematics,and chemistry at not more than two sittings in the west african senior school certificate examination(WASSCE),NECO,General certificate of education ordinary level((GCE,O/L)or their equivalent.\n" +
                        "\n" +
                        "UME Subjects:English Language,Physics,Mathematics and Chemistry.\n" +
                        "\n" +
                        "(b)Direct Entry\n" +
                        "\n" +
                        "Candidates may be admitted to 200 level if they have:\n" +
                        "\n" +
                        "(i)satisfied the general entry requirements for the university as specified in (a)above;and\n" +
                        "\n" +
                        "(ii)Obtained National Diploma(with a minimum of upper credit) or equivalent in Laboratory Technology (Geology Option) and in Mining,Civil and Electrical/Electronic Engineering or any other course adjudged relevant by the Department;or\n" +
                        "\n" +
                        "(iii)Good passes at GCE(Advanced Level) or its equivalent in at least two of the following subjects:Physics,Mathematics and Chemistry."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for the award of B.Tech.in Applied Geophysics,a students is expected to have:\n" +
                        "\n" +
                        "(a)passed all departmental compulsory or core courses,university/school required courses as well as the electives taken;\n" +
                        "\n" +
                        "(b)Accumulated a minimum of 190 course units for students admitted through the UME and 149 course units for direct entry students and obtained a CGPA of not less than 1.0;\n" +
                        "\n" +
                        "(c)completed successfully all industial attachment training,seminars and project.\n" +
                        "\n" +
                        "in additions,students who are admitted by direct entry are expected to audit and pass the following university required courses-GNS1101,102 and103 as well as MEE 101 and 102.If a student fails any of the courses,he/she will be required to offer it formally."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "A students should undergo normal circumstances spend five academic sessions if he/she enters the university through UME,and four if through direct entry to obtain a bachelor of technology degree in Applied Geophysics.\n" +
                        "\n" +
                        "However,if a student fails to graduate at the normal academic sessions,he/she will not be allow to exceed a total of 15 semesters for UME students and 12 semesters for direct entry students."));
    }
}
