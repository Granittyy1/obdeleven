package androidx.compose.ui.input.pointer;

import androidx.collection.C0891t;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;

/* JADX INFO: compiled from: PointerInputEventProcessor.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0891t<a> f14114a = new C0891t<>((Object) null);

    /* JADX INFO: compiled from: PointerInputEventProcessor.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f14115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f14116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f14117c;

        public a(long j, long j10, boolean z10) {
            this.f14115a = j;
            this.f14116b = j10;
            this.f14117c = z10;
        }
    }

    public final C1154e a(s sVar, AndroidComposeView androidComposeView) {
        boolean z10;
        long j;
        long j10;
        ArrayList arrayList = (ArrayList) sVar.f14118a;
        C0891t c0891t = new C0891t(arrayList.size());
        int i10 = 0;
        for (int size = arrayList.size(); i10 < size; size = size) {
            t tVar = (t) arrayList.get(i10);
            long j11 = tVar.f14120a;
            C0891t<a> c0891t2 = this.f14114a;
            a aVarB = c0891t2.b(j11);
            if (aVarB == null) {
                j10 = tVar.f14121b;
                j = tVar.f14123d;
                z10 = false;
            } else {
                long jS = androidComposeView.S(aVarB.f14116b);
                long j12 = aVarB.f14115a;
                z10 = aVarB.f14117c;
                j = jS;
                j10 = j12;
            }
            ArrayList arrayList2 = tVar.f14128i;
            long j13 = tVar.j;
            long j14 = tVar.f14129k;
            long j15 = tVar.f14120a;
            c0891t.e(new q(j15, tVar.f14121b, tVar.f14123d, tVar.f14124e, tVar.f14125f, j10, j, z10, tVar.f14126g, arrayList2, j13, j14), j15);
            long j16 = tVar.f14120a;
            boolean z11 = tVar.f14124e;
            if (z11) {
                c0891t2.e(new a(tVar.f14121b, tVar.f14122c, z11), j16);
            } else {
                c0891t2.f(j16);
            }
            i10++;
            arrayList = arrayList;
        }
        return new C1154e(c0891t, sVar);
    }
}
