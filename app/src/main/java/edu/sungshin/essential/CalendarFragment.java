package edu.sungshin.essential;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.essential03.R;
import com.google.firebase.auth.FirebaseAuth;

public class CalendarFragment extends Fragment {

    public CalendarView calendarView;
    public TextView diaryTextView,textView3;
    public TextView checkBox1, checkBox2,checkBox3,checkBox4, checkBox6;
    public ImageView arrow1,arrow2,arrow3,arrow4,arrow6;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //View v = inflater.inflate(R.layout.fragment_calendar, container, false);
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_calendar, container, false);


        calendarView= rootView.findViewById(R.id.calendarView);
        diaryTextView= rootView.findViewById(R.id.diaryTextView);
        textView3=rootView.findViewById(R.id.textView3);
        checkBox1 = rootView.findViewById(R.id.checkbox1);
        checkBox2 = rootView.findViewById(R.id.checkbox2);
        checkBox3 = rootView.findViewById(R.id.checkbox3);
        checkBox4 = rootView.findViewById(R.id.checkbox4);
        checkBox6 = rootView.findViewById(R.id.checkbox6);
        arrow1 = rootView.findViewById(R.id.arrow1);
        arrow2 = rootView.findViewById(R.id.arrow2);
        arrow3 = rootView.findViewById(R.id.arrow3);
        arrow4 = rootView.findViewById(R.id.arrow4);
        arrow6 = rootView.findViewById(R.id.arrow6);



        //간단한 스트레칭
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),FragmentHomeHealth1Activity.class); //fragment라서 activity intent와는 다른 방식
                startActivity(intent);

            }
        });

        //간단한 스트레칭 화살표
        arrow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),FragmentHomeHealth1Activity.class); //fragment라서 activity intent와는 다른 방식
                startActivity(intent);
            }
        });

        //팔굽혀펴기
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), FragmentHomeHealth2Activity.class); //fragment라서 activity intent와는 다른 방식
                startActivity(intent);

            }
        });

        //팔굽혀펴기 화살표
        arrow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), FragmentHomeHealth2Activity.class); //fragment라서 activity intent와는 다른 방식
                startActivity(intent);

            }
        });


        //물마시기
        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), FragmentHomeHealth3Activity.class); //fragment라서 activity intent와는 다른 방식
                startActivity(intent);

            }
        });

        //물마시기 화살표
        arrow3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), FragmentHomeHealth3Activity.class); //fragment라서 activity intent와는 다른 방식
                startActivity(intent);

            }
        });

        //영단어 외우기
        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), english.class); //fragment라서 activity intent와는 다른 방식
                startActivity(intent);

            }
        });

        //영단어 외우기 화살표
        arrow4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), english.class); //fragment라서 activity intent와는 다른 방식
                startActivity(intent);

            }
        });


        //복습하기
        checkBox6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), assignment.class); //fragment라서 activity intent와는 다른 방식
                startActivity(intent);
            }
        });

        //복습하기 화살표
        arrow6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), assignment.class); //fragment라서 activity intent와는 다른 방식
                startActivity(intent);
            }
        });


        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                diaryTextView.setVisibility(View.VISIBLE);
                diaryTextView.setText(String.format("%d년 %d월 %d일",year,month+1,dayOfMonth));
            }
        });

        return rootView;
    }

}


