package layout;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.wilson.outdoorodyssey.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class mepsFragment extends Fragment {

    EditText mEdit;
    EditText eEdit;
    EditText pEdit;
    EditText sEdit;
    TextView averageView;
    Button logButton;
    SharedPreferences sp;
    int totalScores;
    int numScores;
    int averageScore;

    public mepsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_meps, container, false);
        mEdit = (EditText) v.findViewById(R.id.mEdit);
        eEdit = (EditText) v.findViewById(R.id.eEdit);
        pEdit = (EditText) v.findViewById(R.id.pEdit);
        sEdit = (EditText) v.findViewById(R.id.sEdit);
        averageView = (TextView) v.findViewById(R.id.averageView);
        logButton = (Button) v.findViewById(R.id.logButton);

        v.findViewById(R.id.logButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logMEPS();
            }
        });

        sp = this.getActivity().getSharedPreferences("averageScore", Context.MODE_PRIVATE);
        Toast.makeText(getActivity(), "MEPS Calculator is still in development. It will be fully functional shortly!", Toast.LENGTH_LONG).show();


        return v;
    }

    public void logMEPS (){



        int mVal = Integer.parseInt(mEdit.getText().toString());
        int eVal = Integer.parseInt(eEdit.getText().toString());
        int pVal = Integer.parseInt(pEdit.getText().toString());
        int sVal = Integer.parseInt(sEdit.getText().toString());
        int tempScore;

        tempScore = mVal * eVal * pVal * sVal;
        totalScores += tempScore;
        numScores+= 1;
        averageScore = totalScores / numScores;
        averageView.setText(String.valueOf(averageScore));

        sp.edit().putInt("averageScore",averageScore).apply();


    }







}
