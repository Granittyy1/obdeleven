package p107i6;

import com.google.common.util.concurrent.AbstractFuture;
import java.util.logging.Logger;

/* JADX INFO: compiled from: LazyLogger.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f36752a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36753b = AbstractFuture.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Logger f36754c;

    public final Logger a() {
        Logger logger = this.f36754c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f36752a) {
            try {
                Logger logger2 = this.f36754c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f36753b);
                this.f36754c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
