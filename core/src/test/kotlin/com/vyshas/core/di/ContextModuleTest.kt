/*
 * Copyright 2021 vyshas
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.vyshas.core.di

import android.app.Application
import com.vyshas.core.di.modules.ContextModule
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class ContextModuleTest {

    @MockK(relaxed = true)
    lateinit var application: Application
    private lateinit var contextModule: ContextModule

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        contextModule = ContextModule(application)
    }

    @Test
    fun verifyProvidedContext() {
        assertEquals(application, contextModule.provideContext())
    }
}
