package com.example.memwaves;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatDialogFragment;

public class ProfileDialog extends AppCompatDialogFragment {

    private EditText editTextUser;
    private EditText editTextEmail;
    private ProfileDialogListener listener;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.profile_dialog,null);

        builder.setView(view)
                .setTitle("Profile Info")
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String username = editTextUser.getText().toString();
                        String email = editTextEmail.getText().toString();
                        listener.applyTexts(email,username);

                    }
                });

        editTextUser = view.findViewById(R.id.edit_username);
        editTextEmail = view.findViewById(R.id.edit_email);

        return builder.create();


    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);

        try {
            listener = (ProfileDialogListener) context;
        } catch (Exception e){
            throw new ClassCastException(context.toString() + "must implement dialog listener");
        }
    }

    public interface ProfileDialogListener{
        void applyTexts(String username, String email);
    }
}
