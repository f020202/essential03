package edu.sungshin.essential;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.essential03.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;


public class UserFrament extends Fragment {

    TextView logout;
    private FirebaseAuth mAuth;
    private TextView tv_result;
    private ImageView iv_profile;
    private TextView tv_email;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_user, container, false);
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_user, container, false);

        logout = v.findViewById(R.id.logout);
        mAuth = FirebaseAuth.getInstance();

        Intent intent = new Intent(getActivity(),LoginActivity.class);
        startActivity(intent);

        String nickname = intent.getStringExtra("nickname"); // LoginActivity로 부터 닉네임 전달받음.
        String photoUrl = intent.getStringExtra("photoUrl"); // LoginActivity로 부터 프로필 사진 Uri 전달받음.
        String email = intent.getStringExtra("e-mail"); // LoginActivity로 부터 이메일 전달받음

        tv_result = rootView.findViewById(R.id.tv_result);
        tv_result.setText(nickname); // 닉네임 text를 텍스트 뷰에 세팅.
        iv_profile = rootView.findViewById(R.id.iv_profile);
        Glide.with(this).load(photoUrl).into(iv_profile); //프로필 url을 이미지 뷰에 세팅
        tv_email = rootView.findViewById(R.id.tv_email);
        tv_email.setText(email);


//        logout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(),LoginActivity.class);
//                startActivity(intent);
//                Toast.makeText(getActivity().getApplicationContext(), "로그아웃 되셨습니다.", Toast.LENGTH_LONG).show();
//
//            }
//        });

        return rootView;
    }



}
