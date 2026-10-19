package com.voltasit.obdeleven.domain.usecases.gateway;

import android.graphics.Point;
import androidx.collection.Y;
import com.afollestad.materialdialogs.MaterialDialog;
import com.braze.support.BrazeLogger;
import com.google.common.collect.ImmutableList;
import com.obdeleven.service.model.DiagnosticSession;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.DATAOBJECTPROP;
import com.parse.SaveCallback;
import com.parse.boltsinternal.TaskCompletionSource;
import java.util.List;
import kotlin.jvm.internal.i;
import p078g1.n;
import p078g1.y;
import p109i8.h;
import p114j1.A;
import p134k8.S0;
import p134k8.T0;
import p259v1.j;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements SaveCallback, MaterialDialog.d, j.h.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f30842e;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f30839b = obj;
        this.f30840c = obj2;
        this.f30841d = obj3;
        this.f30842e = obj4;
    }

    @Override // com.afollestad.materialdialogs.MaterialDialog.d
    public void b(MaterialDialog materialDialog, int i10) {
        DATAOBJECTPROP dataobjectprop = (DATAOBJECTPROP) this.f30841d;
        Param param = (Param) this.f30842e;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f30839b;
        if (i10 < 0) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            COMPUSCALE compuscale = (COMPUSCALE) ((List) this.f30840c).get(i10);
            try {
                com.obdeleven.service.odx.a aVarPhysicalToInternal = dataobjectprop.physicalToInternal(compuscale.getCOMPUCONST().getVT().getValue());
                param.f29454b = aVarPhysicalToInternal.f29475a;
                param.f29465n = aVarPhysicalToInternal.f29476b;
                param.f29459g = compuscale.getCOMPUCONST().getVT().getValue();
                param.f29460h = compuscale.getCOMPUCONST().getVT().getTI();
                taskCompletionSource.setResult(Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
        materialDialog.dismiss();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    @Override // v1.j.h.a
    public List c(int i10, y yVar, int[] iArr) {
        int i11;
        int i12;
        int i13;
        int i14;
        b bVar = this;
        int i15 = ((int[]) bVar.f30841d)[i10];
        j.d dVar = (j.d) bVar.f30839b;
        Point point = (Point) bVar.f30842e;
        int i16 = point != null ? point.x : dVar.f35185e;
        int i17 = point != null ? point.y : dVar.f35186f;
        boolean z10 = dVar.f35188h;
        if (i16 == Integer.MAX_VALUE || i17 == Integer.MAX_VALUE) {
            i11 = BrazeLogger.SUPPRESS;
        } else {
            int i18 = Integer.MAX_VALUE;
            for (int i19 = 0; i19 < yVar.f35491a; i19++) {
                n nVar = yVar.f35494d[i19];
                int i20 = nVar.f35309u;
                if (i20 > 0 && (i12 = nVar.f35310v) > 0) {
                    if (!z10) {
                        i13 = i17;
                        i14 = i16;
                    } else if ((i20 > i12) != (i16 > i17)) {
                        i14 = i17;
                        i13 = i16;
                    } else {
                        i13 = i17;
                        i14 = i16;
                    }
                    int i21 = i20 * i13;
                    int i22 = i12 * i14;
                    Point point2 = i21 >= i22 ? new Point(i14, A.e(i22, i20)) : new Point(A.e(i21, i12), i13);
                    int i23 = nVar.f35309u;
                    int i24 = i23 * i12;
                    if (i23 >= ((int) (point2.x * 0.98f)) && i12 >= ((int) (point2.y * 0.98f)) && i24 < i18) {
                        i18 = i24;
                    }
                }
            }
            i11 = i18;
        }
        ImmutableList.a aVar = new ImmutableList.a();
        int i25 = 0;
        while (i25 < yVar.f35491a) {
            int iB = yVar.f35494d[i25].b();
            aVar.c(new j.i(i10, yVar, i25, dVar, iArr[i25], (String) bVar.f30840c, i15, i11 == Integer.MAX_VALUE || (iB != -1 && iB <= i11)));
            i25++;
            bVar = this;
        }
        return aVar.h();
    }

    @Override // com.parse.ParseCallback1
    public void done(Throwable th) {
        c cVar = (c) this.f30839b;
        String vehicleId = (String) this.f30840c;
        i.e(vehicleId, "$vehicleId");
        h hVar = (h) this.f30841d;
        T0 codingResult = (T0) this.f30842e;
        i.e(codingResult, "$codingResult");
        String objectId = hVar.d().getObjectId();
        i.d(objectId, "getObjectId(...)");
        DiagnosticSession diagnosticSessionP = hVar.p();
        Y<S0> y10 = codingResult.f42675a;
        Y<S0> y11 = codingResult.f42676b;
        i.d(y11, "getNewStatuses(...)");
        cVar.f30844b.d(vehicleId, objectId, diagnosticSessionP, y10, y11);
    }
}
