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

public class MneDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_mne_department);
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
                "WELCOME TO THE DEPARTMENT OF MINING ENGINEERING",
                "\n" +
                        "You are welcome to our web site. We invite you to explore the site to get more acquainted with our Department by following the links on the left column. As a technology training institution, our programmes are geared towards producing highly skilled manpower capable of managing mining engineering profession in a sustainable manner. To obtain more information about the history of the Department and our unique attributes as part of a University of Technology, click About Us. In addition to our undergraduate and postgraduate programmes, we also run postgraduate diploma programme. Further details on all our academic programmes can be viewed by clicking the Programme page, while our photo gallery shows a few of our activities.\n" +
                        "\n" +
                        "The Department is well endowed with highly experienced and dedicated staff. These individuals are well attuned to the growing challenges confronting todays mining engineering professional. Taking advantage of rapidly changing technology and interaction with other colleagues nationally and internationally, we adopt state-of-the-art technology and are very pragmatic in our approach to mining engineering training. The profile of each of staff of the department is accessible through the page: Departmental Staff. On-going research activities as well as selected publications of members of the Department are listed on the Research and Publications page."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "(a)UTME Admission:\n" +
                        "\n" +
                        "Admission to 100 Level is through Unified Tertiary Matriculation Examination (UTME) in English Language, Mathematics, Physics and Chemistry. To be eligible for admission, candidates must have the WASSSCE, NECO, Ordinary General Certificate of Education or its equivalent with at least five credit passes in English Language, Mathematics, Physics and Chemistry and any other science subject at not more than two (2) sittings.\n" +
                        "\n" +
                        " U.T.M.E. Subjects: English Language, Chemistry, Mathematics and  Physics.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "(b)  Direct Entry Admission\n" +
                        "\n" +
                        "In addition to the requirements specified above in (a), candidates seeking admission to the 200-Level must possess:\n" +
                        "\n" +
                        "(i)  ND with minimum of Upper Credit Level or its equivalent in Mining or Mineral Resources Engineering from recognized institutions, OR\n" +
                        "\n" +
                        "(ii)  Good passes at the General Certificate of Education (Advanced Level) or its equivalent in the following three subjects: Chemistry, Physics and Mathematics at grades not less than C in each of the subjects at a sitting."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for a degree of Bachelor of Engineering (B. Eng) in Mining Engineering of The Federal University of Technology, Akure, a candidate must satisfactorily\n" +
                        "\n" +
                        "(a)  pass all prescribed compulsory (Core, University  and School courses) and the electives;\n" +
                        "\n" +
                        "(b) complete successfully a minimum of 212 units for students admitted through UTME and 165 units for students admitted through Direct Entry and obtain a CGPA of not less than 1.50.\n" +
                        "\n" +
                        "(c)  complete successfully all field projects, laboratory practicals and industrial attachments;\n" +
                        "\n" +
                        "Direct Entry students are expected to audit and pass GNS 101, 102 and 103   and MEE 101 and 102 and in the event that they fail the courses, they must offer them formally as credit courses."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The minimum duration of the programme is ten academic semesters for students admitted to 100 level and eight academic semesters for those admitted into 200-Level by Direct Entry. If a student fails to graduate at the end of normal academic session, he or she would not be allowed to exceed a total of 15 semesters in the case of UTME students and 13 semesters in the case of Direct Entry students."));

        hodProfileDetailsList.add(new HodProfileDetails("Hod's Profile",
                ""));
    }
}
