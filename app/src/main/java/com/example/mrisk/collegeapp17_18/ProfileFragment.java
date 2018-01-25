package com.example.mrisk.collegeapp17_18;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by mrisk on 11/27/2017.
 */

public class ProfileFragment extends Fragment{

    TextView mFirst;
    TextView mLast;
    EditText mFMEdit;
    EditText mLMEdit;
    Profile mProfile = new Profile(); //hey
    Button button;
    DatePicker dob;
    Calendar calendar = Calendar.getInstance();
    int WITHIN_8_YEARS = 2011;
    String TAG = "Profile Fragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);

        //Wireup XML
        mFirst = (TextView) rootView.findViewById(R.id.fname);
        mLast = (TextView) rootView.findViewById(R.id.lname);
        dob = (DatePicker) rootView.findViewById(R.id.dob);
        mFMEdit = (EditText) rootView.findViewById(R.id.fname_edit);
        mLMEdit = (EditText) rootView.findViewById(R.id.lname_edit);
        button = (Button) rootView.findViewById(R.id.updateButton);


        //Setting with defualt values
        mFirst.setText(mProfile.getFirstName());
        mLast.setText(mProfile.getLastName());
        dob.init(mProfile.getDob().get(Calendar.YEAR),mProfile.getDob().get(Calendar.MONTH), mProfile.getDob().get(Calendar.DAY_OF_MONTH), null );

        //Setting up update button listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFirst.setText(mFMEdit.getText());
                mLast.setText(mLMEdit.getText());
                try {
                    if (dob.getYear() <= WITHIN_8_YEARS) {
                        int day = dob.getDayOfMonth();
                        int month = dob.getMonth();
                        int year = dob.getYear();

                        calendar.set(year, month, day);
                        mProfile.setDob(year, month, day);
                    }
                    else throw new AgeException("Who are you, Michael Kearney?");
                } catch (AgeException e) {
                    Log.i(TAG, e.joinMessageAndYear(e.getMessage(), dob.getYear()));
                }

                mProfile.setFirstName(mFMEdit.getText().toString());
                mProfile.setLastName(mLMEdit.getText().toString());

            }
        });





        return rootView;
    }
}
