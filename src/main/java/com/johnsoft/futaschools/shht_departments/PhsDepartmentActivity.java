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

public class PhsDepartmentActivity extends AppCompatActivity {private Toolbar mToolbar;
    private RecyclerView aboutDepartmentRecycler, admissionRequirementRecycler, gradRequirementRecycler, programDurationRecycler, hodProfileRecycler;
    private List<AboutDepartmentDetails> aboutDepartmentDetailsList = new ArrayList<>();
    private List<AdmissionRequirementDetails> admissionRequirementDetailsList = new ArrayList<>();
    private List<GraduationRequirementDetails> graduationRequirementDetailsList = new ArrayList<>();
    private List<ProgramDurationDetails> programDurationDetailsList = new ArrayList<>();
    private List<HodProfileDetails> hodProfileDetailsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phs_department);
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
                "WELCOME TO THE DEPARTMENT OF PHYSIOLOGY",
                "The BSc. Physiology programme involves a well-rounded training in the fundamentals of normal functioning of the human body systems in a milieu of interdisciplinary and interdependency of biomedical sciences. The theoretical and practical inter-relativity of the course is interwoven with other biomedical sciences. Ithas been well emphasized in order to produce graduates that can stand shoulder to shoulder with local and international contemporaries.\n" +
                        "\n" +
                        "The students will receive up to date training in theoretical, practical and applied physiology to make them suitable to utilize the basic knowledge for future problem solving and other applications in the practice of medicine, nursing, pharmacy, physiotherapy among others. The graduates should also be able to function as entrepreneur whether in public service or self-employed.\n" +
                        "\n" +
                        "Students will undergo intense training in Cardiovascular, Gastrointestinal, Endocrine, Respiratory, Neurologic, Renal and Cutaneous physiology, and relevant areas of anatomy and biochemistry. Other areas to be taught include Human Genetics, Embryology, Psychology, Comparative physiology, Exercise physiology, Immuno-physiology, aviation physiology, in addition to practical laboratory skills and experimentation.\n" +
                        "\n" +
                        "At the end of their training, graduates of the programme will be conversant and comfortable in applying the acquired knowledge in their field to participate and conduct elegant research in physiology towards solving the various pathological problems when the human physiology is altered.\n" +
                        "\n" +
                        "4. PROGRAMME OBJECTIVES\n" +
                        "The programme will be sufficiently broad-based to lead to the production of graduates who will be able to perform the following functions:\n" +
                        "\n" +
                        "(i) To train students to acquire basic knowledge of physiological principles;\n" +
                        "\n" +
                        "(ii) To provide a basis for understanding the physiology and biochemistry of model\n" +
                        "\n" +
                        "(iii) Systems that can be used for studying the reciprocal effects of humans and their environment as well as the effect of toxicants on them.\n" +
                        "\n" +
                        "(iv) To train students to acquire sufficient practical knowledge and skills in experimental physiology;\n" +
                        "\n" +
                        "(iv) To train students to have knowledge of applied physiology as used in medicine, pharmacy, nursing, veterinary medicine, medical and dental sciences;\n" +
                        "\n" +
                        "(v) To educate students who will be able to apply physiology knowledge to real life situations;\n" +
                        "\n" +
                        "(vi) To equip students in physiological knowledge sufficient for them to proceed for further studies in related fields of specialization; and\n" +
                        "\n" +
                        "(vii) To produce graduates who can adapt to various life situations."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "(a) UME Admission\n" +
                        "Admission to 100 Level is through the UME of the Joint Admission and Matriculation Board. To be eligible for admission, candidates MUST have the GCE (OL) or WASSCE or NECO or equivalent with at least five credit passes in subjects which include Mathematics, English Language, Physics, Chemistry and Biology at NOT more than two (2) sittings.\n" +
                        "U.M.E. Subjects: Mathematics, English Language, Biology and Chemistry or Physics.\n" +
                        "(b) Direct Entry Admission\n" +
                        "In addition to the requirements specified in SECTION 5(a) above, candidates seeking admission to 200 Level MUST possess:\n" +
                        "National Diploma (ND) with a minimum of Upper Credit Level or its equivalent in Physiology or related discipline, OR\n" +
                        "Good passes at the Advanced Level of General Certificate of Education or its equivalent in Mathematics, Biology and Chemistry or Physics."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for a B. Tech. degree in Physiology of the Federal University of Technology, Akure, a candidate must:\n" +
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
