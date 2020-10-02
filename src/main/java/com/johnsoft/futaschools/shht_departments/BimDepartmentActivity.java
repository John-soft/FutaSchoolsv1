package com.johnsoft.futaschools.shht_departments;

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

public class BimDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_bim_department);
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
                "WELCOME TO THE DEPARTMENT OF BIO-MEDICAL TECHNOLOGY",
        "The Department of Biomedical Technology (BMT) is one among the three pioneering departments of the School of Health and Health Technology (SHHT), FUTA, which was established in 2015. Biomedical Technology being a multidisciplinary course, the Department was created with the core principle of producing graduates that can be readily absorbed into several areas of the rapidly developing fields of Biomedical Technology. Students are expected to be exposed to intense programme of basic and applied courses, broad range of engineering courses, experimentation, projects and industrial training. These are designed to enable students satisfy the manpower and growing needs of Biomedical Technologists/Engineers in the public, private and industrial sectors of the economy both locally and internationally. Being a nascent and multidisciplinary department, we admitted our first set of 67 students during the 2015/2016 academic session. During the 2016/2017 academic session, the Department admitted another set of 31 students, thus bring the total number of students to 98. The Department started its operation from the School of Sciences Extension building temporary assigned to SHHT by the University. In line with the vision and mission of the University, the Department’s staff members are highly committed to the training of Biomedical Technology students with the core vision of promoting technology for self-reliance.\n" +
                "\n" +
                "MISSION AND VISION STATEMENTS\n" +
                "\n" +
                "The philosophy of the Federal University of Technology, Akure is to produce technologically oriented graduates. In line with this philosophy, the Department trains graduates with a broad based knowledge in various aspects of Biomedical Technology with a bias towards biology, engineering and medicine. The undergraduate programme is designed to produce graduates that can be readily absorbed into several areas of the rapidly developing fields of Biomedical Technology. Students are exposed to intense programme of basic and applied courses, experimentation, projects and industrial training. These are designed to enable them satisfy the manpower and growing needs of Biomedical Engineers and Technologists in the public and industrial sectors of the economy. The programme involves research and training in the following areas: Biomedical instrumentation and intelligent biomedical systems control engineering; neurosciences; Biotechnology and Biomedicine; Nervous and Clinical Engineering, Rehabilitation Engineering. The thrust is to emphasize aspects of study that are relevant to articulated national and international development objectives and those that enhance the relevance of institution to the society. At the end of the programme, the products will be suitable for employment in all relevant public and private enterprises both in Nigeria and the world at large. The general philosophy of the programme is to produce graduates of high academic standing with adequate practical exposure who can function adequately in the medical education process, complement ancillary laboratory medical services to the greater society and develop entrepreneurial expertise in related disciplines."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "(a) UME Admission\n" +
                        "Admission to 100 Level is through the UME of the Joint Admission and Matriculation Board. To be eligible for admission, candidates MUST have the GCE (OL) or WASSCE or NECO or equivalent with at least five credit passes in subjects which include Mathematics, English Language, Physics, Chemistry and Biology at NOT more than two (2) sittings.\n" +
                        "U.M.E. Subjects: Mathematics, English Language, Biology and Chemistry or Physics.\n" +
                        "(b) Direct Entry Admission\n" +
                        "In addition to the requirements specified in SECTION 5(a) above, candidates seeking admission to 200 Level MUST possess:\n" +
                        "National Diploma (ND) with a minimum of Upper Credit Level or its equivalent in Biomedical Technology or related discipline, OR\n" +
                        "Good passes at the Advanced Level of General Certificate of Education or its equivalent in Mathematics, Biology and Chemistry or Physics."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for a B. Tech. degree in Biomedical Technology of the Federal University of Technology, Akure, a candidate must:\n" +
                        "\n" +
                        "(a) pass all prescribed core courses, School and University required courses as well as electives;\n" +
                        "\n" +
                        "(b) complete successfully a minimum of 206 units for candidates admitted through UTME and 159 units for candidates admitted through Direct Entry; and obtain a CGPA of not less than 1.00.\n" +
                        "\n" +
                        "(c) complete successfully all prescribed industrial attachments, projects and seminars. Student admitted by Direct Entry must audit and pass GNS 101, 102, and 103, and MEE 101 and 102. In the event of failure of these courses, the student will then offer the course(s) formally as credit courses."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The normal duration of the programme is five (5) academic sessions for students admitted to 100 Level through UME and four (4) academic sessions for those admitted into 200 Level by Direct Entry. Students may take longer than normal duration to complete the requirements for graduation but will NOT be allowed to exceed fourteen (14) semesters for candidates admitted through UTME and twelve (12) semesters for candidates admitted by Direct Entry."));

    }
}
