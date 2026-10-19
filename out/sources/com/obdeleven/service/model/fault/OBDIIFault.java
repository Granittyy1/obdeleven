package com.obdeleven.service.model.fault;

import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.util.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class OBDIIFault extends Fault {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final char[] f29444o = {'P', 'C', 'B', 'U'};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final char[] f29445p = "0123".toCharArray();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f29446n;

    public enum FaultType {
        ACTIVE(3),
        PENDING(1),
        PERMANENT(3);

        private final int status;

        FaultType(int i10) {
            this.status = i10;
        }

        public final int a() {
            return this.status;
        }
    }

    public OBDIIFault(ControlUnit controlUnit, String str, String str2, FaultType faultType) {
        this.f29431b = controlUnit;
        this.f29432c = str;
        this.f29435f = str2;
        Integer.parseInt(str2, 16);
        this.f29436g = 0;
        this.f29438i = faultType.a();
        this.f29433d = "";
        char cCharAt = str2.charAt(0);
        char[] cArr = b.f29554a;
        byte bDigit = (byte) (Character.digit(cCharAt, 16) << 4);
        int i10 = (bDigit & 192) >> 6;
        int i11 = (bDigit & 48) >> 4;
        this.f29433d += f29444o[i10];
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f29433d);
        char[] cArr2 = f29445p;
        sb2.append(cArr2[i11]);
        this.f29433d = sb2.toString();
        this.f29446n = controlUnit.f29321c.j() || cArr2[i11] == '0';
        this.f29433d += str2.substring(1);
    }

    public static ArrayList k(ControlUnit controlUnit, String str, FaultType faultType) {
        int i10;
        if (str == null) {
            return new ArrayList();
        }
        int i11 = 0;
        String strSubstring = str.substring(0, 4);
        String strSubstring2 = str.substring(4);
        ArrayList arrayList = new ArrayList();
        while (i11 < strSubstring2.length() && (i10 = i11 + 4) <= strSubstring2.length()) {
            OBDIIFault oBDIIFault = new OBDIIFault(controlUnit, strSubstring, strSubstring2.substring(i11, i10), faultType);
            if ("P0000".equals(oBDIIFault.f29433d)) {
                return arrayList;
            }
            arrayList.add(oBDIIFault);
            i11 = i10;
        }
        return arrayList;
    }

    @Override // com.obdeleven.service.model.fault.Fault
    public final ApplicationProtocol b() {
        return ApplicationProtocol.f29265e;
    }

    @Override // com.obdeleven.service.model.fault.Fault
    public final String c(String str) {
        return this.f29446n ? super.c(str) : "";
    }

    @Override // com.obdeleven.service.model.fault.Fault
    public final boolean i() {
        return this.f29446n;
    }
}
