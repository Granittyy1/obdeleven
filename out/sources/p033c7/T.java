package p033c7;

import android.app.Application;
import com.google.protobuf.S;
import io.reactivex.internal.operators.maybe.e;

/* JADX INFO: compiled from: ProtoStorageClient.java */
/* JADX INFO: loaded from: classes3.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f22406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22407b;

    public T(Application application, String str) {
        this.f22406a = application;
        this.f22407b = str;
    }

    public final e a(S s10) {
        return new e(new Q(this, 0, s10));
    }
}
