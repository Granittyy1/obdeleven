package io.grpc;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: EquivalentAddressGroup.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a.b<String> f36958d = new a.b<>("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<SocketAddress> f36959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f36960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36961c;

    public d() {
        throw null;
    }

    public d(List<SocketAddress> list, a aVar) {
        A8.p.f("addrs is empty", !list.isEmpty());
        List<SocketAddress> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f36959a = listUnmodifiableList;
        A8.p.j(aVar, "attrs");
        this.f36960b = aVar;
        this.f36961c = listUnmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        List<SocketAddress> list = this.f36959a;
        if (list.size() != dVar.f36959a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!list.get(i10).equals(dVar.f36959a.get(i10))) {
                return false;
            }
        }
        return this.f36960b.equals(dVar.f36960b);
    }

    public final int hashCode() {
        return this.f36961c;
    }

    public final String toString() {
        return "[" + this.f36959a + "/" + this.f36960b + "]";
    }

    public d(SocketAddress socketAddress) {
        this(Collections.singletonList(socketAddress), a.f36932b);
    }
}
