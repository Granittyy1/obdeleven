package io.grpc;

import java.nio.charset.Charset;
import java.util.BitSet;
import java.util.logging.Logger;

/* JADX INFO: compiled from: InternalMetadata.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f36967a = Charset.forName("US-ASCII");

    /* JADX INFO: compiled from: InternalMetadata.java */
    public interface a<T> extends m.g<T> {
    }

    static {
        Logger logger = m.f37780c;
    }

    public static m.f a(String str, a aVar) {
        boolean z10 = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z10 = true;
        }
        BitSet bitSet = m.d.f37786d;
        return new m.f(str, z10, aVar);
    }
}
