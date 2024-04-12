package ayala.diego.milista

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorPagos(val pagos: List<Pago>): RecyclerView.Adapter<AdaptadorPagos.PagoViewHolder>() {

    class PagoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var imagenPago: ImageView = itemView.findViewById(R.id.imagen_pago)
        var titulo: TextView = itemView.findViewById(R.id.titulo_pago)
        var monto: TextView = itemView.findViewById(R.id.monto_pago)
        var desc: TextView = itemView.findViewById(R.id.desc_pago)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagoViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.lista_item, parent, false)
        return PagoViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return pagos.size
    }

    override fun onBindViewHolder(holder: PagoViewHolder, position: Int) {
        val pago: Pago = pagos[position]
        holder.imagenPago.setImageResource(pago.imagen)
        holder.titulo.text = pago.titulo
        holder.monto.text = "$" + pago.monto
        holder.desc.text = pago.desc
    }
}