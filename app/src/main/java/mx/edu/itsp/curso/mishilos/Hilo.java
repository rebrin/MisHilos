package mx.edu.itsp.curso.mishilos;

import android.widget.TextView;


public class Hilo implements Runnable {
    TextView tvsalida;
    Hilo(TextView tv){
        tvsalida=tv;
    }
    @Override
    public void run() {
        Integer i=0;
        for (i=0;i<200;i++){
            try {
                Thread.sleep(1000);
                tvsalida.setText("valor I:"+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
