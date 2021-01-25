activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>

MainActivity.java
package com.example.userprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
activity_teacher_profile.xml
<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".TeacherProfile">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="300dp"
            android:background="#2FFEBC"
            android:padding="20dp"/>

        <ImageView
            android:id="@+id/profile_image"
            android:layout_width="100dp"
            android:layout_height="100dp"
            android:layout_centerVertical="true"
            android:src="@drawable/profile_image" />

        <TextView
            android:id="@+id/fullname_field"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerVertical="true"
            android:layout_marginLeft="10dp"
            android:layout_toRightOf="@+id/profile_image"
            android:fontFamily="Times New Roman"
            android:includeFontPadding="false"
            android:text="Masooma Zahra"
            android:textColor="#000"
            android:textSize="20sp" />

        <TextView
            android:id="@+id/username_field"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@id/fullname_field"
            android:layout_marginLeft="10dp"
            android:layout_toRightOf="@+id/profile_image"
            android:includeFontPadding="false"
            android:text="Masooma Zahra"
            android:textSize="14sp" />


        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:padding="20dp">

            <com.google.android.material.textfield.TextInputLayout
                android:id="@+id/full_name_profile"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Full Name">

                <com.google.android.material.textfield.TextInputEditText
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:drawableLeft="@drawable/username_small_icon"
                    android:drawablePadding="10dp"
                    android:drawableStart="@drawable/username_small_icon" />

            </com.google.android.material.textfield.TextInputLayout>

            <Button
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="30dp"
                android:background="#fece2f"
                android:fontFamily="@Times New Roman"
                android:text="UPDATE" />
        </LinearLayout>
    </LinearLayout>
</ScrollView>

username_small_icon.xml
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">

</selector>

profile_image.xml
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">

</selector>
TeacherProfile.java
package com.example.userprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TeacherProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_profile);
    }
}





