package androidx.compose.foundation.layout;

import androidx.collection.C0880h;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FlowLayoutBuildingBlocks.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0961v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0962w f10326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10330f;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.v$a */
    /* JADX INFO: compiled from: FlowLayoutBuildingBlocks.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.compose.ui.layout.D f10331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.compose.ui.layout.Y f10332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f10333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f10334d = true;

        public a(androidx.compose.ui.layout.D d10, androidx.compose.ui.layout.Y y10, long j) {
            this.f10331a = d10;
            this.f10332b = y10;
            this.f10333c = j;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.v$b */
    /* JADX INFO: compiled from: FlowLayoutBuildingBlocks.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f10336b;

        public b(boolean z10, boolean z11) {
            this.f10335a = z10;
            this.f10336b = z11;
        }
    }

    public C0961v(int i10, C0962w c0962w, long j, int i11, int i12, int i13) {
        this.f10325a = i10;
        this.f10326b = c0962w;
        this.f10327c = j;
        this.f10328d = i11;
        this.f10329e = i12;
        this.f10330f = i13;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003c  */
    public final a a(b bVar, boolean z10, int i10, int i11, int i12, int i13) {
        a aVar;
        androidx.compose.ui.layout.D d10;
        C0880h c0880h;
        androidx.compose.ui.layout.Y y10;
        if (!bVar.f10336b) {
            return null;
        }
        C0962w c0962w = this.f10326b;
        int iOrdinal = c0962w.f10337a.ordinal();
        boolean z11 = true;
        if (iOrdinal == 0 || iOrdinal == 1) {
            aVar = null;
        } else {
            if (iOrdinal != 2 && iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (z10) {
                d10 = c0962w.f10340d;
                c0880h = c0962w.f10344h;
                y10 = c0962w.f10341e;
            } else {
                d10 = (i10 < c0962w.f10338b - 1 || i11 < c0962w.f10339c) ? null : c0962w.f10342f;
                c0880h = c0962w.f10345i;
                y10 = c0962w.f10343g;
            }
            if (d10 == null) {
                aVar = null;
            } else {
                kotlin.jvm.internal.i.b(c0880h);
                aVar = new a(d10, y10, c0880h.f9182a);
            }
        }
        if (aVar == null) {
            return null;
        }
        if (i10 < 0 || (i13 != 0 && (i12 - ((int) (aVar.f10333c >> 32)) < 0 || i13 >= this.f10325a))) {
            z11 = false;
        }
        aVar.f10334d = z11;
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if ((((int) (r21 >> 32)) - ((int) (r16 >> 32))) < 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.layout.C0961v.b b(boolean r19, int r20, long r21, androidx.collection.C0880h r23, int r24, int r25, int r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C0961v.b(boolean, int, long, androidx.collection.h, int, int, int, boolean, boolean):androidx.compose.foundation.layout.v$b");
    }
}
