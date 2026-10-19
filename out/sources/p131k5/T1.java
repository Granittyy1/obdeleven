package p131k5;

import com.google.android.gms.measurement.internal.e;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class T1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f41994b;

    public T1(e eVar, j3 j3Var) {
        this.f41993a = j3Var;
        this.f41994b = eVar;
    }

    public void a(Throwable th) {
        e eVar = (e) this.f41994b;
        eVar.p();
        eVar.f26577i = false;
        eVar.S();
        eVar.d().f41712f.b(th, "registerTriggerAsync failed with throwable");
    }

    public T1(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f41993a = new int[size];
        this.f41994b = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f41993a)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f41994b)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public T1(int i10, int i11) {
        this.f41993a = new int[]{i10, i11};
        this.f41994b = new float[]{0.0f, 1.0f};
    }

    public T1(int i10, int i11, int i12) {
        this.f41993a = new int[]{i10, i11, i12};
        this.f41994b = new float[]{0.0f, 0.5f, 1.0f};
    }
}
