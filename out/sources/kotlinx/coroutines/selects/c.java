package kotlinx.coroutines.selects;

import Ia.l;
import Ia.q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import p293xa.r;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c<Q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedChannel f43571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FunctionReferenceImpl f43572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FunctionReferenceImpl f43573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q<e<?>, Object, Object, l<Throwable, r>> f43574d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(BufferedChannel bufferedChannel, q qVar, q qVar2, q qVar3) {
        this.f43571a = bufferedChannel;
        this.f43572b = (FunctionReferenceImpl) qVar;
        this.f43573c = (FunctionReferenceImpl) qVar2;
        this.f43574d = qVar3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ia.q<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object>, kotlin.jvm.internal.FunctionReferenceImpl] */
    public final q<Object, Object, Object, Object> a() {
        return this.f43573c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ia.q<java.lang.Object, kotlinx.coroutines.selects.e<?>, java.lang.Object, xa.r>, kotlin.jvm.internal.FunctionReferenceImpl] */
    public final q<Object, e<?>, Object, r> b() {
        return this.f43572b;
    }
}
