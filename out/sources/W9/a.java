package W9;

import D2.V;
import com.voltasit.obdeleven.domain.usecases.device.u;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.P;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.l;
import p293xa.r;

/* JADX INFO: compiled from: Events.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y9.a<u, l> f7075a = new Y9.a<>();

    /* JADX INFO: renamed from: W9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Events.kt */
    public static final class C0098a extends LockFreeLinkedListNode implements P {
    }

    public final void a(u definition) {
        r rVar;
        i.e(definition, "definition");
        l lVar = (l) this.f7075a.a(definition);
        Throwable th = null;
        if (lVar != null) {
            Object objG = lVar.g();
            i.c(objG, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            Throwable th2 = null;
            for (LockFreeLinkedListNode lockFreeLinkedListNodeH = (LockFreeLinkedListNode) objG; !lockFreeLinkedListNodeH.equals(lVar); lockFreeLinkedListNodeH = lockFreeLinkedListNodeH.h()) {
                if (lockFreeLinkedListNodeH instanceof C0098a) {
                    try {
                        i.c(null, "null cannot be cast to non-null type kotlin.Function1<T of io.ktor.events.Events.raise$lambda$2, kotlin.Unit>{ io.ktor.events.EventsKt.EventHandler<T of io.ktor.events.Events.raise$lambda$2> }");
                        throw null;
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            V.e(th2, th3);
                            rVar = r.f47939a;
                        } else {
                            rVar = null;
                        }
                        if (rVar == null) {
                            th2 = th3;
                        }
                    }
                }
            }
            th = th2;
        }
        if (th != null) {
            throw th;
        }
    }
}
