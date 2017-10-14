package com.example.admin.finalprojtest;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.net.URI;

import butterknife.BindView;

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
        setContentView(R.layout.image_to_storage);
        //ButterKnife.bind(this);

        Intent intent = new Intent();
        intent.setClass(this, FinanceInfoActivity.class);
        //startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == GALLERY_INTENT && resultCode == RESULT_OK){
            Uri uri = data.getData();

            StorageReference filepath = mStorageRef.child("Photos").child(uri.getLastPathSegment());

            filepath.putFile(uri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    Toast.makeText(MainActivity.this, "Upload Successful", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    /*TeamInfo teamInfo;

    EditText teamName;
    EditText teamMember1;
    EditText teamMember2;
    EditText teamMember3;*/

    protected Bitmap img = null;
    static final int CAM_REQUEST = 1;
    ImageView ivImage;
    private StorageReference mStorageRef;
    private static final int GALLERY_INTENT = 2;

    public void sendImageFirebase(View view) {

        mStorageRef = FirebaseStorage.getInstance().getReference();

        Intent intent = new Intent(Intent.ACTION_PICK);

        intent.setType("image/*");

        startActivityForResult(intent, GALLERY_INTENT);

    }


        /*if (teamName != null
                && teamMember1 != null
                && teamMember2 != null
                && teamMember3 != null) {

            String tName = teamName.getText().toString();
            List<String> members = new ArrayList<>();

            members.add(teamMember1.getText().toString());
            members.add(teamMember2.getText().toString());
            members.add(teamMember3.getText().toString());

            teamInfo = new TeamInfo(tName, members);
        }*/

}



    /*public void sendToFirebase(View view) {

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

    }*/

