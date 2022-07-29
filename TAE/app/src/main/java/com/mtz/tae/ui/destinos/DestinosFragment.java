package com.mtz.tae.ui.destinos;

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
import com.mtz.tae.databinding.FragmentDestinosBinding;
import com.mtz.tae.model.Destino;
import com.mtz.tae.utility.DestinosSingleton;

import java.util.List;

public class DestinosFragment extends Fragment {

    private FragmentDestinosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DestinosViewModel homeViewModel =
                new ViewModelProvider(this).get(DestinosViewModel.class);

        binding = FragmentDestinosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        llenarRecycler();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void llenarRecycler() {
        RecyclerView recycler = this.binding.recyclerDestinos;

        ListaDestinosAdapter adapter = new ListaDestinosAdapter(DestinosSingleton.getInstance().listaDestinos, this);

        recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        recycler.setAdapter(adapter);
    }
}