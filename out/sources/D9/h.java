package D9;

import io.grpc.ConnectivityState;
import io.grpc.Status;

/* JADX INFO: compiled from: ConnectivityStateInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectivityState f2882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Status f2883b;

    public h(ConnectivityState connectivityState, Status status) {
        this.f2882a = connectivityState;
        A8.p.j(status, "status is null");
        this.f2883b = status;
    }

    public static h a(ConnectivityState connectivityState) {
        A8.p.f("state is TRANSIENT_ERROR. Use forError() instead", connectivityState != ConnectivityState.f36869d);
        return new h(connectivityState, Status.f36899e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f2882a.equals(hVar.f2882a) && this.f2883b.equals(hVar.f2883b);
    }

    public final int hashCode() {
        return this.f2882a.hashCode() ^ this.f2883b.hashCode();
    }

    public final String toString() {
        Status status = this.f2883b;
        boolean zF = status.f();
        ConnectivityState connectivityState = this.f2882a;
        if (zF) {
            return connectivityState.toString();
        }
        return connectivityState + "(" + status + ")";
    }
}
