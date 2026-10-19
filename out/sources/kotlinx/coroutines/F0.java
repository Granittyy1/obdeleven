package kotlinx.coroutines;

import com.google.android.gms.internal.measurement.C1787c0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class F0<U, T extends U> extends kotlinx.coroutines.internal.u<T> implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f43179f;

    public F0(long j, ContinuationImpl continuationImpl) {
        super(continuationImpl, continuationImpl.getContext());
        this.f43179f = j;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final String e0() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.e0());
        sb2.append("(timeMillis=");
        return C4.a.h(sb2, this.f43179f, ')');
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Instruction removed from duplicated block: B:10:0x001f, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        String strR;
        H hC = I.c(this.f43222d);
        J j = hC instanceof J ? (J) hC : null;
        long j10 = this.f43179f;
        if (j != null) {
            int i10 = Pa.b.f4973e;
            C1787c0.u(j10, DurationUnit.MILLISECONDS);
            strR = j.R();
            if (strR == null) {
                strR = "Timed out waiting for " + j10 + " ms";
            }
        } else {
            strR = "Timed out waiting for " + j10 + " ms";
        }
        E(new TimeoutCancellationException(strR, this));
    }
}
