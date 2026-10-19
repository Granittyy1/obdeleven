package Ta;

import A8.p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C2693i;
import p191p5.g;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final <T> Object a(g<T> gVar, c<? super T> cVar) throws Exception {
        if (!gVar.n()) {
            C2693i c2693i = new C2693i(1, p.y(cVar));
            c2693i.s();
            gVar.b(a.f6056b, new F6.c(c2693i));
            Object objP = c2693i.p();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            return objP;
        }
        Exception excJ = gVar.j();
        if (excJ != null) {
            throw excJ;
        }
        if (!gVar.m()) {
            return gVar.k();
        }
        throw new CancellationException("Task " + gVar + " was cancelled normally.");
    }
}
