package com.mtz.tae.ui.sobrenosotros;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.mtz.tae.databinding.FragmentSobreNosotrosBinding;

public class SobreNosotrosFragment extends Fragment {

    private FragmentSobreNosotrosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SobreNosotrosViewModel homeViewModel =
                new ViewModelProvider(this).get(SobreNosotrosViewModel.class);

        binding = FragmentSobreNosotrosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}