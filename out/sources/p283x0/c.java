package p283x0;

import android.os.Handler;
import p222s0.e;

/* JADX INFO: compiled from: CallbackWithHandler.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e.a f47843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f47844b;

    public c(e.a aVar, Handler handler) {
        this.f47843a = aVar;
        this.f47844b = handler;
    }

    public final void a(j.a aVar) {
        int i10 = aVar.f47866b;
        Handler handler = this.f47844b;
        e.a aVar2 = this.f47843a;
        if (i10 == 0) {
            handler.post(new a(aVar2, aVar.f47865a));
        } else {
            handler.post(new b(aVar2, i10));
        }
    }
}
