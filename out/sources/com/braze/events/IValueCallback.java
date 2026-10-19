package com.braze.events;

/* JADX INFO: loaded from: classes.dex */
public interface IValueCallback<T> {
    void onSuccess(T t8);

    default void onError() {
    }
}
