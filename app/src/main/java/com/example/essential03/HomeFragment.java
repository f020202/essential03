package com.example.essential03;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    //캘린더 관련
    public CalendarView calendarView;
    public TextView diaryTextView,textView3;
    public CheckBox checkBox1,checkBox2,checkBox3,checkBox6;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    private View view;

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    //캘린더 여기서부터 시작
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //View v = inflater.inflate(R.layout.fragment_home, container, false);
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_home, container, false);


        calendarView= rootView.findViewById(R.id.calendarView);
        diaryTextView= rootView.findViewById(R.id.diaryTextView);
        textView3=rootView.findViewById(R.id.textView3);
        checkBox1 = rootView.findViewById(R.id.checkbox1);
        checkBox2 = rootView.findViewById(R.id.checkbox2);
        checkBox3 = rootView.findViewById(R.id.checkbox3);
        checkBox6 = rootView.findViewById(R.id.checkbox6);
        view = inflater.inflate(R.layout.fragment_home,container,false);




        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),FragmentHomeHealth1Activity.class); //fragment라서 activity intent와는 다른 방식
                startActivity(intent);

            }
        });

        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), FragmentHomeHealth2Activity.class); //fragment라서 activity intent와는 다른 방식
                startActivity(intent);

            }
        });

        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), FragmentHomeHealth3Activity.class); //fragment라서 activity intent와는 다른 방식
                startActivity(intent);

            }
        });

        checkBox6.setOnClickListener(new View.OnClickListener() {
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