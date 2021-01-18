package com.example.tareainterfazusuariows.Fragmentos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tareainterfazusuariows.Adaptador.Adaptador;
import com.example.tareainterfazusuariows.R;
import com.example.tareainterfazusuariows.Adaptador.RecyclerViewAdaptador;

import java.util.ArrayList;
import java.util.List;

public class fragmentChat extends Fragment {
    View v;
    private RecyclerView myrecyclerview;
    private List<Adaptador> chats;
    private Bundle savedInstanceState;

    public fragmentChat(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.chat,container,false);
        myrecyclerview = v.findViewById(R.id.recyclerView);
        RecyclerViewAdaptador recyclerAdapter = new RecyclerViewAdaptador(getContext(), chats);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        chats = new ArrayList<>();
        chats.add(new Adaptador("JEAN","Hola, que tal?",R.drawable.jean));
        chats.add(new Adaptador("WILMER","Hola?",R.drawable.almeida));
        chats.add(new Adaptador("Juan","que tal?",R.drawable.carlos));
        chats.add(new Adaptador("Sebas","que?",R.drawable.murillo));


    }
}
