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

public class EeeDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_eee_department);

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
                "WELCOME TO THE DEPARTMENT OF ELECTRICAL AND ELECTRONICS ENGINEERING",
                "\n" +
                        "The objectives of the programme are to:\n" +
                        "\n" +
                        "(a)give students basic knowledge in Electrical and Electonics Engineering;\n" +
                        "\n" +
                        "(b)provide sufficient depth of knowledge to enable promising graduates of the Department pursue postgraduate programmes in the Electrical and Electronics Engineering or related disciplines;and\n" +
                        "\n" +
                        "(c)prepare graduates for employment in the industry(public and private)in the areas of electric power,electronics,communications,and computer engineering."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "(a)UME Admission\n" +
                        "\n" +
                        "Admission to 100 level is through the UME of the joint Admission Matriculation Board.To be eligible for admission,candidate must have the GCE(OL)or WASSCE or NECO or equivalent with at least five credit passes in subjects which include English Language,Mathematics,Physics, and Chemistry at NOT more than two(2)sittings.\n" +
                        "\n" +
                        "U.M.E.Subjects;EnglishLanguage,Chemistry,Mathematics and Physics.\n" +
                        "\n" +
                        "(b)Direct Entry Admission\n" +
                        "\n" +
                        "In addition to the requirements specified in (a)above,candidates seeking admission to the 200 level must possess:\n" +
                        "\n" +
                        "(i)ND with a minimum of upper credit level or its equivalent in Electrical and Electronics Engineering or related discipline,OR\n" +
                        "\n" +
                        "Good passes at the Advanced level of General Certificate of Education or its equivalent in chemistry,physics and Mathematics."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for a B.Eng degree in Electrical anad Electronics Engineering of The Federal University of Technology,Akure,a candidate must:\n" +
                        "\n" +
                        "(a)pass all prescribed core courses,school and university required courses as well as electives;and\n" +
                        "\n" +
                        "(b)complete successfully a minimum of 205 units for candidates admitted through UME and 162 units for candidates admitted through Direct Entry.\n" +
                        "\n" +
                        "(c)complete successfully all prescribed industrial attachments,projects and seminars.\n" +
                        "\n" +
                        "Students admitted by Direct Entry must audit and pass GNS101,102,and 103,and MEE 101 and 102.In the event of failure of these courses,they will then offer them formally."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The normal duration of the programme is five academic sessions for students admitted to 100 level through the UME and four academic sessions for those admitted into 200 level by Direct Entry. Students that fail to graduate at the end of normal academic sessions shall not be allowed to exceed a total of 15 semesters in the case of UME students and 12 semesters in the case of Direct Entry students."));

        hodProfileDetailsList.add(new HodProfileDetails("Hod's Profile",
                ""));

    }
}
