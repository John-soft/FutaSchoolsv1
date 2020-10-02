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

public class CpeDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_cpe_department);
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
                "WELCOME TO THE DEPARTMENT OF AGRICULTURAL  ENGINEERING",
                "\n" +
                        "At the onset (2015/2016 academic session), the Computer Engineering Programme took off with seventy (70) students. Since then there has been a growth in the Programme and a steady increase in student enrollment to a total of 265 students in the 2018/2019 academic session. In 2017/2018 academic session, a Coordinator Dr. (Mrs) F. M. Dahunsi was appointed to coordinate the programme in conjunction with the Head of Department of Electrical and Electronics Engineering Dr. A.A. Ponnle.\n" +
                        "\n" +
                        "In November 2018, the Programme became a full-fledged Department and Dr. (Mrs) F. M. Dahunsi was made the Ag. Head of the Computer Engineering Department. The Department is empowered by staff from Computer Engineering Department and both Electrical and Electronics Engineering Department and Computer Science Department with a number of Professors, Readers, Senior Lecturers, and others. The University promotes interdisciplinary approach in the delivery of courses. Engineering Mathematics are taught by Mathematical Science Department, Mechanical Engineering Department handles Engineering Drawings and other Mechanical Engineering related courses, other engineering departments in the School of Engineering handles other related engineering courses, while Computer Science Department is responsible for some software related courses. The Department is equally benefitting from inputs from the Department of Physics and Department of Chemistry, particularly in related areas. The University encourages staff development.\n" +
                        "\n" +
                        "Given the importance of Computer Engineering in the modern economy, the University acquired and put at our disposal Computer systems, auxiliary equipment development and required laboratories to enhance relevance through research on embedded systems, software engineering, computer communication and networks, cryptography, prototyping and micro computer technology is being aggressively prosecuted. To complement equipment need, simulations and emulators are adopted alongside practical. The laboratories of the Department of Electrical and Electronics Engineering and Computer Science Department are also being used to complement and service the Department."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "These are divided into categories as follows:\n" +
                        "\n" +
                        "UTME Admission\n" +
                        "Admission to 100 level is through the UTME of the Joint Admission Matriculation Board. To be eligible for admission, candidates must possess GCE (OL) or WASSCE or NECO or equivalent with at least five credit passes in subjects which include English Language, Mathematics, Physics, Chemistry and any other acceptable Science subject at NOT more than two (2) sittings.\n" +
                        "\n" +
                        "UTME Subjects: English Language, Chemistry, Mathematics and Physics.\n" +
                        "\n" +
                        "Direct Entry Admission\n" +
                        "The candidate must possess, in addition to the requirements in “a” above;\n" +
                        "\n" +
                        "General Certificate of Education (Advanced Level) or equivalent in Chemistry, Physics and Mathematics with grade not lower than C grade; and\n" +
                        "National Diploma with a minimum of Upper Credit Level or equivalent in Computer Engineering or Electrical and Electronics Engineering from accredited and recognized tertiary institutions."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for a degree of B.Eng. in Computer Engineering of the Federal University of Technology, Akure, a candidate must:\n" +
                        "\n" +
                        "(a) Pass all prescribed core courses as well as University and school required courses and the elective;\n" +
                        "\n" +
                        "(b) Complete a minimum of 207 units if admitted through UME and a minimum of 164 units, if by Direct Entry and obtain a CGPA of not less than 1.0; and\n" +
                        "\n" +
                        "(c) Complete successfully all field projects, laboratory practicals and industrial attachments.\n" +
                        "\n" +
                        "Direct Entry students are expected to audit and pass GNS 101, 102 and 103 and MEE 101 and 102 and in the event that they fail these courses, they must offer them formally as credit courses."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The normal duration of the programme is five academic sessions for students admitted to 100 level through the UME and four academic sessions for those admitted into 200 level by Direct Entry. Students that fail to graduate at the end of normal academic sessions shall not be allowed to exceed a total of 15 semesters in the case of UME students and 12 semesters in the case of Direct Entry students."));

        hodProfileDetailsList.add(new HodProfileDetails("Hod's Profile",
                ""));


    }
}
