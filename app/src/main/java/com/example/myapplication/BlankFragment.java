package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


public class BlankFragment extends Fragment {

    private final String TAG = "BlankFragment";

    private List<Fruit> fruitList = new ArrayList<>();

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView");
        initFruit();

        //初始化布局
        View root = inflater.inflate(R.layout.fragment_blank, container, false);

        //获取布局中的列表
        RecyclerView recyclerView = (RecyclerView)root.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(inflater.getContext());
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter fruitAdapter = new FruitAdapter(fruitList);
        //将数据加载到列表中
        recyclerView.setAdapter(fruitAdapter);
        return root;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

//   列表假数据
    private void initFruit() {
        for(int i =3000;i>0;i--){
            Fruit orange = new Fruit("orange",R.drawable.ic_launcher);
            fruitList.add(orange);
            Fruit waterMelon = new Fruit("waterMelon",R.drawable.ic_launcher);
            fruitList.add(waterMelon);
            Fruit apple = new Fruit("apple",R.drawable.ic_launcher);
            fruitList.add(apple);

        }
    }
}