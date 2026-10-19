package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface p<E> {
    Object d(ContinuationImpl continuationImpl);

    kotlinx.coroutines.selects.c e();

    kotlinx.coroutines.selects.c f();

    Object g();

    void i(CancellationException cancellationException);

    f<E> iterator();

    Object l(kotlin.coroutines.c<? super h<? extends E>> cVar);
}
