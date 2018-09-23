package com.example.fegi.sigap;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Fegi on 9/18/2018.
 */

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private Context mCtx;
    private List<Product> productList;

    public ProductAdapter(Context mCtx, List<Product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_view, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = productList.get(position);

        holder.textViewTitle.setText(product.getTitle());
        holder.textViewDesc.setText(product.getShortdesc());
        holder.textViewRating.setText(String.valueOf(product.getRating()));
        holder.textViewPrice.setText(String.valueOf(product.getPrice()));

        holder.imageview.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        ImageView imageview;
        TextView textViewTitle, textViewDesc, textViewRating, textViewPrice;

        public ProductViewHolder(View itemview) {
            super(itemview);

            imageview = itemView.findViewById(R.id.imageView);
            textViewTitle = itemview.findViewById(R.id.textViewTitle);
            textViewDesc = itemview.findViewById(R.id.textViewShortDesc);
            textViewRating = itemview.findViewById(R.id.textViewRating);
            textViewPrice = itemview.findViewById(R.id.textViewPrice);
        }
    }
}
