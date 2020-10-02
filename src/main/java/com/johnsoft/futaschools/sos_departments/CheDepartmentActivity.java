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

public class CheDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_che_department);
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
                "WELCOME TO THE DEPARTMENT OF CHEMISTRY",
                "Chemistry Department is one of the pioneering departments of the university. The Department was established to give prominent scientific training and provide the much – needed impetus to rapid industrial chemistry. The programme is expected to emphasize on the practical aspects of Industrial Chemistry with the aim of proffering solutions to problems encountered in manufacturing and service industries. Currently, the departmental undergraduate academic programmes are organized under B. Tech (Industrial Chemistry) with emphasis on the following specializations; dye and textile , food, polymer and plastic, wood, pulp and paper, instrumentation and chemical analysis, petroleum and mineral processing chemistry.\n" +
                        "\n" +
                        "The department undertakes courses leading to the award of Bachelor of Technology (B. Tech.), Masters of Technology (M.Tech) in Analytical Chemistry and M.Tech in Industrial Chemistry, Professional Master of Technology in Environmental Chemistry, Master of philosophy (M. Phil.) and Doctor of Philosophy in any field of Chemistry. However, the M.Tech. in Environmental Chemistry and Master of Philosophy programmes are the newly proposed initiatives. The department is well equipped with both academic and technological manpower to undertake these programmes. The products of the department are most sought after by reputable employers nationwide.\n" +
                        "\n" +
                        "Our department also has a well-equiped scientific glass-blowing workshop where various laboratory glasswares are fabricated and repaired.\n" +
                        "\n" +
                        "The graduates of this programme with adequate training in industrial chemistry can thus be employed in manufacturing and service industries, teaching and research institutions, military, banks government ministries and parastatals and can be self employed.\n" +
                        "\n" +
                        "OBJECTIVES\n" +
                        "\n" +
                        "At the end of the course, the graduates would have understood the fundamental principles of the subject, acquired a broad based knowledge of the practical and applied chemistry, to be able to;\n" +
                        "\n" +
                        "(a) organize and supervise the production and quality control units in chemical and allied industries;\n" +
                        "\n" +
                        "(b) collect and carry out chemical analysis of samples and make recommendations from the data.\n" +
                        "\n" +
                        "(c) handle some aspects of design and maintenance of equipment as well as the construction of simple laboratory apparatus;\n" +
                        "\n" +
                        "(d) undertake general supervisory / managerial function in chemical and allied  industries; and\n" +
                        "\n" +
                        "(e) establish a basis for the development of research on specialized area of applied chemistry."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "a.     UME admission.\n" +
                        "\n" +
                        "Candidates seeking admission into this programme must have credits in five subjects at GCE O level or WASSCE or NECO or equivalent at not more than one sittings. The five subjects should include English Language, Mathematics, Chemistry, Physics and Biology/Agricultural Science.\n" +
                        "\n" +
                        "UME subjects: English Language, Chemistry, Mathematics and Physics.\n" +
                        "\n" +
                        "b. Direct entry.\n" +
                        "\n" +
                        "Direct entry candidates must fulfil the conditions in (a) above and a minimum of upper Credit at the ND or equivalent in Science Laboratory Technology, Science Technology , Food Science and Technology or Textile Technology to qualify for admission into 200L of the programme. Also, candidates with GCE A Level passes in at least two subjects which must include Chemistry and any one of Physics, Mathematics and Biology are eligible for admission."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for the award of B.Tech, in Industrial Chemistry, a student must have:\n" +
                        "\n" +
                        "(a)  passed all the core courses, university/school required courses and electives;\n" +
                        "\n" +
                        "(b) accumulated a minimum of 183 course units for student admitted through UME and 142 for students admitted through direct entry ; and\n" +
                        "\n" +
                        "(c)  attained a minimum CGPA of 1.0.\n" +
                        "\n" +
                        "     However, the Direct Entry student are expected to audit some 100-levels courses of the the university such as MEE 101, MEE 102, GNS 101, GNS 102, GNS 103. These courses must however be passed at first sitting."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The duration of the programme is five academic sessions for UME, but for the direct entry students it is four. if a student fails to graduate within the stipulated academic sessions, he or she will not be allowed to exceed a total of seven academic sessions in the case of UME students and six (6) in the case of direct entry."));
    }
}