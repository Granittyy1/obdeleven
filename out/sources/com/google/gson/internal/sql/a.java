package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.m;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: compiled from: SqlTypesSupport.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f28982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f28983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f28984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f28985d;

    /* JADX INFO: renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SqlTypesSupport.java */
    public class C0289a extends DefaultDateTypeAdapter.a<Date> {
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
        public final java.util.Date a(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    /* JADX INFO: compiled from: SqlTypesSupport.java */
    public class b extends DefaultDateTypeAdapter.a<Timestamp> {
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
        public final java.util.Date a(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f28982a = z10;
        if (!z10) {
            f28983b = null;
            f28984c = null;
            f28985d = null;
        } else {
            new C0289a(Date.class);
            new b(Timestamp.class);
            f28983b = SqlDateTypeAdapter.f28976b;
            f28984c = SqlTimeTypeAdapter.f28978b;
            f28985d = SqlTimestampTypeAdapter.f28980b;
        }
    }
}
