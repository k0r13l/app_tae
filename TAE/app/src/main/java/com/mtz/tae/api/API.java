package com.mtz.tae.api;

import com.mtz.tae.model.Destino;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface API {
    @GET("/Destino/ObtenerPorId/{id}/")
    Call<List<Destino>> obtenerDestinoPorId(@Path("id") int id);

    @GET("/Destino/Listar/")
    Call<List<Destino>> listarDestinos();
}
