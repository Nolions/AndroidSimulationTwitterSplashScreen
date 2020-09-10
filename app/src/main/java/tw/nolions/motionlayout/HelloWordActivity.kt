package tw.nolions.motionlayout

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class HelloWordActivity : AppCompatActivity() {
    companion object {
        fun getIntent(context: Context) = Intent(context, HelloWordActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_helloword)
    }
}