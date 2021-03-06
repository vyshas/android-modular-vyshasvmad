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

package com.vyshas.dynamicfeatures.characterslist.ui.list.model

import org.junit.Assert
import org.junit.Test

class CharacterItemTest {

    @Test
    fun createCharacterItem_ShouldAddCorrectAttributes() {
        val id = 131231L
        val name = "A.I.M"
        val description = "AIM is a terrorist organization bent on destroying the world."
        val imageUrl = "http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784.jpg"

        val character = CharacterItem(
            id = id,
            name = name,
            description = description,
            imageUrl = imageUrl
        )

        Assert.assertEquals(id, character.id)
        Assert.assertEquals(name, character.name)
        Assert.assertEquals(description, character.description)
        Assert.assertEquals(imageUrl, character.imageUrl)
    }
}
