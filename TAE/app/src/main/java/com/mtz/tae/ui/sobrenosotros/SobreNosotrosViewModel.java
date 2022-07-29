package com.mtz.tae.ui.sobrenosotros;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SobreNosotrosViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SobreNosotrosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is sobre nosotros fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}