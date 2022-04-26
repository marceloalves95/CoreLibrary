package br.com.corelibrary.components.extensions

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

/**
 * @author RubioAlves
 * Created 30/03/2022 at 20:45
 */
fun Activity.overrideTransition(start:Int, end:Int) = overridePendingTransition(start,end)
fun Activity.startActivityWithAnimation(intent: Intent){
    startActivity(intent)
}
inline fun <reified T> Activity.extra(key: String): Lazy<T> = lazy {
    val value = intent.extras?.get(key)
    if (value is T) value else throw IllegalArgumentException("didn't find extra with key $key")
}
inline fun <reified T> AppCompatActivity.observe(
    liveData: LiveData<T>,
    noinline lifecycle:(T) -> Unit){

    liveData.observe(this, Observer(lifecycle))
}