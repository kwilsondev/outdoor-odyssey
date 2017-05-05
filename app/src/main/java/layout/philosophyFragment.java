package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.wilson.outdoorodyssey.R;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 */
public class philosophyFragment extends Fragment {

    Spinner philosophySpinner;
    TextView philosophyBody;

    public philosophyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_philosophy, container, false);
        philosophySpinner = (Spinner) v.findViewById(R.id.philosophySpinner);
        philosophyBody = (TextView) v.findViewById(R.id.philosophyBody);

        philosophySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i) {

                    case 0 :
                        philosophyBody.setText(getResources().getString(R.string.flavors31));
                        break;

                    case 1 :
                        philosophyBody.setText(getResources().getString(R.string.most54321));
                        break;

                    case 2 :
                        philosophyBody.setText(getResources().getString(R.string.bedohave));
                        break;

                    case 3 :
                        philosophyBody.setText(getResources().getString(R.string.DAR));
                        break;

                    case 4 :
                        philosophyBody.setText(getResources().getString(R.string.EBA));
                        break;

                    case 5 :
                        philosophyBody.setText(getResources().getString(R.string.eyeballLevel));
                        break;

                    case 6 :
                        philosophyBody.setText(getResources().getString(R.string.iceberg));
                        break;

                    case 7 :
                        philosophyBody.setText(getResources().getString(R.string.MEPS));
                        break;

                    case 8 :
                        philosophyBody.setText(getResources().getString(R.string.microwave));
                        break;

                    case 9 :
                        philosophyBody.setText(getResources().getString(R.string.potatoHead));
                        break;

                    case 10 :
                        philosophyBody.setText(getResources().getString(R.string.TLS));
                        break;

                    case 11 :
                        philosophyBody.setText(getResources().getString(R.string.wizard));
                        break;

                    default:
                        break;

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        return v;
    }

}
