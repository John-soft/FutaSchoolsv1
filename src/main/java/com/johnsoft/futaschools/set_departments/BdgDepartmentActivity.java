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

public class BdgDepartmentActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_bdg_department);
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
                "WELCOME TO THE DEPARTMENT OF BUILDING",
                "The department kicked off in 2011 as part of the school of environmental Technology’s effort in expanding its domain and strengthening the nations’ building industry by training professional builders who will forever change the face of building in the nation. The department has been nothing but success stories since its inception with great researches and programmes cutting across both undergraduate and postgraduate levels.\n" +
                        "\n" +
                        "PROGRAMME PHILOSOPHY\n" +
                        "\n" +
                        "The overall philosophy of the programme is to provide a broadly-based education and training at honours degree level with the aim of preparing the students to meet the growing complexity of building and construction processes in a changing and demanding technological and global environment. The programme is therefore designed to develop skills of communication, organization decision-making and technological advancement by employing the knowledge gained from various construction and management techniques to develop and advance the science and practice of building technology, construction management, building services and building maintenance for the development of the built environment.\n" +
                        "\n" +
                        "PROGRAMME OBJECTIVES\n" +
                        "\n" +
                        "Based on the foregoing programme philosophy, the major objectives of the department, among others, are to:\n" +
                        "\n" +
                        "(a) Produce graduates with strong competence in the science, technology and management of the building process and with generalized knowledge of other professions in the building and allied professions in order to be able to relate effectively well in the building delivery process;\n" +
                        "\n" +
                        "(b) Develop graduates with creative abilities which can be channeled to improve the quality of the built environment by making it safe, healthy, comfortable, durable but inexpensive to construct and easy to manage and maintain;\n" +
                        "\n" +
                        "(c) Produce graduates with little or no further training upon engagement by employer and who can also be readily admitted and registered by the Nigerian Institute of Building (NIOB) and Council of Registered Builders of Nigeria (CORBON) and other allied professional bodies;\n" +
                        "\n" +
                        "(d) Produce graduates who will ultimately be able to perform and function as contract manager, project management consultants, designers of building structures, maintenance managers, premises managers, facilities managers, building services experts, estimators, building officers, site agents and contractors; and\n" +
                        "\n" +
                        "(e) Produce graduates who can advance postgraduate research in all aspects of building."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "(1) UTME Candidate\n" +
                        "\n" +
                        "UTME Admission Candidate seeking admission shall be through Unified Tertiary Matriculation Examination (UTME) administered by the Joint Admissions and Matriculations Board (JAMB) and shall possess five (5) credits at the WASCE or GCE ‘O’ level or equivalent at not more than two (2) sittings including English language, Mathematics, Physics and Chemistry with one from the following: Economics, Geography, Further Mathematics, Technical Drawing and Building Construction. UTME Subjects: English language, Mathematics, Physics and Chemistry\n" +
                        "\n" +
                        "(2) Direct Entry Candidates\n" +
                        "\n" +
                        "In addition to the requirements specified for UTME above, Direct entry candidates shall possess any of the following:\n" +
                        "\n" +
                        "(a) National Diploma with a minimum of Upper Credit in any of Building, Quantity Surveying, Architecture or Civil Engineering; or other relevant fields in Environmental Design and Management.\n" +
                        "\n" +
                        "(b) Advanced level pass at not less than credit level in Cambridge International Examination (CIE), Interim Joint Matriculation Board (IJMB) examination, Joint Universities Preliminary Examination Board (JUPEB) examination or its equivalent in at least two of the following: Mathematics, Physics, Chemistry, Geography and Economics"));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "To be eligible for the award of B.Tech. Building, a student must have:\n" +
                        "\n" +
                        "a) passed all core courses, all University and School required courses as well as any electives taken.\n" +
                        "\n" +
                        "b) accumulated at least 203 course units if he was admitted through UTME and 161 units if admitted through direct entry and obtained a CGPA of not less than 1.50; and\n" +
                        "\n" +
                        "c) successfully completed the 6 months industrial attachment, seminars and final year dissertation/project Direct entry students are to note that they are expected to audit and pass the following courses: GNS 101, GNS 102, GNS 103, MEE 101 and MEE 102. If any student fails any of the courses, he/she will be required to formally offer it again"));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The duration of the programme is ten (10) semesters for students admitted through the UTME and eight (8) semesters for direct entry students. In case a student fails to meet the normal academic sessions for graduation, he/she shall not be allowed to exceed a total of fifteen (15) semesters for students admitted through the UTME and thirteen semesters (13) for students admitted through direct entry. If a student exceeds the permissible number of semesters as stated above, he/she shall not be awarded any certificate."));

    }
}