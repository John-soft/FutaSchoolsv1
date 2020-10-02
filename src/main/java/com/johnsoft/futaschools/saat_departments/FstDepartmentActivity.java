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

public class FstDepartmentActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private RecyclerView aboutDepartmentRecycler, admissionRequirementRecycler, gradRequirementRecycler, programDurationRecycler, hodProfileRecycler;
    private List<AboutDepartmentDetails> aboutDepartmentDetailsList = new ArrayList<>();
    private List<AdmissionRequirementDetails> admissionRequirementDetailsList = new ArrayList<>();
    private List<GraduationRequirementDetails> graduationRequirementDetailsList = new ArrayList<>();
    private List<ProgramDurationDetails> programDurationDetailsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fst_department);
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
                "WELCOME TO THE DEPARTMENT OF FOOD SCIENCE AND TECHNOLOGY",
                "The philosophy of the programme is to produce well trained food scientists and technologists, capable of working in existing food industries using locally available raw materials to set up cottage food processsing industries (to reduce post harvest food losses) as well as make nutritious and wholesome food available to consumers particularly in Nigeria and West African sub region.\n" +
                        "\n" +
                        "This is achieved through intensive training in biochemical processes of food materials and the application of enerigneering technology to food processing, preservation and storage. the students are prepared to be self reliant and have entrepreneurial drive particularly in the areas of adding value to local raw and food materials and thereby minimising the poor harvest losses.\n" +
                        "\n" +
                        "OBJECTIVES OF THE PROGRAMME\n" +
                        "\n" +
                        "The objectives of the programme are to:\n" +
                        "\n" +
                        "(i) Train skilled, technical and managerial manpower for agro-allied industries;\n" +
                        "\n" +
                        "(ii) produce graduates that can establish, manage and direct small scale food processing and aillied industries using locally available raw materials in line with the institutions motto:Technology for Self Reliance;\n" +
                        "\n" +
                        "(iii) produce qualified personnel that will be involved in consultancy services in food product development, research and development, processing and preservation; which will reduce post-harvest food losses and graduates job creator graduates rather than job seeker;\n" +
                        "\n" +
                        "(iv) equip graduates with knowledge of design and fabrication of food processing equipment and thereby assisting to develop traditional technology; and\n" +
                        "\n" +
                        "(v) turn out graduates that are qualified to teach food science and technology and allied courses in appropriate institution of higher learning.\n" +
                        "\n"));


        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "A. ORDINARY LEVEL REQUIREMENTS\n" +
                        "\n" +
                        "Candidates must have five credits inO’levelor SSCE or NECO at not more than two sitting to include:\n" +
                        "\n" +
                        "i. English Language Credit\n" +
                        "\n" +
                        "ii. Mathematics Credit\n" +
                        "\n" +
                        "iii. Chemistry Credit\n" +
                        "\n" +
                        "iv. Biology/Agricultural Science Credit\n" +
                        "\n" +
                        "v. Physics Credit\n" +
                        "\n" +
                        "B. UNIVERSITY MATRICULATION EXAMINATION SUBJECT REQUIREMENTS\n" +
                        "\n" +
                        "Chemistry\n" +
                        "Mathematics and/or Physics\n" +
                        "Biology or Agricultural Science\n" +
                        "English Language\n" +
                        "C. DIRECT ENTRY REQUIREMENTS\n" +
                        "\n" +
                        "Direct Entry candidates must fulfill the conditions in A (above) and have a minimum of Upper Credit at the ND examination to qualify for admission into 200 level of the programme.\n" +
                        "\n"));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirement",
                "To be eligible for the award of B.Tech deegree in food science and technology a student must have:\n" +
                        "\n" +
                        "a. passed all core (compulsory) courses as well as all university and school required courses and electives recommended for specialization;\n" +
                        "\n" +
                        "b.accumulated at least 202 units for students admitted through UTME and 168 units for those by direct entry, and obtained a CGPA of not less than 1.00; and\n" +
                        "\n" +
                        "c. successfully completed all class work; industrial attachment, seminars and projects.\n" +
                        "\n" +
                        "as part of the programme, students visit industries and take part in the Long Vacation industrial Practical Work Scheme (usually in the second semesters of 200 and 300 levels)to enable them reconcile therotical knowledge with what obtain in the industries and farms. in the second semester of the 400 levels (4th year), they also go on a six-month students industrial Work Experience Scheme (SIWES) in a food industry.\n" +
                        "\n" +
                        "Direct entry students are expected to audit and pass the following University required courses: GNS101, 102, 103 and 106; MEE 101 and 102."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The bachelor of Technology programme in food science and Technology runs normally for 5 academic sessions for UTME candidates and 4 sessions for direct entry candidates. however, if the student fails to graduate within the normal number of sessions, he/she will not be allowed to exceed a total of 7 academic sessions in the case of UTME candidates and 6 for direct students."));
    }
}
