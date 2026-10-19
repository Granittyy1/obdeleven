package io.intercom.android.sdk.api;

import android.content.Context;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.collections.q;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: UserLocaleUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UserLocaleUtilKt {
    public static final String getUserLocaleString(Context context) {
        i.e(context, "context");
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        i.d(locales, "getLocales(...)");
        ArrayList arrayList = new ArrayList();
        int size = locales.size();
        for (int i10 = 0; i10 < size; i10++) {
            Locale locale = locales.get(i10);
            arrayList.add(locale.getLanguage() + '-' + locale.getCountry());
        }
        return q.U(arrayList, ",", null, null, null, 62);
    }
}
