package p302y6;

import android.os.Process;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: y6.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CLSUUID.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2810f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicLong f48369a = new AtomicLong(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f48370b;

    public C2810f(M m7) {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte b10 = bArrArray[0];
        byte b11 = bArrArray[1];
        byte b12 = bArrArray[2];
        byte b13 = bArrArray[3];
        byte[] bArrA = a(time % 1000);
        byte b14 = bArrA[0];
        byte b15 = bArrA[1];
        byte[] bArrA2 = a(f48369a.incrementAndGet());
        byte b16 = bArrA2[0];
        byte b17 = bArrA2[1];
        byte[] bArrA3 = a(Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {b10, b11, b12, b13, b14, b15, b16, b17, bArrA3[0], bArrA3[1]};
        String strH = CommonUtils.h(((C2807c) m7.b()).f48364a);
        String strE = CommonUtils.e(bArr);
        Locale locale = Locale.US;
        f48370b = String.format(locale, "%s%s%s%s", strE.substring(0, 12), strE.substring(12, 16), strE.subSequence(16, 20), strH.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return f48370b;
    }
}
