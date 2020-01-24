package com.sean.viewmodel_livedata_databinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {

    MutableLiveData<Integer> count = new MutableLiveData<>();

    public void increase() {
        count.setValue(count.getValue() + 1);
    }

    public void decrease() {
        count.setValue(count.getValue() -1);
    }

}
