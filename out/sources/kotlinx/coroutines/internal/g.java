package kotlinx.coroutines.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.InterfaceC2713x;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Collection<InterfaceC2713x> f43474a;

    static {
        try {
            f43474a = SequencesKt___SequencesKt.F(SequencesKt__SequencesKt.x(Arrays.asList(new kotlinx.coroutines.android.b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
