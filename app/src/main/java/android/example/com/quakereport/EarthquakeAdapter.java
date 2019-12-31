package android.example.com.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /**
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context     The current context. Used to inflate the layout file.
     * @param earthquakes A List of Word objects to display in a list
     */
    public EarthquakeAdapter(@NonNull Context context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }

        // Get the {@link Word} object located at this position in the list
        Earthquake currentQuake = getItem(position);

        // Find the TextView in the list_item.xml layout with ID miwok_text_view
        TextView magnitudeTextView = listItemView.findViewById(R.id.magnitude_text_view);
        // Get the miwok translation from the current WordAdapter object and
        // set this text on the magnitude TextView
        magnitudeTextView.setText(currentQuake.getmMagnitude());

        // Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView locationTextView = listItemView.findViewById(R.id.location_text_view);
        // Get the default translation from the current WordAdapter object and
        // set this text on the location TextView
        locationTextView.setText(currentQuake.getmLocation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView dateTextView = listItemView.findViewById(R.id.date_text_view);
        // Get the default translation from the current WordAdapter object and
        // set this text on the number TextView
        dateTextView.setText(currentQuake.getmDate());


//        // Set the theme color for the list item
//        View textContainer = listItemView.findViewById(R.id.text_container);
//        // Find the color that the resource ID maps to
//        int color = ContextCompat.getColor(getContext(), mColorResourceId);
//        // Set the background color of the text container View
//        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and one Image)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
