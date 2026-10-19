package io.grpc.internal;

import io.grpc.ConnectivityState;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: io.grpc.internal.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ConnectivityStateManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2245t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<a> f37696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile ConnectivityState f37697b;

    /* JADX INFO: renamed from: io.grpc.internal.t$a */
    /* JADX INFO: compiled from: ConnectivityStateManager.java */
    public static final class a {
    }

    public final void a(ConnectivityState connectivityState) {
        A8.p.j(connectivityState, "newState");
        if (this.f37697b == connectivityState || this.f37697b == ConnectivityState.f36871f) {
            return;
        }
        this.f37697b = connectivityState;
        if (this.f37696a.isEmpty()) {
            return;
        }
        ArrayList<a> arrayList = this.f37696a;
        this.f37696a = new ArrayList<>();
        Iterator<a> it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw null;
        }
    }
}
