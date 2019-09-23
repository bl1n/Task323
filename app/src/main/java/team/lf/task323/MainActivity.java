package team.lf.task323;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = findViewById(R.id.imageView);
        ImageView imageView2 = findViewById(R.id.imageView2);

        Drawable drawable1 = imageView1.getDrawable();
        Drawable drawable2 = imageView2.getDrawable();

        Handler h = new Handler();
        imageView1.setOnClickListener(v -> {
            if (drawable1 instanceof Animatable) {
                ((Animatable) drawable1).start();
                h.postDelayed(((Animatable) drawable2)::start,1500);
            }
        });
        imageView2.setOnClickListener(v -> {
            if (drawable2 instanceof Animatable) {
                ((Animatable) drawable2).start();
                h.postDelayed(((Animatable) drawable1)::start,2250);
            }
        });

    }
}
