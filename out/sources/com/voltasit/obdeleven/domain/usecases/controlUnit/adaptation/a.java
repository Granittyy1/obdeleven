package com.voltasit.obdeleven.domain.usecases.controlUnit.adaptation;

import J8.p;
import com.obdeleven.service.model.UDSResult;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.odx.e;
import com.voltasit.obdeleven.domain.exceptions.NotAvailableOfflineException;
import java.util.ArrayList;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: GetOfflineUdsAdaptationUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f30653a;

    public a(p pVar) {
        this.f30653a = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object a(int i10, String str, e.g gVar, e eVar, ContinuationImpl continuationImpl) throws Throwable {
        GetOfflineUdsAdaptationUC$invoke$1 getOfflineUdsAdaptationUC$invoke$1;
        UDSResult uDSResultA;
        UDSResult.Type type;
        Param param;
        ArrayList arrayList;
        if (continuationImpl instanceof GetOfflineUdsAdaptationUC$invoke$1) {
            getOfflineUdsAdaptationUC$invoke$1 = (GetOfflineUdsAdaptationUC$invoke$1) continuationImpl;
            int i11 = getOfflineUdsAdaptationUC$invoke$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                getOfflineUdsAdaptationUC$invoke$1.label = i11 - Integer.MIN_VALUE;
            } else {
                getOfflineUdsAdaptationUC$invoke$1 = new GetOfflineUdsAdaptationUC$invoke$1(this, continuationImpl);
            }
        } else {
            getOfflineUdsAdaptationUC$invoke$1 = new GetOfflineUdsAdaptationUC$invoke$1(this, continuationImpl);
        }
        GetOfflineUdsAdaptationUC$invoke$1 getOfflineUdsAdaptationUC$invoke$2 = getOfflineUdsAdaptationUC$invoke$1;
        Object objF = getOfflineUdsAdaptationUC$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = getOfflineUdsAdaptationUC$invoke$2.label;
        if (i12 == 0) {
            b.b(objF);
            if (str.length() == 0) {
                return new C8.a.C0024a(new NotAvailableOfflineException());
            }
            if ("SECURITY_ACCESS".equals(str)) {
                uDSResultA = UDSResult.a("33");
            } else if (m.I(str, "7F", false)) {
                String strSubstring = str.substring(4);
                i.d(strSubstring, "substring(...)");
                uDSResultA = UDSResult.a(strSubstring);
            } else {
                Sa.a aVar = N.f43200c;
                GetOfflineUdsAdaptationUC$invoke$udsResult$1 getOfflineUdsAdaptationUC$invoke$udsResult$1 = new GetOfflineUdsAdaptationUC$invoke$udsResult$1(i10, str, gVar, eVar, this, null);
                getOfflineUdsAdaptationUC$invoke$2.label = 1;
                objF = C2680e.f(aVar, getOfflineUdsAdaptationUC$invoke$udsResult$1, getOfflineUdsAdaptationUC$invoke$2);
                if (objF == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            if (uDSResultA == null) {
                return new C8.a.C0024a(new NotAvailableOfflineException());
            }
            type = UDSResult.Type.f29416b;
            param = uDSResultA.f29414c;
            if (uDSResultA.f29412a == type) {
                arrayList = param.c(true);
            } else {
                arrayList = new ArrayList();
                i.d(param, "getParam(...)");
                arrayList.add(param);
            }
            return new C8.a.b(arrayList);
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b.b(objF);
        uDSResultA = (UDSResult) objF;
        if (uDSResultA == null) {
            return new C8.a.C0024a(new NotAvailableOfflineException());
        }
        type = UDSResult.Type.f29416b;
        param = uDSResultA.f29414c;
        if (uDSResultA.f29412a == type) {
            arrayList = param.c(true);
        } else {
            arrayList = new ArrayList();
            i.d(param, "getParam(...)");
            arrayList.add(param);
        }
        return new C8.a.b(arrayList);
    }
}
