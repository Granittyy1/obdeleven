package retrofit2;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import okhttp3.B;
import okhttp3.Protocol;

/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes2.dex */
public final class v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okhttp3.z f46822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f46823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f46824c;

    /* JADX WARN: Multi-variable type inference failed */
    public v(okhttp3.z zVar, Object obj, B b10) {
        this.f46822a = zVar;
        this.f46823b = obj;
        this.f46824c = b10;
    }

    public static v a(NetworkResponse networkResponse) {
        okhttp3.z.a aVar = new okhttp3.z.a();
        aVar.f45695c = androidx.recyclerview.widget.t.d.DEFAULT_DRAG_ANIMATION_DURATION;
        aVar.f45696d = "OK";
        aVar.f45694b = Protocol.HTTP_1_1;
        okhttp3.u.a aVar2 = new okhttp3.u.a();
        aVar2.g("http://localhost/");
        aVar.f45693a = aVar2.a();
        return b(networkResponse, aVar.a());
    }

    public static <T> v<T> b(T t8, okhttp3.z zVar) {
        if (zVar.h()) {
            return new v<>(zVar, t8, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final String toString() {
        return this.f46822a.toString();
    }
}
