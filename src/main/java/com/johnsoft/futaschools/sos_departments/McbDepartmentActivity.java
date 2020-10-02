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

public class McbDepartmentActivity extends AppCompatActivity {private Toolbar mToolbar;
    private RecyclerView aboutDepartmentRecycler, admissionRequirementRecycler, gradRequirementRecycler, programDurationRecycler, hodProfileRecycler;
    private List<AboutDepartmentDetails> aboutDepartmentDetailsList = new ArrayList<>();
    private List<AdmissionRequirementDetails> admissionRequirementDetailsList = new ArrayList<>();
    private List<GraduationRequirementDetails> graduationRequirementDetailsList = new ArrayList<>();
    private List<ProgramDurationDetails> programDurationDetailsList = new ArrayList<>();
    private List<HodProfileDetails> hodProfileDetailsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcb_department);
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
                "WELCOME TO THE DEPARTMENT OF MICROBIOLOGY",
                "Department of Microbiology was created from the Department of Biology in April, 2002 where it was a degree option since 1982. The department has been restructured to take care of not only Food and Industrial Microbiology, but also Environmental and Medical Microbiology leading to the award of B.Tech. degree in Microbiology. This degree has remained very popular in the University as most graduates of the programme get placement, in food, medical, pharmaceutical, petroleum, packaging and agro-allied industries. The Department of Microbiology has adequate facilities for postgraduate programmes such as Postgraduate Diploma (PGD), Master of Technology (M.Tech) and Doctor of Philosophy (Ph.D) degrees. Programme Philosophy The major endeavour of the Department is to provide the students with a broad based knowledge of modern theoretical and practical microbiology. The undergraduate programme in Microbiology is designed to train students in Microbiology techniques and to give the basic knowledge of the fundamental of Bacteriology, Mycology and Virology as well as an insight in the specialised and applied area of the subject and their relationship with other disciplines.\n" +
                        "\n" +
                        "width=451\n" +
                        "\n" +
                        "The objectives of the programme are to\n" +
                        "\n" +
                        "i) Expose the students to both pure and applied courses in Microbiology, which satisfy the manpower needs of schools, institutions, industries, and hospitals.\n" +
                        "\n" +
                        "ii) Permit the combination of the study of microbiology with subject such as Agriculture, Biology, Chemistry, Pharmacy and Technology.\n" +
                        "\n" +
                        "iii) Encourage independence and self-confidence in the students so that they can make meaningful contributions in whatever professional activity them may engage in.\n" +
                        "\n" +
                        "iv) Combine theoretical principles with a realistic approach to the problems and needs of a developing country such as Nigeria.\n" +
                        "\n" +
                        "v) Equip graduates with sufficient knowledge to enable them to undertake postgraduate work in Microbiology and related disciplines in Pure and Applied Sciences.\n" +
                        "\n" +
                        "To be eligible for the award of the degree of Bachelor of Technology (B.Tech) Honours in Microbiology under this program, a student must satisfy:\n" +
                        "\n" +
                        "a) the University requirements, including satisfactory completion (pass) of all the GNS (General Studies) courses.\n" +
                        "\n" +
                        "b) The School of Sciences requirements by passing all the foundation courses.\n" +
                        "\n"));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "a. UTME\n" +
                        "\n" +
                        "Candidates seeking admission into 100 level of the Department of Microbiology for the five-year Microbiology programme through Unified Tertiary Matriculation Examination (UTME) must possess WASSCE, G.C.E. (O/L), NECO, NABTEB or equivalent with credit passes in five (5) subjects, which must include English Language, Biology or Agricultural Sciences, Chemistry, Mathematics and Physics at not more than two sittings.\n" +
                        "\n" +
                        "UTME subjects: English Language, Biology, Chemistry and any one of Mathematics or Physics\n" +
                        "\n" +
                        "b. Direct entry\n" +
                        "\n" +
                        "For direct entry admission, the candidate must possess in addition to the requirements specified in (a) above either:\n" +
                        "\n" +
                        "National Diploma (ND) with a minimum grade of Upper Credit in relevant disciplines from a recognized institution.\n" +
                        "At least two subjects at the General Certificate of Education (Advanced Level) (GCE A/L) or equivalent with a minimum of Grade C."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for the award of the degree of Bachelor of Technology (B. Tech.) Honours in Microbiology, student must satisfy the following:\n" +
                        "\n" +
                        "a) the Departmental requirements by passing all the core and elective courses by accumulating a minimum of 204 course units if admitted through the UTME or 157 course units if by direct entry and by making a CGPA of not less than 1.50;\n" +
                        "\n" +
                        "b) the University/School requirements, by passing all GNS and foundation courses approved by the University and the School of Sciences; and\n" +
                        "\n" +
                        "c) other practical requirements such as industrial attachment, field trips, projects and laboratory practical.\n" +
                        "\n" +
                        "Direct entry students are required to audit and pass GNS 101, 102, and 103 as well as MEE 101 and 102. In case the students fail any of these audited courses, they will be required to register for and pass it."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "A student who is admitted into the 100 level through the UTME would under normal circumstances spend   ten  semesters    while     those     admitted    into   200 level    by    Direct Entry    would\n" +
                        "\n" +
                        "spend eight semesters. However, student who fails to graduate within the normal number of academic sessions will not be allowed to exceed a total of fifteen semesters if admitted through the UTME and thirteen semesters if by Direct Entry."));
    }
}