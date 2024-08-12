package com.example.hw31_3m;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw31_3m.databinding.ItemPizzaBinding;

import java.util.ArrayList;

public class PizzaAdapter extends RecyclerView.Adapter<PizzaViewHolder> {
    private ArrayList<Pizza> pizzaList;

    public PizzaAdapter(ArrayList<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    @NonNull
    @Override
    public PizzaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PizzaViewHolder(ItemPizzaBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaViewHolder holder, int position) {
        holder.onBind(pizzaList.get(position));
    }

    @Override
    public int getItemCount() {
        return pizzaList.size();
    }
}
class PizzaViewHolder extends RecyclerView.ViewHolder{

    ItemPizzaBinding binding;

    public PizzaViewHolder(ItemPizzaBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public void onBind(Pizza pizza){
        binding.tvName.setText(pizza.getName());
        Glide.with(binding.imgPizza).load(pizza.getImage()).into(binding.imgPizza);
    }
}
