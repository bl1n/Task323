package team.lf.task323;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = findViewById(R.id.imageView);
        Drawable drawable = mImageView.getDrawable();

        mImageView.setOnClickListener(v->{
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            }
        });

    }
}
