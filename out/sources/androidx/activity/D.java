package androidx.activity;

import android.content.res.Resources;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.l<Resources, Boolean> f8182d;

    /* JADX INFO: compiled from: EdgeToEdge.kt */
    public static final class a {
        public static D a() {
            return new D(0, 0, 2, new Ia.l<Resources, Boolean>() { // from class: androidx.activity.SystemBarStyle$Companion$dark$1
                @Override // Ia.l
                public final Boolean invoke(Resources resources) {
                    kotlin.jvm.internal.i.e(resources, "<anonymous parameter 0>");
                    return Boolean.TRUE;
                }
            });
        }

        public static D b() {
            return new D(0, 0, 1, new Ia.l<Resources, Boolean>() { // from class: androidx.activity.SystemBarStyle$Companion$light$1
                @Override // Ia.l
                public final Boolean invoke(Resources resources) {
                    kotlin.jvm.internal.i.e(resources, "<anonymous parameter 0>");
                    return Boolean.FALSE;
                }
            });
        }
    }

    public D(int i10, int i11, int i12, Ia.l lVar) {
        this.f8179a = i10;
        this.f8180b = i11;
        this.f8181c = i12;
        this.f8182d = lVar;
    }
}
