/*
 *     Pupil, Hitomi.la viewer for Android
 *     Copyright (C) 2019  tom5079
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package xyz.quaver.pupil.adapters

import android.net.Uri
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.github.piasy.biv.view.BigImageView
import xyz.quaver.pupil.R

class ThumbnailAdapter(var thumbnails: List<String>) : RecyclerView.Adapter<ThumbnailAdapter.ViewHolder>() {

    class ViewHolder(val view: BigImageView) : RecyclerView.ViewHolder(view) {
        fun clear() {
            view.ssiv?.recycle()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(BigImageView(parent.context).apply {
            setFailureImage(ContextCompat.getDrawable(context, R.drawable.image_broken_variant))
        })
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.view.showImage(Uri.parse(thumbnails[position]))
    }

    override fun getItemCount() = thumbnails.size

    override fun onViewRecycled(holder: ViewHolder) {
        holder.clear()
    }

}