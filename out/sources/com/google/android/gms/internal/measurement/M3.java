package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class M3 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25513b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f25515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F3 f25516e;

    public M3(F3 f10) {
        this.f25516e = f10;
    }

    public final Iterator a() {
        if (this.f25515d == null) {
            this.f25515d = this.f25516e.f25445d.entrySet().iterator();
        }
        return this.f25515d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f25513b + 1;
        F3 f10 = this.f25516e;
        return i10 < f10.f25444c.size() || (!f10.f25445d.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f25514c = true;
        int i10 = this.f25513b + 1;
        this.f25513b = i10;
        F3 f10 = this.f25516e;
        return i10 < f10.f25444c.size() ? f10.f25444c.get(this.f25513b) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f25514c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f25514c = false;
        int i10 = F3.f25442h;
        F3 f10 = this.f25516e;
        f10.l();
        if (this.f25513b >= f10.f25444c.size()) {
            a().remove();
            return;
        }
        int i11 = this.f25513b;
        this.f25513b = i11 - 1;
        f10.h(i11);
    }
}
