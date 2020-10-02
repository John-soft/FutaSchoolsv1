package com.johnsoft.futaschools.sems_departments;

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

public class AgyDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_agy_department);
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
                "WELCOME TO THE DEPARTMENT OF APPLIED GEOLOGY",
                "You are welcome to the web page for the Department of Applied Geology (AGY), School of Earth and Mineral Sciences (SEMS), The Federal University of Technology, Akure.\n" +
                        "\n" +
                        "WELCOME MESSAGE FROM THE HEAD OF DEPARTMENT\n" +
                        "\n" +
                        "I particularly welcome you all to the Department of Applied Geology, a dynamic department in the School of Earth and Mineral Sciences (SEMS), in the Federal University of Technology, Akure. The University is situated in the ancient city of Akure, Southwestern Nigeria.\n" +
                        "\n" +
                        "The Department of Applied Geology was created in 1982 as part of the erstwhile School of Earth and Mineral Sciences (SEMS). It is a rare privilege to be the driving wheel of the nations socio-economic development. We have enriching teaching and research activities in all our thriving academic programmes for all qualified students.\n" +
                        "\n" +
                        "We encourage applications from qualified, intrested and talented students on our international programmes. Contact Us through the adress below.\n" +
                        "\n" +
                        "TO OUR PROSPECTIVE STUDENTS\n" +
                        "\n" +
                        "All prospective (national and international) students are enjoined to visit our under-graduate and post-graduate pages for more information on our thriving academic programmes at all levels. Our research activities are interdisciplary and interesting.\n" +
                        "\n" +
                        "If fulfilment is your goal, then you need to consider sending in your application right away for the next admission opportunity.\n" +
                        "\n" +
                        "We look forward to meeting with you soonest.\n" +
                        "\n" +
                        "Contact Us\n" +
                        "\n" +
                        "Department of Applied Geology\n" +
                        "\n" +
                        "Federal University of Technology\n" +
                        "\n" +
                        "P.M.B. 704, Akure\n" +
                        "\n" +
                        "Ondo State Nigeria\n" +
                        "\n" +
                        "West Africa\n" +
                        "\n" +
                        "agy@futa.edu.ng"));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "a). UME\n" +
                        "\n" +
                        "Admission into the first year (100 level) of the programme is through JAMB. To be eligible for admission, candidates are expected to take and pass the U.M.E. examination. They must have, in addition, a minimum of credit pass in five subjects at not more than of two sittings in WASSCE, NECO, GCE ‘O’-level or its equivalent. The credits are required in Chemistry, Mathematics, Physics and English Language. Credit is also required in Biology or Agric. Science or Geography.\n" +
                        "\n" +
                        "U.M.E. subjects: English language, Chemistry, Mathematics and Physics or Biology.\n" +
                        "\n" +
                        "b). Direct Entry\n" +
                        "\n" +
                        "Students may be admitted into the second year (200 level) of the programme through direct entry if they have National Diploma or its equivalent in Geology, Mineral Resources, or Mining Engineering with a minimum of upper credit from recognized Polytechnics and Colleges of Technology or A level passes or its equivalent in at least two science subjects including Chemistry and Mathematics. Eligible candidates must also possess the requirements for U.M.E admission specified in “a” above."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "For a student to be eligible for the award of Bachelor of Technology degree in Applied Geology, he/she must have\n" +
                        "\n" +
                        "(a) passed all departmental compulsory or core courses, University/School required courses and\n" +
                        "\n" +
                        "electives;\n" +
                        "\n" +
                        "(b) completed successfully all industrial attachment training, geological field training and project; and\n" +
                        "\n" +
                        "(c) accumulated a minimum of 200 units if he/she was admitted through UME or 158 units if by direct\n" +
                        "\n" +
                        "entry and made a CGPA of not less than 1.00.\n" +
                        "\n" +
                        "Direct entry students must audit and pass GNS 101, 102 and 103 as well as MEE 101 and 102. They must also offer and pass GNS 106 and AGY 101."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "\n" +
                        "The B.Tech. (Applied Geology) programme is primarily designed for five academic sessions for candidates who enter the University through the UME. However, direct entry candidates are permitted to spend four academic sessions in the programme. In the event that a student is unable to complete his/her course during the normal period, he/she will not be allowed to exceed a maximum of seven academic sessions if admitted through UME or six academic sessions if the admission was through direct entry."));
    }
}
