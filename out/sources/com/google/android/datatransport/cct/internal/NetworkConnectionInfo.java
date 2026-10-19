package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class NetworkConnectionInfo {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v0 com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype, still in use, count: 1, list:
      (r13v0 com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype) from 0x0147: INVOKE 
      (r0v19 android.util.SparseArray<com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype>)
      (1 int)
      (r13v0 com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype)
     VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:328)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class MobileSubtype {
        UNKNOWN_MOBILE_SUBTYPE(0),
        /* JADX INFO: Fake field, exist only in values array */
        GPRS(1),
        /* JADX INFO: Fake field, exist only in values array */
        EDGE(2),
        /* JADX INFO: Fake field, exist only in values array */
        UMTS(3),
        /* JADX INFO: Fake field, exist only in values array */
        CDMA(4),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_0(5),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_A(6),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(7),
        /* JADX INFO: Fake field, exist only in values array */
        TD_SCDMA(8),
        /* JADX INFO: Fake field, exist only in values array */
        IWLAN(9),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(10),
        /* JADX INFO: Fake field, exist only in values array */
        TD_SCDMA(11),
        /* JADX INFO: Fake field, exist only in values array */
        IWLAN(12),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(13),
        /* JADX INFO: Fake field, exist only in values array */
        TD_SCDMA(14),
        /* JADX INFO: Fake field, exist only in values array */
        IWLAN(15),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(16),
        /* JADX INFO: Fake field, exist only in values array */
        TD_SCDMA(17),
        /* JADX INFO: Fake field, exist only in values array */
        IWLAN(18),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(19),
        COMBINED(100);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final SparseArray<MobileSubtype> f25239d;
        private final int value;

        static {
            MobileSubtype mobileSubtype = UNKNOWN_MOBILE_SUBTYPE;
            SparseArray<MobileSubtype> sparseArray = new SparseArray<>();
            f25239d = sparseArray;
            sparseArray.put(0, mobileSubtype);
            sparseArray.put(1, mobileSubtype);
            sparseArray.put(2, mobileSubtype);
            sparseArray.put(3, mobileSubtype);
            sparseArray.put(4, mobileSubtype);
            sparseArray.put(5, mobileSubtype);
            sparseArray.put(6, mobileSubtype);
            sparseArray.put(7, mobileSubtype);
            sparseArray.put(8, mobileSubtype);
            sparseArray.put(9, mobileSubtype);
            sparseArray.put(10, mobileSubtype);
            sparseArray.put(11, mobileSubtype);
            sparseArray.put(12, mobileSubtype);
            sparseArray.put(13, mobileSubtype);
            sparseArray.put(14, mobileSubtype);
            sparseArray.put(15, mobileSubtype);
            sparseArray.put(16, mobileSubtype);
            sparseArray.put(17, mobileSubtype);
            sparseArray.put(18, mobileSubtype);
            sparseArray.put(19, mobileSubtype);
        }

        public MobileSubtype(int i10) {
            super(str, i);
            this.value = i10;
        }

        public static MobileSubtype valueOf(String str) {
            return (MobileSubtype) Enum.valueOf(MobileSubtype.class, str);
        }

        public static MobileSubtype[] values() {
            return (MobileSubtype[]) f25240e.clone();
        }

        public final int a() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v0 com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType, still in use, count: 1, list:
      (r15v0 com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType) from 0x0122: INVOKE 
      (r0v17 android.util.SparseArray<com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType>)
      (0 int)
      (r15v0 com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType)
     VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:291)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class NetworkType {
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE(0),
        /* JADX INFO: Fake field, exist only in values array */
        WIFI(1),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_MMS(2),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_SUPL(3),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_DUN(4),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_HIPRI(5),
        /* JADX INFO: Fake field, exist only in values array */
        WIMAX(6),
        /* JADX INFO: Fake field, exist only in values array */
        PROXY(7),
        /* JADX INFO: Fake field, exist only in values array */
        VPN(8),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_EMERGENCY(9),
        /* JADX INFO: Fake field, exist only in values array */
        PROXY(10),
        /* JADX INFO: Fake field, exist only in values array */
        VPN(11),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_EMERGENCY(12),
        /* JADX INFO: Fake field, exist only in values array */
        PROXY(13),
        /* JADX INFO: Fake field, exist only in values array */
        VPN(14),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_EMERGENCY(15),
        /* JADX INFO: Fake field, exist only in values array */
        PROXY(16),
        /* JADX INFO: Fake field, exist only in values array */
        VPN(17),
        NONE(-1);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SparseArray<NetworkType> f25242c;
        private final int value;

        static {
            NetworkType networkType = NONE;
            SparseArray<NetworkType> sparseArray = new SparseArray<>();
            f25242c = sparseArray;
            sparseArray.put(0, networkType);
            sparseArray.put(1, networkType);
            sparseArray.put(2, networkType);
            sparseArray.put(3, networkType);
            sparseArray.put(4, networkType);
            sparseArray.put(5, networkType);
            sparseArray.put(6, networkType);
            sparseArray.put(7, networkType);
            sparseArray.put(8, networkType);
            sparseArray.put(9, networkType);
            sparseArray.put(10, networkType);
            sparseArray.put(11, networkType);
            sparseArray.put(12, networkType);
            sparseArray.put(13, networkType);
            sparseArray.put(14, networkType);
            sparseArray.put(15, networkType);
            sparseArray.put(16, networkType);
            sparseArray.put(17, networkType);
            sparseArray.put(-1, networkType);
        }

        public NetworkType(int i10) {
            super(str, i);
            this.value = i10;
        }

        public static NetworkType valueOf(String str) {
            return (NetworkType) Enum.valueOf(NetworkType.class, str);
        }

        public static NetworkType[] values() {
            return (NetworkType[]) f25243d.clone();
        }

        public final int a() {
            return this.value;
        }
    }

    public abstract MobileSubtype a();

    public abstract NetworkType b();
}
