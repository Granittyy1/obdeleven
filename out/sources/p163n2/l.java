package p163n2;

import Ja.a;
import androidx.collection.Y;
import androidx.collection.Z;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p141l2.C;

/* JADX INFO: compiled from: NavGraphImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Iterator<C>, a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44816b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f44818d;

    public l(m mVar) {
        this.f44818d = mVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f44816b + 1 < this.f44818d.f44820b.f();
    }

    @Override // java.util.Iterator
    public final C next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f44817c = true;
        Y<C> y10 = this.f44818d.f44820b;
        int i10 = this.f44816b + 1;
        this.f44816b = i10;
        return y10.g(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f44817c) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        Y<C> y10 = this.f44818d.f44820b;
        y10.g(this.f44816b).f44220d = null;
        int i10 = this.f44816b;
        Object[] objArr = y10.f9142d;
        Object obj = objArr[i10];
        Object obj2 = Z.f9144a;
        if (obj != obj2) {
            objArr[i10] = obj2;
            y10.f9140b = true;
        }
        this.f44816b = i10 - 1;
        this.f44817c = false;
    }
}
