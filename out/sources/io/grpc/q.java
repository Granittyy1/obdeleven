package io.grpc;

import java.util.Comparator;

/* JADX INFO: compiled from: ServiceProviders.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements Comparator<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r.a f38029b;

    public q(r.a aVar) {
        this.f38029b = aVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        r.a aVar = this.f38029b;
        int iB = aVar.b(obj) - aVar.b(obj2);
        return iB != 0 ? iB : obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
