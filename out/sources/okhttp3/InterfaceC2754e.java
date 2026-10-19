package okhttp3;

import java.io.IOException;

/* JADX INFO: renamed from: okhttp3.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Call.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2754e extends Cloneable {

    /* JADX INFO: renamed from: okhttp3.e$a */
    /* JADX INFO: compiled from: Call.kt */
    public interface a {
        okhttp3.internal.connection.e a(u uVar);
    }

    void C(f fVar);

    void cancel();

    boolean isCanceled();

    z k() throws IOException;

    u request();

    okhttp3.internal.connection.e.c timeout();
}
