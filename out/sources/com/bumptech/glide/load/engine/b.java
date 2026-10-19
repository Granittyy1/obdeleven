package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;

/* JADX INFO: compiled from: DataFetcherGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: compiled from: DataFetcherGenerator.java */
    public interface a {
        void b(A3.b bVar, Object obj, B3.d<?> dVar, DataSource dataSource, A3.b bVar2);

        void c(A3.b bVar, Exception exc, B3.d<?> dVar, DataSource dataSource);
    }

    boolean a();

    void cancel();
}
