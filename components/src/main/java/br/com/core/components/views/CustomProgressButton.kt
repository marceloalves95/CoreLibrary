package br.com.corelibrary.components.views

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import br.com.corelibrary.R
import br.com.corelibrary.components.extensions.getLayoutContainer
import br.com.corelibrary.databinding.ProgressButtonBinding

/**
 * @author RubioAlves
 * Created 02/04/2022 at 17:06
 */

class CustomProgressButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet?,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private var title:String? = null
    private var loadingTitle:String? = null
    private val binding = ProgressButtonBinding.inflate(getLayoutContainer(), this, true)

    private var state:ProgressButtonState = ProgressButtonState.Normal
        set(value) {
            field = value
            refreshState()
        }

    private fun refreshState() {

        isEnabled = state.isEnabled
        isClickable = state.isEnabled
        refreshDrawableState()

        binding.run {
            textTitle.apply {
                isEnabled = state.isEnabled
                isClickable = state.isEnabled
            }
            progressButton.apply {
                visibility = state.progressVisibility
            }
        }
        when(state){
            ProgressButtonState.Normal -> binding.textTitle.text = title
            ProgressButtonState.Loading -> binding.textTitle.text = loadingTitle
        }
    }

    init {
        setLayout(attrs)
        refreshState()
    }
    private fun setLayout(attrs:AttributeSet?){

        attrs?.let { attributeSet->

            val attributes = context.obtainStyledAttributes(attributeSet, R.styleable.CustomProgressButton)

            setBackgroundResource(R.drawable.progress_button_background)

            val titleResId = attributes.getResourceId(R.styleable.CustomProgressButton_progress_button_title, 0)
            if (titleResId != 0){
                title = context.getString(titleResId)
            }
            val loadingTitleResId = attributes.getResourceId(R.styleable.CustomProgressButton_progress_button_loading_title, 0)
            if (loadingTitleResId != 0){
                loadingTitle = context.getString(loadingTitleResId)
            }

            attributes.recycle()

        }


    }
    fun setLoading(){
        state = ProgressButtonState.Loading
    }
    fun setNormal(){
        state = ProgressButtonState.Normal
    }

    sealed class ProgressButtonState(val isEnabled:Boolean, val progressVisibility:Int){
        object Normal:ProgressButtonState(true, View.GONE)
        object Loading:ProgressButtonState(false,View.VISIBLE)
    }

}