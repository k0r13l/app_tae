package com.mtz.tae.ui.dialogdestino;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DialogViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DialogViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is destinos fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}