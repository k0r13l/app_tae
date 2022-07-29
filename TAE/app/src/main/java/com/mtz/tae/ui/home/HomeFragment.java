package com.mtz.tae.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;
import com.mtz.tae.adapter.ListaDestinosAdapter;
import com.mtz.tae.api.APISingleton;
import com.mtz.tae.databinding.FragmentHomeBinding;
import com.mtz.tae.model.Destino;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import com.mtz.tae.R;
import com.mtz.tae.ui.dialogdestino.DialogDestinoFragment;
import com.mtz.tae.utility.DestinosSingleton;

public class HomeFragment extends Fragment implements Callback<List<Destino>> {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Call<List<Destino>> call = APISingleton.getInstance().listarDestinos();
        call.enqueue(this);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onResponse(Call<List<Destino>> call, Response<List<Destino>> response) {
        if (response.isSuccessful()) {
            List<Destino> listaDestinos = response.body();
            if (listaDestinos.isEmpty()) {

            } else {
                RecyclerView recycler = this.binding.recyclerHome;

                DestinosSingleton.getInstance().listaDestinos = listaDestinos;

                List<Destino> destinosHome = new ArrayList<>();

                for (int i = 0; i < 3; i++) {
                    destinosHome.add(listaDestinos.get(i));
                }

                ListaDestinosAdapter adapter = new ListaDestinosAdapter(destinosHome, this);

                recycler.setLayoutManager(new LinearLayoutManager(getContext()));
                recycler.setAdapter(adapter);
            }
        }
    }

    @Override
    public void onFailure(Call<List<Destino>> call, Throwable t) {
        Toast.makeText(getContext(),
                t.toString(),
                Toast.LENGTH_SHORT).show();
    }
}