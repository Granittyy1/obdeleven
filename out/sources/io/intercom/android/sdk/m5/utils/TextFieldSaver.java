package io.intercom.android.sdk.m5.utils;

import O.h;
import androidx.compose.runtime.saveable.i;
import androidx.compose.runtime.saveable.j;
import androidx.compose.ui.text.E;
import androidx.compose.ui.text.input.TextFieldValue;
import io.intercom.android.sdk.m5.conversation.ui.components.C2365n;
import java.util.List;
import kotlin.collections.l;

/* JADX INFO: compiled from: TextFieldSaver.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TextFieldSaver {
    public static final TextFieldSaver INSTANCE = new TextFieldSaver();
    private static final i<TextFieldValue, ?> textFieldValueSaver = androidx.compose.runtime.saveable.a.a(new a(), new C2365n(3));
    public static final int $stable = 8;

    private TextFieldSaver() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List textFieldValueSaver$lambda$0(j listSaver, TextFieldValue it) {
        kotlin.jvm.internal.i.e(listSaver, "$this$listSaver");
        kotlin.jvm.internal.i.e(it, "it");
        String str = it.f15491a.f15408c;
        int i10 = E.f15315c;
        long j = it.f15492b;
        Integer numValueOf = Integer.valueOf((int) (j >> 32));
        Integer numValueOf2 = Integer.valueOf((int) (j & 4294967295L));
        E e10 = it.f15493c;
        return l.s(str, numValueOf, numValueOf2, Integer.valueOf(e10 != null ? (int) (e10.f15316a >> 32) : -1), Integer.valueOf(e10 != null ? (int) (4294967295L & e10.f15316a) : -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue textFieldValueSaver$lambda$1(List it) {
        E e10;
        kotlin.jvm.internal.i.e(it, "it");
        Object obj = it.get(0);
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = it.get(1);
        kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = it.get(2);
        kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.Int");
        long jB = h.b(iIntValue, ((Integer) obj3).intValue());
        Object obj4 = it.get(3);
        kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type kotlin.Int");
        if (((Integer) obj4).intValue() >= 0) {
            Object obj5 = it.get(3);
            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) obj5).intValue();
            Object obj6 = it.get(4);
            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.Int");
            e10 = new E(h.b(iIntValue2, ((Integer) obj6).intValue()));
        } else {
            e10 = null;
        }
        return new TextFieldValue(str, jB, e10);
    }

    public final i<TextFieldValue, ?> getTextFieldValueSaver() {
        return textFieldValueSaver;
    }
}
