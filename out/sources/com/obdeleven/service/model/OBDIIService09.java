package com.obdeleven.service.model;

import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Iterator;
import p109i8.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public class OBDIIService09 implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final OBDIIService09 f29409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final OBDIIService09 f29410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ OBDIIService09[] f29411d;
    private final String code;
    private final int description;

    /* JADX INFO: Fake field, exist only in values array */
    OBDIIService09 EF8;

    /* JADX INFO: Fake field, exist only in values array */
    OBDIIService09 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    OBDIIService09 EF12;

    /* JADX INFO: Fake field, exist only in values array */
    OBDIIService09 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    OBDIIService09 EF9;

    /* JADX INFO: Fake field, exist only in values array */
    OBDIIService09 EF0;

    /* JADX INFO: renamed from: com.obdeleven.service.model.OBDIIService09$2, reason: invalid class name */
    public final enum AnonymousClass2 extends OBDIIService09 {
        @Override // com.obdeleven.service.model.OBDIIService09, p109i8.j
        public final String c(String str) {
            return Lb.a.h(str);
        }
    }

    /* JADX INFO: renamed from: com.obdeleven.service.model.OBDIIService09$3, reason: invalid class name */
    public final enum AnonymousClass3 extends OBDIIService09 {
        @Override // com.obdeleven.service.model.OBDIIService09, p109i8.j
        public final String c(String str) {
            return Lb.a.h(str);
        }
    }

    static {
        OBDIIService09 oBDIIService09 = new OBDIIService09(0, R.string.supported_pids_0, "SUPPORTED_PIDS", "00");
        f29409b = oBDIIService09;
        OBDIIService09 oBDIIService010 = new OBDIIService09(1, R.string.vin_message_count, "VIN_MESSAGE_COUNT", "01");
        OBDIIService09 oBDIIService011 = new OBDIIService09(2, R.string.common_vin, "VIN", "02");
        OBDIIService09 oBDIIService012 = new OBDIIService09(3, R.string.calibration_id, "CALIBRATION_ID", "04");
        OBDIIService09 oBDIIService013 = new OBDIIService09(4, R.string.calibration_id_message_count, "CALIBRATION_ID_MESSAGE_COUNT", "03");
        OBDIIService09 oBDIIService014 = new OBDIIService09(5, R.string.cvn_message_count, "CVN_MESSAGE_COUNT", "05");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(6, R.string.cvn, "CVN", "06");
        OBDIIService09 oBDIIService015 = new OBDIIService09(7, R.string.tracking_message_count, "TRACKING_MESSAGE_COUNT", "07");
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(8, R.string.performance_tracking_spark, "SPARK_TRACKING", "08");
        OBDIIService09 oBDIIService016 = new OBDIIService09(9, R.string.ecu_name_message_count, "ECU_NAME_MESSAGE_COUNT", "09");
        OBDIIService09 oBDIIService017 = new OBDIIService09(10, R.string.ecu_name, "ECU_NAME", "0A");
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(11, R.string.performance_tracking_compression, "COMPRESSION_TRACKING", "0B");
        OBDIIService09 oBDIIService018 = new OBDIIService09(12, R.string.common_unknown, "UNKNOWN", "");
        f29410c = oBDIIService018;
        f29411d = new OBDIIService09[]{oBDIIService09, oBDIIService010, oBDIIService011, oBDIIService012, oBDIIService013, oBDIIService014, anonymousClass1, oBDIIService015, anonymousClass2, oBDIIService016, oBDIIService017, anonymousClass3, oBDIIService018};
    }

    public OBDIIService09(int i10, int i11, String str, String str2) {
        super(str, i10);
        this.code = str2;
        this.description = i11;
    }

    public static ArrayList d(ArrayList arrayList) {
        OBDIIService09 oBDIIService09;
        OBDIIService09 oBDIIService010;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            OBDIIService09[] oBDIIService09ArrValues = values();
            int length = oBDIIService09ArrValues.length;
            int i10 = 0;
            while (true) {
                oBDIIService09 = f29410c;
                if (i10 >= length) {
                    oBDIIService010 = oBDIIService09;
                    break;
                }
                oBDIIService010 = oBDIIService09ArrValues[i10];
                if (oBDIIService010.code.equals(str)) {
                    break;
                }
                i10++;
            }
            if (oBDIIService010 != oBDIIService09) {
                arrayList2.add(oBDIIService010);
            }
        }
        return arrayList2;
    }

    public static OBDIIService09 valueOf(String str) {
        return (OBDIIService09) Enum.valueOf(OBDIIService09.class, str);
    }

    public static OBDIIService09[] values() {
        return (OBDIIService09[]) f29411d.clone();
    }

    @Override // p109i8.j
    public final ArrayList a(String str) {
        return new ArrayList();
    }

    @Override // p109i8.j
    public final String b() {
        return this.code;
    }

    @Override // p109i8.j
    public String c(String str) {
        return com.obdeleven.service.util.b.b(str);
    }

    @Override // p109i8.j
    public final int getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: com.obdeleven.service.model.OBDIIService09$1, reason: invalid class name */
    public final enum AnonymousClass1 extends OBDIIService09 {
        @Override // com.obdeleven.service.model.OBDIIService09, p109i8.j
        public final String c(String str) {
            return str;
        }
    }
}
