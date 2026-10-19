package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Internal.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2078u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f29200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f29201b;

    /* JADX INFO: renamed from: com.google.protobuf.u$a */
    /* JADX INFO: compiled from: Internal.java */
    public interface a {
        int a();
    }

    /* JADX INFO: renamed from: com.google.protobuf.u$b */
    /* JADX INFO: compiled from: Internal.java */
    public interface b {
        boolean a(int i10);
    }

    /* JADX INFO: renamed from: com.google.protobuf.u$c */
    /* JADX INFO: compiled from: Internal.java */
    public interface c extends d<Integer> {
    }

    /* JADX INFO: renamed from: com.google.protobuf.u$d */
    /* JADX INFO: compiled from: Internal.java */
    public interface d<E> extends List<E>, RandomAccess {
        void f();

        d<E> h(int i10);

        boolean n();
    }

    static {
        Charset.forName("US-ASCII");
        f29200a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f29201b = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC2066h.d(bArr, 0, 0, false);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
