package p123ja;

import bc.a;
import bc.b;
import com.braze.support.BrazeLogger;
import io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe;
import io.reactivex.internal.operators.flowable.FlowablePublish;
import io.reactivex.internal.subscribers.StrictSubscriber;
import java.util.concurrent.atomic.AtomicReference;
import p183oa.c;

/* JADX INFO: compiled from: Flowable.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class d<T> implements a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f41194b = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    @Override // bc.a
    public final void a(b<? super T> bVar) {
        if (bVar instanceof g) {
            d((g) bVar);
        } else {
            Q3.d.I(bVar, "s is null");
            d(new StrictSubscriber(bVar));
        }
    }

    public final FlowableFlatMapMaybe b(c cVar) {
        Q3.d.I(cVar, "mapper is null");
        Q3.d.L(BrazeLogger.SUPPRESS, "maxConcurrency");
        return new FlowableFlatMapMaybe(this, cVar);
    }

    public final FlowablePublish c() {
        int i10 = f41194b;
        Q3.d.L(i10, "bufferSize");
        AtomicReference atomicReference = new AtomicReference();
        return new FlowablePublish(new FlowablePublish.a(atomicReference, i10), this, atomicReference, i10);
    }

    public final void d(g<? super T> gVar) {
        Q3.d.I(gVar, "s is null");
        try {
            e(gVar);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            Fa.d.g(th);
            p231sa.a.c(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void e(g gVar);
}
