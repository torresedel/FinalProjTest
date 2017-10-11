package com.example.admin.finalprojtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.name)
    EditText tvName;
    @BindView(R.id.address)
    EditText tvAddress;
    @BindView(R.id.numBedroom)
    EditText tvNumBedroom;
    @BindView(R.id.numBathroom)
    EditText tvNumBathroom;
    @BindView(R.id.buildingManagerPhone)
    EditText tvBuildingManagerPhone;
    @BindView(R.id.gateCode)
    EditText tvGateCode;
    @BindView(R.id.lockCode)
    EditText tvLockCode;
    @BindView(R.id.lat)
    EditText tvLat;
    @BindView(R.id.lng)
    EditText tvLng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.housing_info_input);
        ButterKnife.bind(this);
    }

    public void sendToFirebase(View view) {

        String name = tvName.getText().toString();
        String address = tvAddress.getText().toString();
        int numBedroom = Integer.parseInt(tvNumBedroom.getText().toString());
        int numBathroom = Integer.parseInt(tvNumBathroom.getText().toString());
        int buildingManagerPhone = Integer.parseInt(tvBuildingManagerPhone.getText().toString());
        int gateCode = Integer.parseInt(tvGateCode.getText().toString());
        int lockCode = Integer.parseInt(tvLockCode.getText().toString());
        int lat = Integer.parseInt(tvLat.getText().toString());
        int lng = Integer.parseInt(tvLng.getText().toString());


        HousingInfoClass housing = new HousingInfoClass(name, address, numBedroom, numBathroom, buildingManagerPhone, gateCode, lockCode, lat, lng);

        }
}
