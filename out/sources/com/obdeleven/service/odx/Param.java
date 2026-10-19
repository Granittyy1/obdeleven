package com.obdeleven.service.odx;

import com.obdeleven.service.odx.model.DATAOBJECTPROP;
import com.obdeleven.service.odx.model.DATATYPE;
import com.obdeleven.service.util.Texttabe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Param {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Type f29453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f29454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f29455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Param> f29456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f29458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f29459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f29460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f29461i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DATAOBJECTPROP f29462k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29464m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29465n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f29466o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Type f29467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Type f29468c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Type f29469d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Type f29470e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Type f29471f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Type f29472g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Type f29473h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ Type[] f29474i;

        static {
            Type type = new Type("SYSTEM", 0);
            f29467b = type;
            Type type2 = new Type("LIST", 1);
            f29468c = type2;
            Type type3 = new Type("VALUE", 2);
            f29469d = type3;
            Type type4 = new Type("RESERVED", 3);
            f29470e = type4;
            Type type5 = new Type("CONST", 4);
            f29471f = type5;
            Type type6 = new Type("NRC", 5);
            f29472g = type6;
            Type type7 = new Type("NOT_AVAILABLE", 6);
            f29473h = type7;
            f29474i = new Type[]{type, type2, type3, type4, type5, type6, type7};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f29474i.clone();
        }
    }

    public Param(byte[] bArr) {
        this(bArr, Type.f29473h);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Param clone() {
        Param param;
        int iOrdinal = this.f29453a.ordinal();
        if (iOrdinal == 1) {
            ArrayList arrayList = new ArrayList();
            Iterator<Param> it = this.f29456d.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().clone());
            }
            param = new Param(this.f29454b, arrayList);
        } else if (iOrdinal != 2) {
            param = new Param(this.f29454b, this.f29453a);
        } else {
            param = new Param(this.f29454b, this.f29462k, this.f29459g, this.f29460h, this.f29461i, this.j);
        }
        param.f29457e = this.f29457e;
        param.f29458f = this.f29458f;
        param.f29463l = this.f29463l;
        param.f29464m = this.f29464m;
        param.f29465n = this.f29465n;
        return param;
    }

    public final int b() {
        Type type = this.f29453a;
        if (type == Type.f29468c) {
            this.f29465n = 0;
            for (Param param : this.f29456d) {
                this.f29465n = param.b() + this.f29465n;
            }
        } else if (type == Type.f29473h) {
            this.f29465n = 0;
        }
        return this.f29465n;
    }

    public final ArrayList c(boolean z10) {
        ArrayList arrayList = new ArrayList();
        Type type = this.f29453a;
        if (type == Type.f29468c) {
            Iterator<Param> it = this.f29456d.iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().c(z10));
            }
        } else if (type == Type.f29469d) {
            arrayList.add(this);
        } else if (z10 && type == Type.f29473h) {
            arrayList.add(this);
        }
        return arrayList;
    }

    public final String d() {
        String str = this.f29458f;
        String strC = str != null ? Texttabe.c(str) : null;
        return strC == null ? this.f29457e : strC;
    }

    public final String e() {
        String str = this.j;
        String strC = str != null ? Texttabe.c(str) : null;
        return strC == null ? this.f29461i : strC;
    }

    public final String f() {
        String str = this.f29460h;
        String strC = str != null ? Texttabe.c(str) : null;
        return strC == null ? this.f29459g : strC;
    }

    public final byte[] g() throws Exception {
        int iCeil = (int) Math.ceil(b() / 8.0f);
        byte[] bArr = new byte[iCeil];
        int iOrdinal = this.f29453a.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                for (Param param : this.f29456d) {
                    byte[] bArrG = param.g();
                    for (int i10 = 0; i10 < bArrG.length; i10++) {
                        if (i10 == 0) {
                            int iB = param.b();
                            while (iB > 8) {
                                iB -= 8;
                            }
                            int i11 = ~((-1) << iB);
                            int i12 = ~i11;
                            byte b10 = (byte) (i11 & bArrG[0]);
                            bArrG[0] = b10;
                            bArrG[0] = (byte) (b10 << param.f29464m);
                            for (int i13 = 0; i13 < param.f29464m; i13++) {
                                i12 = (i12 << 1) | 1;
                            }
                            int i14 = param.f29463l;
                            byte b11 = (byte) (i12 & bArr[i14]);
                            bArr[i14] = b11;
                            bArr[i14] = (byte) (b11 | bArrG[0]);
                        } else {
                            bArr[param.f29463l + i10] = bArrG[i10];
                        }
                    }
                }
                return bArr;
            }
            if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                throw new Exception("Unable to construct PDU\n\t" + toString());
            }
        }
        byte[] bArr2 = this.f29454b;
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, bArr2.length);
        if (this.f29453a == Type.f29469d) {
            DATAOBJECTPROP dataobjectprop = this.f29462k;
            if (dataobjectprop.getDIAGCODEDTYPE().isISHIGHLOWBYTEORDER()) {
                DATATYPE basedatatype = dataobjectprop.getDIAGCODEDTYPE().getBASEDATATYPE();
                if (basedatatype == DATATYPE.A_INT32 || basedatatype == DATATYPE.A_UINT32 || basedatatype == DATATYPE.A_FLOAT32 || basedatatype == DATATYPE.A_FLOAT64) {
                    int length = bArrCopyOf.length;
                    int i15 = length - 1;
                    int i16 = 0;
                    while (i16 < length / 2) {
                        byte b12 = bArrCopyOf[i16];
                        bArrCopyOf[i16] = bArrCopyOf[i15];
                        bArrCopyOf[i15] = b12;
                        i16++;
                        i15--;
                    }
                } else if (basedatatype == DATATYPE.A_UNICODE2STRING) {
                    int length2 = bArrCopyOf.length / 2;
                    for (int i17 = 0; i17 < length2; i17++) {
                        int i18 = i17 * 2;
                        byte b13 = bArrCopyOf[i18];
                        int i19 = i18 + 1;
                        bArrCopyOf[i18] = bArrCopyOf[i19];
                        bArrCopyOf[i19] = b13;
                    }
                }
            }
        }
        System.arraycopy(bArrCopyOf, 0, bArr, 0, iCeil);
        return bArr;
    }

    public final String toString() {
        if (this.f29453a == Type.f29468c) {
            StringBuilder sb2 = new StringBuilder();
            for (Param param : this.f29456d) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append("\t");
                sb2.append(param.toString().replace("\n", "\n\t"));
            }
            return this.f29453a.name() + ":\n" + ((Object) sb2);
        }
        return this.f29453a.name() + ": " + d() + " " + Arrays.toString(this.f29454b) + " " + this.f29463l + " " + this.f29464m + " " + this.f29465n;
    }

    public Param(byte[] bArr, DATAOBJECTPROP dataobjectprop, String str, String str2, String str3, String str4) {
        this(bArr, Type.f29469d);
        this.f29459g = str;
        this.f29460h = str2;
        this.f29461i = str3;
        this.j = str4;
        this.f29462k = dataobjectprop;
    }

    public Param(byte[] bArr, List<Param> list) {
        this(bArr, Type.f29468c);
        this.f29456d = list;
    }

    public Param(byte[] bArr, Type type) {
        this.f29466o = true;
        this.f29454b = bArr;
        this.f29453a = type;
    }
}
