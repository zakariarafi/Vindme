package lms.mobile.vindme.activity.activity.profile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vindme.R;
import com.google.android.material.appbar.MaterialToolbar;

public class EditProfileFragment extends Fragment {
    MaterialToolbar toolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_edit_profile, container, false);

        toolbar = view.findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(v -> {
            NavHostFragment.findNavController(EditProfileFragment.this).navigateUp();
        });

        return view;
    }
}