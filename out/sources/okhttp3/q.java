package okhttp3;

import java.io.IOException;

/* JADX INFO: compiled from: Interceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface q {

    /* JADX INFO: compiled from: Interceptor.kt */
    public interface a {
        z a(u uVar) throws IOException;

        u request();
    }

    z intercept(a aVar) throws IOException;
}
