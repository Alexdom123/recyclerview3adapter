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
import org.w3c.dom.Text

class adapter2(luchadores2:ArrayList<Luchador2>, context: Context): RecyclerView.Adapter<adapter2.ViewHolder>() {

    var luchadores2:ArrayList<Luchador2>?=null
    var context:Context?=null

    init {
        this.luchadores2 = luchadores2
        this.context = context
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {

        val vistaluchador:View = LayoutInflater.from(context).inflate(R.layout.layout_a2,p0,false)
        val luchadorViewHolder = ViewHolder(vistaluchador)
        vistaluchador.tag = luchadorViewHolder
        return luchadorViewHolder
    }

    override fun getItemCount(): Int {
        return luchadores2!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name!!.text = luchadores2!![position].name
        Picasso.get()
            .load(luchadores2!![position].foto)
            .into(holder.imagen)

    }

    class ViewHolder(vista: View):RecyclerView.ViewHolder(vista) {
        var imagen:ImageView?=null
        var name:TextView?=null

        init {
            imagen = vista.iv1
            name = vista.tv1
        }
    }

}