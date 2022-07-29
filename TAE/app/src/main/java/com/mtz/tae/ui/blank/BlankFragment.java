package com.mtz.tae.ui.blank;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mtz.tae.adapter.ListaDestinosAdapter;
import com.mtz.tae.databinding.FragmentBlanckBinding;
import com.mtz.tae.databinding.FragmentDestinosBinding;
import com.mtz.tae.ui.dialogdestino.DialogDestinoFragment;
import com.mtz.tae.utility.DestinosSingleton;

public class BlankFragment extends Fragment {

    private FragmentBlanckBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BlanckViewModel homeViewModel =
                new ViewModelProvider(this).get(BlanckViewModel.class);

        binding = FragmentBlanckBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        binding.buttonBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogDestinoFragment ddf = new DialogDestinoFragment();

                ddf.show(getActivity().getSupportFragmentManager(), "dialog1");
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}