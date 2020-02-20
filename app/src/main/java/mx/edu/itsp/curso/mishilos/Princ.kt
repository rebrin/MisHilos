package mx.edu.itsp.curso.mishilos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class Princ : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       /* var hilo=Thread(
            Runnable({
                this@MainActivity.runOnUiThread(Runnable {
                    var i=0
                    while(i<200){
                        TVSalida.append("i:"+i++)
                    }
                })
            })
        ).start()
        */

        var hilo=Thread(Hilo(TVSalida)).start()

    }


}
