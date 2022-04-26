package br.com.core.components.extensions

import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

/**
 * @author RubioAlves
 * Created 30/03/2022 at 20:45
 */
inline fun <reified T> Fragment.observe(
    liveData: LiveData<T>,
    noinline lifecycle:(T) -> Unit){

    liveData.observe(this, Observer(lifecycle))

}
fun Fragment.toast(messagem:String) = Toast.makeText(requireContext(), messagem, Toast.LENGTH_SHORT).show()