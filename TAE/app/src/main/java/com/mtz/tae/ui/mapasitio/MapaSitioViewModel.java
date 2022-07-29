package com.mtz.tae.ui.mapasitio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MapaSitioViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MapaSitioViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is mapa del sitio fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}