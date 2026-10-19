package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ExtensionRegistryLite.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2071m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C2071m f29183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2071m f29184c = new C2071m(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<a, GeneratedMessageLite.e<?, ?>> f29185a;

    /* JADX INFO: renamed from: com.google.protobuf.m$a */
    /* JADX INFO: compiled from: ExtensionRegistryLite.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final J f29186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29187b;

        public a(int i10, J j) {
            this.f29186a = j;
            this.f29187b = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f29186a == aVar.f29186a && this.f29187b == aVar.f29187b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f29186a) * 65535) + this.f29187b;
        }
    }

    public C2071m() {
        this.f29185a = new HashMap();
    }

    public static C2071m a() {
        C2071m c2071m = f29183b;
        if (c2071m == null) {
            synchronized (C2071m.class) {
                try {
                    c2071m = f29183b;
                    if (c2071m == null) {
                        Class<?> cls = C2070l.f29182a;
                        C2071m c2071m2 = null;
                        if (cls != null) {
                            try {
                                c2071m2 = (C2071m) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c2071m2 == null) {
                            c2071m2 = f29184c;
                        }
                        f29183b = c2071m2;
                        c2071m = c2071m2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c2071m;
    }

    public C2071m(int i10) {
        this.f29185a = Collections.emptyMap();
    }
}
