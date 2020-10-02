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

public class BioDepartmentActivity extends AppCompatActivity {private Toolbar mToolbar;
    private RecyclerView aboutDepartmentRecycler, admissionRequirementRecycler, gradRequirementRecycler, programDurationRecycler, hodProfileRecycler;
    private List<AboutDepartmentDetails> aboutDepartmentDetailsList = new ArrayList<>();
    private List<AdmissionRequirementDetails> admissionRequirementDetailsList = new ArrayList<>();
    private List<GraduationRequirementDetails> graduationRequirementDetailsList = new ArrayList<>();
    private List<ProgramDurationDetails> programDurationDetailsList = new ArrayList<>();
    private List<HodProfileDetails> hodProfileDetailsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_department);
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
                "WELCOME TO THE DEPARTMENT OF BIOLOGY ",
                "The philosophy of the Department of Biology is to train and encourage scientists in areas of Storage Technology, realising that training of scientists is the bedrock of technological development and national growth. The Programme prepares its graduates for employment in any of the disciplines of biology and related fields.\n" +
                        "\n" +
                        "\n" +
                        "OBJECTIVES OF THE DEPARTMENT\n" +
                        "\n" +
                        "The objectives of the department are to:\n" +
                        "\n" +
                        "(a) train skilled manpower using model curriculum in Storage Technology with courses in Biology designed in such a way that students shall receive thorough grounding in modern descriptive and experimental biology.\n" +
                        "\n" +
                        "(b) take cognisance of the overall academic objectives of the Federal University of Technology, Akure which is a result and mission-oriented education to meet the technological needs of the country.\n" +
                        "\n" +
                        "(c) ensure the high quality and marketability of our students.\n" +
                        "\n" +
                        "(d) train personnel who will be involved in minimizing post-harvest losses (of food, wood and leather products) in the agricultural sector and post-production loses in the industrial sector of the nation’s economy.\n" +
                        "\n" +
                        "(e) qualify under graduates for rewarding careers in food and beverage industries, breweries, higher education, timber and leather industries, business and commerce.\n" +
                        "\n" +
                        "(f) train undergraduates to establish small scale stored products factories.\n" +
                        "\n" +
                        "(g) train undergraduate to work as consultants in charge of controlling household and stored products pests.\n" +
                        "\n" +
                        "(h) enable students gain knowledge in effective storage of raw and processed food and non-food products through improved pest management strategies.\n" +
                        "\n" +
                        "(i) train undergraduates to supervise and maintain the keeping quality of raw processed products for use in industries."));

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
                "To be eligible for the award of B.Tech Biology (Storage Technology)a student must have:\n" +
                        "\n" +
                        "(a) passed all core (compulsory) courses as well as all University and school required courses and electives recommended for specialization.\n" +
                        "\n" +
                        "(b) accumulated at least 200 course units and obtained a CGPA of not less than 1.00 and\n" +
                        "\n" +
                        "(c) complete successfully all class work, industrial attachment, seminars and projects."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "A student who is admitted into the 100L should under normal circumstances spend five academic sessions while those admitted into 200L shall spend four academic sessions to obtain the bachelor degree. However, if the student fails to graduate within the normal number of sessions, he/she will not be allowed to exceed a total of seven academic sessions."));
    }
}