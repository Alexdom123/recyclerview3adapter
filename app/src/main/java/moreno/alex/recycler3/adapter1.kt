package moreno.alex.recycler3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.layout_a1.view.*
import kotlinx.android.synthetic.main.layout_a1.view.iv1
import kotlinx.android.synthetic.main.layout_a2.view.*

class adapter1(luchadores:ArrayList<Luchador>, context: Context): RecyclerView.Adapter<adapter1.ViewHolder>() {

    var luchadores:ArrayList<Luchador>?=null
    var context:Context?=null

    init {
        this.luchadores = luchadores
        this.context = context
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {

        val vistaluchador:View = LayoutInflater.from(context).inflate(R.layout.layout_a1,p0,false)
        val luchadorViewHolder = ViewHolder(vistaluchador)
        vistaluchador.tag = luchadorViewHolder
        return luchadorViewHolder
    }

    override fun getItemCount(): Int {
        return luchadores!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        Picasso.get()
            .load(luchadores!![position].foto)
            .into(holder.imagen)

    }

    class ViewHolder(vista: View):RecyclerView.ViewHolder(vista) {
        var imagen:ImageView?=null


        init {
            imagen = vista.iv1

        }
    }

}