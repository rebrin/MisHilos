package mx.edu.itsp.curso.mishilos

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_imgload.*
import java.io.InputStream
import java.net.URL

class IMGLoadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imgload)
    }

    fun descargar(view: View){
       var hilo=Thread(Runnable {
           var imagen=download_img("https://vignette.wikia.nocookie.net/naruto/images/1/12/La_Promesa_de_Naruto.png/revision/latest?cb=20110825232746&path-prefix=es")
           this@IMGLoadActivity.runOnUiThread(
               Runnable {
                   img_princ.setImageBitmap(imagen)
               }
           )
       }).start()
    }

    fun download_img(url:String):Bitmap{
            var bitmap=BitmapFactory.decodeStream(URL(url).content as InputStream?)
            return bitmap
    }
}

