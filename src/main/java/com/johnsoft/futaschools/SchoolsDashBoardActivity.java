package com.johnsoft.futaschools;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.johnsoft.futaschools.model.SchoolsInfo;
import com.johnsoft.futaschools.recycler.RecyclerAdapter;


import java.util.ArrayList;
import java.util.List;

public class SchoolsDashBoardActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private RecyclerView recyclerView;
    private List<SchoolsInfo> schoolsInfoList = new ArrayList<>();
    private long backPressedTime;
    private Toast backToast;
    private FloatingActionButton fab;
    private MediaPlayer playAnthem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schools_dash_board);
        mToolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(mToolbar);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        mToolbar.setTitle("  Futa Schools");
        mToolbar.setLogo(R.drawable.ic_school);
        mToolbar.setTitleTextColor(Color.WHITE);

        recyclerView = (RecyclerView) findViewById(R.id.schools_recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        schoolsInfoList.add(new SchoolsInfo("SCHOOL OF ENGINEERING AND ENGINEERING TECHNOLOGY (SEET)","9 Departments",R.drawable.seet));
        schoolsInfoList.add(new SchoolsInfo("SCHOOL OF AGRICULTURE AND AGRICULTURAL TECHNOLOGY (SAAT)","8 Departments",R.drawable.school_of_agric));
        schoolsInfoList.add(new SchoolsInfo("SCHOOL OF COMPUTING (SOC)","5 Departments",R.drawable.soc));
        schoolsInfoList.add(new SchoolsInfo("SCHOOL OF HEALTH AND HEALTH TECHNOLOGY (SHHT)","3 Departments",R.drawable.school_of_health));
        schoolsInfoList.add(new SchoolsInfo("SCHOOL OF EARTH AND MINERAL SCIENCES (SEMS)","5 Departments",R.drawable.school_of_earth));
        schoolsInfoList.add(new SchoolsInfo("SCHOOL OF ENVIRONMENTAL (SET)","7 Departments",R.drawable.school_of_environmental));
        schoolsInfoList.add(new SchoolsInfo("SCHOOL OF SCIENCES (SOS)","8 Departments",R.drawable.school_of_science));
        schoolsInfoList.add(new SchoolsInfo("SCHOOL OF MANAGEMENT TECHNOLOGY (SMAT)","6 Departments",R.drawable.smat));



        RecyclerAdapter adapter = new RecyclerAdapter(schoolsInfoList,this);
        recyclerView.setAdapter(adapter);

    fab.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            final Snackbar snackbar = Snackbar.make(v, "I will be available shortly...", 6000);
            snackbar.setAction("CLOSE", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    snackbar.dismiss();
                }
            }).show();

        }
    });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.display_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.about_developer_menu:
                Intent intent = new Intent(SchoolsDashBoardActivity.this, AboutDeveloperActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.pdf_files:
                Intent pdfIntent = new Intent(SchoolsDashBoardActivity.this, PdfActivity.class);
                startActivity(pdfIntent);
                break;
            case R.id.frequently_asked_questions:
                Intent faqIntent = new Intent(SchoolsDashBoardActivity.this, FaqActivity.class);
                startActivity(faqIntent);
                break;
            case R.id.play_anthem:
                playAnthem = MediaPlayer.create(this, R.raw.futa_anthem);
                if (playAnthem != null){
                    playAnthem.start();
                    simple_notification();
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
                    alertDialog.setTitle("FUTA ANTHEM");
                    alertDialog.setCancelable(true);
                    alertDialog.setIcon(R.drawable.futalogo);
                    alertDialog.setMessage("Great Futarians, Eh" +
                            "\nGreat Futarians, Eh " +
                            "\nEver leading, ever winning, ever peaceful" +
                            "\nAdvancing the course of technology" +
                            "\nFUTA....land of ancient landmarks" +
                            "\nFUTA....for national progress" +
                            "\nAcademic excellence is your tradition" +
                            "\nTechnology for self reliance" +
                            "\n" +
                            "\n" +
                            "Self-Reliance, Yes!" +
                            "\nSelf-Reliance, Yes!" +
                            "\nPromoting love, unity, not cultism" +
                            "\nChampioning the cause of technology" +
                            "\nFUTA....The shinning example" +
                            "\nFUTA....The pride of Nigeria" +
                            "\nWith God's blessings on our side, we shall go places " +
                            "\nFUTA for self reliance" +
                            "\nFU-UUUU-UUUUU-TA").show();
                    break;
                }

            case R.id.lecture_theatre_pictures:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            playAnthem.stop();
            super.onBackPressed();
            return;
        }else {
            backToast = Toast.makeText(this, "Press back again to exit...", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }

    private void simple_notification(){

        int notificationID = 0;
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_play_btn)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.ic_play_btn))
                .setContentTitle("Now playing")
                .setContentText("Futa Anthem")
                .setAutoCancel(true)
                .setDefaults(NotificationCompat.DEFAULT_ALL);

        Uri path  = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        builder.setSound(path);

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            String channelId = "YOUR_CHANNEL_ID";
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                NotificationChannel channel = new NotificationChannel(channelId, "Channel human readable title",
                        NotificationManager.IMPORTANCE_LOW);
                notificationManager.createNotificationChannel(channel);
                builder.setChannelId(channelId);
            }
            notificationManager.notify(notificationID, builder.build());
        }

    }
}
