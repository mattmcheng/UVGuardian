package edu.dartmouth.cs.myruns5;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.GraphViewSeries;
import com.jjoe64.graphview.LineGraphView;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

//at the moment it is a PreferenceFragment 
public class GraphFragment extends PreferenceFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_graph, container, false);

	}
	
	

}
