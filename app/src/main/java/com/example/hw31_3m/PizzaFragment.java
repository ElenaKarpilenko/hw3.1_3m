package com.example.hw31_3m;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw31_3m.databinding.FragmentPizzaBinding;

import java.util.ArrayList;

public class PizzaFragment extends Fragment {

    FragmentPizzaBinding binding;
    private ArrayList<Pizza> pizzaList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPizzaBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initAdapter();
        PizzaAdapter pizzaAdapter = new PizzaAdapter(pizzaList);
        binding.rvPizza.setAdapter(pizzaAdapter);
        binding.rvPizza.setLayoutManager(
                new GridLayoutManager(requireContext(), 3, LinearLayoutManager.VERTICAL, false));
    }

    private void initAdapter() {
        pizzaList.add(new Pizza("https://t3.ftcdn.net/jpg/06/27/23/56/360_F_627235669_iz0O2leKYRzjxAKdFP7odpp9eCOZREtN.jpg", "pizza"));
        pizzaList.add(new Pizza("https://png.pngtree.com/png-clipart/20230412/original/pngtree-modern-kitchen-food-boxed-cheese-lunch-pizza-png-image_9048155.png", "pizza"));
        pizzaList.add(new Pizza("https://static.vecteezy.com/system/resources/thumbnails/025/076/438/small/pizza-isolated-illustration-ai-generative-png.png", "pizza"));
        pizzaList.add(new Pizza("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT0m0Z6Nkc3UXuyG3uc7bgFQYpZA5YFMQazYw&s", "pizza"));
        pizzaList.add(new Pizza("https://img.freepik.com/free-psd/delicious-freshly-made-peperoni-pizza-isolated-transparent-background_125540-5128.jpg", "pizza"));
        pizzaList.add(new Pizza("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSnne2kaoZcd_Mbt7x_195lFptVsWPXigXs3g&s", "pizza"));
        pizzaList.add(new Pizza("https://image.similarpng.com/very-thumbnail/2020/05/Fresh-tasty-pizza-PNG.png", "pizza"));
        pizzaList.add(new Pizza("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLjMXCWjN7HnRXueoXkwnWgYEpwOv9h4DZbg&s", "pizza"));
        pizzaList.add(new Pizza("https://images.freeimages.com/image/previews/78c/cheesy-slice-png-food-icon-5692718.png", "pizza"));
        pizzaList.add(new Pizza("https://t3.ftcdn.net/jpg/06/27/23/56/360_F_627235669_iz0O2leKYRzjxAKdFP7odpp9eCOZREtN.jpg", "pizza"));
        pizzaList.add(new Pizza("https://png.pngtree.com/png-clipart/20230412/original/pngtree-modern-kitchen-food-boxed-cheese-lunch-pizza-png-image_9048155.png", "pizza"));
        pizzaList.add(new Pizza("https://static.vecteezy.com/system/resources/thumbnails/025/076/438/small/pizza-isolated-illustration-ai-generative-png.png", "pizza"));
        pizzaList.add(new Pizza("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT0m0Z6Nkc3UXuyG3uc7bgFQYpZA5YFMQazYw&s", "pizza"));
        pizzaList.add(new Pizza("https://img.freepik.com/free-psd/delicious-freshly-made-peperoni-pizza-isolated-transparent-background_125540-5128.jpg", "pizza"));
        pizzaList.add(new Pizza("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSnne2kaoZcd_Mbt7x_195lFptVsWPXigXs3g&s", "pizza"));
        pizzaList.add(new Pizza("https://image.similarpng.com/very-thumbnail/2020/05/Fresh-tasty-pizza-PNG.png", "pizza"));
        pizzaList.add(new Pizza("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLjMXCWjN7HnRXueoXkwnWgYEpwOv9h4DZbg&s", "pizza"));
        pizzaList.add(new Pizza("https://images.freeimages.com/image/previews/78c/cheesy-slice-png-food-icon-5692718.png", "pizza"));
        pizzaList.add(new Pizza("https://t3.ftcdn.net/jpg/06/27/23/56/360_F_627235669_iz0O2leKYRzjxAKdFP7odpp9eCOZREtN.jpg", "pizza"));
        pizzaList.add(new Pizza("https://png.pngtree.com/png-clipart/20230412/original/pngtree-modern-kitchen-food-boxed-cheese-lunch-pizza-png-image_9048155.png", "pizza"));
        pizzaList.add(new Pizza("https://static.vecteezy.com/system/resources/thumbnails/025/076/438/small/pizza-isolated-illustration-ai-generative-png.png", "pizza"));
        pizzaList.add(new Pizza("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT0m0Z6Nkc3UXuyG3uc7bgFQYpZA5YFMQazYw&s", "pizza"));
        pizzaList.add(new Pizza("https://img.freepik.com/free-psd/delicious-freshly-made-peperoni-pizza-isolated-transparent-background_125540-5128.jpg", "pizza"));
        pizzaList.add(new Pizza("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSnne2kaoZcd_Mbt7x_195lFptVsWPXigXs3g&s", "pizza"));
        pizzaList.add(new Pizza("https://image.similarpng.com/very-thumbnail/2020/05/Fresh-tasty-pizza-PNG.png", "pizza"));
        pizzaList.add(new Pizza("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLjMXCWjN7HnRXueoXkwnWgYEpwOv9h4DZbg&s", "pizza"));
        pizzaList.add(new Pizza("https://images.freeimages.com/image/previews/78c/cheesy-slice-png-food-icon-5692718.png", "pizza"));
    }
}