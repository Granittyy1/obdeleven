package P3;

import D3.o;
import K3.n;
import Z3.q;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.animation.core.AbstractC0913m;
import androidx.compose.animation.core.B;
import androidx.compose.animation.core.InterfaceC0914n;
import androidx.compose.animation.core.InterfaceC0924y;
import com.facebook.internal.GamingAction;
import com.google.android.gms.measurement.internal.zzip;
import com.google.android.gms.measurement.internal.zziq;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import p131k5.C2523i1;
import p131k5.y3;
import p165n4.p;
import p165n4.s;

/* JADX INFO: compiled from: BitmapDrawableTranscoder.java */
/* JADX INFO: loaded from: classes.dex */
public class b implements e, InterfaceC0914n, y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4915b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f4914a = i10;
        this.f4915b = obj;
    }

    public static b c(String str) {
        return new b(3, (TextUtils.isEmpty(str) || str.length() > 1) ? zzip.f26641b : zziq.b(str.charAt(0)));
    }

    @Override // p131k5.y3
    public void a(Bundle bundle, String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        com.google.android.gms.measurement.internal.e eVar = (com.google.android.gms.measurement.internal.e) this.f4915b;
        if (!zIsEmpty) {
            ((C2523i1) eVar.f3968a).getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
        ((C2523i1) eVar.f3968a).f42224n.getClass();
        eVar.L("auto", "_err", bundle, true, true, System.currentTimeMillis());
    }

    @Override // P3.e
    public o b(o oVar, A3.d dVar) {
        if (oVar == null) {
            return null;
        }
        return new n((Resources) this.f4915b, oVar);
    }

    @Override // androidx.compose.animation.core.InterfaceC0914n
    public InterfaceC0924y get(int i10) {
        return ((B[]) this.f4915b)[i10];
    }

    public String toString() {
        switch (this.f4914a) {
            case 2:
                return Q8.d.a(new StringBuilder("Phase('"), (String) this.f4915b, "')");
            default:
                return super.toString();
        }
    }

    public b(String str, Bundle bundle) {
        Uri uriB;
        this.f4914a = 5;
        bundle = bundle == null ? new Bundle() : bundle;
        GamingAction[] gamingActionArrValuesCustom = GamingAction.valuesCustom();
        ArrayList arrayList = new ArrayList(gamingActionArrValuesCustom.length);
        for (GamingAction gamingAction : gamingActionArrValuesCustom) {
            arrayList.add(gamingAction.a());
        }
        if (arrayList.contains(str)) {
            int i10 = p.f44923a;
            q qVar = q.f7852a;
            uriB = s.b(bundle, String.format("%s", Arrays.copyOf(new Object[]{"fb.gg"}, 1)), i.k(str, "/dialog/"));
        } else {
            uriB = s.b(bundle, p.a(), q.d() + "/dialog/" + str);
        }
        this.f4915b = uriB;
    }

    public b(float f10, float f11, AbstractC0913m abstractC0913m) {
        this.f4914a = 1;
        int iB = abstractC0913m.b();
        B[] bArr = new B[iB];
        for (int i10 = 0; i10 < iB; i10++) {
            bArr[i10] = new B(f10, f11, abstractC0913m.a(i10));
        }
        this.f4915b = bArr;
    }
}
