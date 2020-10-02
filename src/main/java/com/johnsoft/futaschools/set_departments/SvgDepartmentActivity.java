package com.johnsoft.futaschools.set_departments;

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

public class SvgDepartmentActivity extends AppCompatActivity {private Toolbar mToolbar;
    private RecyclerView aboutDepartmentRecycler, admissionRequirementRecycler, gradRequirementRecycler, programDurationRecycler, hodProfileRecycler;
    private List<AboutDepartmentDetails> aboutDepartmentDetailsList = new ArrayList<>();
    private List<AdmissionRequirementDetails> admissionRequirementDetailsList = new ArrayList<>();
    private List<GraduationRequirementDetails> graduationRequirementDetailsList = new ArrayList<>();
    private List<ProgramDurationDetails> programDurationDetailsList = new ArrayList<>();
    private List<HodProfileDetails> hodProfileDetailsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_svg_department);
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
                "WELCOME TO THE DEPARTMENT OF SURVEYING AND GEO-INFORMATICS",
                "Bachelor of Technology in Surveying and Geoinformatics(B. Tech. Surveying and Geoinformatics)\n" +
                        "\n" +
                        "The philosophy that guides this programme is the production of skilled manpower that is adequately trained and furnished with comprehensive information required to be self-reliant in spatial data handling. Such manpower must be produced in an atmosphere with the appropriate human and material resources through the adoption of effective techniques of instruction and exposure to the actual practice of Surveying and Geoinformatics. The goal of this programme is to develop a pool of competent graduates and professionals capable of providing geospatial information necessary for the exploration, exploitation and management of our environmental resources. The graduates produced can be gainfully employed in Federal and State parastatals, Tertiary Institutions, Exploration Companies, Private Survey firms etc.\n" +
                        "\n" +
                        "Specific objectives are to:\n" +
                        "\n" +
                        "(a) train students to have a broad and balanced information in the theoretical and practical skills in the field of Surveying and Geoinformatics;\n" +
                        "\n" +
                        "(b) turn out professionally registrable graduates of Surveying and Geoinformatics capable of understanding and implementing geospatial policy matters at local and national levels;\n" +
                        "\n" +
                        "(c) produce graduates who can understand and articulate the roles of geospatial data products and services in relation to social and economic development issues; and\n" +
                        "\n" +
                        "(d) offer appropriate service courses to other programmes in the University."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "a. UTME\n" +
                        "\n" +
                        "Admission into the first year (100 level) of the programme is through the UTME of the Joint Admission and Matriculation Board (JAMB). To be eligible for admission, candidates must have minimum of five (5) credits in WASSCE or NECO or GCE ordinary level or equivalent at maximum of two (2) sittings in the following subjects: Mathematics, Physics, English Language and any two (2) of Geography, Elementary Surveying, Technical Drawing, Chemistry, Economics, Fine Art, Biology/Agricultural Science.\n" +
                        "\n" +
                        "UTME Subjects:\n" +
                        "\n" +
                        "English Language, Mathematics, Physics and either Chemistry or Geography.\n" +
                        "\n" +
                        "b. DIRECT ENTRY I\n" +
                        "\n" +
                        "In addition to the requirements specified in (a) above, candidates seeking admission into the second year (200 level) of the programme must possess:\n" +
                        "\n" +
                        "(i) National Diploma in Surveying and Geoinformatics or any other related field with a minimum of Upper credit or equivalent from an NBTE-accredited programme of a Monotechnic or Polytechnic or College of Technology; or\n" +
                        "\n" +
                        "(ii) General Certificate Examination (GCE) advanced level or its equivalent with a minimum of credit in at least two subjects which must include Mathematics and Physics.\n" +
                        "\n" +
                        "c. DIRECT ENTRY II\n" +
                        "\n" +
                        "In addition to the requirements specified in (b) above, candidates seeking admission into the third year (300 level) of the programme must possess:\n" +
                        "\n" +
                        "(i) Higher National Diploma in Surveying and Geoinformatics or equivalent with a minimum of Upper credit from the NBTE-accredited programme of a Monotechnic or Polytechnic or College of Technology.\n" +
                        "\n" +
                        "(ii) mandatory NYSC Service or Exemption Certificate"));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for the B. Tech. Surveying and Geoinformatics of the Federal University of Technology, Akure, a student must have:\n" +
                        "\n" +
                        "a. passed all prescribed core courses, University and School required courses as well as elective courses recommended for specialization;\n" +
                        "b. completed a minimum of 196 units for candidates admitted through UTME, 156 units for candidates admitted through Direct Entry I, 119 units for candidates admitted for Direct Entry II and a CGPA of not less than 1.50; and\n" +
                        "c. completed successfully industrial attachment, laboratory practicals, field practicals, field trip, camping exercise and projects.\n" +
                        "NOTE: (i) Direct Entry I students are expected to offer and pass GNS 106 as a credit unit\n" +
                        "\n" +
                        "course. Also, they are to audit and pass GNS 101, 102,103 and MEE 101 and 102;\n" +
                        "\n" +
                        "and if they fail the audited courses at first attempt, they must offer them formally as\n" +
                        "\n" +
                        "credit unit courses.\n" +
                        "\n" +
                        "(ii) Direct Entry II students are expected to offer and pass GNS 106, GNS 203,\n" +
                        "\n" +
                        "CSP 201, CSP 210 as credit unit courses. In addition, they are to audit and pass GNS\n" +
                        "\n" +
                        "101, 102, 103 and MEE 101 and 102; and if they fail the audited courses at first\n" +
                        "\n" +
                        "attempt, they must offer them formally as credit unit courses."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The normal duration of the program is ten (10) semesters for students admitted through the UTME, eight (8) semesters for Direct Entry I and (6) semesters for Direct Entry II students. Any student that fails to graduate at the end of the normal duration will not be allowed to exceed a total of fifteen (15) semesters in the case of UTME students, thirteen (13) semesters in the case of Direct Entry I and eleven (11) semesters for Direct Entry II students."));
    }
}