package com.example.samplemvvm.ListMovieFragment;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.samplemvvm.R;
import com.example.samplemvvm.databinding.FragmentMovieListBinding;
import com.example.samplemvvm.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieListFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private FragmentMovieListBinding binding;

    public MovieListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_movie_list, container, false);
        setupRvMovie();
        return binding.getRoot();
    }

    private void setupRvMovie(){
        RecyclerView recyclerView = binding.rvMovie;
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
//        untuk menjadi dua kolom
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Kingsman: The Secret Service", "Gary 'Eggsy' Unwin faces several challenges when he gets recruited as a secret agent in a secret spy organisation in order to look for Richmond Valentine, an eco-terrorist.", false));
        movieList.add(new Movie("Kingsman: The Golden Circle", "After the enemies blow up their headquarters, the surviving agents of Kingsman band together with their American counterpart to take down a ruthless drug cartel.", false));
        movieList.add(new Movie("The Maze Runner", "Thomas loses his memory and finds himself trapped in a massive maze called the Glade. He and his friends try to escape from the maze and eventually learn that they are subjects of an experiment.", false));
        movieList.add(new Movie("Divergent", "Tris, an adult resident of a futuristic world divided into five factions, elects to join the Dauntless faction. But she actually belongs to another faction, which she must hide, as a major war looms.", false));
        movieList.add(new Movie("Insurgent", "Tris Prior is a divergent who does not belong to any one faction dictated by the government. She must unite with other divergents and unravel a conspiracy that threatens their lives.", false));
        movieList.add(new Movie("Never Have I Ever", "The complicated life of a first-generation Indian-American teenager.", false));
        MovieAdapter adapter = new MovieAdapter(movieList);
        recyclerView.setAdapter(adapter);
    }
}