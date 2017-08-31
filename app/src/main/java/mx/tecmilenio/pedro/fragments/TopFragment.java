package mx.tecmilenio.pedro.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Alumno on 31/08/2017.
 */

public abstract class TopFragment extends Fragments{

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.fragment_top,container,false);
        return view;
    }
}
