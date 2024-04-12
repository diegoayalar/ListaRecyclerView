package ayala.diego.milista

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pagos = listOf(
            Pago(R.drawable.ticket, "Película Cinepolis", 345, "Pago en cine Cinepolis"),
            Pago(R.drawable.fork_knife, "Cena Tacos el Guero", 220, "Pago en Tacos el Guero Raul Marcos"),
            Pago(R.drawable.basket_shopping, "Mandado Ley", 869, "Pago de mandado en super Ley"),
            Pago(R.drawable.house_bolt, "Luz CFE", 987, "Pago de mensualidad de electricidad"),
            Pago(R.drawable.circle_waveform_lines, "Subscripción Spotify", 69, "Pago mensual de Spotify"),
            Pago(R.drawable.clapperboard, "Subscripción Prime Video", 100, "Pago mensual de Amazon Prime Video"),
            Pago(R.drawable.ticket, "Película Cinepolis", 345, "Pago en cine Cinepolis"),
            Pago(R.drawable.fork_knife, "Cena Tacos el Guero", 220, "Pago en Tacos el Guero Raul Marcos"),
            Pago(R.drawable.basket_shopping, "Mandado Ley", 869, "Pago de mandado en super Ley"),
            Pago(R.drawable.house_bolt, "Luz CFE", 987, "Pago de mensualidad de electricidad"),
            Pago(R.drawable.circle_waveform_lines, "Subscripción Spotify", 69, "Pago mensual de Spotify"),
            Pago(R.drawable.clapperboard, "Subscripción Prime Video", 100, "Pago mensual de Amazon Prime Video")
        )

        val recyclerPagos: RecyclerView = findViewById(R.id.lista_view)
        recyclerPagos.layoutManager = LinearLayoutManager(this)
        recyclerPagos.adapter = AdaptadorPagos(pagos)
    }
}