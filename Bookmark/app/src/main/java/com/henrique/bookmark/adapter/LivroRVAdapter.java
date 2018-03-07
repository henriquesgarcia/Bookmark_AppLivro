package com.henrique.bookmark.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.henrique.bookmark.R;
import com.henrique.bookmark.model.Livro;

import org.w3c.dom.Text;

import java.util.List;

import io.objectbox.Box;

/**
 * Created by enriq on 04/03/2018.
 */

public class LivroRVAdapter extends RecyclerView.Adapter<LivroRVAdapter.ViewHolder> {

    private Context context;
    private List<Livro> livros;
    private Box<Livro> livroBox;

    public LivroRVAdapter(Context context, List<Livro> livros, Box<Livro> livroBox) {
        this.context = context;
        this.livros = livros;
        this.livroBox = livroBox;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView tvLivroTitulo;

        public ViewHolder(View itemView) {
            super(itemView);

            tvLivroTitulo = itemView.findViewById(R.id.tv_livro_titulo);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_livro_rv, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        Livro livro = this.livros.get(position);

        viewHolder.tvLivroTitulo.setText(livro.getTitulo());

    }

    @Override
    public int getItemCount() {
        return this.livros.size();
    }

}
