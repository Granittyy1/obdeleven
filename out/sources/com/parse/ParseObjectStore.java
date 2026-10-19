package com.parse;

import com.parse.ParseObject;
import com.parse.boltsinternal.Task;

/* JADX INFO: loaded from: classes3.dex */
interface ParseObjectStore<T extends ParseObject> {
    Task<Void> deleteAsync();

    Task<T> getAsync();

    Task<Void> setAsync(T t8);
}
