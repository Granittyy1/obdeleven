package p037cb;

import Ia.p;
import kotlin.jvm.internal.i;
import p011ab.e;

/* JADX INFO: renamed from: cb.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ElementMarker.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1549v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f22660e = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f22661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<e, Integer, Boolean> f22662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f22663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f22664d;

    /* JADX WARN: Multi-variable type inference failed */
    public C1549v(e descriptor, p<? super e, ? super Integer, Boolean> pVar) {
        i.e(descriptor, "descriptor");
        this.f22661a = descriptor;
        this.f22662b = pVar;
        int iF = descriptor.f();
        if (iF <= 64) {
            this.f22663c = iF != 64 ? (-1) << iF : 0L;
            this.f22664d = f22660e;
            return;
        }
        this.f22663c = 0L;
        int i10 = (iF - 1) >>> 6;
        long[] jArr = new long[i10];
        if ((iF & 63) != 0) {
            jArr[i10 - 1] = (-1) << iF;
        }
        this.f22664d = jArr;
    }
}
