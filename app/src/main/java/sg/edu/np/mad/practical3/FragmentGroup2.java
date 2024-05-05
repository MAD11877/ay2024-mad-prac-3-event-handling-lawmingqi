package sg.edu.np.mad.practical3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class FragmentGroup2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_group2, parent, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
    }
}
