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

public class MtsDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_mts_department);
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
                "WELCOME TO THE DEPARTMENT OF MATHEMATICAL SCIENCES",
                "In addition,it has service all other Departments of the Institution in Mathematics, Statistics and Computer Science. Happily, there has been very steady growth in the programmes over the years. Nowadays, Post- Graduate programmes including M. Tech. and Ph.D are offered in both options.\n" +
                        "\n" +
                        "In realisation of the fact that Mathematics and Computer Science are basically distinct disciplines and in order to ensure a faster and optimum growth of each programme option, the defunct Department of Industrial Mathematics and Computer Science was split into two which led to the emergence of the Department of Mathematical Sciences.\n" +
                        "\n" +
                        "The Department offers B. Tech., M. Tech. and Ph.D degrees in Industrial Mathematics and Statistic as well as offer service courses in Mathematics and Statistics to the entire University. It must be mentioned that all our programmes are tailored such that they equip our students adequately for Industrial applications of the knowledge gained. However, students are exposed to the fundamentals of Mathematical process and principles in both pure and applied Mathematics which include Real Analysis, Algebra, Differential and Integral Calculus, Mechanics (solid, fluid, and quantum), Vector Analysis, Complex Analysis, Mathematical Methods, Ordinary and Partial Differential Equation, Numerical Analysis, Topological Spaces, etc.\n" +
                        "\n" +
                        "Objectives of The Department\n" +
                        "\n" +
                        "The objective of the department are as follows:\n" +
                        "\n" +
                        "a. To develop and give academic and professional training an all areas of Industrial Mathematical and statistics for the development of the latent power of thinking in individuals.\n" +
                        "\n" +
                        "b. To provide and promote sound basic practical and theoretical training in Industrial Mathematics and Statistics as a foundation for Technological development in Nigeria.\n" +
                        "\n" +
                        "c. To identify the basic Scientific and Technological problems in the area s of Industrial Mathematics and Statistics and find appropriate solution to them.\n" +
                        "\n" +
                        "d. To train students to be able to adequately apply information Technology to solve real-life problems inthe areas of Agriculture, Commerce, Medicine,, and othe desciplines that require the knowledge of Industrial Mathematics and Staticstics.\n" +
                        "\n" +
                        "e. To give Student Industrial Work Experience Scheme (SIWES) for the purpose of self employment and job placement in the industry for self actualisation.\n" +
                        "\n" +
                        "f. To develop and offer academic and professional programmes as a foundation for Post Graduate Studies.\n" +
                        "\n" +
                        "g. To offer service courses in Mathematics and Statistics to other Departments in the University."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "UTME:Five ‘O’ Level credits including English, Mathematics, Physics, Chemistry plus one other Science subjects\n" +
                        "\n" +
                        "UTME SUBJECTS\n" +
                        "\n" +
                        "English, Mathematics, Physics and Chemistry\n" +
                        "\n" +
                        "DIRECT ENTRY\n" +
                        "\n" +
                        "Two ‘A’ Level passes in Five ‘O’ Level English, Physics Mathematics and Science subjects.\n" +
                        "\n" +
                        "NCE with at least Merit in Mathematics, Chemistry Physics other Science Subject."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "For students to be eligible for graduation, they must pass all the core, University required and elective courses registered for in the University. The students who enter the university at 100 level must pass a minimum of 209 units an dthe direct entry students, a minimum of 162 units before they can graduate."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The duration of the programme shall be a minimum of five (5) academic sessions for UTME candidates. However, direct entry candidates are allowed to spend a minimum of four (4) academic sessions."));
    }
}