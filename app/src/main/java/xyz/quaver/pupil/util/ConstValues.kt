/*
 *     Pupil, Hitomi.la viewer for Android
 *     Copyright (C) 2020  tom5079
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

package xyz.quaver.pupil.util

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import okhttp3.Dispatcher
import okhttp3.OkHttpClient
import xyz.quaver.proxy
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

const val REQUEST_LOCK = 38238
const val REQUEST_RESTORE = 16546
const val REQUEST_IMPORT_OLD_GALLERIES = 6458
const val REQUEST_IMPORT_OLD_GALLERIES_OLD = 5946
const val REQUEST_DOWNLOAD_FOLDER = 3874
const val REQUEST_DOWNLOAD_FOLDER_OLD = 3425
const val REQUEST_WRITE_PERMISSION_AND_SAF = 13900

const val NOTIFICATION_ID_UPDATE = 2345

val json = Json(JsonConfiguration.Stable)