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

public class EsmDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_esm_department);
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
                "WELCOME TO THE DEPARTMENT OF ESTATE MANAGEMENT",
                "The Department is established to produce competent estate surveyors and valuers with sufficient technical knowledge and skill to optimize the use of land resources in both government and private sectors of the economy and also to produce practitioners that have entrepreneurial skills of value who can be gainfully employed in the real estate industry.\n" +
                        "\n" +
                        "PROGRAMME OBJECTIVES\n" +
                        "\n" +
                        "The objectives of the programmes are to:\n" +
                        "\n" +
                        "a) provide a broad and balanced foundation of the knowledge of land and building for their exploitation and use.\n" +
                        "\n" +
                        "b) develop in the students the ability to apply analytical skills to the solution of theorectical and practical land resources problems.\n" +
                        "\n" +
                        "c) produce graduates that have entrepreneurial skills of value for self-employment in the profession and,\n" +
                        "\n" +
                        "d) lay the foundation on which students can proceed to further studies in specialized aspects of estate surveying practice or multi-disciplinary areas involving estate surverying and valuation."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "(a) UTME Admission\n" +
                        "\n" +
                        "The entry requirements for the five year programme are five credits in WASSCE or NECO or GCE (O/L) or equivalent at not more than two sittings. The credits should be in the following subjects: English Language, Mathematics, Economics, and two others from Geography, Chemistry, Agricultural Science/Biology, Government or History and Technical Drawing. Candidate is expected to have at least a pass in Physics.\n" +
                        "\n" +
                        "UTME subjects\n" +
                        "\n" +
                        "English Language, Mathematics, Economic and any other subject from the above list.\n" +
                        "\n" +
                        "(b) DIRECT ENTRY Admission\n" +
                        "\n" +
                        "Candidates may be admitted to the 200 level of the programme if they have any of the following in addition to the UTME requirements specified in A. above:\n" +
                        "\n" +
                        "1. Advanced Level passes in Economics and at least, any one of Mathematics, Geography, Biology or Chemistry; or\n" +
                        "\n" +
                        "2. OND in Estate Management or any field relevant to Environmental Planning, Design and Management with at least Upper Credit; or\n" +
                        "\n" +
                        "3. Any other equivalent qualifications"));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "For a student to be eligible for the award of Bachelor of Technology in Estate Management,he or she must have:\n" +
                        "\n" +
                        "i. passed all departmental compulsory or core courses, University and School required courses and electives.\n" +
                        "\n" +
                        "ii. successfully completed the six months industrial attachment at an institution recognized by the Estate Surveryors and Valuers Registration Board of Nigeria;and\n" +
                        "\n" +
                        "iii. accumulated a minimum of 200 units if he/she was admitted through UME or 159 units if by direct entry and made a CGPA of not less than 1.00\n" +
                        "\n" +
                        "All Direct entry students must audit and pass GNS 101,102 and 103 as well as MEE 101 and 102.In addition,those who are admitted with other qualifications different from estate management are also to audit and pass ESM 101 and 102."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "Students admitted through UME are expected to spend a minimum of five (5) academic sessions and in case of failure to attain this, the student shall not exceed seven(7) academic sessions. Students admitted through direct entry are expected to spend a minumum of four(4) academic sessions and a maximum of six(6) academic sessions."));
    }
}