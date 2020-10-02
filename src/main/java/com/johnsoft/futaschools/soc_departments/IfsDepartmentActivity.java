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

public class IfsDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_ifs_department);
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
                "WELCOME TO THE DEPARTMENT OF INFORMATION SYSTEMS",
                "In today's complex, interconnected world, the effective creation, distribution, and use of information via technology is central to daily life. Computer based information systems facilitate, enable and often define the relationships between corporations and consumers, buyers and suppliers, businesses of all sizes, social networks, and citizens and their governments. Understanding these relationships and effectively addressing the collection, flow, and distribution of information is vital to running a modern organisation, enterprise or government agency.\n" +
                        "\n" +
                        "Information Systems involves the effective design, delivery, use and impact of information and communications technologies in organisations and society. The importance of information technology and information systems to organisations and the need for well-educated professionals in the field is the basis for the B.Tech. Information Systems degree programme. Whether implementing applications, providing management or decision support, managing complex systems projects, or helping organisations design business processes or cope with rapid change, information systems professionals fill an essential need across all sectors of society.\n" +
                        "\n" +
                        "Information Systems degree programme started as a full-fledge programme under a School of Computing approved by the University Senate in November, 2017 which took off on 2017/2018 academic session. The components of the degree programmes are as follows: Course work, Project work, Industrial Training. The course work involves lecture, tutorial and practical. The project work involves the presentation of seminar papers and submission of dissertation. The Industrial Training is usually being carried out during the Second Semester of the 400 Level of each year and each student submitted a report of his or her industrial training experience in the form of a seminar paper for assessment and evaluation by the Department.\n" +
                        "\n" +
                        "Graduates of the Department can easily find employments in government establishments, industries, business, banking and accounting houses, oil companies, commercial houses, computer hardware and software development establishments. educational institutions, higher institutions as Information Systems officers and Professionals; trainee researchers and academicians respectively. They are also equipped to establish their own private practice in information systems, computer training, software development and e-systems generally."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "The entry requirements for the degree programme shall be:\n" +
                        "\n" +
                        "1. Unified Tertiary Matriculation Examination (UTME)\n" +
                        "\n" +
                        "(a) UTME subjects must include English Language, Mathematics, Chemistry and Physics\n" +
                        "\n" +
                        "(b) Five Credit Passes at not more than TWO sittings, which must include English Language, Mathematics, Chemistry, Physics, and Biology or Agricultural Science or Economics, at Senior Secondary School Certificate.\n" +
                        "\n" +
                        "2. Direct Entry\n" +
                        "\n" +
                        "The following may be considered in addition to the minimum requirements in 1(b):\n" +
                        "\n" +
                        "Two A' Level passes with minimum of C grade in Mathematics, Physics, or Chemistry;\n" +
                        "At least Upper Credit pass in National Diploma in Computer Science from a recognised Polytechnic or its equivalent; and\n" +
                        "NCE with at least credit pass both in Computer Science/Mathematics; Computer Science/Physics or Mathematics/Physics.\n"));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for the award of B.Tech. degree in Information Systems, a student must have:\n" +
                        "\n" +
                        "passed all the core courses, university and school required courses and electives;\n" +
                        "accumulated a minimum of 192 course units for students admitted through UTME and 151 for students admitted through direct entry; and\n" +
                        "attain a minimum CGPA of 1.50.\n" +
                        "However, the direct entry students are expected to audit some 100–level courses of the University such as GNS101, GNS102, GNS103, and MEE101. These courses must be passed at first sitting to be qualified as zero unit otherwise they will be used for computation in the affected students’ results."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The duration of the programme is normally ten academic semesters for UTME and eight academic semesters for the direct entry candidates. If a candidate fails to graduate within the stipulated academic sessions, he or she will not be allowed to exceed a total of fifteen academic semesters in the case of UTME candidate and thirteen semesters in the case of direct entry."));
    }
}
