package com.example.android.droidcafe;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends Fragment {

	@Override
	public View onCreateView(
			LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState
	) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_first, container, false);
	}

	public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

//		view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View view) {
//				FirstFragmentDirections.ActionFirstFragmentToSecondFragment action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(MainActivity.getCurrentOrder());
//				NavHostFragment.findNavController(FirstFragment.this)
//						.navigate(R.id.action_FirstFragment_to_SecondFragment);
//			}
//		});
		view.findViewById(R.id.button_first).setEnabled(false);

		Log.d(this.getClass().getSimpleName(), "DESERT -- " + MainActivity.getCurrentOrder());
		view.findViewById(R.id.floatingActionButton).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				FirstFragmentDirections.ActionFirstFragmentToSecondFragment action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(MainActivity.getCurrentOrder());
				NavHostFragment.findNavController(FirstFragment.this)
						.navigate(action);
			}
		});
	}

	public void onShop(View view) {
	}
}
