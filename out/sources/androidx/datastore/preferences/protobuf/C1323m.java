package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ExtensionRegistryLite.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1323m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C1323m f17264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1323m f17265c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<a, GeneratedMessageLite.e<?, ?>> f17266a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m$a */
    /* JADX INFO: compiled from: ExtensionRegistryLite.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I f17267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17268b;

        public a(int i10, I i11) {
            this.f17267a = i11;
            this.f17268b = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f17267a == aVar.f17267a && this.f17268b == aVar.f17268b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f17267a) * 65535) + this.f17268b;
        }
    }

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        f17265c = new C1323m(0);
    }

    public C1323m() {
        this.f17266a = new HashMap();
    }

    public static C1323m a() {
        C1323m c1323m = f17264b;
        if (c1323m == null) {
            synchronized (C1323m.class) {
                try {
                    c1323m = f17264b;
                    if (c1323m == null) {
                        Class<?> cls = C1322l.f17263a;
                        if (cls != null) {
                            try {
                                c1323m = (C1323m) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                                c1323m = f17265c;
                            }
                        } else {
                            c1323m = f17265c;
                        }
                        f17264b = c1323m;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c1323m;
    }

    public C1323m(int i10) {
        this.f17266a = Collections.emptyMap();
    }
}
