package com.voltasit.obdeleven.domain.usecases.controlUnit;

import Ia.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlinx.datetime.format.E;
import kotlinx.datetime.format.InterfaceC2724i;
import kotlinx.datetime.format.UnicodeKt;
import p293xa.r;

/* JADX INFO: compiled from: WriteWorkshopInfoUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class WriteWorkshopInfoUC$invoke$2$date$1 extends Lambda implements l<InterfaceC2724i.b, r> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final WriteWorkshopInfoUC$invoke$2$date$1 f30651h = new WriteWorkshopInfoUC$invoke$2$date$1();

    public WriteWorkshopInfoUC$invoke$2$date$1() {
        super(1);
    }

    @Override // Ia.l
    public final r invoke(InterfaceC2724i.b bVar) {
        List list;
        List list2;
        InterfaceC2724i.b Format = bVar;
        i.e(Format, "$this$Format");
        ArrayList arrayList = UnicodeKt.f43787a;
        ArrayList arrayListT = kotlin.collections.l.t(new ArrayList());
        int i10 = 0;
        boolean z10 = false;
        String str = "";
        Character chValueOf = null;
        for (int i11 = 0; i11 < 6; i11++) {
            char cCharAt = "yyMMdd".charAt(i11);
            if (chValueOf != null && cCharAt == chValueOf.charValue()) {
                i10++;
            } else if (!z10) {
                if (i10 > 0) {
                    List list3 = (List) q.V(arrayListT);
                    if (list3 != null) {
                        i.b(chValueOf);
                        list3.add(UnicodeKt.a(chValueOf.charValue(), i10));
                    }
                    i10 = 0;
                    chValueOf = null;
                }
                if (UnicodeKt.f43787a.contains(Character.valueOf(cCharAt))) {
                    if (!i.a(str, "")) {
                        List list4 = (List) q.V(arrayListT);
                        if (list4 != null) {
                            list4.add(new E.d(str));
                        }
                        str = "";
                    }
                    if (cCharAt == '\'') {
                        z10 = true;
                        str = "";
                    } else if (cCharAt == '[') {
                        arrayListT.add(new ArrayList());
                    } else if (cCharAt == ']') {
                        List list5 = (List) p.E(arrayListT);
                        if (list5 == null) {
                            throw new IllegalArgumentException("Unmatched closing bracket");
                        }
                        List list6 = (List) q.V(arrayListT);
                        if (list6 != null) {
                            list6.add(new E.b(new E.c(list5)));
                        }
                    } else {
                        chValueOf = Character.valueOf(cCharAt);
                        i10 = 1;
                    }
                } else {
                    str = str + cCharAt;
                }
            } else if (cCharAt == '\'') {
                List list7 = (List) q.V(arrayListT);
                if (list7 != null) {
                    if (str.length() == 0) {
                        str = "'";
                    }
                    list7.add(new E.d(str));
                }
                z10 = false;
                str = "";
            } else {
                str = str + cCharAt;
            }
        }
        if (i10 > 0 && (list2 = (List) q.V(arrayListT)) != null) {
            i.b(chValueOf);
            list2.add(UnicodeKt.a(chValueOf.charValue(), i10));
        }
        if (!i.a(str, "") && (list = (List) q.V(arrayListT)) != null) {
            list.add(new E.d(str));
        }
        List list8 = (List) p.E(arrayListT);
        if (list8 == null) {
            throw new IllegalArgumentException("Unmatched opening bracket");
        }
        UnicodeKt.d(Format, new E.c(list8));
        return r.f47939a;
    }
}
