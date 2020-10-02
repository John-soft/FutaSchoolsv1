package com.johnsoft.futaschools.recycler;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.johnsoft.futaschools.saat_departments.AecDepartmentActivity;
import com.johnsoft.futaschools.saat_departments.AphDepartmentActivity;
import com.johnsoft.futaschools.saat_departments.AreDepartmentActivity;
import com.johnsoft.futaschools.saat_departments.CspDepartmentActivity;
import com.johnsoft.futaschools.saat_departments.EwmDepartmentActivity;
import com.johnsoft.futaschools.saat_departments.FatDepartmentActivity;
import com.johnsoft.futaschools.saat_departments.FstDepartmentActivity;
import com.johnsoft.futaschools.saat_departments.FwtDepartmentActivity;
import com.johnsoft.futaschools.seet_departments.AgeDepartmentActivity;
import com.johnsoft.futaschools.seet_departments.CpeDepartmentActivity;
import com.johnsoft.futaschools.seet_departments.CveDepartmentActivity;
import com.johnsoft.futaschools.seet_departments.EeeDepartmentActivity;
import com.johnsoft.futaschools.seet_departments.IctDepartmentActivity;
import com.johnsoft.futaschools.seet_departments.IpeDepartmentActivity;
import com.johnsoft.futaschools.seet_departments.MeeDepartmentActivity;
import com.johnsoft.futaschools.seet_departments.MmeDepartmentActivity;
import com.johnsoft.futaschools.seet_departments.MneDepartmentActivity;
import com.johnsoft.futaschools.model.DeptInfo;
import com.johnsoft.futaschools.R;
import com.johnsoft.futaschools.sems_departments.AgpDepartmentActivity;
import com.johnsoft.futaschools.sems_departments.AgyDepartmentActivity;
import com.johnsoft.futaschools.sems_departments.McsDepartmentActivity;
import com.johnsoft.futaschools.sems_departments.MstDepartmentActivity;
import com.johnsoft.futaschools.sems_departments.RsgDepartmentActivity;
import com.johnsoft.futaschools.set_departments.ArcDepartmentActivity;
import com.johnsoft.futaschools.set_departments.BdgDepartmentActivity;
import com.johnsoft.futaschools.set_departments.EsmDepartmentActivity;
import com.johnsoft.futaschools.set_departments.IddDepartmentActivity;
import com.johnsoft.futaschools.set_departments.QsvDepartmentActivity;
import com.johnsoft.futaschools.set_departments.SvgDepartmentActivity;
import com.johnsoft.futaschools.set_departments.UrpDepartmentActivity;
import com.johnsoft.futaschools.shht_departments.AnaDepartmentActivity;
import com.johnsoft.futaschools.shht_departments.BimDepartmentActivity;
import com.johnsoft.futaschools.shht_departments.PhsDepartmentActivity;
import com.johnsoft.futaschools.smat_departments.AccDepartmentActivity;
import com.johnsoft.futaschools.smat_departments.BusDepartmentActivity;
import com.johnsoft.futaschools.smat_departments.EcnDepartmentActivity;
import com.johnsoft.futaschools.smat_departments.EntDepartmentActivity;
import com.johnsoft.futaschools.smat_departments.PmtDepartmentActivity;
import com.johnsoft.futaschools.smat_departments.TmtDepartmentActivity;
import com.johnsoft.futaschools.soc_departments.CscDepartmentActivity;
import com.johnsoft.futaschools.soc_departments.CysDepartmentActivity;
import com.johnsoft.futaschools.soc_departments.IfsDepartmentActivity;
import com.johnsoft.futaschools.soc_departments.IftDepartmentActivity;
import com.johnsoft.futaschools.soc_departments.SenDepartmentActivity;
import com.johnsoft.futaschools.sos_departments.BchDepartmentActivity;
import com.johnsoft.futaschools.sos_departments.BioDepartmentActivity;
import com.johnsoft.futaschools.sos_departments.BthDepartmentActivity;
import com.johnsoft.futaschools.sos_departments.CheDepartmentActivity;
import com.johnsoft.futaschools.sos_departments.McbDepartmentActivity;
import com.johnsoft.futaschools.sos_departments.MtsDepartmentActivity;
import com.johnsoft.futaschools.sos_departments.PhyDepartmentActivity;
import com.johnsoft.futaschools.sos_departments.StaDepartmentActivity;

import java.util.List;

public class DeptsRecycler extends RecyclerView.Adapter<DeptsRecycler.DeptViewHolder> {
    private List<DeptInfo> deptInfoList;
    private Context mContext;

    public DeptsRecycler(List<DeptInfo> deptInfoList, Context mContext) {
        this.deptInfoList = deptInfoList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public DeptViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.each_department_layout_tile, null);
        return new DeptViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final DeptViewHolder holder, int position) {
        final DeptInfo deptInfo = deptInfoList.get(position);
        holder.deptImage.setImageDrawable(mContext.getResources().getDrawable(deptInfo.getDeptImage()));
        holder.deptName.setText(deptInfo.getDeptName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, deptInfo.getDeptName(), Toast.LENGTH_SHORT).show();
                if (deptInfo.getDeptName().equals("Agricultural and Environmental Engineering (AGE)")) {
                    Intent intent = new Intent(mContext, AgeDepartmentActivity.class);
                    mContext.startActivity(intent);

                    //School of Engineering
                } else if (deptInfo.getDeptName().equals("Civil and Environmental Engineering (CVE)")) {
                    Intent intent = new Intent(mContext, CveDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Computer Engineering (CPE)")) {
                    Intent intent = new Intent(mContext, CpeDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Electrical and Electronics Engineering (EEE)")) {
                    Intent intent = new Intent(mContext, EeeDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Industrial and Production Engineering (IPE)")) {
                    Intent intent = new Intent(mContext, IpeDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Mechanical Engineering (MEE)")) {
                    Intent intent = new Intent(mContext, MeeDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Metallurgical and Materials Engineering (MME)")) {
                    Intent intent = new Intent(mContext, MmeDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Mining Engineering (MNE)")) {
                    Intent intent = new Intent(mContext, MneDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Information and Communication Technology (ICT)")) {
                    Intent intent = new Intent(mContext, IctDepartmentActivity.class);
                    mContext.startActivity(intent);


                    //School of Agriculture
                } else if (deptInfo.getDeptName().equals("Agricultural and Resource Economics (ARE)")) {
                    Intent intent = new Intent(mContext, AreDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Agricultural Extension and Communication Technology  (AEC)")) {
                    Intent intent = new Intent(mContext, AecDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Animal Production and Health (APH)")) {
                    Intent intent = new Intent(mContext, AphDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Crop, Soil and Pest Management (CSP)")) {
                    Intent intent = new Intent(mContext, CspDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Ecotourism and Wildlife Management  (EWM)")) {
                    Intent intent = new Intent(mContext, EwmDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Fisheries and Aquaculture Technology (FAT)")) {
                    Intent intent = new Intent(mContext, FatDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Food Science and Technology (FST)")) {
                    Intent intent = new Intent(mContext, FstDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Forestry and Wood Technology (FWT)")) {
                    Intent intent = new Intent(mContext, FwtDepartmentActivity.class);
                    mContext.startActivity(intent);
                }


                //School of Computing
                else if (deptInfo.getDeptName().equals("Computer Science (CSC)")) {
                    Intent intent = new Intent(mContext, CscDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Cyber Security (CYS)")) {
                    Intent intent = new Intent(mContext, CysDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Information Systems (IFS)")) {
                    Intent intent = new Intent(mContext, IfsDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Information Technology (IFT)")) {
                    Intent intent = new Intent(mContext, IftDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Software Engineering (SEN)")) {
                    Intent intent = new Intent(mContext, SenDepartmentActivity.class);
                    mContext.startActivity(intent);
                }


                //School of Health
                else if (deptInfo.getDeptName().equals("Biomedical Technology (BIM)")) {
                    Intent intent = new Intent(mContext, BimDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Human Anatomy (ANA)")) {
                    Intent intent = new Intent(mContext, AnaDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Physiology (PHS)")) {
                    Intent intent = new Intent(mContext, PhsDepartmentActivity.class);
                    mContext.startActivity(intent);
                }


                //School of Earth
                else if (deptInfo.getDeptName().equals("Applied Geology (AGY)")) {
                    Intent intent = new Intent(mContext, AgyDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Applied Geophysics (AGP)")) {
                    Intent intent = new Intent(mContext, AgpDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Marine Science and Technology (MST)")) {
                    Intent intent = new Intent(mContext, MstDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Meteorology and Climate Science (MCS)")) {
                    Intent intent = new Intent(mContext, McsDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Remote Sensing and Geoscience Information Systems (RSG)")) {
                    Intent intent = new Intent(mContext, RsgDepartmentActivity.class);
                    mContext.startActivity(intent);
                }


                //School of Environmental
                else if (deptInfo.getDeptName().equals("Architecture (ARC)")) {
                    Intent intent = new Intent(mContext, ArcDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Building (BDG)")) {
                    Intent intent = new Intent(mContext, BdgDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Estate Management (ESM)")) {
                    Intent intent = new Intent(mContext, EsmDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Industrial Design (IDD)")) {
                    Intent intent = new Intent(mContext, IddDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Quantity Surveying (QSV)")) {
                    Intent intent = new Intent(mContext, QsvDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Surveying and Geoinformatics (SVG)")) {
                    Intent intent = new Intent(mContext, SvgDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Urban and Regional Planning (URP)")) {
                    Intent intent = new Intent(mContext, UrpDepartmentActivity.class);
                    mContext.startActivity(intent);
                }


                //School of Sciences
                else if (deptInfo.getDeptName().equals("Biochemistry (BCH)")) {
                    Intent intent = new Intent(mContext, BchDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Biology (BIO)")) {
                    Intent intent = new Intent(mContext, BioDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Biotechnology (BTH)")) {
                    Intent intent = new Intent(mContext, BthDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Industrial Chemistry (CHE)")) {
                    Intent intent = new Intent(mContext, CheDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Mathematical Sciences (MTS)")) {
                    Intent intent = new Intent(mContext, MtsDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Microbiology (MCB)")) {
                    Intent intent = new Intent(mContext, McbDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Physics (PHY)")) {
                    Intent intent = new Intent(mContext, PhyDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Statistics (STA)")) {
                    Intent intent = new Intent(mContext, StaDepartmentActivity.class);
                    mContext.startActivity(intent);
                }



                //School of Management
                else if (deptInfo.getDeptName().equals("Accounting (ACC)")) {
                    Intent intent = new Intent(mContext, AccDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Business Administration (BUS)")) {
                    Intent intent = new Intent(mContext, BusDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Economics (ECN)")) {
                    Intent intent = new Intent(mContext, EcnDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Entrepreneurship (ENT)")) {
                    Intent intent = new Intent(mContext, EntDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Project Management Technology (PMT)")) {
                    Intent intent = new Intent(mContext, PmtDepartmentActivity.class);
                    mContext.startActivity(intent);
                } else if (deptInfo.getDeptName().equals("Transport Management Technology (TMT)")) {
                    Intent intent = new Intent(mContext, TmtDepartmentActivity.class);
                    mContext.startActivity(intent);
                }
            }

       });
    }

    @Override
    public int getItemCount() {
        return deptInfoList.size();

    }

    class DeptViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView deptName;
        ImageView deptImage;

        public DeptViewHolder(@NonNull View itemView) {
            super(itemView);
            deptImage = (ImageView) itemView.findViewById(R.id.dept_image);
            deptName= (TextView) itemView.findViewById(R.id.dept_name);
         }

        @Override
        public void onClick(View v) {

        }
    }
}
