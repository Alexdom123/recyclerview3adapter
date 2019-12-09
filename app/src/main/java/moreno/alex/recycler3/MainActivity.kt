package moreno.alex.recycler3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var luchadores = ArrayList<Luchador>()
        var luchadores2 = ArrayList<Luchador2>()
        var luchadores3 = ArrayList<Luchador3>()


        luchadores.add(Luchador("https://www.talksports24x7.com/wp-content/uploads/2018/04/960-680x439.jpg"))
        luchadores2.add(Luchador2("https://images.mediotiempo.com/McXn21i-rP6hkTu6Rg0gP9l_iyU=/958x596/uploads/media/2016/05/08/edge-8.jpg", "Edge"))
        luchadores3.add(Luchador3("https://s3.superluchas.com/2016/04/Jeff-Hardy.jpg", "Jeff Hardy", "Campeón intercontinental", "No more words"))


        MyRecyclerView.adapter = adapter1(luchadores, this)
        MyRecyclerView.adapter = adapter2(luchadores2, this)
        MyRecyclerView.adapter = adapter3(luchadores3, this)

        MyRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }
}
