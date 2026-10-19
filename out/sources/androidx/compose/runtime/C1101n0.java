package androidx.compose.runtime;

import kotlin.KotlinNothingValueException;

/* JADX INFO: renamed from: androidx.compose.runtime.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1101n0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1099m0 f13098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I0<T> f13100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T f13102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13103f = true;

    /* JADX WARN: Multi-variable type inference failed */
    public C1101n0(AbstractC1099m0 abstractC1099m0, Object obj, boolean z10, I0 i10, boolean z11) {
        this.f13098a = abstractC1099m0;
        this.f13099b = z10;
        this.f13100c = i10;
        this.f13101d = z11;
        this.f13102e = obj;
    }

    public final T a() {
        if (this.f13099b) {
            return null;
        }
        T t8 = this.f13102e;
        if (t8 != null) {
            return t8;
        }
        C1090i.d("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }
}
