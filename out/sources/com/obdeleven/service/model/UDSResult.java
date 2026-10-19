package com.obdeleven.service.model;

import com.obdeleven.service.odx.OdxFactory$Exception;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.odx.model.STRUCTURE;
import com.obdeleven.service.util.Texttabe;

/* JADX INFO: loaded from: classes3.dex */
public final class UDSResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f29412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Param f29414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f29415d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Type f29416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Type f29417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f29418d;

        static {
            Type type = new Type("POSITIVE", 0);
            f29416b = type;
            Type type2 = new Type("NEGATIVE", 1);
            f29417c = type2;
            f29418d = new Type[]{type, type2};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f29418d.clone();
        }
    }

    public UDSResult(Type type, int i10, Param param) {
        this.f29412a = type;
        this.f29413b = i10;
        this.f29414c = param;
    }

    public static UDSResult a(String str) {
        byte[] bArr = new byte[str.length() / 2];
        for (int i10 = 0; i10 < str.length() / 2; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) Integer.parseInt(str.substring(i11, i11 + 2), 16);
        }
        int i12 = Integer.parseInt(str, 16);
        Param param = new Param(bArr, Param.Type.f29472g);
        param.f29459g = Texttabe.a(i12);
        return new UDSResult(Type.f29417c, i12, param);
    }

    public static UDSResult b(int i10, String str, com.obdeleven.service.odx.e.g gVar, com.obdeleven.service.odx.e eVar) throws OdxFactory$Exception {
        byte[] bArr = new byte[str.length() / 2];
        for (int i11 = 0; i11 < str.length() / 2; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) Integer.parseInt(str.substring(i12, i12 + 2), 16);
        }
        com.obdeleven.service.odx.e.c cVarB = eVar.B(gVar.f29508b, gVar.f29507a, i10);
        if (cVarB == null) {
            throw new OdxFactory$Exception(2);
        }
        return new UDSResult(i10, eVar.L(cVarB.f29500b, ((STRUCTURE) cVarB.f29499a).getPARAMS().getPARAM(), bArr, false), str);
    }

    public UDSResult(int i10, Param param, String str) {
        this.f29412a = Type.f29416b;
        this.f29413b = i10;
        this.f29414c = param;
        this.f29415d = str;
    }
}
