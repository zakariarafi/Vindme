package lms.mobile.vindme.activity.activity.profile;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.vindme.R;

import lms.mobile.vindme.activity.activity.cart.CartActivity;
import lms.mobile.vindme.activity.activity.wishlist.WishlistActivity;

public class ProfileFragment extends Fragment {
    Button btnLogout, btnEdit;
    CardView cardKeranjang, cardWishlist, cardPengaturan;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        btnLogout = view.findViewById(R.id.btn_logout);
        btnEdit = view.findViewById(R.id.btn_edit);

        cardKeranjang = view.findViewById(R.id.card_keranjang);
        cardPengaturan = view.findViewById(R.id.card_pengaturan);
        cardWishlist = view.findViewById(R.id.card_wishlist);

        // Event Handling
        handleButtonEvents();
        handleCardEvents();

        return view;
    }

    private void handleButtonEvents() {
        btnLogout.setOnClickListener(v -> {
            Log.d("TAG", "User Logout");
        });

        btnEdit.setOnClickListener(v -> {
            NavHostFragment.findNavController(ProfileFragment.this).navigate(R.id.action_profileFragment_to_editProfileFragment);
        });
    }

    private void handleCardEvents() {
        cardKeranjang.setOnClickListener(v -> {
            Intent intent = new Intent(requireActivity(), CartActivity.class);
            startActivity(intent);
        });

        cardPengaturan.setOnClickListener(v -> {
            Log.d("TAG", "Go to Setting Activity");
        });

        cardWishlist.setOnClickListener(v -> {
            Intent intent = new Intent(requireActivity(), WishlistActivity.class);
            startActivity(intent);
        });
    }
}