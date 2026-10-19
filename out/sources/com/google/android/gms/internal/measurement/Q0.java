package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V7.a f25557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y1 f25558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y1 f25559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1860m3 f25560d;

    public Q0() {
        V7.a aVar = new V7.a();
        aVar.f6730b = new HashMap();
        aVar.f6731c = new M();
        C1925w c1925w = new C1925w();
        c1925w.f25919a.add(zzbv.BITWISE_AND);
        c1925w.f25919a.add(zzbv.BITWISE_LEFT_SHIFT);
        c1925w.f25919a.add(zzbv.BITWISE_NOT);
        c1925w.f25919a.add(zzbv.BITWISE_OR);
        c1925w.f25919a.add(zzbv.BITWISE_RIGHT_SHIFT);
        c1925w.f25919a.add(zzbv.BITWISE_UNSIGNED_RIGHT_SHIFT);
        c1925w.f25919a.add(zzbv.BITWISE_XOR);
        aVar.d(c1925w);
        B b10 = new B();
        b10.f25919a.add(zzbv.EQUALS);
        b10.f25919a.add(zzbv.GREATER_THAN);
        b10.f25919a.add(zzbv.GREATER_THAN_EQUALS);
        b10.f25919a.add(zzbv.IDENTITY_EQUALS);
        b10.f25919a.add(zzbv.IDENTITY_NOT_EQUALS);
        b10.f25919a.add(zzbv.LESS_THAN);
        b10.f25919a.add(zzbv.LESS_THAN_EQUALS);
        b10.f25919a.add(zzbv.NOT_EQUALS);
        aVar.d(b10);
        C c10 = new C();
        c10.f25919a.add(zzbv.APPLY);
        c10.f25919a.add(zzbv.BLOCK);
        c10.f25919a.add(zzbv.BREAK);
        c10.f25919a.add(zzbv.CASE);
        c10.f25919a.add(zzbv.DEFAULT);
        c10.f25919a.add(zzbv.CONTINUE);
        c10.f25919a.add(zzbv.DEFINE_FUNCTION);
        c10.f25919a.add(zzbv.FN);
        c10.f25919a.add(zzbv.IF);
        c10.f25919a.add(zzbv.QUOTE);
        c10.f25919a.add(zzbv.RETURN);
        c10.f25919a.add(zzbv.SWITCH);
        c10.f25919a.add(zzbv.TERNARY);
        aVar.d(c10);
        F f10 = new F();
        f10.f25919a.add(zzbv.AND);
        f10.f25919a.add(zzbv.NOT);
        f10.f25919a.add(zzbv.OR);
        aVar.d(f10);
        H h8 = new H();
        h8.f25919a.add(zzbv.FOR_IN);
        h8.f25919a.add(zzbv.FOR_IN_CONST);
        h8.f25919a.add(zzbv.FOR_IN_LET);
        h8.f25919a.add(zzbv.FOR_LET);
        h8.f25919a.add(zzbv.FOR_OF);
        h8.f25919a.add(zzbv.FOR_OF_CONST);
        h8.f25919a.add(zzbv.FOR_OF_LET);
        h8.f25919a.add(zzbv.WHILE);
        aVar.d(h8);
        L l10 = new L();
        l10.f25919a.add(zzbv.ADD);
        l10.f25919a.add(zzbv.DIVIDE);
        l10.f25919a.add(zzbv.MODULUS);
        l10.f25919a.add(zzbv.MULTIPLY);
        l10.f25919a.add(zzbv.NEGATE);
        l10.f25919a.add(zzbv.POST_DECREMENT);
        l10.f25919a.add(zzbv.POST_INCREMENT);
        l10.f25919a.add(zzbv.PRE_DECREMENT);
        l10.f25919a.add(zzbv.PRE_INCREMENT);
        l10.f25919a.add(zzbv.SUBTRACT);
        aVar.d(l10);
        P p10 = new P();
        p10.f25919a.add(zzbv.ASSIGN);
        p10.f25919a.add(zzbv.CONST);
        p10.f25919a.add(zzbv.CREATE_ARRAY);
        p10.f25919a.add(zzbv.CREATE_OBJECT);
        p10.f25919a.add(zzbv.EXPRESSION_LIST);
        p10.f25919a.add(zzbv.GET);
        p10.f25919a.add(zzbv.GET_INDEX);
        p10.f25919a.add(zzbv.GET_PROPERTY);
        p10.f25919a.add(zzbv.NULL);
        p10.f25919a.add(zzbv.SET_PROPERTY);
        p10.f25919a.add(zzbv.TYPEOF);
        p10.f25919a.add(zzbv.UNDEFINED);
        p10.f25919a.add(zzbv.VAR);
        aVar.d(p10);
        this.f25557a = aVar;
        Y1 y10 = new Y1(null, aVar);
        this.f25559c = y10;
        this.f25558b = y10.d();
        C1860m3 c1860m3 = new C1860m3();
        c1860m3.f25798a = new HashMap();
        this.f25560d = c1860m3;
        y10.g("require", new W5(c1860m3));
        c1860m3.f25798a.put("internal.platform", B0.f25399b);
        y10.g("runtime.counter", new C1835j(Double.valueOf(0.0d)));
    }

    public final InterfaceC1884q a(Y1 y10, zzgb$zzd... zzgb_zzdArr) {
        InterfaceC1884q interfaceC1884qA = InterfaceC1884q.f25814f0;
        for (zzgb$zzd zzgb_zzd : zzgb_zzdArr) {
            interfaceC1884qA = A2.a(zzgb_zzd);
            D1.g(this.f25559c);
            if ((interfaceC1884qA instanceof C1904t) || (interfaceC1884qA instanceof r)) {
                interfaceC1884qA = this.f25557a.c(y10, interfaceC1884qA);
            }
        }
        return interfaceC1884qA;
    }
}
