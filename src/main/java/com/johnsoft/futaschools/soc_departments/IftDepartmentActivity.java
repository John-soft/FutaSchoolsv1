package com.johnsoft.futaschools.soc_departments;

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

public class IftDepartmentActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_ift_department);
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
                "WELCOME TO THE DEPARTMENT OF INFORMATION TECHNOLOGY ",
        "The specific objectives of the B.Tech. (Hons) Information Technology programme are to:\n" +
                "\n" +
                "prepare a graduate for a career in the network management and general business systems area, not only from the technical aspects, but also the operational and management requirements;\n" +
                "\n" +
                "develop the skills required to use a range of software and network tools and techniques in the development of effective systems across a range of domains;\n" +
                "\n" +
                "equip the students with the capacity for professional practice in computing and communications;\n" +
                "\n" +
                "develop in students through an education in Information Technology, a range of transferrable applicable IT skills to all aspects of human endeavours;\n" +
                "\n" +
                "develop the students for the purpose of self-employment and job placements in the government establishments and industry;\n" +
                "\n" +
                "generate in students to appreciate the importance of Information Technology in an industrial, economic, technological and social context; and\n" +
                "\n" +
                "develop the students through sound academic and professional programmes as a basis for further studies in Information Technology or multi-disciplinary studies."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "The entry requirements for the degree programme shall be:\n" +
                        "\n" +
                        "Unified Tertiary Matriculation Examination (UTME) requirements\n" +
                        "\n" +
                        "UTME subjects must include English Language, Mathematics, Chemistry and Physics\n" +
                        "\n" +
                        "Five Credit level passes at not more than two sittings, which must include English Language, Mathematics, Chemistry, Physics, and Biology or Agricultural Science, at Senior Secondary School Certificate.\n" +
                        "\n" +
                        "Direct Entry Requirements\n" +
                        "\n" +
                        "The following may be considered in addition to the minimum requirements of Senior Secondary School Certificate stated above:\n" +
                        "\n" +
                        "Two A' Level passes with a minimum of C grade in Mathematics, Chemistry, or Physics;\n" +
                        "\n" +
                        "At least Upper Credit pass in National Diploma in Computer Science from a recognized Polytechnic or its equivalent;\n" +
                        "\n" +
                        "NCE with at least credit pass both in Computer Science/Mathematics; Computer Science/Physics or Mathematics/Physics."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for the award of B.Tech. degree in Information Technology, a student must have:\n" +
                        "\n" +
                        "passed all the core courses, university and school required courses and electives;\n" +
                        "accumulated a minimum of 192 course units for students admitted through UTME and 151 for students admitted through direct entry; and\n" +
                        "attain a minimum CGPA of 1.50.\n" +
                        "However, the direct entry students are expected to audit some 100–level courses of the University such as GNS101, GNS102, GNS103, and MEE101. These courses must be passed at first sitting to be qualified as zero unit otherwise they will be used for computation in the affected students’ results."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The duration of the programme is normally ten academic semesters for UTME and eight academic semesters for the direct entry candidates. If a candidate fails to graduate within the stipulated academic semesters, he or she will not be allowed to exceed a total of fifteen academic semesters in the case of UTME candidate and thirteen semesters in the case of direct entry candidate."));
    }
}
