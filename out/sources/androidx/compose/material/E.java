package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: InternalMutatorMutex.kt */
/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<a> f11739a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutexImpl f11740b = kotlinx.coroutines.sync.b.a();

    /* JADX INFO: compiled from: InternalMutatorMutex.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MutatePriority f11741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC2694i0 f11742b;

        public a(MutatePriority mutatePriority, InterfaceC2694i0 interfaceC2694i0) {
            this.f11741a = mutatePriority;
            this.f11742b = interfaceC2694i0;
        }
    }
}
