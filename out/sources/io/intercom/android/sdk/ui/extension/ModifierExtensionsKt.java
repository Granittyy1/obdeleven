package io.intercom.android.sdk.ui.extension;

import Ia.l;
import androidx.compose.ui.h;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ModifierExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ModifierExtensionsKt {
    public static final h ifTrue(h hVar, boolean z10, l<? super h, ? extends h> modifier) {
        i.e(hVar, "<this>");
        i.e(modifier, "modifier");
        return z10 ? hVar.i(modifier.invoke(h.a.f13984b)) : hVar;
    }
}
