package com.example.recyclerviewfullexercise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter myAdapter;
    SwipeRefreshLayout swipeRefreshLayout;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }//onCreate END


    //Adapter
    private class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

        //連結layout中的元件到變數
        class ViewHolder extends RecyclerView.ViewHolder{
            private TextView playerName, threePLabel, threePInput, twoPLabel, twoPInput, assistLabel, assistInput, reboundLabel, reboundInput;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                playerName = itemView.findViewById(R.id.playerName);
                threePLabel = itemView.findViewById(R.id.threePointLabel);
                threePInput = itemView.findViewById(R.id.threePointInput);
                twoPLabel = itemView.findViewById(R.id.twoPointLabel);
                twoPInput = itemView.findViewById(R.id.twoPointInput);
                assistLabel = itemView.findViewById(R.id.assistLabel);
                assistInput = itemView.findViewById(R.id.assistInput);
                reboundLabel = itemView.findViewById(R.id.reboundLabel);
                reboundInput = itemView.findViewById(R.id.reboundInput);
            }
        }//ViewHolder END



        //連結layout並return View
        @NonNull
        @Override
        public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }//onCreateViewHolder END

        @Override
        public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {

        }//onBindViewHolder END

        @Override
        public int getItemCount() {
            return 0;
        }//getItemCount END

    }//MyAdapter END














}//MainActivity END