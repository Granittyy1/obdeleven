package p293xa;

import Ia.q;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: DeepRecursive.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c<T, R> extends b<T, R> implements kotlin.coroutines.c<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q<? super b<?, ?>, Object, ? super kotlin.coroutines.c<Object>, ? extends Object> f47916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f47917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kotlin.coroutines.c<Object> f47918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f47919e;

    @Override // p293xa.b
    public final void a(r rVar, kotlin.coroutines.c cVar) {
        this.f47918d = cVar;
        this.f47917c = rVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
    }

    @Override // kotlin.coroutines.c
    public final e getContext() {
        return EmptyCoroutineContext.f43032b;
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        this.f47918d = null;
        this.f47919e = obj;
    }
}
