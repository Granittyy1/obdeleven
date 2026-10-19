package com.google.gson.internal.sql;

import M7.b;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.m;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f28980b = new m() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.m
        public final <T> TypeAdapter<T> create(Gson gson, L7.a<T> aVar) {
            if (aVar.getRawType() != Timestamp.class) {
                return null;
            }
            gson.getClass();
            return new SqlTimestampTypeAdapter(gson.e(L7.a.get(Date.class)));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeAdapter<Date> f28981a;

    public SqlTimestampTypeAdapter() {
        throw null;
    }

    public SqlTimestampTypeAdapter(TypeAdapter typeAdapter) {
        this.f28981a = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    public final Timestamp read(M7.a aVar) throws IOException {
        Date date = this.f28981a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(b bVar, Timestamp timestamp) throws IOException {
        this.f28981a.write(bVar, timestamp);
    }
}
