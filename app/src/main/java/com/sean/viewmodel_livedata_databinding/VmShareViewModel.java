package com.sean.viewmodel_livedata_databinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VmShareViewModel extends ViewModel {
    public MutableLiveData<Integer> progress = new MutableLiveData<>();

}
