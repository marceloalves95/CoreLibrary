package br.com.corelibrary.testing

import io.mockk.MockKAnnotations

/**
 * @author RubioAlves
 * Created 21/04/2022 at 19:02
 */
abstract class BaseTest {
    init {
        MockKAnnotations.init(this)
    }
}