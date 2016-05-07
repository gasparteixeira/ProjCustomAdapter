package edm.rs.senac.com.br.projetocustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Contato> listatContatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listatContatos = new ArrayList<>();
        listatContatos.add(new Contato("Fulano", "(51) 9999-9999"));
        listatContatos.add(new Contato("Ciclano", "(51) 9999-9999"));
        listatContatos.add(new Contato("Beltrano de Tal", "(51) 9999-9999"));

        updateList();
    }

    private void updateList() {
        ContatoAdapter adapter = new ContatoAdapter(this,listatContatos);
        ListView lista = (ListView)findViewById(R.id.listView);
        lista.setAdapter(adapter);
    }
}
