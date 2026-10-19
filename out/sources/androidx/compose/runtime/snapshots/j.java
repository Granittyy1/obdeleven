package androidx.compose.runtime.snapshots;

import android.content.Context;
import android.text.TextUtils;
import androidx.collection.D;
import java.util.ArrayList;
import java.util.Arrays;
import p131k5.B0;
import p131k5.C2523i1;

/* JADX INFO: compiled from: SnapshotId.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13215b;

    public j(Context context) {
        this.f13214a = 1;
        com.google.android.play.integrity.internal.k kVar = new com.google.android.play.integrity.internal.k(context);
        com.google.android.play.integrity.internal.i iVarB = com.google.android.play.integrity.internal.i.b(new p019b6.q(kVar, com.google.android.play.integrity.internal.i.b(p019b6.g.f20571a), new p019b6.c(kVar)));
        this.f13215b = com.google.android.play.integrity.internal.i.b(new p019b6.f(iVarB, com.google.android.play.integrity.internal.i.b(new F6.c(iVarB))));
    }

    public void a(Object obj, String str) {
        ((ArrayList) this.f13215b).add(str + "=" + obj);
    }

    public boolean b() {
        C2523i1 c2523i1 = (C2523i1) this.f13215b;
        if (!TextUtils.isEmpty(c2523i1.f42213b)) {
            return false;
        }
        B0 b10 = c2523i1.f42220i;
        C2523i1.g(b10);
        return b10.y(3);
    }

    public String toString() {
        switch (this.f13214a) {
            case 2:
                return ((ArrayList) this.f13215b).toString();
            default:
                return super.toString();
        }
    }

    public j(C2523i1 c2523i1) {
        this.f13214a = 3;
        this.f13215b = c2523i1;
    }

    public j() {
        this.f13214a = 2;
        this.f13215b = new ArrayList();
    }

    public j(long[] jArr) {
        D d10;
        this.f13214a = 0;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            d10 = new D(jArrCopyOf.length);
            int i10 = d10.f9198b;
            if (i10 >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i10;
                    long[] jArr2 = d10.f9197a;
                    if (jArr2.length < length) {
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        kotlin.jvm.internal.i.d(jArrCopyOf2, "copyOf(...)");
                        d10.f9197a = jArrCopyOf2;
                    }
                    long[] jArr3 = d10.f9197a;
                    int i11 = d10.f9198b;
                    if (i10 != i11) {
                        Q3.d.p(jArr3, jArr3, jArrCopyOf.length + i10, i10, i11);
                    }
                    Q3.d.p(jArrCopyOf, jArr3, i10, 0, jArrCopyOf.length);
                    d10.f9198b += jArrCopyOf.length;
                }
            } else {
                D9.o.r("");
                throw null;
            }
        } else {
            d10 = new D(16);
        }
        this.f13215b = d10;
    }
}
