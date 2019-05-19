package learning.binding.cresterida.me

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.main_layout.*

class NewMainActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        val model=ViewModelProviders.of(this).get(MainViewModelNumberGenerator::class.java)



        val myNumber=model.getNumber()
        myNumber.observe(
            this,
            Observer {

                tvNumber.text=it
            }
        )

        Log.i(TAG,"Random number set")
    }

    companion object{
        private var TAG=NewMainActivity::class.simpleName
    }

}