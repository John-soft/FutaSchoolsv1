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

public class FwtDepartmentActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private RecyclerView aboutDepartmentRecycler, admissionRequirementRecycler, gradRequirementRecycler, programDurationRecycler, hodProfileRecycler;
    private List<AboutDepartmentDetails> aboutDepartmentDetailsList = new ArrayList<>();
    private List<AdmissionRequirementDetails> admissionRequirementDetailsList = new ArrayList<>();
    private List<GraduationRequirementDetails> graduationRequirementDetailsList = new ArrayList<>();
    private List<ProgramDurationDetails> programDurationDetailsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fwt_department);
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
                "WELCOME TO THE DEPARTMENT OF FORESTRY AND WOOD TECHNOLOGY",
                "You are welcome to our web site. We invite you to explore the site to get more acquainted with our Department by following the links on the left column. As a forestry training institution located within the tropical rain forests, our programmes are geared towards producing highly skilled manpower capable of managing these forests in a sustainable manner.\n" +
                        "\n" +
                        "To obtain more information about the history of the Department and our unique attributes as part of a University of Technology, click About Us. In addition to our undergraduate and graduate programmes, we also run some postgraduate diploma courses. Further details on all our academic programmes can be viewed by clicking the Programmes link.\n" +
                        "\n" +
                        "This Department is well endowed with a crop of highly experienced and dedicated faculty and staff. These individuals are well attuned to the growing challenges confronting todays forestry professionals. Taking advantage of rapidly changing technology and interaction with other colleagues elsewhere, they adopt state-of-the-art methods and are very pragmatic in their approach to forestry training."));


        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "a. UME\n" +
                        "\n" +
                        "Admission into the first year (100 Level) of the programme is through JAMB. To be eligible for admission, candidates are expected to take and pass the UME examination. Candidates must possess five (5) credits in SSCE or NECO or GCE (O/L) or equivalent at a maximum of two (2) sittings in the following subjects: Chemistry, Biology, Agricultural Science, Mathematics and English Language and at least a pass in Physics.\n" +
                        "\n" +
                        "UTME subjects: English Language, Chemistry, Biology or Agricultural Science, Mathematics or Physics.\n" +
                        "\n" +
                        "b. Direct Entry\n" +
                        "\n" +
                        "For admission by direct entry (into second year of the programme), candidates must possess in addition to (a) above, any of the following requirements:\n" +
                        "\n" +
                        "i. National Diploma (ND with upper credit) or equivalent, or Higher National Diploma (HND) with lower credit in Forestry or Agriculture from recognized institutions.\n" +
                        "\n" +
                        "ii. GCE Advanced Level or equivalent at one siting in at least two of the following subjects: Physics, Chemistry and Biology with a minimum of 6 (six) points.\n" +
                        "\n" +
                        "iii. Holders of National Certificate in Education with Agriculture double major and at credit pass level.\n" +
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
                        "Direct entry students are expected to audit and pass the following University required courses: GNS101, 102, 103 and 106; MEE 101 and 102.\n" +
                        "\n"));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The duration of the programme is five academic sessions for students admitted through the UTME but for Direct Entry, it is four. If a student fails to graduate in five academic sessions, he or she will NOT be allowed to exceed a total of 7 academic sessions or 15 Semesters.\n" +
                        "\n"));
    }
}
