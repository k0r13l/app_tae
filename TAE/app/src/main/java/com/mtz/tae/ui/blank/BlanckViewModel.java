package com.mtz.tae.ui.blank;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BlanckViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BlanckViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is destinos fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}