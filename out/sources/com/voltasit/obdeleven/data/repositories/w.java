package com.voltasit.obdeleven.data.repositories;

import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseQuery;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import p255u9.C2804g;

/* JADX INFO: compiled from: UpdateRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements K8.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F8.c f30394a;

    public w(F8.c cVar) {
        this.f30394a = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    @Override // K8.u
    public final Object a(String str, ContinuationImpl continuationImpl) throws Throwable {
        UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$1 updateRepositoryImpl$downloadBluetoothFirmwareUpdate$1;
        w wVar;
        if (continuationImpl instanceof UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$1) {
            updateRepositoryImpl$downloadBluetoothFirmwareUpdate$1 = (UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$1) continuationImpl;
            int i10 = updateRepositoryImpl$downloadBluetoothFirmwareUpdate$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                updateRepositoryImpl$downloadBluetoothFirmwareUpdate$1.label = i10 - Integer.MIN_VALUE;
            } else {
                updateRepositoryImpl$downloadBluetoothFirmwareUpdate$1 = new UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$1(this, continuationImpl);
            }
        } else {
            updateRepositoryImpl$downloadBluetoothFirmwareUpdate$1 = new UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$1(this, continuationImpl);
        }
        Object objF = updateRepositoryImpl$downloadBluetoothFirmwareUpdate$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = updateRepositoryImpl$downloadBluetoothFirmwareUpdate$1.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    w wVar2 = (w) updateRepositoryImpl$downloadBluetoothFirmwareUpdate$1.L$0;
                    kotlin.b.b(objF);
                    wVar = wVar2;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    w wVar3 = (w) updateRepositoryImpl$downloadBluetoothFirmwareUpdate$1.L$0;
                    kotlin.b.b(objF);
                    str = wVar3;
                }
                return new C8.a.b((byte[]) objF);
            }
            kotlin.b.b(objF);
            int i12 = C2804g.f47471b;
            ParseQuery query = ParseQuery.getQuery(C2804g.class);
            query.whereEqualTo("objectId", str);
            Sa.a aVar = N.f43200c;
            UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$result$1 updateRepositoryImpl$downloadBluetoothFirmwareUpdate$result$1 = new UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$result$1(query, null);
            updateRepositoryImpl$downloadBluetoothFirmwareUpdate$1.L$0 = this;
            updateRepositoryImpl$downloadBluetoothFirmwareUpdate$1.label = 1;
            objF = C2680e.f(aVar, updateRepositoryImpl$downloadBluetoothFirmwareUpdate$result$1, updateRepositoryImpl$downloadBluetoothFirmwareUpdate$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
            wVar = this;
            w9.d.a aVar2 = (w9.d.a) objF;
            ParseException parseException = aVar2.f47830a;
            if (parseException != null) {
                return E8.a.i(wVar.f30394a.a(parseException));
            }
            List<T> list = aVar2.f47831b;
            if (list.isEmpty()) {
                return new C8.a.C0024a(new Exception("Firmware object not found in database"));
            }
            ParseFile parseFile = ((C2804g) kotlin.collections.q.O(list)).getParseFile("fwHex");
            Sa.a aVar3 = N.f43200c;
            UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$binary$1 updateRepositoryImpl$downloadBluetoothFirmwareUpdate$binary$1 = new UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$binary$1(parseFile, null);
            updateRepositoryImpl$downloadBluetoothFirmwareUpdate$1.L$0 = wVar;
            updateRepositoryImpl$downloadBluetoothFirmwareUpdate$1.label = 2;
            objF = C2680e.f(aVar3, updateRepositoryImpl$downloadBluetoothFirmwareUpdate$binary$1, updateRepositoryImpl$downloadBluetoothFirmwareUpdate$1);
            str = wVar;
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
            return new C8.a.b((byte[]) objF);
        } catch (Throwable th) {
            return E8.a.i(str.f30394a.a(th));
        }
    }
}
