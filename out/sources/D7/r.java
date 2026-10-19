package D7;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Personalization.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements p123ja.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2875c;

    public r(AtomicReference atomicReference, p123ja.q qVar) {
        this.f2874b = atomicReference;
        this.f2875c = qVar;
    }

    @Override // p123ja.q
    public void b(p148la.b bVar) {
        DisposableHelper.c((AtomicReference) this.f2874b, bVar);
    }

    @Override // p123ja.q
    public void onError(Throwable th) {
        ((p123ja.q) this.f2875c).onError(th);
    }

    @Override // p123ja.q
    public void onSuccess(Object obj) {
        ((p123ja.q) this.f2875c).onSuccess(obj);
    }

    public r(p096h7.b bVar) {
        this.f2875c = Collections.synchronizedMap(new HashMap());
        this.f2874b = bVar;
    }
}
