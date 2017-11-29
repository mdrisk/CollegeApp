package com.example.mrisk.collegeapp17_18;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by mrisk on 11/16/2017.
 */

public class FamilyMemberFragment extends android.support.v4.app.Fragment {

    TextView mFirst;
    TextView mLast;
    EditText mFMEdit;
    FamilyMember mFamilyMember = new FamilyMember(); //hey
    FamilyMember mFamtwo = new FamilyMember();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_family_member, container, false);
        mFirst = (TextView) rootView.findViewById(R.id.fname);
        mLast = (TextView) rootView.findViewById(R.id.lname);

        mFirst.setText(mFamilyMember.getFirstName());
        mLast.setText(mFamilyMember.getLastName());
        return rootView;
    }
}
