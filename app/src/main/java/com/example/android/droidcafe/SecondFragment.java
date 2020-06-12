package com.example.android.droidcafe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class SecondFragment extends Fragment {

	private static  String SPACE = " ";
	private String selectedDesert = "";
	private TextView mOrderTextView;

	@Override
	public View onCreateView(
			LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState
	) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_second, container, false);
	}

	public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

		selectedDesert = SecondFragmentArgs.fromBundle(getArguments()).getSelectedDesert();
		mOrderTextView = view.findViewById(R.id.order_text_head);
		mOrderTextView.setText(getString(R.string.order_text_head_prefix) + SPACE + selectedDesert);

		view.findViewById(R.id.button_previous).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				NavHostFragment.findNavController(SecondFragment.this)
						.navigate(R.id.action_SecondFragment_to_FirstFragment);
			}
		});
	}
}
