package com.henrique.bookmark;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.henrique.bookmark.adapter.LivroRVAdapter;
import com.henrique.bookmark.model.Livro;

import java.util.List;

import io.objectbox.Box;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    private Box<Livro> livroBox;
    private RecyclerView rvBiblioteca;

    private BottomNavigationView bottomNavigationView;
    private TextView tvBiblioteca;
    private FrameLayout frameMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        livroBox = ((App) getApplication()).getBoxStore().boxFor(Livro.class);

        setupViews();
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.item_biblioteca:
                List<Livro> livros = livroBox.getAll();
                LivroRVAdapter adapter = new LivroRVAdapter(this, livros, livroBox);

                rvBiblioteca.setAdapter(adapter);
                rvBiblioteca.setLayoutManager(new LinearLayoutManager(this));
                rvBiblioteca.hasFixedSize();

                break;

            case R.id.item_lendo:
                tvBiblioteca.setText(R.string.lendo);
                break;

            case R.id.item_lido:
                tvBiblioteca.setText(R.string.lido);
                break;

            case R.id.item_lerei:
                tvBiblioteca.setText(R.string.lerei);
                break;

            case R.id.item_perfil:
                tvBiblioteca.setText(R.string.sinopse);
                break;
        }
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();

        List<Livro> livros = livroBox.getAll();
        LivroRVAdapter adapter = new LivroRVAdapter(this, livros, livroBox);

        rvBiblioteca.setAdapter(adapter);
        rvBiblioteca.setLayoutManager(new LinearLayoutManager(this));
        rvBiblioteca.hasFixedSize();

    }

    private void setupViews() {
        bottomNavigationView = findViewById(R.id.bottom_nav_view);
        tvBiblioteca = findViewById(R.id.tv_biblioteca);
        frameMain = findViewById(R.id.frame_main);
        rvBiblioteca = findViewById(R.id.rv_biblioteca);
    }

//    public void novoLivro(View view) {
//
//        startActivity(new Intent(this, FormularioLivroActivity.class));
//    }

}
