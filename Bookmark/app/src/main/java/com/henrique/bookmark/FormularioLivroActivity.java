package com.henrique.bookmark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.henrique.bookmark.model.Livro;

import io.objectbox.Box;

public class FormularioLivroActivity extends AppCompatActivity {

    private EditText editTitulo;

    private Box<Livro> livroBox;
    private Livro livro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_livro);

        livroBox = ((App)getApplication()).getBoxStore().boxFor(Livro.class);

        livro = new Livro();

        Intent intent = getIntent();
        long id = intent.getLongExtra("idLivro", -1);

        if (id != -1){
            livro = livroBox.get(id);
            editTitulo.setText(livro.getTitulo());
        }


        setupViews();
    }

    public void salvarLivro(View view) {

        // obter dados inseridos
        String titulo = editTitulo.getText().toString();

        // preencher atributos
        livro.setTitulo(titulo);

        // salvar ou atualizar
        livroBox.put(livro);

        //encerra
        finish();
    }

    private void setupViews() {

        editTitulo = findViewById(R.id.edit_titulo);
    }
}
