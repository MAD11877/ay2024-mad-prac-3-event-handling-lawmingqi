package sg.edu.np.mad.madpractical3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import sg.edu.np.mad.practical3.R;

public class FragmentGroup1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_group1, parent, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

    }
}