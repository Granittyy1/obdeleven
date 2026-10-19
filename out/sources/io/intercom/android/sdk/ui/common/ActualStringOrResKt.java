package io.intercom.android.sdk.ui.common;

import B7.b;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import kotlin.text.m;

/* JADX INFO: compiled from: ActualStringOrRes.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ActualStringOrResKt {
    public static final String parseString(Context context, int i10, List<Pair<String, String>> params) {
        i.e(context, "context");
        i.e(params, "params");
        String string = context.getString(i10);
        i.d(string, "getString(...)");
        Iterator<T> it = params.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            string = m.G(string, b.g(new StringBuilder("{"), (String) pair.c(), '}'), (String) pair.d());
        }
        return string;
    }

    public static String parseString$default(Context context, int i10, List list, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = EmptyList.f42983b;
        }
        return parseString(context, i10, list);
    }
}
