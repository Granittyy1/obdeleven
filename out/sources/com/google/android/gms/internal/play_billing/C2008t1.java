package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2008t1 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f26262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2014v1 f26263e;

    public /* synthetic */ C2008t1(C2014v1 c2014v1) {
        Objects.requireNonNull(c2014v1);
        this.f26263e = c2014v1;
        this.f26260b = -1;
    }

    public final Iterator a() {
        if (this.f26262d == null) {
            this.f26262d = this.f26263e.f26282d.entrySet().iterator();
        }
        return this.f26262d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f26260b + 1;
        C2014v1 c2014v1 = this.f26263e;
        if (i10 >= c2014v1.f26281c) {
            return !c2014v1.f26282d.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f26261c = true;
        int i10 = this.f26260b + 1;
        this.f26260b = i10;
        C2014v1 c2014v1 = this.f26263e;
        return i10 < c2014v1.f26281c ? (C2002r1) c2014v1.f26280b[i10] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f26261c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f26261c = false;
        int i10 = C2014v1.f26279h;
        C2014v1 c2014v1 = this.f26263e;
        c2014v1.l();
        int i11 = this.f26260b;
        if (i11 >= c2014v1.f26281c) {
            a().remove();
        } else {
            this.f26260b = i11 - 1;
            c2014v1.j(i11);
        }
    }
}
