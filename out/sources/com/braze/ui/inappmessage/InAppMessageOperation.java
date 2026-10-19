package com.braze.ui.inappmessage;

import androidx.annotation.Keep;
import java.util.Locale;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: InAppMessageOperation.kt */
/* JADX INFO: loaded from: classes.dex */
public enum InAppMessageOperation {
    DISPLAY_NOW,
    DISPLAY_LATER,
    DISCARD,
    REENQUEUE;

    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: InAppMessageOperation.kt */
    @Keep
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final InAppMessageOperation fromValue(String str) {
            InAppMessageOperation[] inAppMessageOperationArrValues = InAppMessageOperation.values();
            int length = inAppMessageOperationArrValues.length;
            int i10 = 0;
            while (true) {
                String upperCase = null;
                if (i10 >= length) {
                    return null;
                }
                InAppMessageOperation inAppMessageOperation = inAppMessageOperationArrValues[i10];
                String strName = inAppMessageOperation.name();
                if (str != null) {
                    Locale US = Locale.US;
                    i.d(US, "US");
                    upperCase = str.toUpperCase(US);
                    i.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
                }
                if (i.a(strName, upperCase)) {
                    return inAppMessageOperation;
                }
                i10++;
            }
        }

        private Companion() {
        }
    }

    public static final InAppMessageOperation fromValue(String str) {
        return Companion.fromValue(str);
    }
}
