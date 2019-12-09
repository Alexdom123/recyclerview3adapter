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
import kotlinx.android.synthetic.main.layout_a2.view.tv1
import kotlinx.android.synthetic.main.layout_a3.view.*
import org.w3c.dom.Text

class adapter3(luchadores3:ArrayList<Luchador3>, context: Context): RecyclerView.Adapter<adapter3.ViewHolder>() {

    var luchadores3:ArrayList<Luchador3>?=null
    var context:Context?=null

    init {
        this.luchadores3 = luchadores3
        this.context = context
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {

        val vistaluchador:View = LayoutInflater.from(context).inflate(R.layout.layout_a3,p0,false)
        val luchadorViewHolder = ViewHolder(vistaluchador)
        vistaluchador.tag = luchadorViewHolder
        return luchadorViewHolder
    }

    override fun getItemCount(): Int {
        return luchadores3!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name!!.text = luchadores3!![position].name
        holder.campeon!!.text = luchadores3!![position].campeon
        holder.cancion!!.text = luchadores3!![position].cancion
        Picasso.get()
            .load(luchadores3!![position].foto)
            .into(holder.imagen)

    }

    class ViewHolder(vista: View):RecyclerView.ViewHolder(vista) {
        var imagen:ImageView?=null
        var name:TextView?=null
        var campeon:TextView?=null
        var cancion:TextView?=null

        init {
            imagen = vista.iv1
            name = vista.tv1
            campeon = vista.tv2
            cancion = vista.tv3
        }
    }

}