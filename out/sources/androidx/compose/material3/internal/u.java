package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: InternalMutatorMutex.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<a> f12575a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutexImpl f12576b = kotlinx.coroutines.sync.b.a();

    /* JADX INFO: compiled from: InternalMutatorMutex.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MutatePriority f12577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC2694i0 f12578b;

        public a(MutatePriority mutatePriority, InterfaceC2694i0 interfaceC2694i0) {
            this.f12577a = mutatePriority;
            this.f12578b = interfaceC2694i0;
        }
    }
}
