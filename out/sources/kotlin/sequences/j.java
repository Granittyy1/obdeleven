package kotlin.sequences;

import Ia.p;
import com.google.android.gms.internal.measurement.C1787c0;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements g<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RestrictedSuspendLambda f43102a;

    /* JADX WARN: Multi-variable type inference failed */
    public j(p pVar) {
        this.f43102a = (RestrictedSuspendLambda) pVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ia.p, kotlin.coroutines.jvm.internal.RestrictedSuspendLambda] */
    @Override // kotlin.sequences.g
    public final Iterator<Object> iterator() {
        return C1787c0.n(this.f43102a);
    }
}
