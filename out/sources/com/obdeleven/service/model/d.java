package com.obdeleven.service.model;

import com.obdeleven.service.odx.model.DATAOBJECTPROP;
import com.obdeleven.service.odx.model.SNREF;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Continuation<String, UDSResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f29422a;

    public d(ControlUnit controlUnit) {
        this.f29422a = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final UDSResult then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (result.startsWith("620100")) {
            SNREF snref = new SNREF();
            snref.setSHORTNAME("DOP_TEXTTABLEActuaTestStatu");
            ControlUnit controlUnit = this.f29422a;
            com.obdeleven.service.odx.e.c cVarM = controlUnit.f29322d.m(snref);
            if (cVarM != null) {
                String strSubstring = result.substring(6);
                int length = strSubstring.length() / 2;
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    bArr[i10] = (byte) Integer.parseInt(strSubstring.substring(i11, i11 + 2), 16);
                }
                return new UDSResult(UDSResult.Type.f29416b, 256, controlUnit.f29322d.b(cVarM.f29500b, (DATAOBJECTPROP) cVarM.f29499a, bArr, 0, false));
            }
        } else if (result.startsWith("7F")) {
            return UDSResult.a(result.substring(4));
        }
        return null;
    }
}
