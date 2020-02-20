package mx.edu.itsp.curso.mishilos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.core.os.postDelayed
import kotlinx.android.synthetic.main.activity_handler.*

class HandlerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_handler)

        var handler=Handler()
        var runnable= Runnable {
            var i=0
            while(i<6) {
                Log.i("hilo", "se ha ejecutado la accion")
                tvHandler.append("\nmodificando el contenido")
                i++

            }
        }
        handler.postDelayed(runnable,2000)
    }
}
