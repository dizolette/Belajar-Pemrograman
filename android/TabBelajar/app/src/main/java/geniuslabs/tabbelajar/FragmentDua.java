package geniuslabs.tabbelajar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ecko on 3/24/2017.
 */

public class FragmentDua extends Fragment {


    public FragmentDua(){
        //dibuat kosong
    }

    //untuk menghubungkan ke fragment layout
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_dua, container,false);
    }
}
