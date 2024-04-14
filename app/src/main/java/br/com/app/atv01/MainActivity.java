package br.com.app.atv01;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import br.com.app.atv01.splash.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread thread1= new Thread(){
            @Override
            public void run(){

                try {
                    sleep(4500);
                    startActivity(new Intent(MainActivity.this, TelaLogin.class));
                    finish();
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }

            }
        }; thread1.start();
}
}