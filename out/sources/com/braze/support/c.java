package com.braze.support;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.m;
import kotlin.collections.q;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f24371a = new c();

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24372b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f24372b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to create valid enum from string: " + this.f24372b;
        }
    }

    private c() {
    }

    public static final Enum a(String enumValue, Class targetEnumClass) {
        kotlin.jvm.internal.i.e(enumValue, "enumValue");
        kotlin.jvm.internal.i.e(targetEnumClass, "targetEnumClass");
        return Enum.valueOf(targetEnumClass, enumValue);
    }

    public static final EnumSet a(Class targetEnumClass, Set sourceStringSet) {
        kotlin.jvm.internal.i.e(targetEnumClass, "targetEnumClass");
        kotlin.jvm.internal.i.e(sourceStringSet, "sourceStringSet");
        EnumSet result = EnumSet.noneOf(targetEnumClass);
        Iterator it = sourceStringSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Locale US = Locale.US;
                kotlin.jvm.internal.i.d(US, "US");
                String upperCase = str.toUpperCase(US);
                kotlin.jvm.internal.i.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
                result.add(a(upperCase, targetEnumClass));
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(f24371a, BrazeLogger.Priority.E, e10, new a(str));
            }
        }
        kotlin.jvm.internal.i.d(result, "result");
        return result;
    }

    public static final Set a(EnumSet sourceEnumSet) {
        kotlin.jvm.internal.i.e(sourceEnumSet, "sourceEnumSet");
        ArrayList arrayList = new ArrayList(m.y(sourceEnumSet, 10));
        Iterator it = sourceEnumSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).name());
        }
        return q.s0(arrayList);
    }
}
