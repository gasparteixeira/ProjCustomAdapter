package edm.rs.senac.com.br.projetocustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ContatoAdapter extends BaseAdapter {
    private List<Contato> listaContados;
    private Context contexto;

    public ContatoAdapter(Context contexto, List<Contato> listaContados) {
        this.listaContados = listaContados;
        this.contexto = contexto;
    }

    @Override
    public int getCount() {
        return listaContados.size();
    }

    @Override
    public Object getItem(int position) {
        return (listaContados.get(position));
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Contato contato = listaContados.get(position);

        LayoutInflater inflater = (LayoutInflater)contexto.getSystemService(
                contexto.LAYOUT_INFLATER_SERVICE
        );

        View viewInflate = inflater.inflate(R.layout.list_item,null);
        TextView textNome = (TextView)viewInflate.findViewById(R.id.idNome);
        textNome.setText(contato.getNome());

        TextView textTelefone = (TextView)viewInflate.findViewById(R.id.idTelefone);
        textTelefone.setText(contato.getTelefone());

        return viewInflate;
    }
}
