package kotlin.collections;

import java.util.Iterator;

/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterable<Object>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object[] f43020b;

    public j(Object[] objArr) {
        this.f43020b = objArr;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return I2.e.m(this.f43020b);
    }
}
