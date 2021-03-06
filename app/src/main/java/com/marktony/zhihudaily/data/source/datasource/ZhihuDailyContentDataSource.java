/*
 * Copyright 2016 lizhaotailang
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

package com.marktony.zhihudaily.data.source.datasource;

import android.support.annotation.NonNull;

import com.marktony.zhihudaily.data.ZhihuDailyContent;

/**
 * Created by lizhaotailang on 2017/5/25.
 *
 * Main entry point for accessing the {@link ZhihuDailyContent} data.
 */

public interface ZhihuDailyContentDataSource {

    interface LoadZhihuDailyContentCallback {

        void onContentLoaded(@NonNull ZhihuDailyContent content);

        void onDataNotAvailable();

    }

    void getZhihuDailyContent(int id, @NonNull LoadZhihuDailyContentCallback callback);

    void saveContent(@NonNull ZhihuDailyContent content);

}
