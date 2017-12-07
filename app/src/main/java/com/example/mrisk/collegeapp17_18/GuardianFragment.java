package com.example.mrisk.collegeapp17_18;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by mrisk on 11/16/2017.
 */

public class GuardianFragment extends android.support.v4.app.Fragment {

    TextView mFirst;
    TextView mLast;
    EditText mFMEdit;
    EditText mLMEdit;
    Guardian mGuardian = new Guardian("Bob", "Sagat"); //hey
    Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_guardian, container, false);
        mFirst = (TextView) rootView.findViewById(R.id.fname);
        mLast = (TextView) rootView.findViewById(R.id.lname);

        mFMEdit = (EditText) rootView.findViewById(R.id.fname_edit);
        mLMEdit = (EditText) rootView.findViewById(R.id.lname_edit);

        button = (Button) rootView.findViewById(R.id.updateButton);

        mFirst.setText(mGuardian.getFirstName());
        mLast.setText(mGuardian.getLastName());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFirst.setText(mFMEdit.getText());
                mLast.setText(mLMEdit.getText());
            }
        });

        return rootView;
    }
}
