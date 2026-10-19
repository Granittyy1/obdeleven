package U4;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: renamed from: U4.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0817z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseIntArray f6502a = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.a f6503b;

    public C0817z(com.google.android.gms.common.a aVar) {
        C0804l.h(aVar);
        this.f6503b = aVar;
    }

    @ResultIgnorabilityUnspecified
    public final int a(Context context, com.google.android.gms.common.api.a.e eVar) {
        C0804l.h(context);
        C0804l.h(eVar);
        int i10 = 0;
        if (!eVar.l()) {
            return 0;
        }
        int iN = eVar.n();
        SparseIntArray sparseIntArray = this.f6502a;
        int iB = sparseIntArray.get(iN, -1);
        if (iB == -1) {
            int i11 = 0;
            while (true) {
                if (i11 >= sparseIntArray.size()) {
                    i10 = -1;
                    break;
                }
                int iKeyAt = sparseIntArray.keyAt(i11);
                if (iKeyAt > iN && sparseIntArray.get(iKeyAt) == 0) {
                    break;
                }
                i11++;
            }
            iB = i10 == -1 ? this.f6503b.b(context, iN) : i10;
            sparseIntArray.put(iN, iB);
        }
        return iB;
    }
}
