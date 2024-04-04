package com.example.tugas6;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {

    private List<Country> countries;
    private Context context;

    public CountryAdapter(Context context, List<Country> countries) {
        this.context = context;
        this.countries = countries;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_country, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Country country = countries.get(position);
        holder.countryName.setText(country.getName());
        holder.countryDescription.setText(country.getDescription());
        holder.countryRating.setText(country.getRating());

        // Set gambar bendera negara
        int imageResource = context.getResources().getIdentifier(country.getImage(), "drawable", context.getPackageName());
        holder.countryImage.setImageResource(imageResource);

        // Tambahkan OnClickListener ke ImageView
        holder.countryImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Buat intent dan kirim ke DetailNegaraActivity
                Intent intent = new Intent(context, DetailNegaraActivity.class);
                intent.putExtra("nama_negara", country.getName());
                intent.putExtra("deskripsi_negara", country.getDescription());
                intent.putExtra("rating_negara", country.getRating());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView countryName, countryDescription, countryRating;
        ImageView countryImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            countryName = itemView.findViewById(R.id.textViewCountryName);
            countryDescription = itemView.findViewById(R.id.textViewCountryDescription);
            countryRating = itemView.findViewById(R.id.textViewCountryRating);
            countryImage = itemView.findViewById(R.id.imageViewCountry);
        }
    }
}
