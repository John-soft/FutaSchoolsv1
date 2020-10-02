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

import com.airbnb.lottie.LottieAnimationView;
import com.johnsoft.futaschools.ItemClickListener;
import com.johnsoft.futaschools.R;
import com.johnsoft.futaschools.model.SchoolsInfo;
import com.johnsoft.futaschools.schools.SchoolOfAgricActivity;
import com.johnsoft.futaschools.schools.SchoolOfComputingActivity;
import com.johnsoft.futaschools.schools.SchoolOfEarthActivity;
import com.johnsoft.futaschools.schools.SchoolOfEngineeringActivity;
import com.johnsoft.futaschools.schools.SchoolOfEnvironmentalActivity;
import com.johnsoft.futaschools.schools.SchoolOfHealthActivity;
import com.johnsoft.futaschools.schools.SchoolOfManagementActivity;
import com.johnsoft.futaschools.schools.SchoolOfScienceActivity;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>{
    private List<SchoolsInfo> schoolsInfoList;
    private Context mContext;

    public RecyclerAdapter(List<SchoolsInfo> schoolsInfoList, Context mContext) {
        this.schoolsInfoList = schoolsInfoList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.schools_layout_tile, null);
        final RecyclerViewHolder holder = new RecyclerViewHolder(view);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        final SchoolsInfo schoolsInfo = schoolsInfoList.get(position);
        holder.schoolName.setText(schoolsInfo.getSchoolName());
        holder.noOfDepts.setText(schoolsInfo.getSchoolDepts());
        holder.schoolImage.setImageDrawable(mContext.getResources().getDrawable(schoolsInfo.getSchoolImage()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, schoolsInfo.getSchoolName(), Toast.LENGTH_SHORT).show();
                if (schoolsInfo.getSchoolName().equals("SCHOOL OF COMPUTING (SOC)")){
                    Intent intent = new Intent(mContext, SchoolOfComputingActivity.class);
                    mContext.startActivity(intent);
                }else if(schoolsInfo.getSchoolName().equals("SCHOOL OF ENGINEERING AND ENGINEERING TECHNOLOGY (SEET)")){
                    Intent intent = new Intent(mContext, SchoolOfEngineeringActivity.class);
                    mContext.startActivity(intent);
                }else if(schoolsInfo.getSchoolName().equals("SCHOOL OF AGRICULTURE AND AGRICULTURAL TECHNOLOGY (SAAT)")){
                    Intent intent = new Intent(mContext, SchoolOfAgricActivity.class);
                    mContext.startActivity(intent);
                }else if(schoolsInfo.getSchoolName().equals("SCHOOL OF HEALTH AND HEALTH TECHNOLOGY (SHHT)")){
                    Intent intent = new Intent(mContext, SchoolOfHealthActivity.class);
                    mContext.startActivity(intent);
                }else if(schoolsInfo.getSchoolName().equals("SCHOOL OF EARTH AND MINERAL SCIENCES (SEMS)")){
                    Intent intent = new Intent(mContext, SchoolOfEarthActivity.class);
                    mContext.startActivity(intent);
                }else if(schoolsInfo.getSchoolName().equals("SCHOOL OF ENVIRONMENTAL (SET)")){
                    Intent intent = new Intent(mContext, SchoolOfEnvironmentalActivity.class);
                    mContext.startActivity(intent);
                }else if(schoolsInfo.getSchoolName().equals("SCHOOL OF SCIENCES (SOS)")){
                    Intent intent = new Intent(mContext, SchoolOfScienceActivity.class);
                    mContext.startActivity(intent);
                }else if(schoolsInfo.getSchoolName().equals("SCHOOL OF MANAGEMENT TECHNOLOGY (SMAT)")){
                    Intent intent = new Intent(mContext, SchoolOfManagementActivity.class);
                    mContext.startActivity(intent);
                }
            }
        });



    }

    @Override
    public int getItemCount() {
        return schoolsInfoList.size();
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView schoolName;
        private TextView noOfDepts;
        private ImageView schoolImage;
        private LottieAnimationView load;
        private ItemClickListener itemClickListener;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            schoolName = (TextView) itemView.findViewById(R.id.school_name);
            noOfDepts = (TextView) itemView.findViewById(R.id.school_depts);
            schoolImage = (ImageView) itemView.findViewById(R.id.school_image);
            load = (LottieAnimationView) itemView.findViewById(R.id.load_more);
        }

        @Override
        public void onClick(View v) {
            itemClickListener.onClick(v,getAdapterPosition(), false);
        }
        public void setItemClickListener(ItemClickListener itemClickListener){
            this.itemClickListener = itemClickListener;
        }
    }
}
