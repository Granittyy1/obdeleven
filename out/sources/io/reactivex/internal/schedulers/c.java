package io.reactivex.internal.schedulers;

import p123ja.o;

/* JADX INFO: compiled from: NewThreadScheduler.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final RxThreadFactory f40928b = new RxThreadFactory(Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), "RxNewThreadScheduler", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RxThreadFactory f40929a = f40928b;

    @Override // p123ja.o
    public final o.b a() {
        return new d(this.f40929a);
    }
}
