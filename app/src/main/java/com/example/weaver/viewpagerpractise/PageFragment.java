package com.example.weaver.viewpagerpractise;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Weaver on 2016/11/11.
 */
public class PageFragment extends Fragment {
    public static final String KEY_PAGE = "page";

    private TextView mTextView;

    @NonNull
    public static PageFragment newInstance(int page) {
        Bundle args = new Bundle(); //It's the hashmap-like item, right?
        args.putInt(KEY_PAGE, page);

        PageFragment pageFragment = new PageFragment();
        pageFragment.setArguments(args);
        return pageFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page_fragment, container, false);
        mTextView = (TextView) view.findViewById(R.id.text_view);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) { // what's this used for?
        int page = getArguments().getInt(KEY_PAGE);
        mTextView.setText("Page" + page);
    }
}
