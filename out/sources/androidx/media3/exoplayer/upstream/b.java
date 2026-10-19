package androidx.media3.exoplayer.upstream;

import java.io.IOException;

/* JADX INFO: compiled from: LoadErrorHandlingPolicy.java */
/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: compiled from: LoadErrorHandlingPolicy.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IOException f18825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18826b;

        public a(IOException iOException, int i10) {
            this.f18825a = iOException;
            this.f18826b = i10;
        }
    }

    long a(a aVar);

    int b(int i10);
}
