package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JobCancellationException extends CancellationException implements InterfaceC2711v<JobCancellationException> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient JobSupport f43183b;

    public JobCancellationException(String str, Throwable th, JobSupport jobSupport) {
        super(str);
        this.f43183b = jobSupport;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC2711v
    public final /* bridge */ /* synthetic */ Throwable a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!kotlin.jvm.internal.i.a(jobCancellationException.getMessage(), getMessage()) || !kotlin.jvm.internal.i.a(jobCancellationException.f43183b, this.f43183b) || !kotlin.jvm.internal.i.a(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.i.b(message);
        int iHashCode = (this.f43183b.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f43183b;
    }
}
