/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.text.demo

import androidx.fragment.app.Fragment
import com.example.android.text.demo.linebreak.LineBreakFragment
import com.example.android.text.demo.textspan.TextSpanFragment

class Demo(
    val title: String,
    val fragment: () -> Fragment
)

val Demos = listOf(
    Demo(
        title = "Text span",
        fragment = { TextSpanFragment() }
    ),
    Demo(
        title = "Line break",
        fragment = { LineBreakFragment() }
    ),
)
