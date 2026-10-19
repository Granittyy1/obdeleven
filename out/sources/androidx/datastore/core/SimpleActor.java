package androidx.datastore.core;

import Ia.p;
import com.braze.support.BrazeLogger;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import p293xa.r;

/* JADX INFO: compiled from: SimpleActor.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SimpleActor<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f17035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<T, kotlin.coroutines.c<? super r>, Object> f17036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BufferedChannel f17037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f17038d;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleActor(A a10, final Ia.l<? super Throwable, r> lVar, final p<? super T, ? super Throwable, r> onUndeliveredElement, p<? super T, ? super kotlin.coroutines.c<? super r>, ? extends Object> pVar) {
        kotlin.jvm.internal.i.e(onUndeliveredElement, "onUndeliveredElement");
        this.f17035a = a10;
        this.f17036b = pVar;
        this.f17037c = kotlinx.coroutines.channels.g.a(BrazeLogger.SUPPRESS, 6, null);
        this.f17038d = new AtomicInteger(0);
        InterfaceC2694i0 interfaceC2694i0 = (InterfaceC2694i0) a10.getCoroutineContext().get(InterfaceC2694i0.b.f43449b);
        if (interfaceC2694i0 == null) {
            return;
        }
        interfaceC2694i0.B(new Ia.l<Throwable, r>() { // from class: androidx.datastore.core.SimpleActor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Throwable th) {
                r rVar;
                Throwable th2 = th;
                lVar.invoke(th2);
                this.f17037c.a(th2);
                do {
                    Object objB = kotlinx.coroutines.channels.h.b(this.f17037c.g());
                    if (objB == null) {
                        rVar = null;
                    } else {
                        onUndeliveredElement.invoke((T) objB, th2);
                        rVar = r.f47939a;
                    }
                } while (rVar != null);
                return r.f47939a;
            }
        });
    }

    public final void a(j.a aVar) {
        Object objN = this.f17037c.n(aVar);
        if (objN instanceof kotlinx.coroutines.channels.h.a) {
            Throwable thA = kotlinx.coroutines.channels.h.a(objN);
            if (thA != null) {
                throw thA;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (objN instanceof kotlinx.coroutines.channels.h.b) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f17038d.getAndIncrement() == 0) {
            C2680e.c(this.f17035a, null, null, new SimpleActor$offer$2(this, null), 3);
        }
    }
}
