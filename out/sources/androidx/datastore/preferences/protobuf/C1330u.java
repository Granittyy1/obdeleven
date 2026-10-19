package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Internal.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1330u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f17280a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f17281b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u$a */
    /* JADX INFO: compiled from: Internal.java */
    public interface a {
        int a();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u$b */
    /* JADX INFO: compiled from: Internal.java */
    public interface b {
        boolean a();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u$c */
    /* JADX INFO: compiled from: Internal.java */
    public interface c<E> extends List<E>, RandomAccess {
        void f();

        c<E> h(int i10);

        boolean n();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f17281b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new AbstractC1318h.a(bArr, 0, 0, false).f(0);
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static GeneratedMessageLite c(Object obj, Object obj2) {
        GeneratedMessageLite.a aVarD = ((I) obj).d();
        I i10 = (I) obj2;
        if (!aVarD.f17129b.getClass().isInstance(i10)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        aVarD.i();
        GeneratedMessageLite.a.j(aVarD.f17130c, (GeneratedMessageLite) ((AbstractC1311a) i10));
        return aVarD.h();
    }
}
