package com.sean.viewmodel_livedata_databinding;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

import com.sean.viewmodel_livedata_databinding.databinding.FragmentSeekbarBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class SeekbarFragment extends Fragment {


    public SeekbarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seekbar, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final VmShareViewModel vmShareViewModel = ViewModelProviders.of(requireActivity()).get(VmShareViewModel.class);

        final FragmentSeekbarBinding fragmentSeekbarBinding = DataBindingUtil.bind(view);

        fragmentSeekbarBinding.setLifecycleOwner(requireActivity());
        fragmentSeekbarBinding.setViewModel(vmShareViewModel);

        fragmentSeekbarBinding.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                vmShareViewModel.progress.setValue(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

//        vmShareViewModel.progress.observe(requireActivity(), new Observer<Integer>() {
//            @Override
//            public void onChanged(Integer progress) {
//                fragmentSeekbarBinding.seekBar.setProgress(progress);
//            }
//        });
    }
}
