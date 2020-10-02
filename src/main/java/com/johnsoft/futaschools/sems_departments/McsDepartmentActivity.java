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

public class McsDepartmentActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_mcs_department);
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
                "WELCOME TO THE DEPARTMENT OF METEOROLOGY AND CLIMATE SCIENCE",
                "The Department offers a full degree in Meteorology at both undergraduate and post-graduate level. Apart from independent (privately-sponsored) students, the department trains Nigerians as well as those from other African countries in applied Meteorology. The Department became a university component of the World Meteorological Organization (WMO) Regional Meteorological Training Centre (RMTC) in June 1994. The WMO has thus been sponsoring foreign students from Ghana, Gambia, Zambia, Tanzania and Sudan to study meteorology (undergraduate and postgraduate) in the Department.\n" +
                        "OUR VISION\n" +
                        "\n" +
                        "to produce well trained personnel in agricultural meteorology, water resources management (hydro-meteorology), the environment (urban climate and pollution) and transport industry (land, water and air) through teaching, learning and research.\n" +
                        "\n" +
                        "The specific objectives of the programme are to:\n" +
                        "train competent and skilled meteorologists for national services such as the Nigerian Meteorological Agency (NIMET) and the Military (especially the Air force and Navy);\n" +
                        "train graduates who are able to offer viable solutions to weather-related problems in agriculture and allied sectors that are crucially required for enhanced and sustainable agricultural production and food security;\n" +
                        "produce graduates who are trained and equipped to assist the government, health institutions, medical and pharmaceutical companies and industries in the effective management of the occurrences of diseases and weather-related epidemics during any period of the year;\n" +
                        "develop useful tools for the socioeconomic needs of the nation in terms of weather forecasting models in aviation, agriculture (onset, cessation and amount of rainfall), climate change, and water resources management systems;\n" +
                        "produce well trained personnel in the areas on which the economy is highly dependent, especially in agricultural meteorology, water resources management (hydro-meteorology), the environment (urban climate and pollution) and transport industry (land, water and air);\n" +
                        "train graduates who are able to effectively employ use of modern ICT facilities and remote sensing systems to advance meteorological research and applications; and\n" +
                        "produce graduates who can pursue effective postgraduate research in all aspects of meteorology."));

        admissionRequirementDetailsList.add(new AdmissionRequirementDetails("Admission Requirement",
                "The Admission to the department is through university Matriculation Examination (UME)and university administered Pre-degree science Programme(PDS)\n" +
                        "\n" +
                        "UME subjectsEnglish,Physics,Mathematics and either Chemistry or Geography\n" +
                        "\n" +
                        "OLevel Requirements\n" +
                        "\n" +
                        "The requirement for admission is 5 credit pass in NECO/WAEC Senior Secondary Certificate including English,Mathematics,Phsics and either Chemistry or Geography at not more than two sittings.\n" +
                        "\n" +
                        "Direct Entry Requirements\n" +
                        "\n" +
                        "All candidates must satisfy olevel requirements and in addition\n" +
                        "\n" +
                        "(i)A-level passes in Physics and Mathematics and either Chemistry or Geography.\n" +
                        "\n" +
                        "(ii)A WMO Class II Certificate\n" +
                        "\n" +
                        "Direct Entry Students are exempted from 100 level courses except the Use of English and Engineering drawing."));

        graduationRequirementDetailsList.add(new GraduationRequirementDetails("Graduation Requirements",
                ""));

        programDurationDetailsList.add(new ProgramDurationDetails("Program Duration",
                "The Department runs a 5-years programme for secondary school leavers and 4-year programme for WMO class II graduates (Weather Forecasters) leading to the award of Bachelor of Technology (B.Tech) in Meteorology.In the third year,students take laboratory and field practical courses(MET 304 and 305) in Dynamics Meteorology and Physical Meteorology.Practical experiments are undertaken in thermometry.radiation studies,turbulence,the development and calibration of simple measuring equipment,etc.four hours are spent every week throughout the session on these coursers.This way,the students are exposed to use and maintenance of research and routine equipment in meteorology.The practical courses are a follow-up of a 200 level course on Instrumentation and Environmental (MET 202).Also during the long vacation after the third year,students undertake 6-week independent field experiments investigating simple problems in practical meteorology outside the university.A report is submitted for grading."));

    }
}
