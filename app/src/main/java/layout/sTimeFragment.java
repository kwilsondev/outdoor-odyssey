package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import com.wilson.outdoorodyssey.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class sTimeFragment extends Fragment {

    Spinner sTimeSpinner;
    TextView sTimeBody;

    public sTimeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_s_time, container, false);
        sTimeSpinner = (Spinner) v.findViewById(R.id.sTimeSpinner);
        sTimeBody = (TextView) v.findViewById(R.id.sTimeBody);

        sTimeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i) {

                    case 0:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        sTimeBody.setText(getResources().getString(R.string.aCreed));
                        break;

                    case 1:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        sTimeBody.setText(getResources().getString(R.string.aWish));
                        break;

                    case 2:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        sTimeBody.setText(getResources().getString(R.string.anyway));
                        break;

                    case 3:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.attitude));
                        break;

                    case 4:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.birdByBird));
                        break;

                    case 5:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.conversations));
                        break;

                    case 6:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        sTimeBody.setText(getResources().getString(R.string.desiderata));
                        break;

                    case 7:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.dontWeAll));
                        break;

                    case 8:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        sTimeBody.setText(getResources().getString(R.string.faithTrustLove));
                        break;

                    case 9:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        sTimeBody.setText(getResources().getString(R.string.footprints));
                        break;

                    case 10:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.godsPromise));
                        break;

                    case 11:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.howToMake));
                        break;

                    case 12:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.ifPoem));
                        break;

                    case 13:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.ifEverThereWas));
                        break;

                    case 14:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.ifIWereAnyBetter));
                        break;

                    case 15:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.justToKeepYouGoing));
                        break;

                    case 16:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.lincolnsFailures));
                        break;

                    case 17:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.littleEyesBoy));
                        break;

                    case 18:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.littleEyesGirl));
                        break;

                    case 19:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.liveYourDash));
                        break;

                    case 20:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.mayonnaiseJar));
                        break;

                    case 21:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.myPledge));
                        break;

                    case 22:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.paidInFull));
                        break;

                    case 23:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.quotes));
                        break;

                    case 24:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.remember));
                        break;

                    case 25:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.spreadingYourLight));
                        break;

                    case 26:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.striving));
                        break;

                    case 27:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.successEmerson));
                        break;

                    case 28:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.successUnknown));
                        break;

                    case 29:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.bridgeBuilder));
                        break;

                    case 30:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.carrotEggCoffeeBean));
                        break;

                    case 31:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.emperorsSeed));
                        break;

                    case 32:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.generalsPoem));
                        break;

                    case 33:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.manInTheArena));
                        break;

                    case 34:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.manInTheGlass));
                        break;

                    case 35:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.optimistCreed));
                        break;

                    case 36:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.paradoxOfOurAge));
                        break;

                    case 37:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.prayerOfASportsman));
                        break;

                    case 38:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.roadNotTaken));
                        break;

                    case 39:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.sheepdogsPoem));
                        break;

                    case 40:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.starfishStory));
                        break;

                    case 41:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.thisIsTheBeginning));
                        break;

                    case 42:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.toRisk));
                        break;

                    case 43:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.universalPrayer));
                        break;

                    case 44:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.untitled));
                        break;

                    case 45:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.vigil));
                        break;

                    case 46:
                        sTimeBody.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                        sTimeBody.setText(getResources().getString(R.string.weShallBeFree));
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
