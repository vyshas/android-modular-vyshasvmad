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

package com.vyshas.dynamicfeatures.characterslist.ui.list.adapter.holders

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import com.vyshas.commons.ui.base.BaseViewHolder
import com.vyshas.dynamicfeatures.characterslist.databinding.ListItemErrorBinding
import com.vyshas.dynamicfeatures.characterslist.ui.list.CharactersListViewModel

/**
 * Class describes characters error view and metadata about its place within the [RecyclerView].
 *
 * @see BaseViewHolder
 */
class ErrorViewHolder(
    inflater: LayoutInflater
) : BaseViewHolder<ListItemErrorBinding>(
    binding = ListItemErrorBinding.inflate(inflater)
) {

    /**
     * Bind view data binding variables.
     *
     * @param viewModel character list view model.
     */
    fun bind(viewModel: CharactersListViewModel) {
        binding.viewModel = viewModel
        binding.executePendingBindings()
    }
}
