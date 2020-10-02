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

public class MstDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_mst_department);
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
                "WELCOME TO THE DEPARTMENT OF MARINE SCIENCE AND TECHNOLOGY",
                "The Department of Marine Science & Technology was approved as an academic Department of the University by National University Commission in 2009 as part of the School of Earth and Mineral Sciences. The foundation Head of Department, Dr Y. A. Asiwaju-Bello, FNMGS, was appointed immediately to midwife the successful take-off of the Department. The first set of students, made up of 10 males and 1 female, was admitted through UTME into 100-level Bachelor of Technology programme in October 2010. In the subsequent 2011/2012 session, 2 direct entry students were admitted into 200-level to raise the number at that level to 13. Fifty-eight students, made up of 55 males and 3 females, were admitted into the 100-level that session to constitute the second set. Since inception, there had been overwhelming number of enquiries from would-be students about admission into the Department. This confirms the high level of popularity of the programme among applicants.\n" +
                        "\n" +
                        "The Department has secured the goodwill of the management of Ondo State Sports Council for the use of 100-meter long State-owned swimming to train our 100-level students. We have also established a working relationship with Nigerian Meteorological Agency (NIMET) for joint usage of NIMET Marine Observatory yard at Aiyetoro, Ondo State. Possible areas of cooperation are being worked out with National Institute for Oceanography & Marine Research (NIOMR), Victoria Island, Lagos.\n" +
                        "\n" +
                        "The Department is into negotiation with some overseas Universities and international agencies for cooperation on areas of training and joint usage of marine facilities.\n" +
                        "\n" +
                        "Programme’s Objective\n" +
                        "\n" +
                        "To use a multi-disciplinary approach to impart basic and fundamental knowledge of marine science.\n" +
                        "\n" +
                        "To train students with the capability to explore and exploit the marine environment; and\n" +
                        "\n" +
                        "To equip the students with result–oriented research capability for industrial, technological and academic development of the country.\n" +
                        "\n"));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "Admission into the Department is only for candidates that are physically and medically fit and is through JAMB U.M.E. and Direct Entry.\n" +
                        "\n" +
                        "FOR U.M.E. APPLICANTS\n" +
                        "\n" +
                        "Admission through U.M.E. takes the student to 100 Level. To be eligible for admission, candidate is expected to pass both the U.M.E. and the University screening test. The candidate must have in addition a minimum of credit pass in five subjects at not more than two sittings in SSCE, NECO or GCE (Ordinary Level). The credit passes are required in the following subjects: English Language, Mathematics, Chemistry, Physics and Biology. The U.M.E. subjects are: English Language, Physics, Mathematics and Chemistry.\n" +
                        "\n" +
                        "FOR DIRECT ENTRY APPLICANTS\n" +
                        "\n" +
                        "Admission by direct entry is into second year (200 level) of the programme. In addition to the Senior School Certificate requirements for U.M.E. admission, eligible student for direct entry should further possess National Diploma (ND) at a minimum of Upper Credit level in Oceanography, Mineral Exploration, Mineral Resources Engineering, Geology, Geophysics, Meteorology, Marine Biology and Science Technology from any recognized institution or good passes at GCE (advanced level) at one sitting in at least two of the following subjects: Physics, Mathematics and Chemistry."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                "The minimum number of Units required for graduation and for completion of Class of Degree is 202 Units for students admitted through UME and 158 Units for those admitted through Direct Entry."));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The B.Tech.(Marine Science& Technology)programme is designed for five academic sessions for candidates who gained admission into the University through U.M.E. However, Direct Entry candidates are expected to spend Four Academic Sessions in the programme. The first two sessions of the programme are devoted to grounding the students in basic sciences and introducing them to various aspects of Life and Earth Sciences, such as Ecology, Meteorology and Geology, which are relevant to the programme. The following two sessions will expose the students to the core courses in Marine Science and Technology including six months Industrial Experience Scheme (SIWES). There will also be a lot of opportunities to learn practical skills during the long vacation field work and during SIWES. The last year of the programme will be focused on a range of courses which are designed to provide detailed specialist knowledge of strategies for monitoring and managing the marine environment. The degree programme culminates in an original and supervised independent research project."));
    }
}
