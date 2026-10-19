package com.braze.enums;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.e;
import p005a4.q;

/* JADX INFO: loaded from: classes.dex */
public enum Month {
    JANUARY(0),
    FEBRUARY(1),
    MARCH(2),
    APRIL(3),
    MAY(4),
    JUNE(5),
    JULY(6),
    AUGUST(7),
    SEPTEMBER(8),
    OCTOBER(9),
    NOVEMBER(10),
    DECEMBER(11);

    public static final Companion Companion = new Companion(null);
    private final int value;

    public static final class Companion {

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f24059b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i10) {
                super(0);
                this.f24059b = i10;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return q.c(new StringBuilder("No month with value "), this.f24059b, ", value must be in (0,11)");
            }
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final Month getMonth(int i10) {
            Month month;
            Month[] monthArrValues = Month.values();
            int length = monthArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    month = null;
                    break;
                }
                month = monthArrValues[i11];
                if (month.getValue() == i10) {
                    break;
                }
                i11++;
            }
            if (month != null) {
                return month;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new a(i10), 2, (Object) null);
            return null;
        }

        private Companion() {
        }
    }

    Month(int i10) {
        this.value = i10;
    }

    public static final Month getMonth(int i10) {
        return Companion.getMonth(i10);
    }

    public final int getValue() {
        return this.value;
    }
}
